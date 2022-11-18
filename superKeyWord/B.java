package superKeyWord;

public class B extends A  {
  
  int a;

  B() {
    System.out.println("It's B Constructor");
  }

  B(int a) {
    super(10);
    System.out.println("It's Argument Constructor of B");
  }
  
  void display() {

    System.out.println("It's B");

    a=20;

    super.a=30;

    int c = a+super.a;

    System.out.println(c);

  }

  void baseDisplay() {
    super.display();
  }

  public static void main(String[] args) {
    
    B b=new B(10);

    b.display();

    b.baseDisplay();

  }

}
