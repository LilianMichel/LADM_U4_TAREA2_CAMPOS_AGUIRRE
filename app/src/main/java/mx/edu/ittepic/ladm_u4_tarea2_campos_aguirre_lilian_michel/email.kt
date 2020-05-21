package mx.edu.ittepic.ladm_u4_tarea2_campos_aguirre_lilian_michel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_email.*

class email : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_email)
        send_email.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            intent.type = "text/html"

            intent.putExtra(Intent.EXTRA_EMAIL,arrayListOf<String>("limicamposag@ittepic.edu.mx"))
            intent.putExtra(Intent.EXTRA_CC, arrayListOf<String>("CC@gmail.com"))
            intent.putExtra(Intent.EXTRA_BCC, arrayListOf<String>("BCC@email.com"))
            intent.putExtra(Intent.EXTRA_SUBJECT,"HOLA")
            intent.putExtra(Intent.EXTRA_TEXT,"ESTA ES UNA PRUEBA DE ENVIO DE CORREO")
            startActivity(intent)
        }
    }
}
