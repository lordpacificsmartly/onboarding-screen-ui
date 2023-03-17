package com.lordpacific.onboardingscreenui

import androidx.compose.ui.graphics.Color
import com.lordpacific.onboardingscreenui.ui.theme.ColorBlue

data class OnBoardingData(
    val image: Int,
    val title: String,
    val desc: String,
    val backgroundColor:Color,
    val mainColor: Color = ColorBlue
)
