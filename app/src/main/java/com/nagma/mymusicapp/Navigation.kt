package com.nagma.mymusicapp

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun navigation(navController: NavController,
               viewModel: MainViewModel,
               pd: PaddingValues) {
    NavHost(
        navController = navController as NavHostController,
        startDestination = Screen.DrawerScreen.addAccount.dRoute,
        modifier = Modifier.padding(pd)) {
        composable(Screen.DrawerScreen.addAccount.dRoute) {

        }

        composable(Screen.DrawerScreen.Subscription.dRoute) {

        }
    }

}