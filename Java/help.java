import java.util.ArrayList;
import java.util.Set;

public class help {
      // Function to print an array p[] of size n
    static void printArray(int p[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(p[i]+" ");
        System.out.println();
    }

    static boolean checkArray(ArrayList<Integer> p, int k, int splits) 
    {
        Set<Integer> intSet = Set.copyOf(p);
        for (int num : p) {
            if(num > 9) {
                return false;
            }
        }
        if (k == splits && intSet.size() == k) 
        {
            return true;
        }

        return false;
    }

    static ArrayList<Integer> removeEnd(int p[], int k)
    {
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        for(int i = 0; i < k + 1; i ++) 
        {
            newArray.add(p[i]);
        }
        return newArray;
    }
    
    // Function to generate all unique partitions of an integer
    static void printAllUniqueParts(int n, int splits)
    {
        int[] p = new int[n]; // An array to store a partition
        int k = 0;  // Index of last element in a partition
        p[k] = n;  // Initialize first partition as number itself
 
        // This loop first prints current partition then generates next
        // partition. The loop stops when the current partition has all 1s
        while (true)
        {
            // print current partition
            if (checkArray(removeEnd(p, k), k + 1, splits)) 
            { 
                printArray(p, k+1);
            }
 
            // Generate next partition
 
            // Find the rightmost non-one value in p[]. Also, update the
            // rem_val so that we know how much value can be accommodated
            int rem_val = 0;
            while (k >= 0 && p[k] == 1)
            {
                rem_val += p[k];
                k--;
            }
 
            // if k < 0, all the values are 1 so there are no more partitions
            if (k < 0)  return;
 
            // Decrease the p[k] found above and adjust the rem_val
            p[k]--;
            rem_val++;
 
 
            // If rem_val is more, then the sorted order is violated.  Divide
            // rem_val in different values of size p[k] and copy these values at
            // different positions after p[k]
            while (rem_val > p[k])
            {
                p[k+1] = p[k];
                rem_val = rem_val - p[k];
                k++;
            }
 
            // Copy rem_val to next position and increment position
            p[k+1] = rem_val;
            k++;
        }
    }


    // Driver program
    public static void main (String[] args) 
    {
        printAllUniqueParts(41, 7);
        System.out.println("_________");
        printAllUniqueParts(12, 2);
        System.out.println("_________");
        printAllUniqueParts(16, 2);
        System.out.println("_________");
        
        
    }
}
