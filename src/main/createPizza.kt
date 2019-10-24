class Pizza {       
	val Pizza = this	
	infix fun create(item: String){
		Pizza = item
	}
}


object process{
	infix fun dsl(block: Pizza.() -> Unit) : Pizza{
		return Pizza().apply(block)
	}
}

