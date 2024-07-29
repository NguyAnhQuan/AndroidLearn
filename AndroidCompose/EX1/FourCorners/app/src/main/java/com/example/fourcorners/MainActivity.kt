package com.example.fourcorners

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.fourcorners.ui.theme.FourCornersTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FourCornersTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Actives()
                }
            }
        }
    }
}

@Composable
fun ingredient(
    Title: String,
    Body: String,
    BackgroundColor: Color,
    modifier: Modifier = Modifier,
){
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(BackgroundColor)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = Title,
            modifier = Modifier.padding(bottom = 16.dp),
            fontWeight = FontWeight.Bold
        )
        Text(
            text = Body,
            textAlign = TextAlign.Justify
        )
    }
}

@Composable
fun Actives(){
    Column(Modifier.fillMaxWidth()) {
        Row(Modifier.weight(1f)) {
            ingredient(
                Title = stringResource(id = R.string.Title1),
                Body = stringResource(id = R.string.Body1),
                BackgroundColor = Color(0xFFEADDFF),
                modifier = Modifier.weight(1f)
            )
            ingredient(
                Title = stringResource(id = R.string.Title2),
                Body = stringResource(id = R.string.Body2),
                BackgroundColor = Color(0xFFD0BCFF),
                modifier = Modifier.weight(1f)
            )
        }
        Row(Modifier.weight(1f)) {
            ingredient(
                Title = stringResource(id = R.string.Title3),
                Body = stringResource(id = R.string.Body3),
                BackgroundColor = Color(0xFFB69DF8),
                modifier = Modifier.weight(1f)
            )
            ingredient(
                Title = stringResource(id = R.string.Title4),
                Body = stringResource(id = R.string.Body4),
                BackgroundColor = Color(0xFFF6EDFF),
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewActive(){
    FourCornersTheme {
        Actives()
    }
}