package Arrays;
import java.util.*;

public class insert_update_in_sorted_arr {
    public static void main(String[] args) {
        int[] arr=new int[10];
        int l=0;
        insert(arr,l);
        update(arr,l);
        display(arr,l);
        System.out.println();
        find(arr,l);
        delete(arr,l);
        for (int i = 0; i < arr.length-1; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static int insert(int[] arr,int l)
    {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i< arr.length;i++)
        {
            System.out.print("Enter The Element:");
            arr[l]=sc.nextInt();
            sort(arr,l);
        }
        l++;
        return l;
    }
    public static void sort(int[] arr,int l)
    {
        for(int i=0;i< arr.length;i++)
        {
            for(int j=0;j< arr.length-1;j++)
            {
                int temp=0;
                if(arr[j]>arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void display(int[] arr,int l)
    {
        for(int i=0;i< arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void update(int[] arr,int l)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter element to update:");
        int v= sc.nextInt();
        for (int i=0;i< arr.length;i++)
        {
            if (arr[i]==v)
            {
                Scanner sc1=new Scanner(System.in);
                System.out.print("Enter new Element");
                arr[i]=sc1.nextInt();
                sort(arr,l);
                return;
            }
        }
        System.out.println("Element not found");
    }
    public static int delete(int[] arr,int l)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter element to delete:");
        int v= sc.nextInt();
        for (int i=0;i< arr.length;i++)
        {
            if (arr[i]==v)
            {
                l--;
                for(int j=i;j< arr.length-1;j++)
                {
                    arr[j]=arr[j+1];
                }
            }

        }
        return l;
    }
    public static void find(int[] arr,int l)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter element to Find:");
        int v= sc.nextInt();
        for (int i=0;i< arr.length;i++)
        {
            if (arr[i]==v)
            {
                System.out.println("Element is present");
                return;
            }
        }
        System.out.println("Element not Present");
    }
}
