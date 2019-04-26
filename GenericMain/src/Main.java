import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalTime;
import java.util.Random;

public class Main
{

  public static void main(String[] args)
  {

    System.out.println("Integer array example:");
    int value=5;
    //Heap h1 = new Heap <Integer>(Integer.class, 10);
    Heap heapI=new Heap<Integer>(value, 10);
    Random rand=new Random();

    for (int i=1; i < heapI.getLength(); i++)
    {
      value=rand.nextInt(50);
      heapI.setValue(value, i);
      System.out.print(value + "; ");
    }
    System.out.println();

    System.out.println("Array length=" + heapI.getLength());
    System.out.println("First element=" + heapI.getValue(0));

    System.out.println("Do you want to know the max and min values in the array?");

    BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
    String line=null;
    try
    {
      line=buffer.readLine();
    }
    catch (IOException e)
    {
      e.printStackTrace();
    }
    System.out.println(line + "!");

    System.out.println("Min element=" + heapI.getMin().toString());
    System.out.println("Max element=" + heapI.getMax().toString());

    System.out.println();
    System.out.println("LocalTime array example:");

    LocalTime localtime=LocalTime.now();
    Heap heapLT=new Heap<LocalTime>(localtime, 5);


    for (int i=1; i < heapLT.getLength(); i++)
    {
      localtime=LocalTime.of(rand.nextInt(23), rand.nextInt(59), rand.nextInt(59));
      heapLT.setValue(localtime,i);
      System.out.print(localtime + "; ");
    }
    System.out.println();

    System.out.println("Array length=" + heapLT.getLength());
    System.out.println("First element=" + heapLT.getValue(0));
    System.out.println("Min element=" + heapLT.getMin().toString());
    System.out.println("Max element=" + heapLT.getMax().toString());

  }

}
