package TestNesting.triplenesting;

public class Actual {
	@SuppressWarnings("unused")
	public void nestingTest() {
		int i;
		// # 1.16.1
		i = 2;
		// Code for 1.16.1
			// ## 1.16.5
			int c = 3;
				// ### 1.18.2
					// Oh no
				// ### 1.17.1
					// Triple nesting O_o
				// ### end
			// ## end
		//# def
		i = 1;
		//# end
		
	}
}
