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
    int thing = 0;
    int numba = 0;
    SortableLinkedList Deletion = new SortableLinkedList();
    for(int i = 0; i < data.size(); i++){
      numba = data.get(i);
      if(length(numba) > longest){
        longest = length(data.get(i));
      }
    }
    for(int i = 0; i < longest; i++){
      merge(data, Bucket);
      for(int j = 0; j < data.size(); j++){
        numba = data.get(j);
        thing = nth(numba, i);
        Bucket[thing].add(numba);
      }
      Deletion.extend(data);
    }
    merge(data, Bucket);
  }
  public static void radixSort(SortableLinkedList data){
    SortableLinkedList Zeroes = new SortableLinkedList(); SortableLinkedList Ones = new SortableLinkedList();
    SortableLinkedList Twos = new SortableLinkedList();  SortableLinkedList Threes = new SortableLinkedList();
    SortableLinkedList Fours = new SortableLinkedList(); SortableLinkedList Fives = new SortableLinkedList();
    SortableLinkedList Sixes = new SortableLinkedList(); SortableLinkedList Sevens = new SortableLinkedList();
    SortableLinkedList Eights = new SortableLinkedList(); SortableLinkedList Nines = new SortableLinkedList();
    SortableLinkedList[] Bucket = {Zeroes, Ones, Twos, Threes, Fours, Fives, Sixes, Sevens, Eights, Nines};
    SortableLinkedList Negatives = new SortableLinkedList();
    int longest = 0;
    int thing = 0;
    int numba = 0;
    int max = 0;
    SortableLinkedList Deletion = new SortableLinkedList();
    for(int i = 0; i < data.size(); i++){
      numba = data.get(i);
      if(length(numba) > longest){
        longest = length(data.get(i));
      }
    }
    for(int n = 0; n < data.size(); n++){
      if(data.get(n) < 0){
        Negatives.add(data.get(n));
        data.remove(n);
        n = n - 1;
      }
    }
    for(int i = 0; i < longest; i++){
      merge(Negatives, Bucket);
      for(int j = 0; j < Negatives.size(); j++){
        numba = Negatives.get(j);
        thing = nth(numba,i);
        Bucket[9 - thing].add(numba);
      }
      Deletion.extend(Negatives);
    }
    merge(Negatives, Bucket);


    for(int i = 0; i < longest; i++){
      merge(data, Bucket);
      for(int j = 0; j < data.size(); j++){
        numba = data.get(j);
        thing = nth(numba, i);
        Bucket[thing].add(numba);
      }
      Deletion.extend(data);
    }
    merge(data, Bucket);
    Negatives.extend(data);
    data.extend(Negatives);
  }

}
