public class Driver{
	public static void main(String[]args){
		int[] arrayName = { 8, 6, 7, 5, 3, 0, 9};
		Sorts.printArray( arrayName);
		Sorts.insertionSort( arrayName);
		Sorts.printArray( arrayName);
	}
}