package com.android.robotiumtest;

import android.test.ActivityInstrumentationTestCase2;

import com.robotium.solo.Solo;

public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

    private Solo solo;

    public MainActivityTest() {
        super(MainActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        solo = new Solo(getInstrumentation(), getActivity());
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
        //solo.finishOpenedActivities();
    }

    public void testOnCreate() throws Exception {
        //Unlock the lock screen
        solo.unlockScreen();
        solo.clickOnEditText(0);
        solo.enterText(0, "Hello World!!!");
        solo.clickOnButton(0);
        System.out.println("!@#$%^&*()");
        System.out.println(solo.getEditText(1).toString());

        assertEquals(solo.getEditText(0).getText().toString(),solo.getEditText(1).getText().toString());
        //EditText input =(EditText)getActivity().findViewById(R.id.txtInput);
        //EditText result =(EditText)getActivity().findViewById(R.id.txtResult);
        //assertEquals(input.getText().toString(),result.getText().toString());
    }
}