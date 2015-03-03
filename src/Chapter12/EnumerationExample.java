package Chapter12;

public class EnumerationExample {

    public static void main(String[] args) {

        Transport transport1;

        transport1 = Transport.Truck;

        System.out.println(Transport.Car);

        for (Transport i : Transport.values()) {
            System.out.println("Transport " + i + " has speed: " + i.getSpeed());
        }

        System.out.println(transport1.getSpeed());
    }
}

enum Transport {
    Truck(50), Car(90), Airplane(700, 1100), Train(200, 500);

    private int speed;
    private int maxSpeed;

    Transport(int speed) {
        this.speed = speed;
    }

    Transport(int speed, int maxSpeed) {
        this.speed = speed;
        this.maxSpeed = maxSpeed;
    }

    public int getSpeed() {
        return speed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
}