package com.garaaaaaaya.frontendjetpackcompose.presentation.component

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.garaaaaaaya.frontendjetpackcompose.data.DummyData
import com.garaaaaaaya.frontendjetpackcompose.model.ModelDrama

@Composable
fun DetailDrama(
    modifier: Modifier = Modifier,
    navController: NavController,
    dramaID: Int?
) {
    val dramaList = DummyData.Drama.filter { drama ->
        drama.id == dramaID
    }

    Column(
        modifier = Modifier
    ) {
        DramaDetail(newDramaList = dramaList, navController)
    }
    
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun DramaDetail(
    newDramaList: List<ModelDrama>,
    navController: NavController,
    modifier: Modifier = Modifier
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(16.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Filled.ArrowBackIosNew,
                            contentDescription = null,
                            modifier = Modifier
                                .clickable {
                                    navController.popBackStack()
                                }
                            )
                        Text(
                            text = "Detail Drama",
                            modifier = Modifier
                        )
                    }
                }
            )
        }
    ) {contentPadding ->
        Row(
            modifier = Modifier
                .padding(contentPadding)
        ) {
            Column(
                verticalArrangement = Arrangement.spacedBy(4.dp),
                modifier = Modifier
                    .padding(10.dp)
                    .fillMaxSize()
            ) {

                Column(
                    modifier = Modifier
                        .height(250.dp)
                        .border(
                            1.dp,
                            Color.Black,
                            RoundedCornerShape(10.dp)
                        )
                        .clip(RoundedCornerShape(10.dp))
                ) {
                    
                    AsyncImage(
                        model = ImageRequest.Builder(LocalContext.current)
                            .data(data = newDramaList[0].photo)
                            .build(),
                        contentScale = ContentScale.FillWidth,
                        modifier = Modifier
                            .wrapContentSize()
                            .fillMaxSize(),
                        contentDescription = "Gambar Detail Drama",
                    )
                }

                Text(
                    text = newDramaList[0].title,
                    fontSize = 30.sp,
                    modifier = Modifier
                        .padding(3.dp)

                )

                Text(
                    text = newDramaList[0].genre,
                    color = Color(android.graphics.Color.parseColor("#64569A")),
                    modifier = Modifier
                        .padding(start = 10.dp)
                )

            }

        }
    }
}