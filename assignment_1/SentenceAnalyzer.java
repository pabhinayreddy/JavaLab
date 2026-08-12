import java.util.Scanner;

class SentenceAnalyzer {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String[] words = sentence.split(" ");
        System.out.println("Word Count: " + words.length);
        int firstSpace = sentence.indexOf(" ");
        int lastSpace = sentence.lastIndexOf(" ");
        String firstWord = sentence.substring(0, firstSpace);
        String lastWord = sentence.substring(lastSpace + 1);
        System.out.println("First Word: " + firstWord);
        System.out.println("Last Word: " + lastWord);
        int firstJ = sentence.indexOf('J');
        int lastJ = sentence.lastIndexOf('J');
        System.out.println("First 'J' index: " + firstJ);
        System.out.println("Last 'J' index: " + lastJ);
        int comparison = firstWord.compareTo(lastWord);
        System.out.println("Comparison (first vs last word): " + comparison);
        char[] characters = sentence.toCharArray();
        char firstCharacter = sentence.charAt(0);
        String firstCharString = String.valueOf(firstCharacter);
        int ascii = (int) firstCharacter;
        System.out.println("First character: " + firstCharString);
        System.out.println("First character ASCII value: " + ascii);

        sc.close();
    }
}