package com.sunupermana.dynamiclink

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.dynamiclinks.FirebaseDynamicLinks


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        dynamicLinkChecker()
    }

    private fun dynamicLinkChecker() {
        intent.data
        FirebaseDynamicLinks.getInstance().getDynamicLink(intent).addOnSuccessListener {
            Log.i("MainActivity", "received!")

            var deepLinks = it
            deepLinks?.let {
                Log.i("MainActivity", "link Not Null! here is: ${deepLinks.link}")
            }
        }.addOnFailureListener(this) {
            Log.e("MainActivity", "error")
        }
    }
}
