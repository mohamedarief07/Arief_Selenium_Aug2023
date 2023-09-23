package retryAndListenner;

import java.security.NoSuchProviderException;
import java.util.NoSuchElementException;

import org.testng.annotations.Test;

public class LearnRetry {

	@Test
	public void createLead() {
		System.out.println("create Lead -");

	}

	@Test
	public void editLead() {
		System.out.println("Edit Lead -");

	}

	@Test
	public void deleteLead() throws InterruptedException {
		System.out.println("Delete Lead -");
		// Thread.sleep(15000);
		throw new NoSuchElementException();
	}

	@Test
	public void duplicateLead() {

		System.out.println("Duplicate Lead -");

	}

	@Test
	public void mergeLead() {
		System.out.println("Merge Lead -");

	}
}
