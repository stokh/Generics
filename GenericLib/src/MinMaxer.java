class MinMaxer<T extends Comparable<T>>
{

  private T[] vals;

  MinMaxer(T[] t)   {
    vals=t;
  }

  T min(){
    T v=vals[0];

    for (int i=1; i < vals.length; i++){
      if (v == null)
        continue;
      if (vals[i].compareTo(v) < 0)
      {
        v=vals[i];
      }
    }
    return v;
  }

   T max(){
    T v=vals[0];
    for (int i=1; i < vals.length; i++)
    {
      if (v == null)
        continue;
      if (vals[i].compareTo(v) > 0)
      {
        v=vals[i];
      }
    }
    return v;
  }
}



