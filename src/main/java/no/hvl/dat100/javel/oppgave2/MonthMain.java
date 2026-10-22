package no.hvl.dat100.javel.oppgave2;

public class MonthMain {
    public static void main(String[] args) {

        // test data
        double[][] power_prices_month = MonthPowerData.powerprices_month;

        double[][] power_usage_month = MonthPowerData.powerusage_month;

        System.out.println("==============");
        System.out.println("OPPGAVE 2");
        System.out.println("==============");
        System.out.println();

        System.out.println("Månedlig strømforbruk:");
        MonthlyPower.print_PowerUsage(power_usage_month);

        System.out.println("\nMånedlige strømpriser:");
        MonthlyPower.print_PowerPrices(power_prices_month);

        System.out.printf("%nTotalt forbruk: %.2f kWh%n",
                MonthlyPower.computePowerUsage(power_usage_month));
        System.out.println("Over 1000 kWh: "
                + MonthlyPower.exceedThreshold(power_usage_month, 1000));
        System.out.printf("Spotpris: %.2f NOK%n",
                MonthlyPower.computeSpotPrice(power_usage_month, power_prices_month));
        System.out.printf("Strømstøtte: %.2f NOK%n",
                MonthlyPower.computePowerSupport(power_usage_month, power_prices_month));
        System.out.printf("Norgespris: %.2f NOK%n",
                MonthlyPower.computeNorgesPrice(power_usage_month));

    }
}
