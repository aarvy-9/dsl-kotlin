import kotlin.test.assertEquals
import org.junit.Test


class TestSource {
    @Test fun testCanary() {
		assertEquals(true, true)
    }
	
	@Test fun testCreatePizza() {
		val dslString = process dsl {}
		assertEquals(dslString, "")
	}
	
	
}
