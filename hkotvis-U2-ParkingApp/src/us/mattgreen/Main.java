package us.mattgreen;

import java.io.FileNotFoundException;

public class Main { // No scanners or prints... just calling methods
    public static void main(String[] args) throws FileNotFoundException {
       Garage g = new Garage();
        g.parking();
        g.welcome();

        }

    }



// ArrayList<Integer> checkIns = new ArrayList<>();
// ArrayList<String> lostTickets = new ArrayList<>();
       /* Scanner input = new Scanner(new File("Parking.txt"));
        while (input.hasNextInt())
        {
            int in = input.nextInt();
            checkIns.add(in);
            //System.out.println(in);
        }
        input.close();
        checkIns.add(99);
        System.out.println(checkIns);
        PrintWriter outputFile = new PrintWriter("Parking.txt");
        for (int checkIn:checkIns) {
            outputFile.println(checkIn);
        }
        outputFile.close();*/
