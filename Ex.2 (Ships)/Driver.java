public class Driver {
    public static void main(String[] args) {
        Ship[] array = new Ship[10];
        for (int i = 0; i < 5; i++) {
            array[i] = new CargoShip();
        }
        for (int i = 5; i < 10; i++) {
            array[i] = new CruiseShip();
        }
    }
}
/*

 */