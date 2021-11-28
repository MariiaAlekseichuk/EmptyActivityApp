package com.example.emptyactivityapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

const val APP_TAG = "Empty_Activity_App"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(APP_TAG, "Крылышкуя золотописьмом")
    }

    override fun onStart() {
        super.onStart()
        Log.d(APP_TAG, "Тончайших жил,")
    }

    override fun onResume() {
        super.onResume()
        Log.d(APP_TAG, "Кузнечик в кузов пуза уложил")
    }

    override fun onPause() {
        super.onPause()
        Log.d(APP_TAG, "Прибрежных много трав и вер.")
    }

    override fun onStop() {
        super.onStop()
        Log.d(APP_TAG, "«Пинь, пинь, пинь!» — тарарахнул зинзивер.")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(APP_TAG, "О, лебедиво! О, озари!")
    }
}