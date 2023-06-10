package com.mobile.practice.common.nav

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.NavHostController
import com.mobile.practice.common.route.LandingScreenRoute
import com.mobile.practice.screen.LandingScreen
import com.mobile.practice.screen.SignInScreen
import com.mobile.practice.screen.SignInViewModel

@Composable
fun LandingNavGraph(
    navController: NavHostController
) {

    NavHost(
        navController = navController,
        startDestination = LandingScreenRoute.Landing.route
    ) {
        composable(route = LandingScreenRoute.Landing.route) {
            LandingScreen(modifier = Modifier) {
                navController.navigate(LandingScreenRoute.SignIn.route) {
                    popUpTo(0)
                }
            }
        }

        composable(route = LandingScreenRoute.SignIn.route) {
            SignInScreen(
                modifier = Modifier,
                viewModel = SignInViewModel()
            )
        }
    }

}

