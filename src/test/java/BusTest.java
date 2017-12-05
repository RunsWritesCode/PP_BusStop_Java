import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BusTest {

    Bus bus;
    Person person;
    Person person2;
    BusStop busStop;

    @Before
    public void before() {
        bus = new Bus("Edinburgh", 2);
        person = new Person();
        busStop = new BusStop("Waverley");
    }

    @Test
    public void busIsEmpty() {
        assertEquals(0, bus.countPassengers());
    }

    @Test
    public void addPassenger() {
        bus.addPassenger(person);
        bus.addPassenger(person2);
        assertEquals(2, bus.countPassengers());
    }

    @Test
    public void canRemovePassengers() {
        bus.addPassenger(person);
        bus.removePassenger();
        assertEquals(0, bus.countPassengers());
    }

    @Test
    public void countPassengersInQueue() {
        assertEquals(0, busStop.countQueue());
    }

    @Test
    public void addPassengersToQueue() {
        busStop.addQueuer(person);
        assertEquals(1, busStop.countQueue());
    }

    @Test
    public void canRemoveQueuer() {
        busStop.addQueuer(person);
        busStop.removeFromQueue();
        assertEquals(0, busStop.countQueue());
    }

    @Test
    public void canPickupPassenger() {
        busStop.addQueuer(person);
        busStop.addQueuer(person2);
        bus.pickup(busStop);
        bus.pickup(busStop);
        assertEquals(2, bus.countPassengers());
        assertEquals(0, busStop.countQueue());
    }


}
