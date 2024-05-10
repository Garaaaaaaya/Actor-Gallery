package com.garaaaaaaya.frontendjetpackcompose.presentation.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.garaaaaaaya.frontendjetpackcompose.model.ModelDrama

@Composable
fun DramaItem(
    drama: ModelDrama,
    modifier: Modifier = Modifier,
    onItemClicked: (Int) -> Unit
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .clickable { onItemClicked(drama.id) }
            .fillMaxWidth()
            .padding(top = 10.dp, bottom = 10.dp, end = 10.dp)
    ) {

        Image(
            painter = painterResource(id = drama.photo),
            contentDescription = "Album Drama",
            modifier = Modifier
                .width(100.dp)
        )

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .border(4.dp, color = Color.Gray, shape = RoundedCornerShape(5))
                .padding(25.dp)
        ) {
            Text(
                text = drama.title,
                fontSize = 30.sp,
                overflow = TextOverflow.Ellipsis,
                maxLines = 1,
                modifier = Modifier
                    .align(Alignment.Start)

            )
            Text(
                text = drama.genre,
                color = Color(android.graphics.Color.parseColor("#64569A")),
                modifier = Modifier
                    .align(Alignment.Start)
            )

        }
    }

}