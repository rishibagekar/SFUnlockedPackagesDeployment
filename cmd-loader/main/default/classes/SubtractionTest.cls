@isTest
public class SubtractionTest {
    // Test method for addNumbers2
    @isTest
    static void testAddNumbers() {
        // Test data
        Integer num1 = 5;
        Integer num2 = 10;
        Integer expectedResult = 15;

        // Call the method and store the result
        Integer result = Subtraction.subNumbers(num1, num2);

        // Assert the result
        System.assertEquals(expectedResult, result, 'The subtraction result is incorrect.');
    }

    // Test for negative numbers
    @isTest
    static void testAddNegativeNumbers() {
        Integer num1 = -5;
        Integer num2 = -10;
        Integer expectedResult = -15;

        Integer result = Subtraction.subNumbers(num1, num2);

        System.assertEquals(expectedResult, result, 'The subtraction of negative numbers is incorrect.');
    }

    // Test for zero testing
    @isTest
    static void testAddZero() {
        Integer num1 = 0;
        Integer num2 = 0;
        Integer expectedResult = 0;

        Integer result = Subtraction.subNumbers(num1, num2);

        System.assertEquals(expectedResult, result, 'The subtraction with zero is incorrect.');
    }
}