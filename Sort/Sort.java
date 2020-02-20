import java.util.Arrays;
public class Sort {
public static void main(String[] args){
	
	int array[] = { 2, 4, 6, 3, 1, 10, 15, 7 };
	 
		for (int i = 1; i < array.length; i++) { 
			int current = array[i];
			int j = i; 
			while (j > 0 && array[j - 1] > current) { 
				array[j] = array[j - 1]; j--; } 
			array[j] = current;
			}

	System.out.println(Arrays.toString(array));
	}
}
