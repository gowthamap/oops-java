package ClassSample2;

public class Sample {

  public static void main(String a[]) {

    int num1 = 100;
    int num2 = 200;

    int num3 = 150;
    int num4 = 250;

    Sum s = new Sum();

    Sum s1 = new Sum();

    s.calculateSum(num1, num2);
    s.displaySum();

    s1.calculateSum(num3, num4);
    s1.displaySum();

    s.displaySum();
    s1.displaySum();

  }

}