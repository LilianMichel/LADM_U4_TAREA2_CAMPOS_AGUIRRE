package mx.edu.ittepic.ladm_u4_tarea2_campos_aguirre_lilian_michel

import android.annotation.SuppressLint
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.ActivityCompat
import kotlinx.android.synthetic.main.activity_llamadas.*
import java.util.jar.Manifest

class llamadas : AppCompatActivity() {
    val phoneNumber = "3118905671"
    val REQUEST_PHONE_CALL = 1


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_llamadas)

        action_call_button.setOnClickListener {
           if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
               ActivityCompat.requestPermissions(this, arrayOf(android.Manifest.permission.CALL_PHONE), REQUEST_PHONE_CALL)
           }else {
               starCall()
           }

        }
    }
    @SuppressLint("MissingPermission")
    private fun starCall(){
        val callIntent = Intent(Intent.ACTION_CALL)

        callIntent.data = Uri.parse("tel:"+phoneNumber)

        startActivity(callIntent)
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        //super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == REQUEST_PHONE_CALL)starCall()
    }
}
