public class CargoShip extends Ship {
    // CargoShip will interpret capacity as TEU

    private String cargoType;
    private String loadingMethod;
    private int numberOfCranes;
    private boolean contraband;
    private float cargoValue;

    public CargoShip() {}

    public String getCargoType() {
        return cargoType;
    }

    public void setCargoType(String cargoType) {
        this.cargoType = cargoType;
    }

    public String getLoadingMethod() {
        return loadingMethod;
    }

    public void setLoadingMethod(String loadingMethod) {
        this.loadingMethod = loadingMethod;
    }

    public int getNumberOfCranes() {
        return numberOfCranes;
    }

    public void setNumberOfCranes(int numberOfCranes) {
        this.numberOfCranes = numberOfCranes;
    }

    // Contraband? Absolutely not...
    public boolean contraband() {
        return false;
    }

    public void setContraband(boolean contraband) {
        this.contraband = contraband;
    }

    public float getCargoValue() {
        return cargoValue;
    }

    public void setCargoValue(float cargoValue) {
        this.cargoValue = cargoValue;
    }

    public void getStuck() {
        setName("Ever Given");
    }

}
