package com.comcast.csv.meme_test;

public class StringParsingUsingRegEx {

	public static void main(String arg[]) {

		boolean b = new StringParsingProblem().isAddressValid("0e800 has St.");

		System.out.println(b);

		int d = new StringParsingProblem().getDistanceFromCityCenter("e348 has St.");

		System.out.println(d);

	}

	public boolean isAddressValid(String address) {

		if (address.matches("^\\d+[A-Za-z]\\d+\\s\\w+\\s\\w+\\.")) {

			System.out.println("h");

			return true;

		}

		return false;

	}

	public int getDistanceFromCityCenter(String address) {

		if (address.matches("^\\d+")) {

			String[] distance = address.split("[A-Za-z]");

			return Integer.parseInt(distance[0]);

		}

		return 0;

	}

}
