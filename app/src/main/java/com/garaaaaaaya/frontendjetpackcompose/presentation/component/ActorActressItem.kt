package com.garaaaaaaya.frontendjetpackcompose.presentation.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.garaaaaaaya.frontendjetpackcompose.R
import com.garaaaaaaya.frontendjetpackcompose.model.ModelActorActress

@Composable
fun ActorActressItem(
    actorActress: ModelActorActress,
    modifier: Modifier = Modifier
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
    ) {
        Image(
            painter = painterResource(
                id = actorActress.photo
            ),
            contentDescription = "Foto Actor Actress",
            modifier = Modifier
                .width(100.dp)
                .padding(10.dp)
                .border(1.dp, Color.Black, RoundedCornerShape(5))
                .clip(RoundedCornerShape(5))
                .requiredSize(100.dp),

        )
        Text(
            text = actorActress.name,
            fontSize = 13.sp,
            overflow = TextOverflow.Ellipsis,
            maxLines = 1,
            modifier = Modifier
                .padding(bottom = 4.dp)
        )

    }
}

@Preview (showBackground = true)
@Composable
private fun ActorActressItemPreview() {
    ActorActressItem(
        actorActress = ModelActorActress(1, "Song Kang", R.drawable.actoractress_han_sohee)
    )
}