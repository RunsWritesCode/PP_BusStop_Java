import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String inputDestination, int inputCapacity) {
        this.destination = inputDestination;
        this.capacity = inputCapacity;
        this.passengers = new ArrayList<>();
    }


    public int countPassengers() {
        return this.passengers.size();
    }

    public void addPassenger(Person person) {
        if (countPassengers() < capacity) {
            this.passengers.add(person);
        }
    }

    public Person removePassenger() {
        return this.passengers.remove(0);
    }   

    public void pickup(BusStop busStop) {
        addPassenger(busStop.removeFromQueue());
    }
}
