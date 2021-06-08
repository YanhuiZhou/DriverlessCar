public interface Car {
    void move(String command, int xLimit, int yLimit) throws CarMoveOutException;
    int getPositionX();
    int getPositionY();
    String getOrientation();

    void printCar();
}



