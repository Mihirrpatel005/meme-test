package com.comcast.csv.meme_test;

import java.util.*;
import com.comcast.csv.meme.Meme;

/**
 * Using all forms of loops and recursions to iterate over a {@link List} of
 * {@link Meme}s and log it's name and year. Format of the log message isn't
 * important.
 */

public class LoopProblem {

	public void linklist_listitrator(LinkedList<Meme> lm) {

		ListIterator<Meme> listIterator = lm.listIterator();
		Meme l1 = null;
		while (listIterator.hasNext()) {
			l1 = listIterator.next();
			System.out.println(l1.getName() + " " + l1.getYear());
		}

	}
	
	public void linklist_itrator(LinkedList<Meme> lm) {

		Iterator<Meme> Iterator = lm.iterator();
		Meme l1 = null;
		while (Iterator.hasNext()) {
			l1 = Iterator.next();
			System.out.println(l1.getName() + " " + l1.getYear());
		}

	}

	public void for_loop(LinkedList<Meme> lm) {

		Meme l1 = null;
		for (int i = 0; i < lm.size(); i++) {

			l1 = lm.get(i);
			System.out.println(l1.getName() + " " + l1.getYear());
		}

	}

	public void for_each(LinkedList<Meme> lm) {

		for (Meme l1 : lm) {
			System.out.println(l1.getName() + " " + l1.getYear());
		}

	}

}
