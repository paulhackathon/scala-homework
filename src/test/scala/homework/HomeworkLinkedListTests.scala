import org.scalatest.FunSuite

class HomeworkLinkedListTests extends FunSuite {
	test("Head of linked list cannot be null.") {
		assertThrows[IllegalArgumentException]{
			Homework.getFifthFromEnd(null)
		}
	}
	
	test("Linked list must be at least six nodes long.") {
		assertThrows[IllegalArgumentException] {
			Homework.getFifthFromEnd(Homework.createLinkedList(Array(0,1,2)))
		}
	}
	
	test("Valid linked list returns correct data.") {
		assert(Homework.getFifthFromEnd(Homework.createLinkedList(Array(0,1,2,3,4,5,6,7))) == 2)
	}
	
	test("Valid linked list of minimum length returns correctly.") {
		assert(Homework.getFifthFromEnd(Homework.createLinkedList(Array(0,1,2,3,4,5))) == 0)
	}
}