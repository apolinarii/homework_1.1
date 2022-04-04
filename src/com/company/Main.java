package com.company;

import static java.lang.System.*;

public class Main {

    public static void main(String[] args) {

byte a = 1;
short b = 100;
int c = 250;
long e = 500;
float f = 2f;
double j = 5L;

float boxerOne = 78.2f;
float boxerTwo = 82.7f;
float boxerWeight = boxerOne + boxerTwo;
System.out.println("Sum of boxer weight is " + boxerWeight + "kg");
System.out.println("Difference of boxer weight is " + (boxerTwo - boxerOne) + "kg");

byte banana = 80;
byte milk = 105;
byte iceCream = 100;
byte egg = 70;
int bananasWeight = 5*banana;
int milkWeight = 2*milk;
int iceCreamsWeight = 2*iceCream;
int eggsWeight = 4*egg;
int breakfastWeightGr = bananasWeight + milkWeight + iceCreamsWeight + eggsWeight;
int breakfastWeightKg = breakfastWeightGr / 1000;
System.out.println("Weight of breakfast is " + breakfastWeightKg + "kg");

byte loseWeightKg = 7;
int loseWeightGr = 7 * 1000;
int dietOne = 250;
int dietTwo = 500;
int weightLosePlaneOne = loseWeightGr / dietOne;
System.out.println("It takes " + weightLosePlaneOne + " days to lose weight");
int weightLosePlaneTwo = loseWeightGr / dietTwo;
System.out.println("It takes " + weightLosePlaneTwo + " days to lose weight");
System.out.println("It takes an average of " + ((weightLosePlaneOne + weightLosePlaneTwo) / 2) + " days to lose weight");

int salaryMasha = 67760;
int salaryDenis = 83690;
int salaryKristina = 76230;

int salaryIncreaseMasha = salaryMasha + salaryMasha / 100 * 10;
int salaryIncreaseDenis = salaryDenis + salaryDenis / 100 * 10;
int salaryIncreaseKristina = salaryKristina + salaryKristina / 100 * 10;

int salaryYearMasha = salaryMasha * 12;
int salaryYearDenis = salaryDenis * 12;
int salaryYearKristina = salaryKristina * 12;

int salaryIncreaseYearMasha = (salaryMasha + salaryMasha / 100 * 10) * 12;
int salaryIncreaseYearDenis = (salaryDenis + salaryDenis / 100 * 10) * 12;
int salaryIncreaseYearKristina = (salaryKristina + salaryKristina / 100 * 10) * 12;

int salaryYearDifferenceMasha = ((salaryMasha + salaryMasha / 100 * 10) * 12) - salaryMasha * 12;
int salaryYearDifferenceDenis = ((salaryDenis + salaryDenis / 100 * 10) * 12) - salaryDenis * 12;
int salaryYearDifferenceKristina = ((salaryKristina + salaryKristina / 100 * 10) * 12) - salaryKristina * 12;

System.out.println("Masha's salary at the moment " + salaryMasha + " rubles");
System.out.println("Denis's salary at the moment " + salaryDenis + " rubles");
System.out.println("Kristina's salary at the moment " + salaryKristina + " rubles");

System.out.println("Masha's salary after the promotion will be " + salaryIncreaseMasha + " rubles");
System.out.println("Denis's salary after the promotion will be " + salaryIncreaseDenis + " rubles");
System.out.println("Kristina's salary after the promotion will be " + salaryIncreaseKristina + " rubles");

System.out.println("The difference between Masha's annual income is " + salaryYearDifferenceMasha + " rubles");
System.out.println("The difference between Denis's annual income is " + salaryYearDifferenceDenis + " rubles");
System.out.println("The difference between Kristina's annual income is " + salaryYearDifferenceKristina + " rubles");
    }
}
