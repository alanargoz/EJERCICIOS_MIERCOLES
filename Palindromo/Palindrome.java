import java.util.Arrays;

public class Palindrome {
    public static void main(String[] args)
    {
    String userInput = "Aba aBA";
    String copyInput = userInput.toLowerCase();
    String reverse = "";
    
     for(int i = copyInput.length() - 1; i >= 0; i--)
     {
         reverse = reverse + copyInput.charAt(i);
     }
     if (copyInput.equals(reverse)){
         System.out.println("The word "+userInput+" is a palindrome.");
     }
     else{
         System.out.println("The word "+userInput+" is not palindrome.");
     }
}}
