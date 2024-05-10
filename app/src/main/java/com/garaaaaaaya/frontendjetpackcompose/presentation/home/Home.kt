package com.garaaaaaaya.frontendjetpackcompose.presentation.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Home(
    modifier: Modifier = Modifier,
    navController: NavController
) {

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "Home - Lazy Column and Rows")
                })
        }

    ) { contentPadding ->

        Column(
            modifier = Modifier
                .padding(contentPadding)
        ) {
            Text(
                text = "Populer Actor Actress",
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(start = 10.dp, bottom = 5.dp)
            )

            HomeScreenRowsColumn(navController)

            Text(
                text = "List Of Korean Drama",
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(start = 10.dp, top = 15.dp)
            )

            HomeScreenColumn(navController)
        }
    }

}

