package com.example.alertboexshw

import android.content.DialogInterface
import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.alertboexshw.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // question one code here
        binding.question1.setOnClickListener {
            val options = arrayOf("Java or Kotlin", "Html", "Swift", "Assembly")
            val builder = AlertDialog.Builder(this)
            builder.setTitle("What is Language Used For Android Development ?")
            builder.setSingleChoiceItems(options, 0, DialogInterface.OnClickListener { dialog, which ->
                Toast.makeText(this, "You Clicked On ${options[which]}", Toast.LENGTH_SHORT).show()
            })
            builder.setPositiveButton("Submit", DialogInterface.OnClickListener { dialog, which ->

            })
            builder.setNegativeButton("Decline", DialogInterface.OnClickListener { dialog, which ->

            })
            builder.show()
        }

        // question two code here
        binding.question2.setOnClickListener {
            val options = arrayOf("Kotlin", "Php", "Java", "MySql", "XML")
            val builder = AlertDialog.Builder(this)
            builder.setTitle("What are the Language Used For Frontend Android Development ?")
            builder.setMultiChoiceItems(options, null, DialogInterface.OnMultiChoiceClickListener { dialog, which, isChecked ->
                Toast.makeText(this, "You Clicked On ${options[which]}", Toast.LENGTH_SHORT).show()
            })
            builder.setPositiveButton("Submit", DialogInterface.OnClickListener { dialog, which ->

            })
            builder.setNegativeButton("Decline", DialogInterface.OnClickListener { dialog, which ->

            })
            builder.show()
        }

        // question three code here
        binding.question3.setOnClickListener {
            val options = arrayOf("Kotlin", "Java" ,"Php", "Swift", "MySQL")
            val builder = AlertDialog.Builder(this)
            builder.setTitle("What are the Language Used For Backend Android Development ?")
            builder.setMultiChoiceItems(options, null, DialogInterface.OnMultiChoiceClickListener { dialog, which, isChecked ->
                Toast.makeText(this, "You Clicked On ${options[which]}", Toast.LENGTH_SHORT).show()
            })
            builder.setPositiveButton("Submit", DialogInterface.OnClickListener { dialog, which ->

            })
            builder.setNegativeButton("Decline", DialogInterface.OnClickListener { dialog, which ->

            })
            builder.show()
        }

        // exit button code here
        binding.btnExit.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Are you Sure?")
            builder.setMessage("Do you want to close the App")
            builder.setIcon(R.drawable.exit_app)
            builder.setPositiveButton("YES", DialogInterface.OnClickListener { dialog, which ->
                finish()
            })
            builder.setNegativeButton("NO", DialogInterface.OnClickListener { dialog, which ->

            })
            builder.show()
        }

    }
}