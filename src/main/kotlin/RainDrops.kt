class RainDrops {
    private val rules= listOf(
        Rule(3,"Pling"),
        Rule(5,"Plang"),
        Rule(7,"Plong")
    )

    fun findExpectedExpression(input: Int) :String {
        val result = rules
            .filter { it.appliesTo(input) }
            .joinToString("-") { it.result }
        return when {
            result.isEmpty() -> input.toString()
            else -> result
        }
    }
    private class Rule(val divisor: Int, val result: String) {
        fun appliesTo(arg: Int): Boolean = arg % divisor == 0

    }
}

