package com.garaaaaaaya.frontendjetpackcompose.presentation.home

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.garaaaaaaya.frontendjetpackcompose.data.DummyData
import com.garaaaaaaya.frontendjetpackcompose.model.ModelDrama
import com.garaaaaaaya.frontendjetpackcompose.navigation.Screen
import com.garaaaaaaya.frontendjetpackcompose.presentation.component.DramaItem

@Composable
fun HomeScreenColumn(
    navController: NavController,
    drama: List<ModelDrama> = DummyData.Drama) {
    LazyColumn(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 10.dp)
    ) {
        items(drama, key = { it.id }){
            DramaItem(drama = it){ dramaId ->
                navController.navigate(Screen.Detail.route + "/$dramaId")
            }
        }
    }
}