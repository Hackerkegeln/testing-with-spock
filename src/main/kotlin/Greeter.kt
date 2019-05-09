class Greeter(private val calendar: CalendarService) {
    fun sayHello(): String = sayHelloTo("World")

    fun sayHelloTo(name: String): String = "Hello, $name!"

    fun sayHelloWithTimeTo(name: String): String =
        "${sayHelloTo(name)} It is now ${calendar.currentTime}."
}

