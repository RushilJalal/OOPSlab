interface Product {
    double calculateSales();
}

class Hardware implements Product {
    private String category;
    private String manufacturer;
    private double[] sales = new double[3];

    public Hardware(String category, String manufacturer, double[] sales) {
        this.category = category;
        this.manufacturer = manufacturer;
        this.sales = sales;
    }

    @Override
    public double calculateSales() {
        double totalSales = 0;
        for (double sale : sales) {
            totalSales += sale;
        }
        return totalSales;
    }
}

class Software implements Product {
    private String type;
    private String os;
    private double[] sales = new double[3];

    public Software(String type, String os, double[] sales) {
        this.type = type;
        this.os = os;
        this.sales = sales;
    }

    @Override
    public double calculateSales() {
        double totalSales = 0;
        for (double sale : sales) {
            totalSales += sale;
        }
        return totalSales;
    }
}

public class company {
    public static void main(String[] args) {
        double[] hardwareSales = { 1000, 1200, 900 };
        double[] softwareSales = { 500, 600, 450 };

        Hardware hardware = new Hardware("Laptop", "ABC Corp", hardwareSales);
        Software software = new Software("Antivirus", "Windows", softwareSales);

        double hardwareTotalSales = hardware.calculateSales();
        double softwareTotalSales = software.calculateSales();

        System.out.println("Hardware Total Sales: $" + hardwareTotalSales);
        System.out.println("Software Total Sales: $" + softwareTotalSales);
    }
}