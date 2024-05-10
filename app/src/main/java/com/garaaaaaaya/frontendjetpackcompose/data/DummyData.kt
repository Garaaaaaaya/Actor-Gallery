package com.garaaaaaaya.frontendjetpackcompose.data

import com.garaaaaaaya.frontendjetpackcompose.R
import com.garaaaaaaya.frontendjetpackcompose.model.ModelActorActress
import com.garaaaaaaya.frontendjetpackcompose.model.ModelDrama

object DummyData {

    val ActorActress = listOf(
        ModelActorActress(
            id = 1,
            name = "Song Kang",
            photo = R.drawable.actoractress_songkang
        ),
        ModelActorActress(
            id = 2,
            name = "Bae Suzy",
            photo = R.drawable.actoractress_bae_suzy
        ),
        ModelActorActress(
            id = 3,
            name = "Kim Soen-Ho",
            photo = R.drawable.actoractress_kim_soenho
        ),
        ModelActorActress(
            id = 4,
            name = "Han So Hee",
            photo = R.drawable.actoractress_han_sohee
        ),
        ModelActorActress(
            id = 5,
            name = "Kim So Hyun",
            photo = R.drawable.actoractress_kim_sohyun
        ),
        ModelActorActress(
            id = 6,
            name = "Kim Woobin",
            photo = R.drawable.actoractress_kim_woobin
        ),
        ModelActorActress(
            id = 7,
            name = "Kim Jisoo",
            photo = R.drawable.actoractress_kim_jisoo
        ),
        ModelActorActress(
            id = 8,
            name = "Nam Joo Hyuk",
            photo = R.drawable.actoractress_namjoohyuk
        ),
        ModelActorActress(
            id = 9,
            name = "Kim Jiwon",
            photo = R.drawable.actoractress_kim_jiwon
        ),
        ModelActorActress(
            id = 10,
            name = "Yook Sung Jae",
            photo = R.drawable.actoractress_yook_sungjjae
        )

    )

    val Drama = listOf(
        ModelDrama(
            id = 1,
            title = "Queen Of Tears",
            photo = R.drawable.drama_queen_of_tears,
            genre = "Romance, Comedy"
        ),
        ModelDrama(
            id = 2,
            title = "Crash Landing On You",
            photo = R.drawable.cover_cloy,
            genre = "Romance, Comedy"
        ),
        ModelDrama(
            id = 3,
            title = "All of Us are Dead",
            photo = R.drawable.cover_aouad,
            genre = "Horor, Thriller"
        ),
        ModelDrama(
            id = 4,
            title = "Descedants of The Sun",
            photo = R.drawable.cover_dots,
            genre = "Romance, Comedy"
        ),
        ModelDrama(
            id = 5,
            title = "Doone",
            photo = R.drawable.cover_doona,
            genre = "Romance, Comedy"
        ),
        ModelDrama(
            id = 6,
            title = "My Demon",
            photo = R.drawable.cover_mydemon,
            genre = "Romance, Fantasy"
        ),
        ModelDrama(
            id = 7,
            title = "Bussiness Proposal",
            photo = R.drawable.cover_bussinesproposal,
            genre = "Romance, Comedy"
        ),
        ModelDrama(
            id = 8,
            title = "Love Alarm",
            photo = R.drawable.cover_lovealarm,
            genre = "Romance, Fantasy"
        ),
        ModelDrama(
            id = 9,
            title = "Vincenzo",
            photo = R.drawable.cover_vincenzo,
            genre = "Action, Comedy"
        ),
        ModelDrama(
            id = 10,
            title = "Queen Of Tears",
            photo = R.drawable.cover_theglory,
            genre = "Thriller, Drama"
        )
    )

}