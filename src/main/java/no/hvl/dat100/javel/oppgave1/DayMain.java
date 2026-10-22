package no.hvl.dat100.javel.oppgave1;

public class DayMain {

    public static void main(String[] args) {

        // test data
        double[] powerusage_day = DayPowerData.powerusage_day;

        double[] powerprices_day = DayPowerData.powerprices_day;

        System.out.println("==============");
        System.out.println("OPPGAVE 1");
        System.out.println("==============");
        System.out.println();

        System.out.println("Strømpriser:");
        DailyPower.printPowerPrices(powerprices_day);

        System.out.println("\nStrømforbruk:");
        DailyPower.printPowerUsage(powerusage_day);

        System.out.printf("%nTotalt forbruk: %.2f kWh%n",
                DailyPower.computePowerUsage(powerusage_day));
        System.out.printf("Spotpris: %.2f NOK%n",
                DailyPower.computeSpotPrice(powerusage_day, powerprices_day));
        System.out.printf("Strømstøtte: %.2f NOK%n",
                DailyPower.computePowerSupport(powerusage_day, powerprices_day));
        System.out.printf("Norgespris: %.2f NOK%n",
                DailyPower.computeNorgesPrice(powerusage_day));
        System.out.printf("Største forbruk: %.2f kWh%n",
                DailyPower.findPeakUsage(powerusage_day));
        System.out.printf("Gjennomsnittlig forbruk: %.2f kWh%n",
                DailyPower.findAvgPower(powerusage_day));

    }
}
