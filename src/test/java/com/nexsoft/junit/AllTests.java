package com.nexsoft.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ BangunDatarTest.class, CalculatorTest.class, MethodTest.class })
public class AllTests {
	
}
