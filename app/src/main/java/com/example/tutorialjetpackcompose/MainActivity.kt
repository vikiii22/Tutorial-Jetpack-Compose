package com.example.tutorialjetpackcompose

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tutorialjetpackcompose.ui.theme.TutorialJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TutorialJetpackComposeTheme() {
                MyComponent()
            }
        }
    }
}

@Composable
fun MyTexts() {
    Column(modifier = Modifier.padding(start = 16.dp, top = 16.dp, end = 16.dp, bottom = 16.dp)) {
        MyText("Hello World", MaterialTheme.colors.onBackground, MaterialTheme.typography.subtitle1)
        Spacer(modifier = Modifier.height(16.dp))
        MyText("Estoy practicando Jetpack Compose", MaterialTheme.colors.onBackground, MaterialTheme.typography.subtitle2)
    }
}

@Composable
fun MyText(text: String, color: Color, style: TextStyle) {
    Text(text, color = color, style = style)
}

@Composable
fun MyImage() {
    Image(
        painter = painterResource(id = R.drawable.ic_launcher_foreground),
        contentDescription = "Android Logo",
        modifier = Modifier
            .clip(CircleShape)
            .background(MaterialTheme.colors.primary)
            .size(50.dp)
    )
}

@Composable
fun MyComponent(){
    Row(modifier = Modifier
        .background(MaterialTheme.colors.background)
        .padding(16.dp)
    ) {
        MyTexts()
        MyImage()
    }
}

@Preview()
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun MyTextsPreview() {
    MyComponent()
}