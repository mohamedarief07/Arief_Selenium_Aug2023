package retryAndListenner;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailedTC implements IRetryAnalyzer {

	int retryCount = 0;

	@Override
	public boolean retry(ITestResult result) {
		if (retryCount < 3) {
			retryCount++;
			return true;

		}
		return false;
	}

}
