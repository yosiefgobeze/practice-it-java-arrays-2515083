import java.util.Arrays;

public class App {

  public static void main(String[] args) {
    // declare, define and initialize a double array.
    double[] lotteryNum; // declaring
    lotteryNum = new double[5]; // defining
    lotteryNum[0] = 2; // initializing
    lotteryNum[1] = 4; // initializing
    lotteryNum[2] = 6; // initializing
    lotteryNum[3] = 8; // initializing
    lotteryNum[4] = 10; // initializing
    System.out.println("Natural order print");
    for (int i = 0; i < lotteryNum.length; i++) {
      System.out.println(lotteryNum[i]);
    }

    System.out.println("Reverse order print");
    // printing in reverse order
    for (int i = lotteryNum.length - 1; i >= 0; i--) {
      System.out.println(lotteryNum[i]);
    }

    System.out.println("Natural order print, with enhanced for loop");
    // enhanced for loop
    for (double item : lotteryNum) {
      System.out.println(item);
    }

    System.out.println("Using stream to print each item");
    Arrays.stream(lotteryNum).forEach(System.out::println);
    // Arrays.stream(lotteryNum).filter()
    // Arrays.stream(lotteryNum).sum()
    // Arrays.stream(lotteryNum).average()
  }
}