package com.heriparid.android.simplemaven.ui;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

@RunWith(RobolectricTestRunner.class)
public class HomeActivityTest {

	private HomeActivity activity;
	
	@Before
	public void setup(){
		activity = Robolectric.buildActivity(HomeActivity.class).create().get();
	}
	
	@Test
	public void test_activityNotNull(){
		Assert.assertNotNull(activity);
	}
}
