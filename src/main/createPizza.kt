class Pizza {
	val pizza = this
	val add = this
	val start = this
	val ingredients: MutableList<String> = mutableListOf()
	
	infix fun spread(input1: String) {
	
		ingredients.add(input1)
		
	}
	
	infix fun topping(input: String) {
		
		ingredients.add(input)
		
	}
	
	infix fun bake(input: String) {
		
		ingredients.add("baked")
		
	}
	
	override fun toString() = "Pizza: ${ingredients.joinToString()}".trim()
	
}

object create {

  infix fun Pizza(block: Pizza.() -> Unit): String {
    val toBuild = Pizza()
    
    toBuild.block()
    
    return toBuild.toString()
  }
  
}

fun Pizza.toppings(block: Pizza.() -> Unit) {

	block()
	
}
