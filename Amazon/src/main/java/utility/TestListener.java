package utility;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener extends SeleniumUtility implements ITestListener {

	private static String getTestMethodName(ITestResult iTestResult) {
		return iTestResult.getMethod().getConstructorOrMethod().getName();
	}

	public void onStart(ITestContext iTestContext) {
		System.out.println("On Start method " + iTestContext.getName());
//		iTestContext.setAttribute("WebDriver", this.driver);
	}

	public void onFinish(ITestContext iTestContext) {
		System.out.println("On Finish method " + iTestContext.getName());
	}

	public void onTestStart(ITestResult iTestResult) {
		System.out.println("On TestStart method " + getTestMethodName(iTestResult) + " start");
	}

	public void onTestSuccess(ITestResult iTestResult) {
		System.out.println("On TestSuccess method " + getTestMethodName(iTestResult) + " succeed");

	}

	public void onTestFailure(ITestResult iTestResult) {
		System.out.println("On TestFailure method " + getTestMethodName(iTestResult) + " failed");

		// Get driver from BaseTest and assign to local webdriver variable.
		Object testClass = iTestResult.getInstance();
		WebDriver webDriver = ((SeleniumUtility) testClass).getDriver();

		// Take base64Screenshot screenshot.
		String base64Screenshot = "data:image/png;base64,"
				+ ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.BASE64);
	}

	public void onTestSkipped(ITestResult iTestResult) {
		System.out.println("OnTestSkipped method " + getTestMethodName(iTestResult) + " skipped");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
		System.out.println("Test failed but it is in defined success ratio " + getTestMethodName(iTestResult));
	}

}