import java.util.Scanner ;

public class hello {

  public static void greet(String name) {
      System.out.println("Hello " + name + " Welcome to methods Lecture !");
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Your Name : ");
       String name = sc.nextLine();

       greet(name);
       sc.close();
  }
}