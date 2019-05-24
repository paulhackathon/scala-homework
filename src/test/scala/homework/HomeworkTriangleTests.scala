import org.scalatest.FunSuite

class HomeworkTriangleTests extends FunSuite {
	test("Triangle must have positive side length.") {
		assertThrows[IllegalArgumentException]{
			Homework.getTriangleType(-1, 1, 1)
		}
		assertThrows[IllegalArgumentException]{
			Homework.getTriangleType(1, 1, 0)
		}
	}
	
	test("Correctly identifies equaliteral triangles.") {
		assert(Homework.getTriangleType(1, 1, 1) == "equilateral")
	}
	
	test("Correctly identifies isoceles triangles.") {
		assert(Homework.getTriangleType(5, 4, 5) == "isoceles")
	}
	
	test("Correctly identifies scalene triangles.") {
		assert(Homework.getTriangleType(3, 4, 5) == "scalene")
	}
}