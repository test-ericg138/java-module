import java.util.concurrent.ThreadLocalRandom;

public class HelloJava {
  private int i;

  private HelloJava() {

  }

  public void hello() {
    System.out.println("hello" + " java");

    String unused1 = "unused1";
    String unused2 = "unused2";

    String unused8 = "unused8";
  }

  private static ThreadLocalRandom random() {
    return ThreadLocalRandom.current();
  }
}
