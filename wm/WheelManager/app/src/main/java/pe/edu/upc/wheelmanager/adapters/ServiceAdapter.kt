package pe.edu.upc.wheelmanager.adapters

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import pe.edu.upc.wheelmanager.R
import pe.edu.upc.wheelmanager.models.Service

class ServiceAdapter (private val products: ArrayList<Service>, private val context: Context) :
    RecyclerView.Adapter<ServiceAdapter.ServicePrototype>() {

    inner class ServicePrototype(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private lateinit var cvProduct: CardView
        private lateinit var tvName: TextView
        private lateinit var btDelete: ImageButton

        fun bindTo(service: Service) {
            tvName = itemView.findViewById(R.id.tvName)
            btDelete = itemView.findViewById(R.id.btDelete)
            cvProduct = itemView.findViewById(R.id.cvProduct)

            tvName.text = service.name

            btDelete.setOnClickListener {
                products.remove(service)
                this@ServiceAdapter.notifyDataSetChanged()
            }

            cvProduct.setOnClickListener {
                val intent = Intent(context, ServiceAdapter::class.java)
                intent.putExtra("name", service.name)
                (context as Activity).startActivityForResult(intent, 0)
            }
        }
    }

    fun onActivityResult(name: String?){
        products[0].name = name!!
        notifyDataSetChanged()
    }

    // Vista por cada fila de acuerdo al diseño del prototipo
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ServicePrototype {
        val view = LayoutInflater.from(context).inflate(R.layout.prototype_service, parent, false)
        return ServicePrototype(view)
    }

    // Cantidad de elementos del recyclerview
    override fun getItemCount(): Int {
        return products.size
    }

    // Información a mostrar en cada vista
    override fun onBindViewHolder(holder: ServicePrototype, position: Int) {
        holder.bindTo(products[position])
    }
    }
