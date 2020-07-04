import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main (String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while(T-->0)
		{
		    int n = Integer.parseInt(br.readLine());
		    Map<Integer,Integer> map = new TreeMap<Integer,Integer>();
		    int b=0;
		    while(n%2==0)
		    {
		        if(map.containsKey(2))
		        {
		            b=map.get(2);
		            map.replace(2,b+1);
		        }
		        else
		        {
		            map.put(2,1);
		        }
		        n=n/2;
		    }
		    while(n%3==0)
		    {
		        if(map.containsKey(3))
		        {
		            b=map.get(3);
		            map.replace(3,b+1);
		        }
		        else
		        {
		            map.put(3,1);
		        }
		        n=n/3;
		    }
		    for (int i = 5; i <= n; i = i + 6) 
            { //5 7 11 13 17 19 23 25 29 31
                while(n%i==0)
                {
                    if(map.containsKey(i))
    		        {
    		            b=map.get(i);
    		            map.replace(i,b+1);
    		        }
    		        else
    		        {
    		            map.put(i,1);
    		        }
    		        n=n/i;
                }
                while(n%(i+2)==0)
                {
                    if(map.containsKey(i+2))
    		        {
    		            b=map.get(i+2);
    		            map.replace(i+2,b+1);
    		        }
    		        else
    		        {
    		            map.put(i+2,1);
    		        }
    		        n=n/(i+2);
                }
            }
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                System.out.print(entry.getKey()+" "+entry.getValue()+" ");
            }
            System.out.println("");
		}
	}
}
