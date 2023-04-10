import java.util.HashSet;

public class isUnique {
    public static void main(String[] args){
        String word = "Hello";
        int length = word.length();
        if (length == 0){
            System.out.println("true");

        }
        else {
            // System.out.println(isUniqueBrute(word, length));
            // System.out.println(isUniqueHash(word, length));
            System.out.println(isUniqueArray(word, length));
        }
    }

    // This made it O(n2). Since it is the brute force technique.
    public static Boolean isUniqueBrute(String word, int length){
        if (length <= 0){
            return false;
        }

        for (int i = 0; i<length ; i++){
            for (int j = i+1 ; j<length; j++){
                if (word.charAt(i) == word.charAt(j)){
                    return false;
                }
            }
        }
        return true;
    }

    // This made it O(n) since I am using hashset. But the lookup time is still not always constant.
    public static Boolean isUniqueHash(String word, int length){
        int [] test = {1,2,3,4};
        System.out.println(test.length);
        HashSet<Character> map = new HashSet<>(); // creating a new hashset
        for(int i = 0; i<length; i++){
            if (map.contains(word.charAt(i))){
                return false;
            }
            map.add(word.charAt(i));
        }
        return true;
    }

    // Using the array now. This will make the lookup time constant.
    public static boolean isUniqueArray(String word, int length){
        // Let's consider that the string is using Unicode, hence only 256 characters, otherwise it could be 128
        // characters.

        // since there should only be unique characters, length cannot exceed 256.
        if (length > 256){
            return false;
        }

        // create an empty boolean array of length 256
        boolean [] characters = new boolean[256];
        int unicodeVal = 0;

        for (int i = 0; i<length; i++){
            unicodeVal = word.charAt(i);
            if(characters[unicodeVal]){
                return false;
            }
            characters[unicodeVal] = true;
        }
        return true;
    }
}
