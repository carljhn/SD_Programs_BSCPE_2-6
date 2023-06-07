// Check if a string is a palindrome or not.

public class palindrome_check {
    public static void main(String[] args) {
        String original = "nurse"; // This is the string to be checked
        original = original.replace(" ", ""); // this removes all the spaces if the word/s contain/s spaces on between
        String reversed = "";

        // for loop to interpret if the string is a palindrome
        for(int i = original.length() - 1; i >= 0; i--){
            reversed += original.charAt(i);
            // System.out.println(reversed);
        }

        // for loop that compares the given string and the palindrome if they are the same, hence the word is an example of palindrome
        boolean palindrome = true;
        for(int i = 0; i < original.length(); i++){
            if(original.charAt(i) != reversed.charAt(i)){
                palindrome = false;
            }
        }

        // if statement that tell the string is a palindrome
        if(palindrome){
            System.out.println("The word, " + original + ", is a PALINDROME.");
        }

        // else statement if the word is not a palindrome
        else{
            System.out.println("The word, " + original + ", is NOT A PALINDROME.");
        }
    }
}
