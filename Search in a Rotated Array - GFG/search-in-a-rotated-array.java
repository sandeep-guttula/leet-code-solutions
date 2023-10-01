//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

public class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        
        int t = Integer.parseInt(in.readLine().trim());
        while (t-- > 0)
        {
            int n = Integer.parseInt(in.readLine().trim());
            int A[] = new int[n];
            String s[]=in.readLine().trim().split(" ");
            for (int i = 0;i < n;i++)
            {
                A[i] = Integer.parseInt(s[i]);
            }
            int key = Integer.parseInt(in.readLine().trim());
            
            out.println(new Solution().search(A, 0, n - 1, key));
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    int search(int nums[], int low, int high, int target)
    {
        while(low <= high){
            int mid  = (low+high)/2;

            if(nums[mid] == target){
                return mid;
            }

            if(nums[mid] >= nums[low]){
                if(nums[low] <= target && target <= nums[mid] ){
                    high = mid -1;
                } else {
                    low = mid +1;
                }
            } else {
                if(nums[mid] <= target && target <= nums[high]){
                    low = mid +1;
                } else {
                    high = mid -1;
                }
            }
        }
        return -1;
    }
}