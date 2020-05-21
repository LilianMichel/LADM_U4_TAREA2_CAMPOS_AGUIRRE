package mx.edu.ittepic.ladm_u4_tarea2_campos_aguirre_lilian_michel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            var v = Intent(this, llamadas::class.java)
            startActivity(v)
        }
        button2.setOnClickListener {
            var v = Intent(this, email::class.java)
            startActivity(v)
        }
    }
}
