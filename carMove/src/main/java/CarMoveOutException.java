public class CarMoveOutException extends Exception{
    private String direction;  //from which direction, car moves out of the car park

    public CarMoveOutException(String direction) {
        this.direction = direction;
    }

    public String getDirection() {
        return direction;
    }
}
