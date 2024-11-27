package com.example.ddi_fouad_examen_1eval

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.ddi_fouad_examen_1eval.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        buttons()
    }

    private fun buttons() {
        binding.buttonBricolaje.setOnClickListener {
            Toast.makeText(this, "Se ha pulsado el Botón 'Bricolaje'", Toast.LENGTH_LONG).show()
        }
        binding.opinions.setOnClickListener {
            Toast.makeText(this, "Se ha pulsado el Botón '25 oponiones'", Toast.LENGTH_LONG).show()
        }

        binding.bottomNavigation.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.item_home -> {
                    Toast.makeText(this, "Se ha pulsado el item 'home'", Toast.LENGTH_LONG).show()
                    true
                }

                R.id.item_shop -> {
                    Toast.makeText(this, "Se ha pulsado el item 'cesta'", Toast.LENGTH_LONG).show()
                    true
                }

                else -> false
            }
        }

        binding.iconStar.setOnCheckedChangeListener{ checkBox, isChecked ->
            if(isChecked){
                Toast.makeText(this, "Seleccionado", Toast.LENGTH_LONG).show()
            } else{
                Toast.makeText(this, "No seleccionado", Toast.LENGTH_LONG).show()
            }
        }
    }
}