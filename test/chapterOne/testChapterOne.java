package chapterOne;

import static org.junit.jupiter.api.Assertions.*;

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
		assertEquals(ChapterOne.checkPermuatation("late", "rate"), true);
	}

}
