package mx.edu.potros.examenu2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnVisitar : Button = findViewById(R.id.btn_visitar)

        btnVisitar.setOnClickListener {
            var intento : Intent = Intent(this, Principal::class.java)
            startActivity(intento)
        }
    }
}