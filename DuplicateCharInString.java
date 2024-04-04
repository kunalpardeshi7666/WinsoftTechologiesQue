
//Q4:Write a Java Program to find the duplicate characters in a string.



import java.util.*;

class DuplicateCharacters {
    void findDuplicateCharacters(String str) {
        
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        char[] characters = str.toCharArray();

        for (char ch : characters) {
            if (charCountMap.containsKey(ch)) {
                charCountMap.put(ch, charCountMap.get(ch) + 1);
            } else {
                charCountMap.put(ch, 1);
            }
        }

	int count = 0;
        System.out.print("Duplicate characters in the string '" + str + "':");
        for (char ch : charCountMap.keySet()) {
            if (charCountMap.get(ch) > 1) {
                System.out.println(ch + ": " + charCountMap.get(ch) + " occurrences");
		count++;
            }
	}
	if(count == 0){
		System.out.println("0");
	}
    }

    public static void main(String[] args) {
        
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter String");
	
        String str = sc.nextLine();;

	DuplicateCharacters obj = new DuplicateCharacters();
        obj.findDuplicateCharacters(str);

    }
}
