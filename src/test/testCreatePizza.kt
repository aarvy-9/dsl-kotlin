import kotlin.test.assertEquals
import org.junit.Test

class TestSource {
  @Test fun testCanary() {
		assertEquals(true, true)
  }
	
	@Test fun testCreatePizza() {
		val result = create Pizza {}
 
 	  assertEquals("Pizza:", result)
	}
}
