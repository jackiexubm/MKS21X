public class Driver{
    public static void main(String[]args){
	int[] arrayName = new int[10];
	String input = args[0];
	for (int i = 0; i < 10; i ++){
	    arrayName[i] = (int)(Math.random()*1000);
	}
	if(input.equals("selection")){
	    Sorts.selectionSort(arrayName);
	}else if(input.equals("insertion")){
	    Sorts.insertionSort(arrayName);
	}
    }
}
