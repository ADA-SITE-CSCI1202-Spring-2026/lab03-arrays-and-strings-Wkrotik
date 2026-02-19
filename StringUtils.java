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

  public static void main(String[] args) {
    System.out.println(reverse(args[0]));
    System.out.println(repeat(args[0]));
  }
}
