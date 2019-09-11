package com.example.pocmockito

import android.support.test.filters.LargeTest
import androidx.test.InstrumentationRegistry
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.intent.Intents.intended
import androidx.test.espresso.intent.matcher.IntentMatchers.hasComponent
import androidx.test.espresso.intent.rule.IntentsTestRule
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.runner.AndroidJUnit4
import com.example.pocmockito.feature.MainActivity

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Rule

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
@LargeTest
class ExampleInstrumentedTest {

    @Rule
    @JvmField
    val rule = IntentsTestRule(MainActivity::class.java)


    @Test
    fun useAppContext() {


        onView(withId(R.id.btn_action))
            .perform(click())

      //  intended(hasComponent("com.dominio.app.DashboardActivity"))
    }
}
