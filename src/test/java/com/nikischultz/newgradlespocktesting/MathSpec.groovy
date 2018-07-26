package com.nikischultz.newgradlespocktesting

import spock.lang.Specification

@Category(UnitTest.class)
class MathSpec extends Specification{

    def 'Get the bigger number'() {

        expect: 'Should return the bigger number'
        Math.max(a, b) == c

        where:
        a << [1, 2]
        b << [0, 3]
        c << [1, 3]

    }
}
