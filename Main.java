import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word to convert to pigLatin: ");
        String word = scanner.nextLine();
        pigLatin(word);
    }
    /**
     * @param sentence takes in a users words and converts them to pig latin
     */
    public static String pigLatin(String sentence) {
        String[] words = sentence.split(" ");
        String pigLatin = "";
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String firstLetter = word.substring(0, 1);
            String restOfWord = word.substring(1);
            pigLatin = pigLatin + restOfWord + firstLetter + "ay ";
        }
        System.out.println(pigLatin);
        return pigLatin;

    }
}
