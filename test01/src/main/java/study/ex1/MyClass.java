package study.ex1;

public class MyClass {
  public static final int a = 10;

  public void m1() {
    System.out.println("m1()");
  }

  public void m2(String name) {
    System.out.printf("m2(%s)\n", name);
  }

  public void m3(String name, int age) {
    System.out.printf("m3(%s, %d)\n", name, age);
  }
}
