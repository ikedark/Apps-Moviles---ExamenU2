package mx.edu.potros.examenu2

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.GridView
import android.widget.ImageView
import android.widget.TextView

class Regalos : AppCompatActivity() {
    var catalogo: ArrayList<Detalles> = ArrayList<Detalles>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_regalos)

        var option: String? = intent.getStringExtra("seleccion")
        cargarArticulos(option)

        var listview : GridView = findViewById(R.id.articulos) as GridView

        var adaptador: DetallesAdapter = DetallesAdapter(this, catalogo)


        listview.adapter= adaptador
    }

    fun cargarArticulos(option:String?){
        when(option){
            "Detalles"->{
                catalogo.add(Detalles(R.drawable.cumplebotanas,"$280"))
                catalogo.add(Detalles(R.drawable.cumplecheve,"$320"))
                catalogo.add(Detalles(R.drawable.cumpleescolar,"$330"))
                catalogo.add(Detalles(R.drawable.cumplepaletas,"$190"))
                catalogo.add(Detalles(R.drawable.cumplebotanas,"$150"))
                catalogo.add(Detalles(R.drawable.cumplevinos,"$370"))
                var titulo : TextView = findViewById(R.id.tv_tipo_detalle)
                titulo.text=option
            }
            "Globos"->{
                catalogo.add(Detalles(R.drawable.globoamor,"$240"))
                catalogo.add(Detalles(R.drawable.globocumple,"$820"))
                catalogo.add(Detalles(R.drawable.globofestejo,"$260"))
                catalogo.add(Detalles(R.drawable.globonum,"$760"))
                catalogo.add(Detalles(R.drawable.globoregalo,"$450"))
                catalogo.add(Detalles(R.drawable.globos,"$240"))
                var titulo : TextView = findViewById(R.id.tv_tipo_detalle)
                titulo.text=option
            }
            "Peluches"->{
                catalogo.add(Detalles(R.drawable.peluchemario,"$320"))
                catalogo.add(Detalles(R.drawable.pelucheminecraft,"$320"))
                catalogo.add(Detalles(R.drawable.peluchepeppa,"$290"))
                catalogo.add(Detalles(R.drawable.peluches,"$"))
                catalogo.add(Detalles(R.drawable.peluchesony,"$330"))
                catalogo.add(Detalles(R.drawable.peluchestich,"$280"))
                catalogo.add(Detalles(R.drawable.peluchevarios,"$195"))
                var titulo : TextView = findViewById(R.id.tv_tipo_detalle)
                titulo.text=option
            }
            "Regalos"->{
                catalogo.add(Detalles(R.drawable.regaloazul,"$80"))
                catalogo.add(Detalles(R.drawable.regalobebe,"$290"))
                catalogo.add(Detalles(R.drawable.regalocajas,"$140"))
                catalogo.add(Detalles(R.drawable.regalocolores,"$85"))
                catalogo.add(Detalles(R.drawable.regalos,"$"))
                catalogo.add(Detalles(R.drawable.regalovarios,"$75"))
                var titulo : TextView = findViewById(R.id.tv_tipo_detalle)
                titulo.text=option
            }
            "Tazas"->{
                catalogo.add(Detalles(R.drawable.tazaabuela,"$120"))
                catalogo.add(Detalles(R.drawable.tazalove,"$120"))
                catalogo.add(Detalles(R.drawable.tazaquiero,"$260"))
                catalogo.add(Detalles(R.drawable.tazas,"$280"))
                var titulo : TextView = findViewById(R.id.tv_tipo_detalle)
                titulo.text=option
            }
        }
    }

     class DetallesAdapter: BaseAdapter {
        var detalles = ArrayList<Detalles>()
        var context :Context? = null

         constructor(context: Context, detalles: ArrayList<Detalles>): super(){
             this.context = context
             this.detalles = detalles
         }

         override fun getCount(): Int {
             return detalles.size
         }

         override fun getItem(position: Int): Any {
             return detalles[position]
         }

         override fun getItemId(position: Int): Long {
             return position.toLong()
         }

         override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
             var detalle = detalles[position]
             var inflator = LayoutInflater.from(context)
             var vista = inflator.inflate(R.layout.activity_detalle_regalos, null)

             var imagen = vista.findViewById(R.id.iv_regalo_imagen) as ImageView
             var precio = vista.findViewById(R.id.tv_regalo_precio) as TextView

             imagen.setImageResource(detalle.image)
             precio.setText(detalle.precio)

             return vista
         }

     }


}

