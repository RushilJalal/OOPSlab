
public class pattern {
    public static void main(String[] args) {
        //using nested for loop
        for (int i = 1; i <= 5; i++) {
            for(int j = 1; j<= i; j++ ) {
                System.out.print(i+" ");
            }
            System.out.println("");
        }
        System.out.println("");
        //using for each loop
        int arr[] = {1,2,3,4,5};
        for (int i: arr)
            System.out.println(Integer.toString(i).repeat(i));
    }
}
