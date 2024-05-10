package com.garaaaaaaya.frontendjetpackcompose.presentation.home

import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.garaaaaaaya.frontendjetpackcompose.data.DummyData
import com.garaaaaaaya.frontendjetpackcompose.model.ModelActorActress
import com.garaaaaaaya.frontendjetpackcompose.model.ModelDrama
import com.garaaaaaaya.frontendjetpackcompose.presentation.component.ActorActressItem

@Composable
fun HomeScreenRowsColumn(
    navController: NavController,
    actorActress: List<ModelActorActress> = DummyData.ActorActress,
    drama: List<ModelDrama> = DummyData.Drama
) {

    LazyRow {
        items(actorActress) {
            ActorActressItem(
                actorActress = it
            )
        }
    }

}
