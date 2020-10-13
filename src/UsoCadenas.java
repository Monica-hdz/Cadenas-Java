public class UsoCadenas {
    public static void main(String[] args) {
        System.out.println(owofied("I'm gonna ride 'till I can't no more"));
        System.out.println(countVowels("Celebration"));
        System.out.println(doubleLetters("orange"));
        System.out.println(doubleLetters("loop"));
        System.out.println(removeVowels("I'm gonna ride 'till I can't no more"));
    }

    public static String owofied(String sentence) {
        return sentence
                .replace("i", "wi")
                .replace("e", "we")
                .concat("owo");
    }

    public static int countVowels(String sentence) {
        int count = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if("aeiou".contains(String.valueOf(sentence.charAt(i)).toLowerCase())){
                count ++;
            }
        }
        return count;
    }

    public static boolean doubleLetters(String sentence){
        boolean isDoubleLetters = false;
        for (int i = 0; i < sentence.length(); i++) {
            try{
                if (sentence.charAt(i) == sentence.charAt(i+1)){
                    isDoubleLetters = true;
                    break;
                }
            }catch (StringIndexOutOfBoundsException ignored){ }
        }
        return isDoubleLetters;
    }


    public static String removeVowels(String sentence){
        StringBuilder newSentence = new StringBuilder();
        for (int i = 0; i < sentence.length(); i++) {
            if(!"aeiou".contains(String.valueOf(sentence.charAt(i)).toLowerCase())){
                newSentence.append(sentence.charAt(i));
            }
        }
        return newSentence.toString();
    }
}

