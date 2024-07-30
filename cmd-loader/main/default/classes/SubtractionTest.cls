@isTest
public class SubtractionTest {
    // Test method for addNumbers111
    @isTest
    static void testSubNumbers() {
        // Test data
        Integer num1 = 5;
        Integer num2 = 10;
        Integer expectedResult = -5;

        // Call the method and store the result
        Integer result = Subtraction.subNumbers(num1, num2);

        // Assert the result
        System.assertEquals(expectedResult, result, 'The Subtraction result is incorrect.');
    }

    // Test for negative numbers
    @isTest
    static void testSubNegativeNumbers() {
        Integer num1 = -5;
        Integer num2 = -10;
        Integer expectedResult = 5;

        Integer result = Subtraction.subNumbers(num1, num2);

        System.assertEquals(expectedResult, result, 'The Subtraction of negative numbers is incorrect.');
    }

    // Test for zero testing
    @isTest
    static void testSubZero() {
        Integer num1 = 0;
        Integer num2 = 0;
        Integer expectedResult = 0;

        Integer result = Subtraction.subNumbers(num1, num2);

        System.assertEquals(expectedResult, result, 'The Subtraction with zero is incorrect.');
    }
}