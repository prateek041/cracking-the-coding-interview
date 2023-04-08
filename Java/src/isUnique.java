public class isUnique {
    public static void main(String[] args){
        String word = "Heloe";
        int length = word.length();
        System.out.println(isUniqueBrute(word, length));
    }

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
}
