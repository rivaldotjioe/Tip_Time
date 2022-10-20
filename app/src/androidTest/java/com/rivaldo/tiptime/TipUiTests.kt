package com.rivaldo.tiptime

import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performTextInput
import com.rivaldo.tiptime.ui.theme.TipTimeTheme
import org.junit.Rule
import org.junit.Test

class TipUiTests {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun calculate_20_percent_tip(){
        composeTestRule.setContent { 
            TipTimeTheme {
                TipTimeScreen()
            }
        }
        composeTestRule.onNodeWithText("Cost of Service")
            .performTextInput("10")
        composeTestRule.onNodeWithText("Tip (%)").performTextInput("20")
        composeTestRule.onNodeWithText("Tip amount: $2.00").assertExists()

    }
}