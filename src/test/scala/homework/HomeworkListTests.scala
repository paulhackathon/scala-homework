import org.scalatest.FunSuite

class HomeworkListTests extends FunSuite {
	test("List arguments cannot be null.") {
		assertThrows[IllegalArgumentException]{
			Homework.listIsSubset(null, List(1, 2, 3))
		}
	}
	
	test("Partially matching lists fail.") {
		assert(Homework.listIsSubset(List(1, 2, 6), List(1, 2, 3)) == false)
	}
	
	test("Completely unrelated lists fail.") {
		assert(Homework.listIsSubset(List(9, 8, 7), List(1, 2, 3, 4)) == false)
	}
	
	test("Second list is subset of first list.") {
		assert(Homework.listIsSubset(List(1, 2, 3), List(1, 2)) == true)
	}
	
	test("First list is subset of second list.") {
		assert(Homework.listIsSubset(List(5, 3, 2), List(1, 2, 3, 4, 5, 6)) == true)
	}
	
	test("Empty list arguments returns true.") {
		assert(Homework.listIsSubset(List(), List(1, 2, 3)) == true)
		assert(Homework.listIsSubset(List(), List()) == true)
	}
}