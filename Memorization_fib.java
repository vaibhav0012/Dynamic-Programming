
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
  final int max =100;
  int[] lookup = new int[max];
  final int Nil=0;

  void intialize()
  {
    for(int i=0;i<max;i++)
    {
      lookup[i]=Nil;
    }
  }
  int fib(int n)
  {
    if(lookup[n]==Nil)
    {
      if(n==0||n==1)
      {
        lookup[n]=n;
      }
      else{
        lookup[n]=fib(n-1)+fib(n-2);
      }
    }
    return lookup[n];
  }

  public static void main(String[] args)
  {
    Main m = new Main();
    m.intialize();
    System.out.println(m.fib(6));
  }
}
