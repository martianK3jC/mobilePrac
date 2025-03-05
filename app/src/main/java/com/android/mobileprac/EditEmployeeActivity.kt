package com.android.mobileprac

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class EditEmployeeActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_employee)

        //Retrieve data from intent
        val name = intent.getStringExtra("name")
        val department = intent.getStringExtra("department")
        val salary = intent.getStringExtra("salary")
        val joiningDate = intent.getStringExtra("joiningDate")
        val performanceRating = intent.getStringExtra("performanceRating")
        val username = intent.getStringExtra("username")

        //Display data
        findViewById<TextView>(R.id.tvEmployeeName).text = name;
        findViewById<EditText>(R.id.etDepartment).setText(department)
        findViewById<EditText>(R.id.etSalary).setText(salary)
        findViewById<EditText>(R.id.etJoiningDate).setText(joiningDate)
        findViewById<EditText>(R.id.etPerformanceRating).setText(performanceRating)
        findViewById<EditText>(R.id.etUsername).setText(username)

        //Update button
        findViewById<Button>(R.id.btnUpdate).setOnClickListener {
            Toast.makeText(this, "Data Updated", Toast.LENGTH_SHORT).show()
        }

    }
}