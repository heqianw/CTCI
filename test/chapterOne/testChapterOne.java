package chapterOne;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class testChapterOne {

	@Test
	void testIsUnique() {
		assertEquals(ChapterOne.isUnique("Same"), true);
		assertEquals(ChapterOne.isUnique("UNIQUE"), false);
		assertEquals(ChapterOne.isUnique("Not unique"), false);
		assertEquals(ChapterOne.isUnique("Expect it to fail"), false);
	}
	@Test
	void testCheckPermutation() {
		assertEquals(ChapterOne.checkPermuatation("cater", "cater"), true);
		assertEquals(ChapterOne.checkPermuatation("tare", "rate"), true);
		assertEquals(ChapterOne.checkPermuatation("late", "rate"), false);
	}
	@Test
	void testdoURLify() {
		char [] modify = {'M', 'r', ' ', 'S', 'm', 'i', 't', 'h', ' ', 'J', 'o', 'h', 'n', ' ', ' ', ' ', ' '};
		assertEquals(ChapterOne.doURLify(modify, 13), "Mr%20Smith%20John");
	}
	@Test
	void testIsPalindromePerm() {
		String test = "tact coa";
		assertEquals(ChapterOne.isPalindromePerm(test), true);
	}
	@Test
	void testOneAway() {
		String one = "pale";
		String two = "ple";
		assertEquals(ChapterOne.oneAway(one, two), true);
		one = "pales";
		two = "pale";
		assertEquals(ChapterOne.oneAway(one, two), true);
		one = "pale";
		two = "bale";
		assertEquals(ChapterOne.oneAway(one, two), true);
		one = "pale";
		two = "bake";
		assertEquals(ChapterOne.oneAway(one, two), false);
	}
}
