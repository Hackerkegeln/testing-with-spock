import spock.lang.Specification
import spock.lang.Unroll


class RainDropsTest extends Specification {
    private RainDrops target

    void setup() {
        target = new RainDrops()
    }

    @Unroll
    def "Rain drops kata with #input -> #expected"() {
        when: 'rain drop is called'
        String result = this.target.findExpectedExpression(input)
        then: 'the expected result is created'
        result == expected
        where:
        input | expected
        1     | "1"
        2     | "2"
        3     | "Pling"
        5     | "Plang"
        6     | "Pling"
        7     | "Plong"
        10    | "Plang"
        14    | "Plong"
        15    | "Pling-Plang"
        30    | "Pling-Plang"
        21    | "Pling-Plong"
        105   | "Pling-Plang-Plong"
    }
}
