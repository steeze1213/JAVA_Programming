public class NumException {
	public static void main (String[] args) {
		String[] stringNumber = {"23", "12", "3.141592", "998"}; 
		
		int i=0;
		try {
			for (i=0; i<stringNumber.length; i++) {
				int j = Integer.parseInt(stringNumber[i]);
				System.out.println("The value converted to an integer is " + j);
			}
		}
		catch (NumberFormatException e) {
			System.out.println(stringNumber[i] + " can't be converted to an integer.");
		}
	}
}