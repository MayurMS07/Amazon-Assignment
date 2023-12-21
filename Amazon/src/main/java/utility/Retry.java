package utility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
 
public class Retry implements IRetryAnalyzer {
 
    private int count = 0;
    private static int maxTry = 2; //Run the failed test 2 times
 
    public boolean retry(ITestResult iTestResult) {
        if (!iTestResult.isSuccess()) {                      
            if (count < maxTry) {                            
                count++;                                     
                return true;                                 
            }
        }
        return false;
    }
}