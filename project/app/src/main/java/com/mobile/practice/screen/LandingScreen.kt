package com.mobile.practice.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import kotlinx.coroutines.delay

private const val SplashWaitTime: Long = 2000

@Composable
fun LandingScreen(
    modifier: Modifier,
    onTimeoutSignIn: () -> Unit,
) = Box(
    modifier = modifier
        .fillMaxSize()
        .background(color = Color.White),
    contentAlignment = Alignment.Center
) {
    val currentOnTimeoutSignIn by rememberUpdatedState(onTimeoutSignIn)

    LaunchedEffect(onTimeoutSignIn) {
        delay(SplashWaitTime) // Simulates loading things
        currentOnTimeoutSignIn()
    }


    LandingScreenBody()
}

@Composable
fun LandingScreenBody() {
    Text(text = "Landing Screen")
}

@Preview(showBackground = true)
@Composable
fun LandingScreenPreview() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White),
        contentAlignment = Alignment.Center
    ) {
        LandingScreenBody()
    }
}