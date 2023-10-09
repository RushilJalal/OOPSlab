import java.util.*;
class Q1
{
    public static void main(String[] args) {
        int chars = 0, words = 1, lines = 0, vowels = 0;
        String input;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        input = sc.nextLine();
        
        for(int i = 0; i < input.length(); i++)
        {
            char ch = input.charAt(i);
            //no. of words
            if(ch >= 'a' && ch <= 'z')
                chars++;

            //no of characters includes letters and numbers, not space
            else
                words++;
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                vowels++;
            }
        }
        //check how to count number of lines
        System.out.println("No. of characters: "+chars);
        System.out.println("No. of words: "+words);
        System.out.println("No. of vowels: "+vowels);
        
        
        
    }
}