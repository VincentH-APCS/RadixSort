public class Radix{

  public static int nth(int n, int col){
    int p = 0;
    if(n < 0){
      n = n * - 1;
    }
    p = (int)(n % Math.pow(10, col + 1));
    p = (int)(p / Math.pow(10, col));
    return p;
  }

  public static int length(int n){
     if(n < 0){
      n = n * -1;
    }
    if(n == 0){
      return 1;
    } else
    return (int)Math.log10(n) + 1;
  }

  public static void merge(MyLinkedList original, MyLinkedList[] buckets){
    for(int i = 0; i < buckets.length; i++){
      original.extend(buckets[i]);
    }

  }

}
