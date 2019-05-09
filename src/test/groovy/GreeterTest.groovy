import spock.lang.Specification
import spock.lang.Unroll

import java.time.LocalTime


class GreeterTest extends Specification {
    private Greeter greeter
    private CalendarService calendar

    void setup() {
        calendar = Mock(CalendarService)
        greeter = new Greeter(calendar)
    }

    def "should greet the world"() {
        when: 'say hello is called'
        String result = greeter.sayHello()
        then: 'the world should be greeted'
        result == 'Hello, World!'
    }

    @Unroll
    def "should greet #person with #expected"() {
        when: 'say hello to is called'
        String result = greeter.sayHelloTo(person)
        then: 'the person should be greeted'
        result == expected
        where:
        person         | expected
        'Christoph'    | 'Hello, Christoph!'
        'Hackerkegeln' | 'Hello, Hackerkegeln!'
        'O|i'          | 'Hello, O|i!'
    }

    def "simple test"() {
        expect:
        greeter.sayHello() == 'Hello, World!'
    }

    def "should greet a person with the current time"() {
        given: 'a current time'
        LocalTime currentTime = LocalTime.of(19, 12)
        and: 'a person'
        String person = 'Christoph'
        when: 'say hello with time is called'
        String result = greeter.sayHelloWithTimeTo(person)
        then: 'the person should be greeted with the expected time'
        result == 'Hello, Christoph! It is now 19:12.'
        and: 'calendar service is queried for the current time'
        1 * calendar.currentTime >> currentTime
    }
}
