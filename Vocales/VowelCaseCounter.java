
public class VowelCaseCounter {
	public static void main(String args[]) {
        String s = "azcbobobegghakl";
        char []chars=s.toCharArray();
        int a, e, i, o, u, A, E, I, O, U;
        a = e = i = o = u = A = E = I = O = U = 0;
        
        for(char c : chars) {
            switch(c){
               case 'a':
            	   a ++;
            	   break;
               case 'e':
            	   e++;
            	   break;
               case 'i':
            	   i++;
            	   break;
               case 'o':
            	   o++;
            	   break;
               case 'u':
                  u++;
                  break;
               case 'A':
            	   A++;
            	   break;
               case 'E':
            	   E++;
            	   break;
               case 'I':
            	   I++;
            	   break;
               case 'O':
            	   O++;
            	   break;
               case 'U':
            	   U++;
                  break;
           }  
            }
        System.out.println("The string has " +a+" a");
        System.out.println("The string has " +e+" e");
        System.out.println("The string has " +i+" i");
        System.out.println("The string has " +o+" o");
        System.out.println("The string has " +u+" u");
        System.out.println("The string has " +A+" A");
        System.out.println("The string has " +E+" E");
        System.out.println("The string has " +I+" I");
        System.out.println("The string has " +O+" O");
        System.out.println("The string has " +U+" U");
        }}
