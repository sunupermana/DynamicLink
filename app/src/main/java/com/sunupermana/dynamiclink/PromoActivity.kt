package com.sunupermana.dynamiclink

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

/**
 * @author sunupermanajati 2020-02-05.
 */

class PromoActivity  : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val appLinkIntent = intent
        val appLinkAction = appLinkIntent.action
        val appLinkData = appLinkIntent.data
    }

}