public class SpltStringEx {

    public static void main(String[] args) {

        String sentence = "@Java:(";
        String[] words = sentence.split("@");
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
    }
}