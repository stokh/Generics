class LongHolder implements Holder<Long>, Comparable<LongHolder>
{
  private Long long1;

  LongHolder(){
    long1=0L;
    System.out.println(long1);
  }

  public void put(Long l){
    long1=l;
    System.out.println(long1);
  }

  public String toString(){
    System.out.println(long1);
    return long1.toString();

  }

  public Long get(){
    return long1;
  }


public int compareTo(LongHolder o)
  {
    if(long1 > o.get()) return 1;
    if(long1 < o.get()) return -1;
    else                return 0;
  }
}
