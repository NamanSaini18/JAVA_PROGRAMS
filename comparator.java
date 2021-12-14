import java.util.Comparator;
import java.util.TreeSet;

public class CompDemo {
    public static void main(String[] args) {
        TreeSet<Integer> obj = new TreeSet(new MySort());
        obj.add(10);
        obj.add(23);
        obj.add(6);
        obj.add(4);
        obj.add(4);
        System.out.println(obj);
    }
}
class MySort implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
//        return -o1.compareTo(o2);
        return 0;
//        Integer i1 = (Integer) o1;
//        Integer i2 = (Integer) o2;
//        if(i1>i2){
//            return +1;
//        }
//        else if (i1<i2){
//            return -1;
//        }
//        else
//            return 0;
    }
}
