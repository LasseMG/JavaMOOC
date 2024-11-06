package LicensePlate;

import java.util.ArrayList;
import java.util.HashMap;

public class Storage {
    private HashMap<LicensePlate, String> owners = new HashMap<>();

    public LicensePlate addLicensePlate(LicensePlate lp, String name) {
        if (owners.putIfAbsent(lp, name) == null) {
            return lp;
        } else {
            throw new IllegalArgumentException("License plate already in registry");
        }
    }

    public LicensePlate removeLicensePlate(LicensePlate lp) {
        if (owners.remove(lp) != null) {
            return lp;
        } else {
            throw new IllegalArgumentException("License plate not in registry");
        }
    }

    public LicensePlate getLicensePlate(LicensePlate lp) {
        owners.get(lp);
        return lp;
    }
}
