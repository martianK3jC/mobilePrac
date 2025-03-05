package com.android.mobileprac

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.EditText
import com.android.mobileprac.utils.txt

class DataEntryActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_entry)

        val btnSave = findViewById<Button>(R.id.btnSave);

        btnSave.setOnClickListener {
            val intent = Intent(this, EditEmployeeActivity::class.java).apply {
                putExtra("name", findViewById<EditText>(R.id.etEmplooyeName).txt())
                putExtra("department", findViewById<EditText>(R.id.etDepartment).txt())
                putExtra("salary", findViewById<EditText>(R.id.etSalary).txt())
                putExtra("joiningDate", findViewById<EditText>(R.id.etSalary).txt())
                putExtra("performanceRating", findViewById<EditText>(R.id.etPerformanceRating).txt())
                putExtra("username", findViewById<EditText>(R.id.etUsername).txt())
                putExtra("password", findViewById<EditText>(R.id.etPassword).txt())
            }
            startActivity(intent)
        }
    }
}