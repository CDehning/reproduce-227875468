package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Column {
        // These crash on Android 7
        // Downloaded from Google Fonts
        Text(text = "Hello $name!", fontFamily = FontFamily(Font(R.font.robotoflexregular)))
        Text(text = "Hello $name!", fontFamily = FontFamily(Font(R.font.robotoflexvariable)))
        // Downloaded from ticket
        Text(text = "Hello $name!", fontFamily = FontFamily(Font(R.font.raleway)))

        // These don't crash
        // Downloaded from Google Fonts
        Text(text = "Hello $name!", fontFamily = FontFamily(Font(R.font.robotoregular)))
        Text(text = "Hello $name!", fontFamily = FontFamily(Font(R.font.opensansregular)))
        Text(text = "Hello $name!", fontFamily = FontFamily(Font(R.font.ralewayregular)))
        Text(text = "Hello $name!", fontFamily = FontFamily(Font(R.font.ralewaythin)))

        // Downloaded from ticket
        Text(text = "Hello $name!", fontFamily = FontFamily(Font(R.font.alegreya_sans_light)))
        Text(text = "Hello $name!", fontFamily = FontFamily(Font(R.font.hind)))
        Text(text = "Hello $name!", fontFamily = FontFamily(Font(R.font.quicksand)))
        Text(text = "Hello $name!", fontFamily = FontFamily(Font(R.font.roboto)))
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyApplicationTheme {
        Greeting("Android")
    }
}