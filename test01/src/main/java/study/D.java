package study;

public class D {

  public static void m() {
    System.out.println("D.m()");
  }
  
  public static void m2() throws Exception {
    System.out.println("D.m2()");
    throw new Exception("오호라 예외");
  }
  
  public static void m3() {
    System.out.println("D.m3()");
    throw new RuntimeException("오호라 예외");
  }
}
