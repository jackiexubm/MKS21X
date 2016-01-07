import java.util.Random;
public class Sorts{
    
    private static String debug = "false";
    public static void printArray(int[] data){
	if (data.length == 0) {
	    System.out.print("\n[]");
	}else{
	    System.out.print("\n[ ");
	    int i = 0;
	    while(i < data.length - 1){
		System.out.print(data[i] + ", ");
		i++;
	    }
	    System.out.print(data[i] + "]");
	}
    }

    public static void fillRandom(int[] data){
	Random rand = new Random();
	for(int i = 0; i < data.length; i ++){
	    data[i] = rand.nextInt(Integer.MAX_VALUE) - (2 * rand.nextInt(Integer.MAX_VALUE));
	}
    }
    
    public static void insertionSort(int[] data){
	if (data.length == 0){
	}else{
	    if(debug.equals("true")){
		printArray(data);	
		System.out.print("\nStart insertionSort");
	    }  
	    for(int i = 1; i < data.length; i++){			 // go through each element
		boolean notDone = true;    
		for(int j = i - 1; j >= 0 && notDone; j--){	 // check each element before for position to be inserted
		    if(data[i] > data[j]){					 // the position to be inserted is one after the element that is smaller than data[i] 
			int intsert = data[i];				 // remember the number needed to be inserted
			for(int k = i; k > j + 1; k--){	   	 // shift over everything until j
			    data[k] = data[k-1]; 
			}
			data[j + 1] = intsert;				 // add the number to be inserted at the right spot
			notDone = false;					 // perform only once
		    }else if (j == 0) {						 // if data[i] is smallest,
			int intsert = data[i];				 
			for(int k = i; k > 0; k--){			 // add intsert to beginning
			    data[k] = data[k-1]; 			 // shift everything over
			}
			data[0] = intsert;					 // add intsert to beginning
		    }
		}
		if(debug.equals("true")){
		    System.out.print("\nResult:");
		    printArray(data);	    
		}
	    }
	}
    }
    
    public static void swap(int[] data, int pos1, int pos2){
	int holder = data[pos2];
	data[pos2] = data[pos1];
	data[pos1] = holder;
    }

    public static void selectionSort(int[] data){
	if(debug.equals("true")){
	    System.out.print("\nStart selectionSort:");
	}
	for (int i = 0; i < data.length; i ++){
	    int lowestPosition = i;
	    int lowest = data[i];
	    for(int i2 = i; i2 < data.length - 1; i2 ++){
		if(data[i2 + 1] < lowest){
		    lowest = data[i2 + 1];
		    lowestPosition = i2 + 1;
		}
	    }
	    swap(data,i,lowestPosition);
	}
	if(debug.equals("true")){
	    System.out.print("\nResult:");
	printArray(data);
	}
    }
    
    public static void bubbleSort(int[] data){
	if(debug.equals("true")){
	    System.out.print("\nStart bubbleSort:");
	}

	for (int i = 0; i < data.length - 1; i ++){
	    int swapped = 0;   
	    for (int i2 = 0; i2 < data.length - 1 - i; i2 ++){
		if(data[i2] > data[i2 + 1]){
		    swap(data,i2,i2 + 1);
		    swapped ++;
		}
	    }
	    if(swapped < 1){
		if(debug.equals("true")){
		    System.out.print("\nResult:");
		    printArray(data);
		}
		return;
	    }
	}
	if(debug.equals("true")){
	System.out.print("\nResult:");
	printArray(data);
	}	
    }    
}
