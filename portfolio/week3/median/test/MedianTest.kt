// COMP2850 Portfolio: Week 3
// Tests for median()

import io.kotest.core.spec.style.FreeSpec
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import io.kotest.matchers.floats.plusOrMinus


const val tolerance = 0.000001f

@Suppress("Unused")
class MedianTest : FreeSpec({
	"Exception when size=0" {
		shouldThrow<IllegalArgumentException> {median(listOf())}
	}

	//Write four more tests here

	//yuck, opening bracket not on new line
	"median of 1-element list is element 0" {
		median(listOf(2f)) shouldBe 2f
	}

	"median of 2-element list is arithmetic mean of element 0 and 1" {
		median(listOf(2f,3f)) shouldBe 2.5f
	}

	"median of 3-element list is element 1" {
		median(listOf(2f,3f,4f)) shouldBe 3f
	}

	"median of 4-element list is arithmetic mean of element 1 and 2" {
		median(listOf(2f,3f,4f,5f)) shouldBe 3.5f
	}
})
