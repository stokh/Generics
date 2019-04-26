public interface Holder<T extends Comparable<T>>{

  void put(T t);
  T get();
}

