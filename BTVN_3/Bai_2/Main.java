public class Main
{
	public static void main(String[] args) {
		Array arr1 = new Array(), arr2 = new Array();

		arr1.inputData();
		arr2.inputData();

		double s1 = 1.0*arr1.sum()/arr1.getLen(), s2 = 1.0*arr2.sum()/arr2.getLen();
		if(s1 == s2) {
			System.out.println("Bye");
		} else {
			System.out.println((s1 > s2) ? "arr1" : "arr2");
		}
	}
}