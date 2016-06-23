package com.comcast.csv.meme_test;

/**
 * The following methods operate on street addresses in a particular format. The
 * format contains the following components:
 * 
 * 1. Number of miles from the center of the city 2. Primary direction from the
 * city as a single lower-case letter 3. Street number 4. Street name (always a
 * single word) 5. An abbreviation for either a Street or Avenue with a period
 * 
 * </h2>Example Valid Addresses</h2> 25w873 Apple St. 3n17 Special Ave. 0e34800
 * Main St.
 */
public class StringParsingProblem {

	/**
	 * Returns true if the address is valid, otherwise false.
	 * 
	 * @param address
	 *            the address to validate
	 * @return true if the address is valid
	 */
	public boolean isAddressValid(String address) {

		int count = 0, j = 0;
		boolean period = false, word_add = true;
		for (String str : address.split(" ")) {
			// System.out.println(str);
			if (count == 0) {
				j = getDistanceFromCityCenter(str);
				// System.out.println(j + " >>");
			}
			if (count == 1) {
				word_add = !isPeriod(str);
			}
			if (count == 2) {
				period = isPeriod(str);
				// System.out.println(period);
			}
			count++;

		}

		if (count == 3 && j > 0 && period &&  word_add) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Get the distance in miles from the center of the city from the given
	 * address.
	 * 
	 * @param address
	 *            the address
	 * @return the distance
	 */

	public boolean isPeriod(String str) {
		char las_period = str.charAt(str.length() - 1);
		if (las_period == 46) {
			return true;
		} else {
			return false;
		}

	}

	public boolean isDigit(String str) {

		final StringBuilder sb = new StringBuilder(str.length());
		for (int i = 0; i < str.length(); i++) {
			final char c = str.charAt(i);

			if (c > 47 && c < 58) {

				sb.append(c);

			}
		}
		if (str.length() == sb.length() && str.length() > 0) {
			return true;
		} else {
			return false;
		}

	}

	public int getDistanceFromCityCenter(String address) {
		String miles = "";
		String Street = "";
		int cou = 0;
		final StringBuilder sb = new StringBuilder(address.length());
		for (int i = 0; i < address.length(); i++) {
			final char c = address.charAt(i);

			if (c > 96 && c < 123) {
				// break;
				sb.append(c);
				cou++;

			} else {
				if (cou == 0) {
					miles += c;
				} else if (cou == 1) {
					Street += c;
				}

			}
		}
		if (sb.length() == 1 && isDigit(miles) && isDigit(Street)) {

			int i = Integer.parseInt(miles);
			return i;
		}

		return 0;
	}
}
