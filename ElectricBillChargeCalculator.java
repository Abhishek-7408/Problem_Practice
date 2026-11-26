import java.util.Scanner;

public class ElectricBillChargeCalculator{

    public static double UnitCal(int watt,int hrs,double rate){
        double charge = rate*watt*hrs/1000.0;
        return charge;

    }


    public static double MonthUnit(int watt,int hrs,double rate){
        double charge = 30*rate*watt*hrs/1000.0;
        return charge;
    }

    public static double YearUnit(int watt,int hrs,double rate){
        double charge = 365*rate*watt*hrs/1000.0;
        return charge;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter energy consumption in watt: ");
        int watt = sc.nextInt();

        System.out.println("Enter time in hrs: ");
        int hrs = sc.nextInt();

        System.out.println("Enter rate per unit charge is Rupees Rs: ");

        double rate = sc.nextDouble();

        System.out.printf("Bill per unit is Rs: %.2f%n", UnitCal(watt, hrs, rate));
        System.out.printf("Bill Generated per month is Rs: %.2f%n", MonthUnit(watt, hrs, rate));
        System.out.printf("Bill Generated per Year is Rs: %.2f%n", YearUnit(watt, hrs, rate));

    }









}