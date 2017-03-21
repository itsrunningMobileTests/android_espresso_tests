package com.example.vijayaragavan.testproject.expressoTest.Page;

import android.support.test.rule.ActivityTestRule;

import com.example.vijayaragavan.testproject.LoginActivity;
import com.example.vijayaragavan.testproject.R;

import org.junit.Rule;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by sripadmasudha on 21/03/17.
 */

public class loginPage {

    private static String username;
    private static String password;
    private LoginActivity mActivity;

//    @Rule
//    public ActivityTestRule<LoginActivity> mActivityRule = new ActivityTestRule(LoginActivity.class);


    private static void login(){

        username = "abc@gmail.com";
        password = "qwerty12345";

//        mActivity = mActivityRule.getActivity();
        onView(withId(R.id.email)).perform(typeText(username));
        onView(withId(R.id.password)).perform(typeText(password));
        onView(withId(R.id.email_sign_in_button)).perform(click());

        onView(withId(R.id.tvResult)).check(matches(withText("Result")));

//        Spoon.screenshot(mActivity, "initial_state");
    }
}
