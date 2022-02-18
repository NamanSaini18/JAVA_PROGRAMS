
public class ArrayDemo {
    int arr[];
    public ArrayDemo(int size){
        arr = new int[size];

        for(int i=0;i<arr.length;i++){
            arr[i] = Integer.MIN_VALUE;
        }
    }
    public void insert(int value, int index){
        try
        {
            if(arr[index]==Integer.MIN_VALUE)
            {
                arr[index] = value;
            }
            else
            {
                System.out.println("Array is Already filled");
            }
        }catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Invalid Index");
        }
    }
    public void traverse(){
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
    public void indexvalueprint(int index)
    {
        try
        {
            System.out.println("Required Index's value is successfully printed");
            System.out.println(arr[index]);
        }catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Invalid Index");
        }
    }
    public void searchinarray(int searchvalue){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == searchvalue)
            {
                System.out.println("Value Found");
                return;
            }
        }
        System.out.println("No match found");
    }
    public void deletevalue(int index){
        try
        {
            arr[index] = Integer.MIN_VALUE;
            System.out.println("Value is deleted Successfully");
        }catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Out of Range");
        }

    }
    public void deletearray(){
        int arr[] = {10,20,30};
        this.arr = null;
    }

    public static void main(String[] args) {
        ArrayDemo obj = new ArrayDemo(5);
//        System.out.println("Before insertion delete value");
//        obj.traverse();
        obj.insert(200,0);
        obj.insert(300,1);
        obj.insert(400,2);
        obj.insert(600,3);
        obj.insert(1000,4);

        System.out.println("After insertion");
        obj.traverse();
        obj.deletevalue(6);
        System.out.println("After Deletion");
        obj.traverse();
        obj.indexvalueprint(2);
        obj.searchinarray(1000);
        obj.traverse();
//        obj.deletearray();

    }
}
