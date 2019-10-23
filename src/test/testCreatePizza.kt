import kotlin.test.assertEquals
import org.junit.Test

class TestSource {
    @Test fun create() {
        assertEquals("create Pizza", processDsl("create Pizza"))
    }
}
