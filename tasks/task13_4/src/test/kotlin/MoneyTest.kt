// Task 13.4: unit tests for Money class

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.assertions.withClue
import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

import io.kotest.core.spec.IsolationMode

@Suppress("unused")
class MoneyTest : FreeSpec({
    // Write your unit tests here
    isolationMode = IsolationMode.InstancePerRoot

    "Can create a Money" {
        val m = Money(1, 50)
        withClue("euros") {m.euros shouldBe 1}
        withClue("cents") {m.cents shouldBe 50}
    }

    "Can create a different Money" {
        val m = Money(2, 99)
        withClue("euros") { m.euros shouldBe 2 }
        withClue("cents") { m.cents shouldBe 99 }
    }

    "€1.50 + €1.00 is €2.50" {
        Money(1, 50) + Money(1, 0) shouldBe Money(2, 50) 
    }
})
