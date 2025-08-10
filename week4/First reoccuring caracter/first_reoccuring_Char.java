import java.util.HashSet;
public class FirstRecurringCharacter {
    public static Character findFirstRecurringCharacter(String s) {
        HashSet<Character> seen = new HashSet<>();
        
        for (char c : s.toCharArray()) {
            if (seen.contains(c)) {
                return c;                
            }
            seen.add(c);
        }
        
        return null;    
    }

    public static void main(String[] args) {
        String input = "leetcode";
        Character result = findFirstRecurringCharacter(input);
        
        if (result != null) {
            System.out.println("First recurring character: " + result);
        } else {
            System.out.println("No recurring characters found.");
        }
    }
}
