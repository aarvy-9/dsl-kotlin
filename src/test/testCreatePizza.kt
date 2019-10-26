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
	
	@Test fun testSpreadCheese() {
	
		val result = create Pizza {
			add spread "cheese"
		}

		assertEquals("Pizza: cheese", result)
	}
	
	@Test fun testSpreadToppings() {

		val result = create Pizza{
			add spread "cheese"
			toppings {
				add topping "onions"
				add topping "jalapenos"
				add topping "green_pepper"
			}
		}
		
		assertEquals("Pizza: cheese, onions, jalapenos, green_pepper", result)
	}
	
	@Test fun testSpreadSauce() {
	
		val result = create Pizza{
			add spread "cheese"
			toppings {
				add topping "onions"
				add topping "jalapenos"
				add topping "green_pepper"
			}
			add spread "sauce"
		}
		
		assertEquals("Pizza: cheese, onions, jalapenos, green_pepper, sauce", result)
	}
	
	@Test fun testBaked() {
	
		val result = create Pizza{
			add spread "cheese"
			toppings {
				add topping "onions"
				add topping "jalapenos"
				add topping "green_pepper"
			}
			add spread "sauce"
			start bake ""
		}
		
		assertEquals("Pizza: cheese, onions, jalapenos, green_pepper, sauce, baked", result)
	}
}
