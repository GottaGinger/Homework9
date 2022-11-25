
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String pigLatin = scan.nextLine();
        System.out.println(translate(pigLatin));
    }

    public static Boolean isVowel(char c) {
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }


    public static String translate(String pigLatin) {
        pigLatin = pigLatin.toLowerCase();
        // calculating length of the string
        int size = pigLatin.length();
        // loop for finding the first vowel in the string

        if (isVowel(pigLatin.charAt(0))) {
            pigLatin = pigLatin + "way";
        } else {
            for (int i = 1; i < size; i++) {
                if(isVowel(pigLatin.charAt(i))) {
                    pigLatin = pigLatin.substring(i) + pigLatin.substring(0, i) + "ay";
                    break;
                }
            }
        }
        return pigLatin;

    }
}

