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
    for (int i = 0; i < lotteryNum.length; i++) {
      System.out.println(lotteryNum[i]);
    }
  }
}