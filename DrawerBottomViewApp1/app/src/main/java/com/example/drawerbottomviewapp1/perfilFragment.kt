package com.example.drawerbottomviewapp1

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton


class perfilFragment : Fragment(R.layout.fragment_perfil) {
    private lateinit var imbt:ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_perfil, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        imbt=view.findViewById(R.id.imbt)

        imbt.setOnClickListener(){
            val ventana:Intent = Intent(context,MainActivity::class.java)
            startActivity(ventana  )
        }
    }

    companion object {

    }
}