package com.example.vijayaragavan.testproject.expressoTest;

import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.example.vijayaragavan.testproject.LoginActivity;

import com.squareup.spoon.Spoon;
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

@LargeTest
@RunWith(AndroidJUnit4.class)
public class loginTest {


    private String username;
    private String password;
    private LoginActivity mActivity;

    @Rule
    public ActivityTestRule<LoginActivity> main = new ActivityTestRule(LoginActivity.class);

    @Before
    public void setup(){
        mActivity = main.getActivity();
        username = "abc@gmail.com";
        password = "qwerty12345";


        onView(withId(R.id.email)).perform(typeText(username));
        onView(withId(R.id.password)).perform(typeText(password));
        onView(withId(R.id.email_sign_in_button)).perform(click());

        onView(withId(R.id.tvResult)).check(matches(withText("Result")));


    }

    @Test
    public void test(){
        System.out.println("&&&&&&&");
    }


}
