import java.util.ArrayList;

public class BusStop {

    private String name;
    private ArrayList<Person> queue;

    public BusStop(String inputName) {
        this.name = inputName;
        this.queue = new ArrayList<>();
    }


    public int countQueue() {
        return this.queue.size();
    }

    public void addQueuer(Person person) {
        this.queue.add(person);
    }

    public Person removeFromQueue() {
        return this.queue.remove(0);
    }
}

