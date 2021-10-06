package com.example.android.gymondoautomationtest

import androidx.test.core.app.ActivityScenario.launch
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest
{
    @get:Rule
    var activityTestRule: ActivityTestRule<MainActivity> =ActivityTestRule(MainActivity::class.java)

    @Test
    fun  login_App(){
        //Login by entering username and password
        onView(withId(R.id.editText))
            .perform(typeText(MainActivity.USERNAME), closeSoftKeyboard())
        onView(withId(R.id.editText2))
            .perform(typeText(MainActivity.PASSWORD), closeSoftKeyboard())
        onView(withId(R.id.button)).perform(click())
        Thread.sleep(5000)

        }
    }



