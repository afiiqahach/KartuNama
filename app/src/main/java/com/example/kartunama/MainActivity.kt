package com.example.kartunama

import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Phone
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kartunama.ui.theme.KartuNamaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            KartuNamaTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    KartuNama()
                }
            }
        }
    }
}

@Composable
fun KartuNama() {
    Surface(color = Color.LightGray) {
        Column (
            modifier = Modifier
              //  .fillMaxWidth()
              //  .fillMaxHeight()
                .fillMaxSize()
                .padding(top = 200.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Column(
                modifier = Modifier,
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally

            ) {
                val image = painterResource(R.drawable.android_logo)
                Image(
                    painter = image,
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(150.dp)
                        .padding(top = 4.dp)
                )
                Text(
                    text = stringResource(R.string.FullName),
                    modifier = Modifier.padding(bottom = 8.dp),
                    fontSize = 32.sp
                )
                Text(
                    text = stringResource(R.string.Title),
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp
                )
            }
            Column(
                modifier = Modifier
                    // .fillMaxWidth()
                    // .fillMaxHeight()
                    .padding(top =100.dp),
                //verticalArrangement = Arrangement.Center,
                //horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row {
                    val PhoneIcons = painterResource(id = R.drawable.ic_phone)
                    Icon(
                        painter = PhoneIcons,
                        contentDescription = "Phone",
                        modifier = Modifier,
                        tint = Color.DarkGray

                    )
                    Text(
                        text = stringResource(R.string.Telp),
                        fontSize = 18.sp,
                        modifier = Modifier.padding(start = 8.dp, bottom = 8.dp),
                        textAlign = TextAlign.Justify,
                    )
                }
                Row {
                    val LinkIcons = painterResource(id = R.drawable.ic_ig)
                    Icon(
                        painter = LinkIcons,
                        contentDescription = "Social Media",
                        modifier = Modifier,
                        tint = Color.DarkGray
                    )
                    Text(
                        text = stringResource(R.string.Link),
                        fontSize = 18.sp,
                        modifier = Modifier.padding(start = 8.dp, bottom = 8.dp),
                        textAlign = TextAlign.Justify,
                    )
                }
                Row {
                    val EmailIcons = painterResource(id = R.drawable.ic_mail)
                    Icon(
                        painter = EmailIcons,
                        contentDescription = "Email",
                        modifier = Modifier,
                        tint = Color.DarkGray
                    )
                    Text(
                        text = stringResource(R.string.Email),
                        fontSize = 18.sp,
                        modifier = Modifier.padding(start = 8.dp, bottom = 8.dp),
                        textAlign = TextAlign.Justify,
                    )
                }

            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    KartuNamaTheme {
        KartuNama()
    }
}