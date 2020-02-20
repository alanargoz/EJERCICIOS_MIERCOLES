import java.util.Scanner;


public class Converter {
	
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        int copynum = num;
        String binary = " ";
        if (num > 0) {
            while (num > 0) {
                if (num % 2 == 0) {
                    binary = "0" + binary;
                } else {
                    binary = "1" + binary;
                }
                num = num / 2;
            }
        }
        System.out.println("The number " + copynum + " is represented as " + binary + "in binary"); 
	}
}