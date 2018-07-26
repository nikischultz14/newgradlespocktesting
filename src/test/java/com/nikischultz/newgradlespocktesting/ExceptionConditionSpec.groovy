package com.nikischultz.newgradlespocktesting

import org.junit.experimental.categories.Category
import spock.lang.Specification

@Category(UnitTest.class)
class ExceptionConditionSpec extends Specification{

//    def stack = new Stack()
//
//    def 'Verify that exception is thrown'() {
//
//        when: 'We try to remove an element from an empty stack'
//        stack.pop()
//
//        then: 'Should throw an exception'
//        notThrown EmptyStackException
//    }

    def 'Write assertions for the thrown exception'() {

        when: 'A RuntimeException is thrown with a message'
        throw new RuntimeException('Hello World!')

        then: 'Should throw RuntimeException with the correct message'
        def ex = thrown RuntimeException
        ex.message == 'Hello World!'
    }

}
