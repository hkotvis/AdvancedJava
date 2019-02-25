package us.mattgreen;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Garage {
    ArrayList<String> checkIns = new ArrayList<>();
    ArrayList<String> lostTickets = new ArrayList<>();
    void welcome() {
       header();
        System.out.println("1 - Check In");
        System.out.println("2 - Close Garage");
        // checkIns.add(0, money);
        Scanner kb = new Scanner(System.in);
        if (kb.nextLine().equals("1")) {
            header();
            System.out.println("1 - Check Out");
            System.out.println("2 - Lost Ticket");
            if (kb.nextLine().equals("1")) {
                checkOut();
            }
            else{
                loseTicket();
            }

        }
    }

    private void header(){
        System.out.println("Best Value Parking");
        System.out.println("--------------------");
    }


    private void checkOut(){

        Random rand = new Random();
        // Obtain a number between [7 - 12].
        int timeIn = rand.nextInt(6) + 7;
        int timeOut = rand.nextInt(12) + 1;
        header();
        int hours = (12 - timeIn) + timeOut;
        System.out.println("Receipt for vehicle ID: ");
        System.out.println("\nParked for "+ ((12 - timeIn) + timeOut) + " hours, from "+ timeIn + " am - " + timeOut + " pm" );
        if(hours <= 3){
            System.out.println("$5.00");
        }
        else if (hours > 3 && hours < 13){
            int pay = hours - 3;
            int paypay= 5+pay;
            System.out.println("$" + paypay +".00");
        }
        else{
            System.out.println("$15.00");
        }

    }
   private void loseTicket(){
        header();
        System.out.println("Receipt for vehicle ID: ");
        System.out.println("\nLost Ticket\n$25.00");
    }

}
