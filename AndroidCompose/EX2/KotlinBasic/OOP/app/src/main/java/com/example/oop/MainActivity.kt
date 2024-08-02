package com.example.oop

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.oop.ui.theme.OOPTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            OOPTheme {
                GreetingPreview()
            }
        }
    }
}

@Preview
@Composable
fun GreetingPreview() {
    OOPTheme {
        var people: OpenClassPepel = SubPepleMan("Long", 20)
        people.OpenEyes()

        people = SubPeopleWoman("Long", 20)
        people.OpenEyes()

    }
}