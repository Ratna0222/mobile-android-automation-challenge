package com.example.android.gymondoautomationtest

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TestRule
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class ImageActivityTest
{

    @get:Rule
    var activityTestRule: ActivityTestRule<ImageActivity> = ActivityTestRule(ImageActivity::class.java)

    @Test
    fun image_View(){
        Thread.sleep(10000)
        onView(withId(R.id.appCompatImageView))
            .check(matches(withEffectiveVisibility(ViewMatchers.Visibility.VISIBLE)))

}
}
