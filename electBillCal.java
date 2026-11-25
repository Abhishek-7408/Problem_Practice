import java.util.Scanner;
public class electBillCal{
    public  static double calculate(int watt, int hr){
        double ConUnit = (watt*hr)/1000.0;
        return ConUnit;
    }
    public static double chargeDay(int watt,int hr){
        return calculate(watt,hr);
    }

    public static double chargeMonths(int watt,int hr){
        return calculate(watt,hr)*30;
    }
    public static double chargeYears(int watt,int hr){
        return calculate(watt,hr)*365;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter appliance power consumption in WATT: ");
        int watt = sc.nextInt();
        System.out.println("Enter use time in hours: ");
        int hrs = sc.nextInt();
        
System.out.printf("Calculated unit is: %.2f%n", calculate(watt, hrs));
System.out.printf("Calculated unit Per day is: %.2f%n", chargeDay(watt, hrs));
System.out.printf("Calculated unit per year is: %.2f%n", chargeYears(watt, hrs));
System.out.printf("Calculated unit month is: %.2f%n", chargeMonths(watt, hrs));


    }
}