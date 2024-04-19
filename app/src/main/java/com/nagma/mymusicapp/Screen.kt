package com.nagma.mymusicapp

import androidx.annotation.DrawableRes

sealed class Screen(val title:String, route:String) {

    sealed class DrawerScreen(
        val dTitle:String,
        val dRoute:String,
        @DrawableRes
        val icon:Int
    ): Screen(dTitle, dRoute) {
        object Account: DrawerScreen(
            "Account",
            "account",
            R.drawable.ic_account
        )

        object Subscription: DrawerScreen(
            "Subscription",
            "subscribe",
            R.drawable.ic_subscribe
        )

        object addAccount: DrawerScreen(
            "Add Account",
            "add_account",
            R.drawable.ic_add_account
        )
    }
}

val screensInDrawer = listOf(
    Screen.DrawerScreen.Account,
    Screen.DrawerScreen.Subscription,
    Screen.DrawerScreen.addAccount
)