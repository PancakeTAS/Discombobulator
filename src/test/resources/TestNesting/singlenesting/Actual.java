package TestNesting.singlenesting;

public class Actual {
	@SuppressWarnings("unused")
	public void nestingTest() {
		int i;
		// # 1.16.1
		i = 2;
		// Code for 1.16.1
		// ## 1.16.5
		int c = 3;
		i = 4;
		// ## end
		i = 6;
		//# def
		// ## 1.15.2
		i = 3;
		// ## end
		i = 1;
		//# end
		
	}
}
