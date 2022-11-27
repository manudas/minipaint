package com.example.android.minipaint

import android.os.Bundle
import android.view.View
import android.view.Window
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val myCanvasView = MyCanvasView(this)

        // hide system UI
        val decorView: View = window.decorView

        WindowCompat.setDecorFitsSystemWindows(window, false)
        val controllerCompat = WindowInsetsControllerCompat(window, decorView)
        controllerCompat.hide(WindowInsetsCompat.Type.systemBars() or WindowInsetsCompat.Type.navigationBars())
        controllerCompat.systemBarsBehavior =
            WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE

        myCanvasView.contentDescription = getString(R.string.canvasContentDescription)
        setContentView(myCanvasView)
    }
}