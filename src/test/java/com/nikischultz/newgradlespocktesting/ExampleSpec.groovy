package com.nikischultz.newgradlespocktesting

import org.junit.experimental.categories.Category
import spock.lang.Specification

@Category(UnitTest.class)
class ExampleSpec extends Specification {

    def 'A feature method'() {
        //setup block
        //when and then blocks (not practical to have both when and then, and expect blocks in same feature method)
        //expect block
        //cleanup block
        //where block
    }
}
