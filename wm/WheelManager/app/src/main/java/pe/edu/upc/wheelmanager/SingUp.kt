package pe.edu.upc.wheelmanager

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView
import java.util.*

class SingUp : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sing_up)

        //Declarando variable para el Data Picker
        val tv = findViewById<TextView>(R.id.tv_datePicker)
        val cal = Calendar.getInstance()
        val myYear = cal.get(Calendar.YEAR)
        val myMonth = cal.get(Calendar.MONTH)
        val day = cal.get(Calendar.DAY_OF_MONTH)

        tv.setOnClickListener{
            val datePickerDialog = DatePickerDialog(this,
                DatePickerDialog.OnDateSetListener{ view, year, month, dayOfMonth ->
                tv.text = "Date:" + dayOfMonth + "/ " + (month +1) + "/ " + year
            },myYear,myMonth,day)
            datePickerDialog.show()
        }

        //Spinner
        val spinner = findViewById<Spinner>(R.id.spnElements)
        val list = resources.getStringArray(R.array.genders)
        val adapter = ArrayAdapter(this,android.R.layout.simple_spinner_item,list)
        spinner.adapter = adapter




    }
}