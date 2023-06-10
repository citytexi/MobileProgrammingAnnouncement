package com.mobile.practice.common.nav

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.NavHostController
import com.mobile.practice.common.route.LandingScreenRoute

@Composable
fun LandingNavGraph(
    navController: NavHostController
) {

    NavHost(
        navController = navController,
        startDestination = LandingScreenRoute.Landing.route
    ) {
        composable(route = LandingScreenRoute.Landing.route) {

        }

        composable(route = LandingScreenRoute.SignIn.route) {

        }
    }

}

