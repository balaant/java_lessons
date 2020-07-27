package homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagram3 {

    public static boolean anagram(String s, String t) {
        if (s.length() != t.length()) {
            System.out.println("Слова разной длины");
            return false;
        }
        return frequencyMap(s).equals(frequencyMap(t));
    }

    private static Map<Character, Integer> frequencyMap(String str) {
        Map<Character, Integer> M = new HashMap<>();
        for (char c : str.toLowerCase().toCharArray()) {
            Integer frequency = M.get(c);
            if (frequency == null) {
                frequency = 1;
            } else frequency++;
            M.put(c, frequency);
        }
        return M;
    }

    public static void main(String[] args) {
        System.out.println("Введите два слова: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        if (anagram(s, t)) {
            System.out.println("Слова анаграммы");
        } else System.out.println("Слова не анаграммы");
    }
}
