import java.util.Scanner;

public class Paizaaa {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String[] s = new String[1000];
    for (int i = 0; i < 1000; i++) {
      s[i] = sc.next();
    }

    for (String t : s) {
      System.out.println(t);
    }

    sc.close();
  }
}