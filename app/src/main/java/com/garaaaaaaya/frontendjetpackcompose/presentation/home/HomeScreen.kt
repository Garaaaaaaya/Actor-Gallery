package com.garaaaaaaya.frontendjetpackcompose.presentation.home

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.garaaaaaaya.frontendjetpackcompose.R
import com.garaaaaaaya.frontendjetpackcompose.navigation.NavigationItem
import com.garaaaaaaya.frontendjetpackcompose.navigation.Screen
import com.garaaaaaaya.frontendjetpackcompose.presentation.component.DetailDrama
import com.garaaaaaaya.frontendjetpackcompose.presentation.gallery.GalleryScreen
import com.garaaaaaaya.frontendjetpackcompose.presentation.profile.ProfileScreen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController()
) {

    Scaffold(
        bottomBar = {
            BottomAppBar {
                BottomBar(navController)
            }
        }

    ) { contentPadding ->
        NavHost(
            navController = navController,
            startDestination = Screen.Home.route,
            modifier = Modifier
                .padding(contentPadding)
        ) {
            composable(Screen.Home.route) {
                Home(modifier, navController)
            }

            composable(Screen.Gallery.route) {
                GalleryScreen(modifier = Modifier)
            }

            composable(Screen.Profile.route) {
                ProfileScreen(modifier = Modifier)
            }

            composable(
                Screen.Detail.route + "/{dramaId}",
                arguments = listOf(navArgument("dramaId") { type = NavType.IntType })
            ){navBackStackEntry ->
                DetailDrama(
                    navController = navController,
                    dramaID = navBackStackEntry.arguments?.getInt("dramaId")
                )
            }
        }

    }

}

@Composable
private fun BottomBar(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavigationBar(
        containerColor = MaterialTheme.colorScheme.onPrimary,
        modifier = Modifier
    ) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route

        val NavigationItems = listOf(
            NavigationItem(
                title = stringResource(id = R.string.home_screen),
                icon = Icons.Outlined.Home,
                screen = Screen.Home
            ),
            NavigationItem(
                title = stringResource(id = R.string.gallery_screen),
                icon = Icons.Outlined.FavoriteBorder,
                screen = Screen.Gallery
            ),
            NavigationItem(
                title = stringResource(id = R.string.profile_screen),
                icon = Icons.Outlined.AccountCircle,
                screen = Screen.Profile
            )
        )

        NavigationItems.map { item ->
            NavigationBarItem(
                selected = currentRoute == item.screen.route,
                onClick = {
                    navController.navigate(item.screen.route) {
                        popUpTo(navController.graph.findStartDestination().id) {
                            saveState = true
                        }
                        restoreState = true
                        launchSingleTop = true
                    }
                },
                icon = {
                    Icon(
                        imageVector = item.icon,
                        contentDescription = null
                    )
                },
                label = {
                    Text(
                        text = item.title
                    )
                }
            )
        }

    }
}

@Preview(showBackground = true)
@Composable
private fun HomeScreenPreview() {
    HomeScreen()
}