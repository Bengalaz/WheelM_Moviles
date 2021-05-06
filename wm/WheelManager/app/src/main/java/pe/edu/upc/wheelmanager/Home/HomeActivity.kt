package pe.edu.upc.wheelmanager.Home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import pe.edu.upc.wheelmanager.R

class HomeActivity : AppCompatActivity() {

    private lateinit var btProduct: Button
    private lateinit var btService: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
    }
}