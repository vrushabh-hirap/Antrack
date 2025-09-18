package com.vrushabhhirap.antrack

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import android.widget.Toolbar
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.vrushabhhirap.antrack.databinding.ActivityTeacherBinding

class TeacherActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityTeacherBinding

    // In your TeacherActivity.kt - onCreate method
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_teacher)

        // Setup toolbar
        val toolbar: androidx.appcompat.widget.Toolbar? = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.apply {
            title = "Teacher Dashboard"
            setDisplayHomeAsUpEnabled(true) // Optional: adds back arrow
        }

        val btnAddClass = findViewById<Button>(R.id.btnAddClass);


        btnAddClass.setOnClickListener {
            setContentView(R.layout.dialog_add_class)
        }
        // Set toolbar title color to white
        toolbar?.setTitleTextColor(ContextCompat.getColor(this, android.R.color.white))
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_content_teacher)
        return navController.navigateUp(appBarConfiguration)
                || super.onSupportNavigateUp()
    }
}