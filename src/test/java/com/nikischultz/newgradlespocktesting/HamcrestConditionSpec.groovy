package com.nikischultz.newgradlespocktesting

import spock.lang.Specification

@Category(UnitTest.class)
class HamcrestConditionSpec extends Specification{

    def 'Write assertions with Hamcrest matchers'() {

        given: 'We create a new list'
        def list = []

        when: 'A new item is added to the list'
        list.add('Hello World!')

        then: 'The list should have one item'
        list hasSize(1)

        and: 'The list should contain the correct item'
        list contains('Hello World!')
    }
}
