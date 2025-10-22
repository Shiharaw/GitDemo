package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks {
	
	@Before("@NetBanking")
	public void netBankingSetup() {
		System.out.println("***************************************");
		System.out.println("Setup enries in the Netbanking database");
	}
	
	@After public void teardown() {
		System.out.println("Clear the entries");
	}
	
	@Before("@Mortgage")
	public void mortgageSetup() {
		System.out.println("*************************************");
		System.out.println("Setup enries in the Mortgage database");
		
		//Changes to file for JIT demo purpose ShiharaW
		System.out.println("*************************************");
		System.out.println("Setup enries in the Mortgage database");
	}
	
	@Before("@Mortgage")
	public void mortgageSetup1() {
		System.out.println("*************************************");
		System.out.println("Setup enries in the Mortgage database1");
		
		//Changes to file for JIT demo purpose ShiharaW
		System.out.println("*************************************");
		System.out.println("Setup enries in the Mortgage database1");
	}

}

//Before > Background > Scenario > After
