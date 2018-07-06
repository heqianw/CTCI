package chapterOne;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.Assert;
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
	@Test
	void testStringCompression() {
		String toCompress = "aaabbbccc";
		assertEquals(ChapterOne.stringCompression(toCompress), "a3b3c3");
		toCompress = "abcdefg";
		assertEquals(ChapterOne.stringCompression(toCompress), "abcdefg");
	}
	@Test
	void testRotateMatrix() {
		int[][] toRotate = {{0, 1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11}};
		int[][] result = ChapterOne.rotateMatrix(ChapterOne.rotateMatrix(ChapterOne.rotateMatrix(
				ChapterOne.rotateMatrix(toRotate))));
		Assert.assertArrayEquals(toRotate, result);
	}
}
