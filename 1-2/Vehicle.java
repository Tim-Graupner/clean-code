
public class Vehicle {

    private final String vin;

    public static Vehicle byVin(final String vin){
        return new Vehicle(vin);
    }

    public boolean isBlacklisted() {
        if (vin.equals("1HGBH41JXMN109186")) {
            return true;
        } else if (vin.equals("2HGBH41JXMN109186")) {
            return true;
        } else if (vin.equals("3HGBH41JXMN109186")) {
            return true;
        } else if (vin.equals("4HGBH41JXMN109186")) {
            return true;
        } else {
            return false;
        }
    }

    private Vehicle(final String vin){
        this.vin = vin;
    }

}
