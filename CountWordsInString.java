// Q3:Write a Java Program to count the number of words in a string using HashMap.


import java.util.*;

class WordCounter {
    
    Map<String, Integer> countWords(String str) {

        str = str.trim();
        String[] words = str.split("\\s+");
        
        Map<String, Integer> wordCountMap = new HashMap<>();
        
        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }
        
        return wordCountMap;
    }
    
    public static void main(String[] args) {
	
	WordCounter obj = new WordCounter();
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter String");
        String str1 = sc.nextLine();
        
        Map<String, Integer> wordCountMap1 = obj.countWords(str1);
        
        System.out.print("Word counts in string 1:");
        System.out.println(wordCountMap1);
    
    }
}
