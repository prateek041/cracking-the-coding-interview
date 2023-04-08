import java.util.HashSet;

public class isUnique {
    public static void main(String[] args){
        String word = "Helo";
        int length = word.length();
        if (length == 0){
            System.out.println("true");

        }
        else {
//            System.out.println(isUniqueBrute(word, length));
            System.out.println(isUniqueHash(word, length));
        }
    }

    // This made it O(n2)
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

    // This made it O(n)
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
}
