package TestNesting.defaultnesting;

public class Actual {
	
	@SuppressWarnings("unused")
	public void heck() {
		String version;
		// # 1.16.1
		version = "1.16.1";
		//## def
		version = "1.16.1";
		//## 1.16.5
		version = "1.16.5";
		//## end
		// # end
	}
}
