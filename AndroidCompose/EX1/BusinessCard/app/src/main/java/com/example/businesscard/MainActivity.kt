package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BusinessCardTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    Meger()
                }
            }
        }
    }
}


@Composable
fun ElementsBody(
    ImgPath: Painter,
    Title: String,
    Body: String,
    Description: String,
    modifier: Modifier = Modifier,
){
    Box {

    }
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
//        modifier = Modifier.padding( top = 100.dp)
    ) {
        Image(
            painter = ImgPath,
            contentDescription = Description,
            Modifier
                .background(Color(0xDF0C1A2C))
                .size(100.dp)
        )
        Text(
            text = Title,
            fontSize = 50.sp
        )
        Text(
            text = Body,
            color = Color(0xD7225317),
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
fun ActiveBody(){
    ElementsBody(ImgPath = painterResource(id = R.drawable.android_logo),
        Title = stringResource(id = R.string.Title),
        Body = stringResource(id = R.string.Body),
        Description = stringResource(id = R.string.Description)
    )
}

@Composable
fun ElementsInfo(
    Icon: androidx.compose.ui.graphics.vector.ImageVector,
    DescriptionIcon: String,
    BodyIcon: String,
    modifier: Modifier = Modifier
){
    Row {
        Icon(
            imageVector = Icon,
            contentDescription = DescriptionIcon,
            modifier = Modifier
                .size(24.dp)
                .padding(end = 8.dp),
            tint = Color(0xFF24791E)
        )
        Text(
            text = BodyIcon
        )
    }
}

@Composable
fun ActiveInfo(){
    Column(
        modifier = Modifier.padding(bottom = 80.dp)
    ) {
        ElementsInfo(Icon = Icons.Default.Phone,
            DescriptionIcon = stringResource(id = R.string.d1),
            BodyIcon = stringResource(id = R.string.Phone),
        )
        ElementsInfo(Icon = Icons.Default.Share,
            DescriptionIcon = stringResource(id = R.string.d2),
            BodyIcon = stringResource(id = R.string.Share)
        )
        ElementsInfo(Icon = Icons.Default.Email,
            DescriptionIcon = stringResource(id = R.string.d3),
            BodyIcon = stringResource(id = R.string.Mail)
        )
    }
}

@Composable
fun Meger(){
    Column(
        modifier = Modifier
            .background(Color(0xF791DBA4))
            .fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        ActiveBody()
        ActiveInfo()
    }
}


@Preview(showBackground = true)
@Composable
fun PreviewActive() {
    BusinessCardTheme {
        Meger()
    }
}