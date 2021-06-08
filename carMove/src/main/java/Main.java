import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to DriverLess");
        Scanner sc = new Scanner(System.in);

        // get the dimensions sorted
        System.out.println("Please Enter X dimension for car park:");
        int xDimension = sc.nextInt();
        System.out.println("Please Enter Y dimension for car park:");
        int yDimension = sc.nextInt();
        System.out.println("car park dimension is " + xDimension + " times " + yDimension + "\n");

        // initialize car initial position and orientation
        System.out.println("Please Enter starting X for the car:");
        int xPosition = sc.nextInt();
        System.out.println("Please Enter starting Y for the car:");
        int yPosition = sc.nextInt();
        System.out.println("Please Choose orientation for the car: 1 for East, 2 for West, 3 for North, 4 for South");
        int numOrientation = sc.nextInt();
        String orientation;

        //based on 1,2,3,4 to match East, West, North, South
        switch (numOrientation) {
            case 1:
                orientation = "East";
                break;
            case 2:
                orientation = "West";
                break;
            case 3:
                orientation = "North";
                break;
            case 4:
                orientation = "South";
                break;
            default:
                orientation = "Not chosen";
        }


        //instantiate car myCar
        Car myCar = new cCar(xPosition, yPosition, orientation);
        myCar.printCar();


        String command = " ";
        do {
            System.out.println("Enter command: t for turn, f for forward. Enter q to Quit:");
            command = sc.next();

            if (command.equals("t") || command.equals("f")) {
                try {
                    myCar.move(command, xDimension, yDimension);
                    System.out.println("move successfully");
                    myCar.printCar();     //show new position
                } catch (CarMoveOutException e){
                    System.out.println("Car moving out of car park from boundary on " + e.getDirection() + ", please choose turn instead");
                }
            }

        } while(!command.equals("q")); //quit the game if q is entered
    }

}

