package com.example.alertdialogueboxes

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.alertdialogueboxes.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // for button 1 for app exit or not
        binding.btn1.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Are You Sure?")
            builder.setMessage("Do you want to close the App.")
            builder.setIcon(R.drawable.exit_app)
            builder.setPositiveButton("YES",DialogInterface.OnClickListener { dialog, which ->
                //   what action should be perform when yes is clicked
                finish()
            })
            builder.setNegativeButton("NO",DialogInterface.OnClickListener { dialog, which ->
                // what action should be perform when no is clicked

            })
            builder.show()
        }

        // for button 2 for single option show
        binding.btn2.setOnClickListener {
            val options = arrayOf("Gulab Jamun", "Rasmallai", "Kaju Katli", "Normal Misti")
            val builder2 = AlertDialog.Builder(this)
            builder2.setTitle("Which is your favourite sweets ?")
            builder2.setSingleChoiceItems(options, 0,DialogInterface.OnClickListener { dialog, which ->
                // what action should be perform when user clicks on any options
                Toast.makeText(this, "You Clicked on ${options[which]}",Toast.LENGTH_SHORT).show()
            })
            builder2.setPositiveButton("Submit", DialogInterface.OnClickListener { dialog, which ->
                // what action should be perform when submit is click
            })
            builder2.setNegativeButton("Decline", DialogInterface.OnClickListener { dialog, which ->
                // what action should be perform when decline is click
            })
            builder2.show()
        }

        // for button 3 for multi pol options show
        binding.btn3.setOnClickListener {
            val options = arrayOf("Gulab Jamun", "Rasmallai", "Kaju Katli", "Normal Misti")
            val builder3 = AlertDialog.Builder(this)
            builder3.setTitle("How many Sweets do you like in this item ?")
            builder3.setMultiChoiceItems(options,null,DialogInterface.OnMultiChoiceClickListener { dialog, which, isChecked ->
                Toast.makeText(this, "You Clicked On ${options[which]}", Toast.LENGTH_SHORT).show()
            })
            builder3.setPositiveButton("Submit", DialogInterface.OnClickListener { dialog, which ->

            })
            builder3.setNegativeButton("Decline", DialogInterface.OnClickListener { dialog, which ->

            })
            builder3.show()
        }

    }
}