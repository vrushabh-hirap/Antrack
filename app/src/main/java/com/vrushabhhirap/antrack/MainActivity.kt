package com.vrushabhhirap.antrack

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnTeacher = findViewById<Button>(R.id.btnTeacher);
        val btnStudent = findViewById<Button>(R.id.btnStudent);


        btnTeacher.setOnClickListener {
            val intentTeacher = Intent(this, TeacherActivity::class.java)
            intentTeacher.putExtra("Role","Teacher")
            startActivity(intentTeacher)
            Toast.makeText(this, "You are a Teacher!", Toast.LENGTH_SHORT).show()

        }
        btnStudent.setOnClickListener {
            val intentStudent = Intent(this, StudentActivity::class.java)
            intentStudent.putExtra("Role","Student")
            startActivity(intentStudent)
            Toast.makeText(this,"You are a Student", Toast.LENGTH_SHORT).show()
        }


    }
}