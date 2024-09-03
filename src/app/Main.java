package app;

public class Main {

    private static final double CONV_K = 2.20462;

    public static void main(String[] args) {
        System.out.println("Version 1.0");

        double kgs = 5;
        double pnds = 12;
        double pounds = convKgstoPounds(kgs);
        double kilos = convPoundstoKgs(pnds);
        System.out.println("Result is" + pounds + "pounds and " + kilos + "kilograms");
    }

    private static double convKgstoPounds(double kgs) {
        return kgs * CONV_K;
    }
    private static double convPoundstoKgs(double pnds) {
        return pnds / CONV_K;
    }

}
