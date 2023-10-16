class statements {
    public static void main(String[] args) {
        int x = 10;
        double y = x;
        System.out.println(y);
        //causes error
        double x = 10.5;
        int y = x;
        System.out.println(y);
        double x = 10.5;
        int y = (int) x;
        System.out.println(y);
    }
}