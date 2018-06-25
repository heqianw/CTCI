package chapterOne;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testChapterOne {

	@Test
	void test() {
		assertEquals(ChapterOne.isUnique("Same"), true);
		assertEquals(ChapterOne.isUnique("UNIQUE"), false);
		assertEquals(ChapterOne.isUnique("Not unique"), false);
		assertEquals(ChapterOne.isUnique("Expect it to fail"), false);
	}

}
