import java.util.Hashset;
class InterviewPrep {
  public static void main(String[] args) {
    int [] array1= {1,2,4,5,6};
    int [] array2={9,8,9,10};
    System.out.println(containsCommonItemBF(array1,array2));
  }


//takes 2 arrays and returns true or false based on matching element in the array Brute Force O(n*n)
  public static boolean containsCommonItemBF(int[] array1, int[] array2)
  {
    for (int i=0;i<array1.length;i++)
    {
      for (int j=0;j<array2.length;j++)
      {
        if(array1[i]== array2[j])
        {
          return true;
        }
      }
    }
    return false;
  }
}

  public static boolean containsCommonItemOptimized(int[] array1, int[] array2)
  {
    for (int i=0;i<array1.length;i++)
    {
      for (int j=0;j<array2.length;j++)
      {
        if(array1[i]== array2[j])
        {
          return true;
        }
      }
    }
    return false;
  }
}