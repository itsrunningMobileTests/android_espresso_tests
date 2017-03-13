package com.example.vijayaragavan.testproject.expressoTest;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.example.vijayaragavan.testproject.LoginActivity;

import com.example.vijayaragavan.testproject.R;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.Espresso.closeSoftKeyboard;
import static android.support.test.espresso.Espresso.*;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
//import android.support.


import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by Vijayaragavan on 13/03/17.
 */


@RunWith(AndroidJUnit4.class)
public class loginTest {


    private String username;
    private String password; ;



    @Rule
    public ActivityTestRule<LoginActivity> mActivityRule = new ActivityTestRule(LoginActivity.class);

    @Before
    public void userCredentials(){
        username = "abc@gmail.com";
        password = "qwerty12345";

    }

    @Test
    public void testlogin()
    {
        onView(withId(R.id.email)).perform(typeText(username));
        onView(withId(R.id.password)).perform(typeText(password));
        onView(withId(R.id.email_sign_in_button)).perform(click());

        onView(withId(R.id.tvResult)).check(matches(withText("result")));
    }

}
