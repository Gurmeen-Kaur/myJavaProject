package practice;

public class Calculator {

	double result;

	double addition(double firstNumber, double secondNumber) {
		result = firstNumber + secondNumber;
		return result;
	}

	double substraction(double firstNumber, double secondNumber) {
		result = firstNumber - secondNumber;
		return result;
	}

	double multiplication(double firstNumber, double secondNumber) {
		result = firstNumber * secondNumber;
		return result;
	}

	double division(double firstNumber, double secondNumber) {
		result = firstNumber / secondNumber;
		return result;
	}
}
