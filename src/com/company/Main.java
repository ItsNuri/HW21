package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        DayOfWeek dayOfWeek1 = DayOfWeek.Duishonbu;
        DayOfWeek dayOfWeek2 = DayOfWeek.Sheishenbi;

        switch (dayOfWeek2) {
            case Duishonbu:
                System.out.println("Bugun Javadan Teory sabagyn okuim");
                break;
            case Sheishenbi:
                System.out.println("Bugun English tilin okuim");
        }



    }
}