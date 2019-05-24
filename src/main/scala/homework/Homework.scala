object Homework {
	var getTriangleType = { (a: Int, b: Int, c: Int) =>
		if(a<1||b<1||c<1) throw new IllegalArgumentException
		if(a==b&&b==c) {
			"equilateral"
		} else if(a==b||a==c||b==c) {
			"isoceles"
		} else {
			"scalene"
		}
	}
	
	var getFifthFromEnd = { (head: ListNode) =>
		if(head == null) {
			throw new IllegalArgumentException
		}
		
		var follower, leader = head
		
		for(a <- 0 to 4) {
			if(leader== null){
				throw new IllegalArgumentException
			} 
			leader = leader.next
		}
		
		while(leader.next != null) {
			leader = leader.next
			follower = follower.next
		}
		
		follower.data
	}
	
	var listIsSubset = { (a: List[Int], b: List[Int]) =>
		if(a==null||b==null) throw new IllegalArgumentException
		(a forall (b contains)) || (b forall (a contains))
	}
	
	//Helper function for creating linked lists.
	var createLinkedList = { (args: Array[Int]) =>
		var head = new ListNode(args(0))
		var next = head
		for(i <- 1 to args.length - 1) {
			next.next = new ListNode(args(i))
			next = next.next
		}
		head
	}
}