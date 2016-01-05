public class Driver{
    public static void main(String[]args){
	int[] arrayName = new int[10];
	
	for (int i = 0; i < 10; i ++){
	    arrayName[i] = (int)(Math.random()*100);
	}
	Sorts.printArray( arrayName);
	Sorts.selectionSort( arrayName);
	Sorts.printArray( arrayName);
    }
}
