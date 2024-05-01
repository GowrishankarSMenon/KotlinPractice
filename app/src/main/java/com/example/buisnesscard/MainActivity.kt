package com.example.buisnesscard


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.buisnesscard.ui.theme.BuisnessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BuisnessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                }
            }
        }
    }
}

@Composable
fun ShowMainScreen(modifier: Modifier = Modifier) {
    val userImage = painterResource(id = R.drawable.user)
    val githubLogo =  painterResource(id = R.drawable.github)
    val linkedinLogo =  painterResource(id = R.drawable.linkedin)
    val gmailLogo =  painterResource(id = R.drawable.gmail)
    Row(modifier = modifier.fillMaxHeight().fillMaxWidth()) {
        Column(
            modifier = modifier
                .width(20000.dp)
                .padding(100.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Image(
                painter = userImage, contentDescription = null,
                Modifier
                    .height(250.dp)
                    .padding(start = 10.dp)
            )
            Text(
                text = "Gowrishankar Menon",
                fontSize = 30.sp,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.SansSerif,
            )
            Text(
                text = "Android UI dev",
                fontSize = 24.sp,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
            )

            ContactInfo()


        }
    }
}

@Composable
fun ContactInfo(modifier: Modifier = Modifier) {
    Column(modifier = modifier
        .padding(60.dp)
        .fillMaxWidth()
        .fillMaxHeight(), horizontalAlignment = Alignment.Start) {
        Row(modifier = modifier, horizontalArrangement = Arrangement.Start) {
            Text(text = "Hi guys")
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    BuisnessCardTheme {
        ShowMainScreen()
    }
}