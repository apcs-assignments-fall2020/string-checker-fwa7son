import java.util.Scanner;

public class MyMain {
    
    // Counts the number of 'a', 'b', and 'c' chars in str
    public static String countABC(String str) {
        int acount = 0;
        int bcount = 0;
        int ccount = 0;
        
        Character ch1 = new Character('a');
        Character ch2 = new Character('b');
        Character ch3 = new Character('c');
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch1) { 
                acount++;
            }
            if (str.charAt(i) == ch2) { 
                bcount++;
            }
            if (str.charAt(i) == ch3) { 
                ccount++;
            }
        }    
        String acount1 = Integer.toString(acount);
        String bcount1 = Integer.toString(bcount);
        String ccount1 = Integer.toString(ccount);
            
        return ("There are " + acount1 + " letter a's, " + bcount1 + " letter b's, " + ccount1 + " letter c's.");
    }

    // Checks to see whether or not str contains 'The' or 'the'
    public static boolean containsThe(String str) {
        if (str.contains("The") || str.contains("the")) {
            return true;
        }
    return false;
    }


    public static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) 
                return false; 
            i++; 
            j--; 
        }
    return true;
    }


    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please input a string");

        String str = scan.nextLine();

        System.out.println(countABC(str));


        if (containsThe(str))
            System.out.println("Your String DOES contain the");
        else
            System.out.println("Your String DOES NOT contain the"); 
        if (isPalindrome(str)) 
            System.out.println("Your string IS a palindrome"); 
        else
            System.out.println("Your string IS NOT a palindrome");
    }
}