public class Generics<T> {
  // Below is the representation using general method 
//    public void display(Integer[] a1){
//        for(Integer res : a1) {
//            System.out.println(res);
//        }
//    }
//    public void display(Character[] a1){
//        // Overriding of method
//        for(Character res: a1){
//            System.out.println(res);
//        }
//    }
  //Below is the representation using Template class by utilizing generics, This will help in reducing the redundancy of our code by a very greater extent
    public void display(T arr1){
        for(T res: arr1){
            System.out.println(res);

        }
    }


    public static void main(String[] args) {
        Character carr[] = {'a','b','c','d','e'};
        Integer iarr[] = {10,20,30,40,50};
        Generics obj = new Generics();
        obj.display(carr);
        obj.display(iarr);

    }

}
