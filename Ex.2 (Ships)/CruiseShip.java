public class CruiseShip extends Ship {

    // Capacity interpreted as maximum occupants
    public float ticketPrice;
    public int numberOfRooms;
    public String[] buffetMenu;
    public String[] services;
    public String cruiseType;

    public CruiseShip() {}

    public float getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(float ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public String[] getBuffetMenu() {
        return buffetMenu;
    }

    public void setBuffetMenu(String[] buffetMenu) {
        this.buffetMenu = buffetMenu;
    }

    public String[] getServices() {
        return services;
    }

    public void setServices(String[] services) {
        this.services = services;
    }

    public String getCruiseType() {
        return cruiseType;
    }

    public void setCruiseType(String cruiseType) {
        this.cruiseType = cruiseType;
    }
}
