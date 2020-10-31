import java.io.*;
public class MaxSumSubarrayofSizeK {
    public static void main(String[] args)throws IOException 
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(in.readLine());
        int k=Integer.parseInt(in.readLine());
        String[] string=in.readLine().split(" ");
        int[] ar=new int[n];
        for(int i=0;i<n;i++)
            ar[i]=Integer.parseInt(string[i]);
        int i=0,j=0,sum=0,max=0;
        while(j<n)
        {
            sum+=ar[j];
            if(j-i+1<k)
                j++;
            else if(j-i+1==k)
            {
                max=Math.max(sum,max);
                sum-=ar[i];
                i++;
                j++;
            }
        }
        System.out.println(max);
    }
}
