package Arrays;
//17.Insert / update / search / print /x delete.
public class insert_arr{
    public static void main(String[] args) {
        int[] arr=new int[5];
        int l= 0;
        int v1=10;
        int v2=20;
        l=insert(arr,10,l);
        l=insert(arr,20,l);
        l=insert(arr,30,l);
        l=insert(arr,40,l);
        l=insert(arr,50,l);
        // l=insert(arr,50,l);
        update(arr,10,50,l);
        search(arr,30,l);
        for (int i=0;i< arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        delete(arr,20,l);

        for (int i=0;i< arr.length-1;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
    public static int insert(int[] arr,int v,int l){
        if(l== arr.length)
        {
            System.out.println("Array is Full!!");
            return 0;
        }
        arr[l]=v;
        l++;
        return l;

    }
    public static void update(int[] arr,int v1,int v2,int l)
    {
        for (int i=0;i<l;i++)
        {
            if (arr[i]==v1)
            {
                arr[i]=v2;

            }
        }
    }
    public static void search(int[] arr,int v1,int l)
    {
        for (int i=0;i<l;i++)
        {
            if (arr[i]==v1)
            {
                System.out.println(v1+" Is present");
                return;
            }
        }
        System.out.println(v1+" Is not present");
        return;
    }
    public static int delete(int[] arr,int v1,int l)
    {
        for (int i=0;i<l;i++)
        {
            if (arr[i]==v1)
            {
                l--;
                for(int j=i;j<l;j++)
                {
                    arr[j]=arr[j+1];
                }
            }
        }
        return l;
    }
}
