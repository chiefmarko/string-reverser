/**
 * Simple program to reverse String 
 * 
 * Algorithm:
 * 
 * Convert string to character array
 * Loop through half of the array, swapping every character at i with character ((length-1)- i)
 * The whole array has been reversed by the time you get to the midpoint of the array
 */

class StringReverser{

    public static void main(String[] args) {
        System.out.println(compress("abcngh"));
    }
    //Return the reverse of the String
    public static String compress(String input){

        char [] chars = input.toCharArray();
        int lastSize = chars.length-1;

        for(int i = 0; i < chars.length / 2; i++){

        //Swap character from beginning with corresponding character from end
            char c = chars[i];
            chars[i] = chars[lastSize - i];
            chars[lastSize - i] = c;
        }

        return String.valueOf(chars);
    }
}
