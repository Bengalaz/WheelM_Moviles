package pe.edu.upc.wheelmanager.Service

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import pe.edu.upc.wheelmanager.R
import pe.edu.upc.wheelmanager.adapters.ServiceAdapter
import pe.edu.upc.wheelmanager.models.Service

class MainActivity : AppCompatActivity() {

    private lateinit var btAdd: Button
    private lateinit var etName: EditText
    private lateinit var rvServices: RecyclerView

    private var services = ArrayList<Service>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_service_main)
        initViews()
        initListeners()
    }

    private fun initListeners() {
        btAdd.setOnClickListener {
            val name = etName.text.toString()
            val service = Service(name)
            if (name.isEmpty()) {
                Toast.makeText(this, "Product's name is missing", Toast.LENGTH_SHORT).show()
            } else {
                services.add(service)
                rvServices.adapter?.notifyDataSetChanged()
            }
        }
    }

    private fun initViews() {
        btAdd = findViewById(R.id.btAdd)
        etName = findViewById(R.id.etName)
        rvServices = findViewById(R.id.rvProducts)

        val productAdapter = ServiceAdapter(services, this)
        rvServices.adapter = productAdapter
        rvServices.layoutManager = LinearLayoutManager(this)
    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (resultCode == Activity.RESULT_OK){
            if (requestCode == 0) {
                val name = data?.getStringExtra("name")
                (rvServices.adapter as ServiceAdapter).onActivityResult(name)
            }
        }
        super.onActivityResult(requestCode, resultCode, data)
    }
}