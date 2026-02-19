import java.util.Arrays;

public class StringUtils {
  public static String reverse(String s){
    StringBuilder sb = new StringBuilder();
    for(int i = s.length() -1; i >= 0; i--) {
      char c = s.charAt(i);
      sb.append(c);
    }
    return sb.toString();
  }
  public static String repeat(String s){
    StringBuilder sb = new StringBuilder();
    for(int i = 0; i <= s.length() - 1; i++) {
      for (int j = 0; j <= i; j++) {
        char c = s.charAt(j);
        sb.append(c);

      }
    }
    return sb.toString();
  }

  public static String swap(String s){
    String[] words = s.split(" ", -1);
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < words.length; i++) {
      String word = words[i];
      if (word.length() <= 1) {
        sb.append(word);
      } else {
        char first = word.charAt(0);
        char last = word.charAt(word.length() - 1);
        if (word.length() == 2) {
          sb.append(last).append(first);
        } else {
          sb.append(last).append(word, 1, word.length() - 1).append(first);
        }
      }
      if (i < words.length - 1) {
        sb.append(' ');
      }
    }
    return sb.toString();
  }

  public static String sortLetters(String s){
    char[] letters = s.toCharArray();
    Arrays.sort(letters);
    return new String(letters);
  }

  public static boolean areAnagrams(String a, String b){
    if (a.length() != b.length()) {
      return false;
    }
    return sortLetters(a).equals(sortLetters(b));
  }

  public static void main(String[] args) {
    System.out.println(reverse(args[0]));
    System.out.println(repeat(args[0]));
    System.out.println(swap(args[0]));
    System.out.println(sortLetters(args[0]));
  }
}
