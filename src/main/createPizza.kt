class Pizza {
  override fun toString() = "Pizza:"
}

object create {
  infix fun Pizza(block: () -> Unit): String {
    val toBuild = Pizza()
    
    block()
    
    return toBuild.toString()
  }
}