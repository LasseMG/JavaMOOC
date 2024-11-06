package LicensePlate;

public class LicensePlateApp {
    public static void main(String[] args) {
        Storage storage = new Storage();

        LicensePlate l1 = new LicensePlate("DK", "295728");
        storage.addLicensePlate(l1, "Hans");

        System.out.println(l1.hashCode());
        System.out.println(storage.getLicensePlate(l1));
    }
}
