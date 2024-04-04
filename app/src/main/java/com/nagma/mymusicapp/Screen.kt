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
            "add-accont",
            R.drawable.ic_add_account
        )
    }
}