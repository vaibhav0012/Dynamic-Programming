/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
  int[] table = new int[100];

  int fib(int n)
  {
   int[] table =new int[n+1];
   table[0]=0;
   table[1]=1;
    int i=2;
    while(i<=n)
    {
      table[i]=table[i-1]+table[i-2];
      i++;
    }
    return table[n];
  }
  public static void main(String[] args)
  {
    Main m = new Main();
    System.out.println(m.fib(6));
  }
}
