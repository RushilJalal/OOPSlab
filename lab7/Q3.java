public class Q3 {
    public static void main(String[] args) {
        Integer wrappedInt = 10;

        Double wrappedDouble = 3.14;

        Character wrappedChar = 'A';

        Boolean wrappedBoolean = true;

        System.out.println("Autoboxing Example:");
        System.out.println("Wrapped Integer: " + wrappedInt);
        System.out.println("Wrapped Double: " + wrappedDouble);
        System.out.println("Wrapped Character: " + wrappedChar);
        System.out.println("Wrapped Boolean: " + wrappedBoolean);

        int unboxedInt = wrappedInt;
        double unboxedDouble = wrappedDouble;
        char unboxedChar = wrappedChar;
        boolean unboxedBoolean = wrappedBoolean;

        System.out.println("\nUnboxing Example:");
        System.out.println("Unboxed Integer: " + unboxedInt);
        System.out.println("Unboxed Double: " + unboxedDouble);
        System.out.println("Unboxed Character: " + unboxedChar);
        System.out.println("Unboxed Boolean: " + unboxedBoolean);
    }
}
