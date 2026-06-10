package com.modularhub.feature.cart.standalone

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.modularhub.feature.cart.CartFeature

class StandaloneActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(android.R.id.content, CartFeature.createFragment())
                .commit()
        }
    }
}
