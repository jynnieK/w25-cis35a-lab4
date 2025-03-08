import java.time.LocalDate;

public class Ship {
    private boolean floating = true;
    private int capacity;

    private float length;
    private float width;
    private float height;

    private String name;
    private String origin;
    private String portOfDeparture;
    private String portOfArrival;
    private String owner;

    private LocalDate dateDeparture;
    private LocalDate dateArrival;

    public Ship() {}

    public Ship(boolean floating, int capacity, float length, float width,
                float height, String name, String origin,
                String portOfDeparture, String portOfArrival,
                String owner, LocalDate dateDeparture,
                LocalDate dateArrival) {
        this.floating = floating;
        this.capacity = capacity;
        this.length = length;
        this.width = width;
        this.height = height;
        this.name = name;
        this.origin = origin;
        this.portOfDeparture = portOfDeparture;
        this.portOfArrival = portOfArrival;
        this.owner = owner;
        this.dateDeparture = dateDeparture;
        this.dateArrival = dateArrival;
    }

    public boolean isFloating() {
        return floating;
    }

    public void setFloating(boolean floating) {
        this.floating = floating;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getPortOfDeparture() {
        return portOfDeparture;
    }

    public void setPortOfDeparture(String portOfDeparture) {
        this.portOfDeparture = portOfDeparture;
    }

    public String getPortOfArrival() {
        return portOfArrival;
    }

    public void setPortOfArrival(String portOfArrival) {
        this.portOfArrival = portOfArrival;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public LocalDate getDateDeparture() {
        return dateDeparture;
    }

    public void setDateDeparture(LocalDate dateDeparture) {
        this.dateDeparture = dateDeparture;
    }

    public LocalDate getDateArrival() {
        return dateArrival;
    }

    public void setDateArrival(LocalDate dateArrival) {
        this.dateArrival = dateArrival;
    }

    public void scuttle() {
        floating = false;
    }
}
