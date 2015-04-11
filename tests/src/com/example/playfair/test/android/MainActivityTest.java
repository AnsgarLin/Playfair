package com.example.playfair.test.android;

import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.example.playfair.main.MainActivity;
import com.example.playfair.util.Logger;

import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.SmallTest;
import android.util.Log;

public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

	public MainActivityTest() {
		super(MainActivity.class);
	}
	
	@Before
	public void setUp() throws Exception {
		Logger.d(getClass(), getClass().getName() + " SetUp");
	}

	@After
	public void tearDown() throws Exception {
		Logger.d(getClass(), getClass().getName() + " tearDown");
	}

	@SmallTest
	public void testActivity() {
		assertTrue(true);
	}

}
