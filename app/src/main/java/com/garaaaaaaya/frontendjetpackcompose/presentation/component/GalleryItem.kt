package com.garaaaaaaya.frontendjetpackcompose.presentation.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.garaaaaaaya.frontendjetpackcompose.R
import com.garaaaaaaya.frontendjetpackcompose.model.ModelActorActress

@Composable
fun GalleryItem (
    gallery: ModelActorActress,
    modifier: Modifier = Modifier
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
    ) {
        Image(
            painter = painterResource(id = gallery.photo),
            contentDescription = null,
            modifier = Modifier
                .width(100.dp)
                .padding(top = 6.dp, bottom = 20.dp, start = 6.dp, end = 6.dp)
                .border(1.dp, Color.Black, RectangleShape)
                .fillMaxWidth()
        )

    }
}

@Composable
@Preview (showBackground = true)
private fun GalleryItemPreview() {
    GalleryItem(ModelActorActress(1, "Songkang", R.drawable.actoractress_songkang))
}