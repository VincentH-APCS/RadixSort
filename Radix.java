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

/*  public static void merge(MyLinkedList original, MyLinkedList[] buckets){
    for(int i = 0; i < buckets.length; i++){
      original.extend(buckets[i]);
    }*/
  public static void merge(SortableLinkedList original, SortableLinkedList[] buckets){
      for(int i = 0; i < buckets.length; i++){
        original.extend(buckets[i]);
      }
  }
  public static void radixSortSimple(SortableLinkedList data){
    SortableLinkedList Zeroes = new SortableLinkedList(); SortableLinkedList Ones = new SortableLinkedList();
    SortableLinkedList Twos = new SortableLinkedList();  SortableLinkedList Threes = new SortableLinkedList();
    SortableLinkedList Fours = new SortableLinkedList(); SortableLinkedList Fives = new SortableLinkedList();
    SortableLinkedList Sixes = new SortableLinkedList(); SortableLinkedList Sevens = new SortableLinkedList();
    SortableLinkedList Eights = new SortableLinkedList(); SortableLinkedList Nines = new SortableLinkedList();
    SortableLinkedList[] Bucket = {Zeroes, Ones, Twos, Threes, Fours, Fives, Sixes, Sevens, Eights, Nines};
    int longest = 0;
    int = thing = 0;
    for(int i = 0; i < data.length; i++){
      if(length(data[i] > longest){
        longest = length(data.get(i));
      }
    }
    for(int i = 0; i < longest; i++){
      merge(data, Bucket);
      for(int j = 0; j < data.length; j++){
        thing = nth(data[i], i);
        Bucket[thing].add(data[i]);
      }
    }


  }

}
