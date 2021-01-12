public class Radix{

  public static int nth(int n, int col){
    //Math.pow
    return 0;
  }

  public static int length(int n){
    if(n < 0){
      n = n * -1;
    }
    int digit = 0;
    while(n >= 10){
      digit = digit + 1;
      n = n / 10;
    }
    return digit + 1;
  }

  public static void merge(MyLinkedList original, MyLinkedList[] buckets){

  }

}
