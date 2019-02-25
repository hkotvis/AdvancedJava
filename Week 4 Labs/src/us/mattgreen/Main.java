package us.mattgreen;
import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            //example of adding bytes
            byte a = 5;
            byte b = 6;
            byte c = (byte)(a+b);
            System.out.println(c);

            long cc = 1234567894564568445L;

            Scanner input = new Scanner(System.in);
            System.out.print("Please enter your favorite NFL team: ");
            String fav = input.nextLine();
            Team team;
            switch (fav.substring(0, 3)){
                case "Gre":
                case "Pac":
                case "GRE":
                case"PAC":
                    team = Team.GREENBAYPACKERS;
                    break;

                case "Chi":
                case "Bea":
                    team = Team.CHICAGOBEARS;
                    break;

                case "Det":
                case "Lio":
                    team = Team.DETROITLIONS;
                    break;

                default: team = Team.GREENBAYPACKERS;
            }

            doIt(team);


        }

        public static void doIt(Team t){
            switch(t){
                case CHICAGOBEARS:
                    System.out.println("Chicago Bears");
                    break;
                case GREENBAYPACKERS:
                    System.out.println("Greenbay Packers");
                    break;
                case DETROITLIONS:
                    System.out.println("Detroit Lions");
                    break;
                default:
                    System.out.println("New team- fix code");
            }
        }
    }

//Classes start with uppercase and objects start with lowercase!!!
// Create a class that includes a main method that asks the user their favorite NFC team. Based upon the first three
// letters, the method should be able to identify the team based upon mascot or city.2.There should be a second method
// with an argument of the enumtype Team and should printout the name of the team with the name.  City Mascot (Ex: Green
// Bay Packers, Chicago Bears)  3.Create the enumtype Team.

