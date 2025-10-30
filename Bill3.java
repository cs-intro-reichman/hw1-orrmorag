// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		String name1 = args[0];  // Ron
		String name2 = args[1];  // Lisa
		String name3 = args[2];  // Dan
		int totalBill = Integer.parseInt(args[3]);   // 100
		double eachPays = Math.ceil(totalBill/3.0);  // 34
	    System.out.println("Dear " + name3 + ", " + name2 + ", " + 
						   "and " + name1 + ": pay " + eachPays + " Shekels each.");
	}
}