package com.duke.listeners;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.duke.utilities.TestUtils;

public class customListner implements ITestListener{

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {
		System.setProperty("org.uncommons.reportng.escape-output", "false");
		Reporter.log("Capturing Screenshot !!!");
		try {
			TestUtils.getInstance().captureScreenshotAsJPG("Failed");
		} catch (IOException e) {
			e.printStackTrace();
		}
		/*Reporter.log("<a target=\"_blank\" href=\""+ System.getProperty("user.dir") + "\\screenShots\\" + "failed" + "+\""
				+ " height=300 width=300>Click here for screenshot</a>");*/
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}