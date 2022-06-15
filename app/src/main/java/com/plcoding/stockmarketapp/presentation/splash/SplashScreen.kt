package com.plcoding.stockmarketapp.presentation.splash

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.plcoding.stockmarketapp.presentation.destinations.CompanyListingsScreenDestination
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import kotlinx.coroutines.delay

@Composable
@Destination(start = true)
fun SplashScreen(navigator: DestinationsNavigator){
    var visible by remember { mutableStateOf(false) }
    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
            ) {

        AnimatedVisibility(
            visible = visible,
            enter = fadeIn(animationSpec = tween(durationMillis = 1000))
        ) {
            Text(
                text = "Stocks Inspector",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Green
            )
        }

        LaunchedEffect(key1 = true) {
            delay(200)
            visible = true
            delay(1800)
            navigator.navigate(
                CompanyListingsScreenDestination()
            )
        }
    }

}