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
      original.extend(buckets[0]);
      original.extend(buckets[1]);
      original.extend(buckets[2]);
      original.extend(buckets[3]);
      original.extend(buckets[4]);
      original.extend(buckets[5]);
      original.extend(buckets[6]);
      original.extend(buckets[7]);
      original.extend(buckets[8]);
      original.extend(buckets[9]);
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
    /*for(int i = 0; i < data.size(); i++){
      numba = data.get(i);
      if(numba > longest){
        longest = numba;
      }
    }*/
    while(data.size() > 0){
      numba = data.remove(0);
      if(longest < length(numba)){
        longest = length(numba);
      }
      thing = nth(numba, 0);
    Bucket[thing].add(numba);
    }
    //longest = length(numba);
    for(int i = 1; i < longest; i++){
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

    SortableLinkedList Deletion = new SortableLinkedList();
    SortableLinkedList Pastebin = new SortableLinkedList();
    while(data.size() > 0){
      numba = data.remove(0);
      if(longest < length(numba)){
        longest = length(numba);
      }
      thing = nth(numba, 0);
      Bucket[thing].add(numba);
    }
  /*  for(int n = 0; n < data.size(); n++){
      numba = data.get(n);
      if(numba < 0){
        Negatives.add(numba);
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
*/

    for(int i = 1; i < longest; i++){
      merge(data, Bucket);
      for(int j = 0; j < data.size(); j++){
        numba = data.get(j);
        thing = nth(numba, i);
        Bucket[thing].add(numba);
      }
      Deletion.extend(data);
    }
    merge(data, Bucket);
    while(data.size() > 0){
      numba = data.remove(0);
      if(numba < 0){
        Negatives.add(0, numba);
      }
      else Pastebin.add(numba);
    }

    Negatives.extend(Pastebin);
    data.extend(Negatives);
  }

}
