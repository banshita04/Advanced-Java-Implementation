package com.cg.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

class CalculatorTest {

	public CalculatorTest() {
		// TODO Auto-generated constructor stub
		System.out.println("---Constructor Test---");
	}

	Calculator c = new Calculator();

	@Test
	@DisplayName("TESTCASE_FOR_ADD")
	void testAdd() {
		//		fail("Not yet implemented");
		//		Calculator c = new Calculator();
		int result = c.add(5, 8);

		assertEquals(13, result);
	}

	@Test
	@DisplayName("TESTCASE_FOR_PRODUCT")
	void testProduct() {
		//		Calculator c = new Calculator();
		int r = c.product(5, 5);

		assertEquals(25, r);
	}

	@Test //positive testing
	void testDivision() {
		int r = c.div(10, 5);

		assertEquals(2, r);
	}

	@ParameterizedTest
	@CsvSource({"10,10,20","5,5,10","4,5,9"})
	void testAddWithParams(int x, int y, int expected) {
		int r = c.add(x, y);
		assertEquals(expected, r);
	}

	@ParameterizedTest
	@CsvFileSource( files = "test.csv", numLinesToSkip = 1)
	void testAddMethodWithParamsCSV(int x, int y, int expected) {
		int r = c.add(x, y);
		assertEquals(expected, r);
	}

	@Test //negative testing
	void testDivForException() {
		//Supplier wont accept any params, but return obj
		assertThrows(ArithmeticException.class, ()->c.div(10, 0));
	}

}

