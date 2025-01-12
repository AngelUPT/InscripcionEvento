package com.example.inscripcioneventos

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.inscripcioneventos.ui.theme.InscripcionEventosTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            InscripcionEventosTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column {
        Text(text = "Nombre")
        OutlinedTextField(value="", onValueChange = {})
        Text(text = "Email")
        OutlinedTextField(value="", onValueChange = {})
        Row (verticalAlignment = Alignment.CenterVertically) {
            RadioButton(selected = false, onClick = { })
            Text(text = "Si")
        }
        Row(verticalAlignment = Alignment.CenterVertically) {
            RadioButton(selected = false, onClick = { })
            Text(text = "No")
        }
        Button (onClick = {}, ) {
            Text(text = "Inscribirse")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    InscripcionEventosTheme {
        Greeting("Android")
    }
}