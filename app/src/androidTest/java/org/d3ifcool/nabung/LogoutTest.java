package org.d3ifcool.nabung;

import android.util.Log;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.Buffer;

import androidx.test.espresso.Espresso;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import static androidx.test.espresso.Espresso.onData;
import static androidx.test.espresso.action.ViewActions.clearText;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.longClick;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.RootMatchers.isDialog;
import static androidx.test.espresso.matcher.ViewMatchers.isCompletelyDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.anything;
import static org.hamcrest.core.AllOf.allOf;

@RunWith(AndroidJUnit4.class)
public class LogoutTest {
    @Rule
    public ActivityTestRule<LoginActivity> mLoginTestRule = new ActivityTestRule<>(LoginActivity.class);

    @Before
    public void init() {
        mLoginTestRule.getActivity();
    }

    @Test
    public void logoutTest() throws InterruptedException, IOException {


//      Login
        String username = "veverorooo@gmail.com";
        String password = "satuduatiga";

        //      Stage Login
        Espresso.onView(withId(R.id.et_email_login)).perform(typeText(username), closeSoftKeyboard());
        Espresso.onView(withId(R.id.et_password_login)).perform(typeText(password), closeSoftKeyboard());
        Espresso.onView(withId(R.id.bt_login)).perform(click());
        Thread.sleep(5000);


        //klik nav profile
        Espresso.onView(withId(R.id.navigation_profile)).perform(click());
        Espresso.onView(withId(R.id.bt_logout)).perform(click());
        Thread.sleep(2000);

    }
}