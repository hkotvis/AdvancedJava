package us.mattgreen;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Garage {
   public ArrayList<Integer> checkIns = new ArrayList<>();
   public ArrayList<Integer> lostTickets = new ArrayList<>();

    public void header(){
        System.out.println("\nBest Value Parking");
        System.out.println("--------------------");
    }

    public void parking() throws FileNotFoundException {
        Scanner inputCh = new Scanner(new File("Check.txt"));
        while (inputCh.hasNextInt())
        {
            int in = inputCh.nextInt();
            checkIns.add(in);
        }
        inputCh.close();
        Scanner inputL = new Scanner(new File("Lost.txt"));
        while (inputL.hasNextInt())
        {
            int in = inputL.nextInt();
            lostTickets.add(in);
        }
        inputL.close();

    }

    public void welcome() throws FileNotFoundException {
       header();
        System.out.println("1 - Check In");
        System.out.println("2 - Close Garage");
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
        else{
            closeGarage();
        }
    }

    private void checkOut() throws FileNotFoundException {
        Random rand = new Random();
        // Obtain a number between [7 - 12].
        int timeIn = rand.nextInt(6) + 7;
        // num between 1 and 11
        int timeOut = rand.nextInt(12) + 1;
        header();
        int hours = (12 - timeIn) + timeOut;
        System.out.println("Receipt for Vehicle ID: " + (rand.nextInt(99) + 1));
        System.out.println("\nParked for "+ ((12 - timeIn) + timeOut) + " hours, from "+ timeIn + " am - " + timeOut + " pm" );
        if(hours <= 3){
            System.out.println("$5.00");
            checkIns.add(5);
        }
        else if (hours > 3 && hours < 13){
            int pay = hours - 3;
            int paypay= 5 + pay;
            System.out.println("$" + paypay +".00");
            checkIns.add(paypay);

        }
        else{
            System.out.println("$15.00");
            checkIns.add(15);
        }

        setCheckFile();
    }

   private void loseTicket() throws FileNotFoundException{
        header();
        Random rand = new Random();
        System.out.println("Receipt for Vehicle ID: " + (rand.nextInt(99) + 1));
        System.out.println("\nLost Ticket\n$25.00");
        lostTickets.add(25);
        setLostFile();
    }


    private void closeGarage() throws FileNotFoundException {
        header();
        System.out.println("Activity to Date\n");
        System.out.println("$"+ getCheckSum() + " was collected from "+ checkIns.size() + " check ins");
        System.out.println("$"+ getLostSum() + " was collected from "+ lostTickets.size() + " lost tickets");
        System.out.println("\n$"+ (getCheckSum() + getLostSum()) + " was collected overall");

        setCheckFile();
        setLostFile();
    }

    private int getLostSum() {
        int lostSum = 0;
        int i =0;
        while(i < lostTickets.size()){
            lostSum = lostSum + lostTickets.get(i);
            i++;
        }
        return lostSum;
    }
    private int getCheckSum() {
        int checkSum = 0;
        int i =0;
        while(i < checkIns.size()){
            checkSum = checkSum + checkIns.get(i);
            i++;
        }
        return checkSum;
    }

    private void setLostFile() throws FileNotFoundException {
        PrintWriter lostFile = new PrintWriter("Lost.txt");
        for (int lost:lostTickets) {
            lostFile.println(lost);
        }
        lostFile.close();
    }

    private void setCheckFile() throws FileNotFoundException {
        PrintWriter checkFile = new PrintWriter("Check.txt");
        for (int checkIn:checkIns) {
            checkFile.println(checkIn);
        }

        checkFile.close();
    }
}
