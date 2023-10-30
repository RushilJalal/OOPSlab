import java.util.*;

//create arraylist 5,10,20,3,17,25
//1. display elements
//2. insert 19 at 3rd position
//3. delete 2nd element
class arrListQ1 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(5);
        arr.add(10);
        arr.add(20);
        arr.add(3);
        arr.add(17);
        arr.add(25);

        arr.add(4, 19);

        arr.remove(3);
        System.out.println(arr);
    }
}