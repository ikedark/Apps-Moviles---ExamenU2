package mx.edu.potros.examenu2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.BaseAdapter

class Regalos : AppCompatActivity() {
    var detalles: ArrayList<Detalles> = ArrayList<Detalles>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_regalos)

        var catalogoOption: String? = intent.getStringExtra("catalogoType")
        cargarArticulos(catalogoOption)

    }

    fun cargarArticulos(option:String?){
        when(option){
            "Detalles"->{
                detalles.add(Detalles(R.drawable.cumplebotanas,"$280"))
                detalles.add(Detalles(R.drawable.cumplecheve,"$320"))
                detalles.add(Detalles(R.drawable.cumpleescolar,"$330"))
                detalles.add(Detalles(R.drawable.cumplepaletas,"$190"))
                detalles.add(Detalles(R.drawable.cumplebotanas,"$150"))
                detalles.add(Detalles(R.drawable.cumplevinos,"$370"))
            }
            "Globos"->{
                detalles.add(Detalles(R.drawable.globoamor,"$240"))
                detalles.add(Detalles(R.drawable.globocumple,"$820"))
                detalles.add(Detalles(R.drawable.globofestejo,"$260"))
                detalles.add(Detalles(R.drawable.globonum,"$760"))
                detalles.add(Detalles(R.drawable.globoregalo,"$450"))
                detalles.add(Detalles(R.drawable.globos,"$240"))
            }
            "Peluches"->{
                detalles.add(Detalles(R.drawable.peluchemario,"$320"))
                detalles.add(Detalles(R.drawable.pelucheminecraft,"$320"))
                detalles.add(Detalles(R.drawable.peluchepeppa,"$290"))
                detalles.add(Detalles(R.drawable.peluches,"$"))
                detalles.add(Detalles(R.drawable.peluchesony,"$330"))
                detalles.add(Detalles(R.drawable.peluchestich,"$280"))
                detalles.add(Detalles(R.drawable.peluchevarios,"$195"))
            }
            "Regalos"->{
                detalles.add(Detalles(R.drawable.regaloazul,"$80"))
                detalles.add(Detalles(R.drawable.regalobebe,"$290"))
                detalles.add(Detalles(R.drawable.regalocajas,"$140"))
                detalles.add(Detalles(R.drawable.regalocolores,"$85"))
                detalles.add(Detalles(R.drawable.regalos,"$"))
                detalles.add(Detalles(R.drawable.regalovarios,"$75  "))
            }
            "Tazas"->{
                detalles.add(Detalles(R.drawable.tazaabuela,"$120"))
                detalles.add(Detalles(R.drawable.tazalove,"$120"))
                detalles.add(Detalles(R.drawable.tazaquiero,"$260"))
                detalles.add(Detalles(R.drawable.tazas,"$280"))
            }
        }
    }

    private class DetallesAdapter: BaseAdapter {
        var detalles = 

    }


}

