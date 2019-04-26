import java.lang.reflect.Array;
import java.util.Arrays;

public class Heap<T extends Comparable<T>>
{
  private int maxint=1000000;
  private int tsize=1;
  private T[] list;

/*  Heap (Class<T> clazz, int tsize) {
    this.tsize=tsize;
    T[] list = (T[]) Array.newInstance(clazz, tsize);
//    first= list[0];
}*/

  Heap(T t, int tsize){
    if (tsize < 1 || tsize > maxint)
      throw new IndexOutOfBoundsException("Size not allowed: " + tsize);
    this.tsize=tsize;
    list=(T[]) Array.newInstance(t.getClass(), tsize);
    list[0]=t;
  }

  Heap(T[] list){//
    this.list=list;
  }

  public void add(T val){
    T[] temp=Arrays.copyOf(list, list.length + 1);
    temp[list.length]=val;
    list=temp;
  }

   T getMin(){
    return (T) new MinMaxer(list).min();
  }


   T getMax(){
    return (T) new MinMaxer(list).max();
  }

   void setMin(Holder<T> h){
    h.put((T) new Heap(list).getMin());
  }

   int getLength(){
    return list.length;
  }

   void setValue(T val, int index){
    list[index]=val;
  }

   T getValue(int index){
    return list[index];
  }

}
