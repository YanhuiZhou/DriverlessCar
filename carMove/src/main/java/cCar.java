public class cCar implements Car {
    int positionX;
    int positionY;
    String orientation;

    public cCar(int positionX, int positionY, String orientation) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.orientation = orientation;
    }


    /* the move method for car, enter t means turn, enter f means forward */
    public void move(String command, int xLimit, int yLimit) throws CarMoveOutException {
        if (command != null && command.equals("t") ){
            switch (orientation){
                case "East":
                    orientation = "South";
                    break;
                case "South":
                    orientation = "West";
                    break;
                case "West":
                    orientation = "North";
                    break;
                case "North":
                    orientation = "East";
                    break;
            }
        }

        if (command != null && command.equals("f") ){
            switch (orientation){
                case "East":
                    if ((positionX + 1) <= xLimit) {
                        positionX = positionX + 1;
                    } else {
                        throw new CarMoveOutException("East");
                    }
                    break;
                case "South":
                    if ((positionY - 1) >= 1) {
                        positionY = positionY - 1;;
                    } else {
                        throw new CarMoveOutException("South");
                    }
                    break;
                case "West":
                    if ((positionX - 1) >= 1) {
                        positionX = positionX - 1;
                    } else {
                        throw new CarMoveOutException("West");
                    }
                    break;
                case "North":
                    if ((positionY + 1) <= yLimit) {
                        positionY = positionY + 1;;
                    } else {
                        throw new CarMoveOutException("North");
                    }
                    break;
            }

        }
    }



    /* Print the location and orientation of car */
    public void printCar() {
        System.out.println("the car is at: X " + positionX + " Y " + positionY + ", facing: " + orientation);
    }

    public boolean checkBoundary(int xLimit, int yLimit, Car myCar){
        return true;
    }

    @Override
    public int getPositionX() {
        return positionX;
    }

    @Override
    public int getPositionY() {
        return positionY;
    }

    @Override
    public String getOrientation() {
        return orientation;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }
}