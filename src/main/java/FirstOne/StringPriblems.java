package FirstOne;

public class StringPriblems {
    public static void main(String[] args) {
        String line = "   Hello    i  am super    cool java   programmer   ";
        findLongestWord(line);
        findShortestWord(line);
        reverseString();
    }
    public static void findLongestWord(String line) {
        line = line.strip();
        String[] words = line.split(" ");
        String longestWord = words[0];
        for (String word : words) {
            if (!word.isBlank()) {
                if (word.length() > longestWord.length()) {
                    longestWord = word;
                }
                ;
            }
            ;
        }
        System.out.println("longestWord = " + longestWord);
    }
    public static void  findShortestWord (String line){
        line = line.strip();
        String [] words = line.split(" ");
        String shortestWord = words[0];
        for (String word : words) {
            if (!word.isBlank()) {
                if (word.length() < shortestWord.length()) {
                    shortestWord = word;
                }
                ;
            }
            ;
        }
        System.out.println("shortestWord = " + shortestWord);
    }
    public static void reverseString(){
        String line = "i.like.this.program.very.much";
        String [] words = line.split("\\.");
        String result = "";
        for (int i=words.length-1;i>=1;i--) {
            result+=words[i]+".";

        }
        result += words[0];
        System.out.println("result = " + result);
    }
}
