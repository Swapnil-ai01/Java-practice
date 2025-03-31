import java.util.HashMap;
import java.util.Scanner;
class Task17{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Write a sentence:");
    String sen = sc.nextLine().toLowerCase();
    sc.close();
    String[] words = sen.split("\\W+");
    HashMap<String, Integer> wordCount = new HashMap<>();
    for (String word : words) {
        if (!word.isEmpty()) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }

        System.out.println("Word frequencies:");
        for (HashMap.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}