import java.util.Scanner;
import java.util.Scanner;
import java.util.Scanner;
public class IntegerList{

    int[] list; //values in the list
    Scanner scan = new Scanner(System.in);

    //-------------------------------------------------------
    //create a list of the given size
    //-------------------------------------------------------
    public IntegerList(int size)
    {
    list = new int[size];
    }


    //-------------------------------------------------------
    //fill array with integers between 1 and 100, inclusive
    //-------------------------------------------------------
    public void randomize()
    {
    for (int i=0; i<list.length; i++)
        list[i] = (int)(Math.random() * 100) + 1;
    }

    //-------------------------------------------------------
    //print array elements with indices
    //-------------------------------------------------------
    public void print()
    {
    for (int i=0; i<list.length; i++)
        System.out.println(i + ":\t" + list[i]);
    }

    //-------------------------------------------------------
    //return the index of the first occurrence of target in the list.
    //return -1 if target does not appear in the list
    //-------------------------------------------------------
    public int search(int target)
    {
        for(int i = 0; i<list.length; i++)
        {
           if(target == list[i])
           {
               return i;
           }
        }
    }

    //-------------------------------------------------------
    //sort the list into ascending order using the selection sort algorithm
    //-------------------------------------------------------
    public void selectionSort(int[] x)
    {
    for (int i = 0; i < x.length-1; i++) {
        int minIndex = i;
        for (int j = i+1; j < x.length; j++) {
            if (x[minIndex] > x[j]) {
                minIndex = j;
            }
        }
        int temp = x[i];
        x[i] = x[minIndex];
        x[minIndex] = temp;
    }
}
}
