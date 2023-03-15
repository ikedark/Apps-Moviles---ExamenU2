package mx.edu.potros.examenu2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Principal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)

        var btnDetalles: Button = findViewById(R.id.btn_detalles) as Button
        var btnGlobos: Button = findViewById(R.id.btn_globos) as Button
        var btnPeluches: Button = findViewById(R.id.btn_peluches) as Button
        var btnRegalos: Button = findViewById(R.id.btn_regalos) as Button
        var btnTazas: Button = findViewById(R.id.btn_tazas) as Button

        btnDetalles.setOnClickListener {
            var intento : Intent = Intent(this, Regalos::class.java)
            intento.putExtra("seleccion","Detalles")
            startActivity(intento)
        }
        btnGlobos.setOnClickListener {
            var intento : Intent = Intent(this, Regalos::class.java)
            intento.putExtra("seleccion","Globos")
            startActivity(intento)
        }
        btnPeluches.setOnClickListener {
            var intento : Intent = Intent(this, Regalos::class.java)
            intento.putExtra("seleccion","Peluches")
            startActivity(intento)
        }
        btnRegalos.setOnClickListener {
            var intento : Intent = Intent(this, Regalos::class.java)
            intento.putExtra("seleccion","Regalos")
            startActivity(intento)
        }
        btnTazas.setOnClickListener {
            var intento : Intent = Intent(this, Regalos::class.java)
            intento.putExtra("seleccion","Tazas")
            startActivity(intento)
        }
    }
}