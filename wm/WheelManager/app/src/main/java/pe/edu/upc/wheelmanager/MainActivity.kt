package pe.edu.upc.wheelmanager

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.fragment.app.Fragment
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*
import pe.edu.upc.wheelmanager.FragmentsRL.*

class MainActivity : AppCompatActivity(),NavigationView.OnNavigationItemSelectedListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        val toggle = ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open,R.string.close)
        toggle.isDrawerIndicatorEnabled = true
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        nav_menu.setNavigationItemSelectedListener(this)

        setToolbarTitle(" ")
        changeFragment(Home())

        btnSignup.setOnClickListener{
            val intent = Intent(this,SingUp::class.java)
            startActivity(intent)
        }

        btnSingin.setOnClickListener{
            val intent = Intent(this,SignIn::class.java)
            startActivity(intent)
        }

    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        drawerLayout.closeDrawer(GravityCompat.START)

        when(item.itemId){
            R.id.home ->{
                setToolbarTitle(" ")
                changeFragment(Home())
            }

            R.id.revolutionize ->{
                setToolbarTitle(" ")
                changeFragment(revolutionize())
            }

            R.id.benefits ->{
                setToolbarTitle(" ")
                changeFragment(Benefits())
            }

            R.id.about ->{
                setToolbarTitle(" ")
                changeFragment(About())
            }

            R.id.subscription ->{
                setToolbarTitle(" ")
                changeFragment(SubscriptionPlans())
            }
        }
        return true
    }

    fun setToolbarTitle(title:String){
        supportActionBar?.title = title
    }

    fun changeFragment(frag:Fragment){
        val fragment = supportFragmentManager.beginTransaction()
        //fragment container , and fragment itself
        fragment.replace(R.id.fragment_container,frag).commit()
    }
}