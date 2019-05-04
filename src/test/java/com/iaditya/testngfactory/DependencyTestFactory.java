package com.iaditya.testngfactory;

import org.testng.annotations.Factory;

import com.iaditya.testng.FactoryDependencyTest;

/**
 * Simple Factory class to trigger dependency tests
 * 
 * @author adityai
 *
 */
public class DependencyTestFactory {
	
	/**
	 * Simple Factory method to trigger dependency tests
	 * 
	 * @return
	 */
    @Factory
    public Object[] factoryMethod() 
    {
        return new Object[] { new FactoryDependencyTest(1), new FactoryDependencyTest(2) };
    }
}
