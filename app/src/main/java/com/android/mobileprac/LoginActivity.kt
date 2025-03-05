package com.android.mobileprac

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.android.mobileprac.ui.theme.MobilePracTheme
import com.android.mobileprac.utils.txt

class LoginActivity : Activity() {
    private val staticUsername = "admin"
    private val staticPassword = "password"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        findViewById<Button>(R.id.btnLogin).setOnClickListener {
            val username = findViewById<EditText>(R.id.etUsername).txt()
            val password = findViewById<EditText>(R.id.etPassword).txt()

            if(username == staticUsername && password == staticPassword){
                findViewById<TextView>(R.id.tvLoginMessage).text = "Login Successful!"
            }else{
                findViewById<TextView>(R.id.tvLoginMessage).text = "Invalid credentials"
            }
        }
    }
}