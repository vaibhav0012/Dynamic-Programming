import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
 
  int lis(int[] arr, int n)
  {
   int[] table = new int[n];
   //initialization
   for(int i=0;i<n;i++)
   table[i]=1;

  for(int i=1;i<n;i++)
  {
    for(int j=0;j<i;j++)
    {
      if(arr[i]>arr[j]&&table[i]<table[j]+1)
      {
        table[i]=table[j]+1;
      }
    }
  }
  int max=0;
    for(int i=0;i<n;i++)
    {
      max=Math.max(table[i],max);
    }
    return max;
  }
  public static void main(String[] args)
  {
    Main m = new Main();
    int arr[] = { 12,13,15,35,22,26,39,42,21,34 }; 
    System.out.println(m.lis(arr, 10));
  }
}
