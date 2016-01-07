public class Driver{
    public static void main(String[]args){
	String type = "insertion";
	int size = 10;
	String arrayType = "random";

	if(args.length > 0){
	    type = args[0];
	}
	if(args.length > 1){
	    size = Integer.parseInt(args[1]);
	}
	if(args.length > 2){
	    arrayType = args[2];
	}
	int[] test = new int[size];
	for (int i = 0; i < size; i ++){
	    test[i] = (int)(Math.random()*10);
	}


	Sorts.bubbleSort(test);
	Sorts.printArray(test);

	



    }
}
