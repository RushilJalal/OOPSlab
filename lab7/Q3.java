class Q3 {

    // unboxing
    public static void main(String[] args) {
        int i = 10;
        byte b = 20;
        short s = 30;
        long l = 40;
        float f = 50.0f;
        double d = 60.0;

        // autoboxing
        Integer obj1 = new Integer(i);
        Byte obj2 = new Byte(b);
        Short obj3 = new Short(s);
        Long obj4 = new Long(l);
        Float obj5 = new Float(f);
        Double obj6 = new Double(d);
        System.out.println(obj1++);
        System.out.println(obj2++);
        System.out.println(obj3++);
        System.out.println(obj4++);
        System.out.println(obj5++);
        System.out.println(obj6++);
    }

}