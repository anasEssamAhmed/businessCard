package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFFECECEC)
                ) {
                }
            }
        }
    }
}

@Composable
fun bodyOfBusinessCard(name: String, work: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.lego)
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier.padding(start = 100.dp, end = 100.dp)
        )
        Text(
            text = name,
            fontSize = 30.sp,
            fontFamily = FontFamily.SansSerif,
            modifier = Modifier.padding(top = 5.dp)
        )
        Text(
            text = work,
            fontSize = 25.sp,
            fontFamily = FontFamily.SansSerif,
            modifier = Modifier.padding(top = 5.dp),
            style = TextStyle(color = Color(0xFF2E8B57))
        )
    }

}

@Composable
fun ImageWithText() {
    val telImage = painterResource(R.drawable.phone_call)
    val shareImage = painterResource(R.drawable.shareme)
    val emailImage = painterResource(R.drawable.email)

    Box(
        modifier = Modifier.fillMaxSize()
            .padding(20.dp)
        ,
        contentAlignment = Alignment.BottomCenter,
    ) {
        Column{
            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(bottom = 10.dp)
            ) {
                Image(
                    painter = telImage,
                    contentDescription = null,
                    modifier = Modifier.size(30.dp)
                )
                Text(
                    text = "0567658945",
                    modifier = Modifier.padding(start = 10.dp)
                )
            }
            Row(
                verticalAlignment = Alignment.Bottom,
                modifier = Modifier.padding(bottom = 10.dp)
            ) {
                Image(
                    painter = shareImage,
                    contentDescription = null,
                    modifier = Modifier.size(30.dp)
                )
                Text(
                    text = "@AnasAhmed",
                    modifier = Modifier.padding(start = 10.dp)
                )
            }
            Row(
                verticalAlignment = Alignment.Bottom,
                horizontalArrangement = Arrangement.Center,
            ) {
                Image(
                    painter = emailImage,
                    contentDescription = null,
                    modifier = Modifier.size(30.dp)
                )
                Text(
                    text = "anasps201@gmail.com",
                    modifier = Modifier.padding(start = 10.dp)
                )
            }
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    BusinessCardTheme {
        bodyOfBusinessCard("Anas Ahmed", "Android Developer")
        ImageWithText()
    }
}