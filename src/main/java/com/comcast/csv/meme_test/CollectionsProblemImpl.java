package com.comcast.csv.meme_test;

import java.util.*;

import com.comcast.csv.meme.Meme;

/**
 * Implement the specified interface.
 */

class MemosortbyYear implements Comparator<Meme> {

	public int compare(Meme m1, Meme m2) {

		/// by year sort
		return (m1.getYear() < m2.getYear()) ? -1 : (m1.getYear() > m2.getYear()) ? 1 : 0;

	}
}

public class CollectionsProblemImpl implements CollectionsProblem {

	public void sort(ArrayList<Meme> memes, boolean ascending) {

		if (ascending) {
			Collections.sort(memes, new MemosortbyYear());
		}

	}

	public void addTag(ArrayList<Meme> memes, String tag) {

		Meme m1 = null;
		for (int i = 0; i < memes.size(); i++) {
			m1 = memes.get(i);
			String[] tg = m1.getTags();
			tg[tg.length] = tag;
			m1.setTags(tg);
			memes.add(i, m1);
		}

	}

}
