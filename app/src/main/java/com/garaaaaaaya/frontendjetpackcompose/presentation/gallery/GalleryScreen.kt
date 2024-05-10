package com.garaaaaaaya.frontendjetpackcompose.presentation.gallery

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.garaaaaaaya.frontendjetpackcompose.data.DummyData
import com.garaaaaaaya.frontendjetpackcompose.model.ModelActorActress

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GalleryScreen(
    actorActress: List<ModelActorActress> = DummyData.ActorActress,
    modifier: Modifier
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                Text(text = "Gallery - Staggered Grid")
            })
        }

    ) {contentPadding ->
        GalleryScreenGrid(
            modifier = Modifier
                .padding(contentPadding)
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun GalleryScreenPreview() {

    GalleryScreen(modifier = Modifier)

}