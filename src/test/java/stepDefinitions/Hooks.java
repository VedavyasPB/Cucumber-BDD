package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	@Before("@NetBanking")
	public void netbankingSetup() {
		System.out.println("*********************");
		System.out.println("setup entries in netbanking database");
	}

	@After
	public void tearDown() {
		System.out.println("clear  entries");
		System.out.println("*********************");
	}

	@Before("@Mortgage")
	public void mortgageSetup() {
		System.out.println("*********************");
		System.out.println("setup entries in mortgage database");
	}
}
