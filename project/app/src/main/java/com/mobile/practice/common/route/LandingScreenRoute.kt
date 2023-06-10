package com.mobile.practice.common.route

sealed class LandingScreenRoute(val route: String) {

    object Landing : LandingScreenRoute("landing")
    object SignIn : LandingScreenRoute("sign_in")

}
