package lc;

public class Trials {

	public static void main(String[] args) {
	
		Trials obj = new Trials();
		obj.diffForAndForEach();
	}
	
	
	/* Difference between for and for each loop
	    // With for loop, 
	     * we can increase the iteration count and 
	     * have access to index which helps in modifying the underlying collection	
	*/
	public void diffForAndForEach() {
		String[] ip = {"ram", "raj","sam", "tom"};
		
		for(String s: ip) {
			System.out.println(s);
		}
		
		for(String s: ip) {
			s += " ** ";
			System.out.println(s);
		}
		
		for(String s: ip) {
			System.out.println(s);
		}
		

	}

}
