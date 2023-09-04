class Box {
    double width, height, depth, volume;

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    double vol() {
        volume = width * height * depth;
        return volume;
    }
}

class Q1 {
    public static void main(String[] args) {
        Box b = new Box(5, 7, 9);
        System.out.println(b.vol());
    }
}