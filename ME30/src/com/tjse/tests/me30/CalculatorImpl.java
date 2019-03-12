package com.tjse.tests.me30;

public class CalculatorImpl implements Calculator {

	private double currValue;

	@Override
	public double doOperation(String operation) {
		char operator = operation.charAt(0);
		try {
			Double.parseDouble(operation.substring(1));

		} catch (NumberFormatException e) {
			return currValue;
		}

		double operand = Double.parseDouble(operation.substring(1));

		switch (operator) {
		case '+':
			currValue = currValue + operand;
			break;
		case '-':
			currValue = currValue - operand;
			break;
		case '=':
			currValue = operand;
			break;
		case '*':
			currValue = currValue * operand;
			break;
		case '/':
			currValue = currValue / operand;
			break;

		default:
			break;

		}

		char[] chars = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
				't', 'u', 'v', 'w', 'x', 'y', 'z', '!', '?', '.', ',', '%', '^' };
		for (char c : chars) {
			if (operand == c || operator == c) {
				return currValue;
			}
		}
		return currValue;
	}

	public static void main(String[] args) {
		CalculatorImpl calc = new CalculatorImpl();
		System.out.println(calc.doOperation("q"));
	}
}