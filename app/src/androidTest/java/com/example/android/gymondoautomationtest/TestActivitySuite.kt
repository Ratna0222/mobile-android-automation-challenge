package com.example.android.gymondoautomationtest

import org.junit.runner.RunWith
import org.junit.runners.Suite

@RunWith(Suite::class)
@Suite.SuiteClasses
    (
    MainActivityTest :: class,
    ListActivityTest::class,
    ImageActivityTest::class
)
class TestActivitySuite
