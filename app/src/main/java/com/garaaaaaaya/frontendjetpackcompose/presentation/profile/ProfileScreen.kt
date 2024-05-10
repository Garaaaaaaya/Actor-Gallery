package com.garaaaaaaya.frontendjetpackcompose.presentation.profile

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.garaaaaaaya.frontendjetpackcompose.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProfileScreen(modifier: Modifier) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { 
                    Text(text = "Profile Menu")
                }
            )
        }
    ) {
        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
                .padding(it),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            Image(
                painter = painterResource(id = R.drawable.tegar_wibisana),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .padding(horizontal = 16.dp)
                    .border(
                        1.dp,
                        Color.Black,
                        RectangleShape
                    )
                    .height(200.dp)
            )

            Spacer(modifier = Modifier.padding(vertical = 15.dp))

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .padding(20.dp)
                    .border(1.dp, Color.Black, RoundedCornerShape(20.dp))
                    .fillMaxWidth()
            ) {
                Text(
                    text = "Nama",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Black,
                    textDecoration = TextDecoration.Underline,
                    modifier = Modifier
                        .padding(top = 8.dp)

                )
                Text(
                    text = "Tegar Wibisana",
                    fontSize = 25.sp,
                    modifier = Modifier
                        .padding(bottom = 8.dp)
                )
            }

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .padding(20.dp)
                    .border(1.dp, Color.Black, RoundedCornerShape(20.dp))
                    .fillMaxWidth()
            ) {
                Text(
                    text = "Email",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Black,
                    textDecoration = TextDecoration.Underline,
                    modifier = Modifier
                        .padding(top = 8.dp)

                )
                Text(
                    text = "Tegarwibisanaa@gmail.com",
                    fontSize = 25.sp,
                    modifier = Modifier
                        .padding(bottom = 8.dp)
                )
            }

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .padding(20.dp)
                    .border(1.dp, Color.Black, RoundedCornerShape(20.dp))
                    .fillMaxWidth()
            ) {
                Text(
                    text = "Universitas",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Black,
                    textDecoration = TextDecoration.Underline,
                    modifier = Modifier
                        .padding(top = 8.dp)

                )
                Text(
                    text = "UPN Veteran Yogyakarta ",
                    fontSize = 25.sp,
                    modifier = Modifier
                        .padding(bottom = 8.dp)
                )
            }

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .padding(20.dp)
                    .border(1.dp, Color.Black, RoundedCornerShape(20.dp))
                    .fillMaxWidth()
            ) {
                Text(
                    text = "Jurusan",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Black,
                    textDecoration = TextDecoration.Underline,
                    modifier = Modifier
                        .padding(top = 8.dp)

                )
                Text(
                    text = "Informatika",
                    fontSize = 25.sp,
                    modifier = Modifier
                        .padding(bottom = 8.dp)
                )
            }
        }
    }
}

@Preview (showBackground = true)
@Composable
private fun ProfileScreenPreview() {
    ProfileScreen(modifier = Modifier)
}
