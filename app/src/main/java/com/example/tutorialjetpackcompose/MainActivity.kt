package com.example.tutorialjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.tutorialjetpackcompose.ui.theme.TutorialJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyComponent()
        }
    }
}

@Composable
fun MyTexts() {
    Column() {
        MyText("Hello World")
        MyText("Estoy practicando Jetpack Compose")
    }
}

@Composable
fun MyText(text: String) {
    Text(text)
}

@Composable
fun MyImage() {
    Image(
        painter = painterResource(id = R.drawable.ic_launcher_foreground),
        contentDescription = "Android Logo"
    )
}

@Composable
fun MyComponent(){
    Row {
        MyTexts()
        MyImage()
    }
}

@Preview(showBackground = true)
@Composable
fun MyTextsPreview() {
    MyComponent()
}