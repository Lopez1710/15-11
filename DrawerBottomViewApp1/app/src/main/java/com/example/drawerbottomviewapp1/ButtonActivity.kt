package com.example.drawerbottomviewapp1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class ButtonActivity : AppCompatActivity() {
    private lateinit var btmenu:BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_button)

        var inicioFragment = InicioFragment()
        var mensajeFragment = mensajeFragment()
        var perfilFragment = perfilFragment()

        btmenu=findViewById(R.id.bnv_Menu)
        btmenu.setOnNavigationItemReselectedListener {
            when(it.itemId){
                R.id.myinicio->{
                    setfragmentactual(inicioFragment)
                }
                R.id.mymensaje->{
                    setfragmentactual(mensajeFragment)
                }
                R.id.myperfil->{
                    setfragmentactual(perfilFragment)
                }
            }
        }
    }

    private fun setfragmentactual(fragment:Fragment)=supportFragmentManager.beginTransaction().apply{
        replace(R.id.fl_vista,fragment)
        commit()
    }
}