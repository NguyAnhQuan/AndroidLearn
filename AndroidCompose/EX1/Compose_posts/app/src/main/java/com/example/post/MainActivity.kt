package com.example.post

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.post.ui.theme.PostTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PostTheme {
                Surface(modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ComposeActiveApp()
                }
            }
        }
    }
}

@Composable
fun ComposeActiveApp(){
    ArticleCard(
        Title = stringResource(R.string.Compose_Tile),
        BodySort = stringResource(R.string.Compose_Sort),
        BodyLong = stringResource(R.string.Compose_Long),
        ImgPath = painterResource(R.drawable.bg_compose_background))
}

@Composable
fun ArticleCard(
    Title: String,
    BodySort: String,
    BodyLong: String,
    ImgPath: Painter,
    modifier: Modifier = Modifier,
){
    Column(modifier = modifier) {
        Image(painter = ImgPath, contentDescription = stringResource(R.string.imgHeader))
        Text(
            text = Title,
            modifier = Modifier.padding(16.dp),
            fontSize = 24.sp
        )
        Text(
            text = BodySort,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp),
            textAlign = TextAlign.Justify
        )
        Text(
            text = BodyLong,
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ComposePostsPreview(){
    PostTheme {
        ComposeActiveApp()
    }
}