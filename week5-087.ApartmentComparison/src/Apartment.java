
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }

    public boolean larger(Apartment otherApartment) {
        if (this.pricePerSquareMeter > otherApartment.pricePerSquareMeter) {
            return true;
        } else {
            return false;
        }
    }

    public int priceDifference(Apartment otherApartment) {

        int diff = 0;
        diff = (otherApartment.squareMeters * otherApartment.pricePerSquareMeter) - (this.squareMeters * this.pricePerSquareMeter);

        if (diff < 0) {
            diff = Math.abs(diff);
        }

        return diff;
    }

    public boolean moreExpensiveThan(Apartment otherApartment) {

        int fiestApartment;
        int secondApartment;

        fiestApartment = this.squareMeters * this.pricePerSquareMeter;
        secondApartment = otherApartment.squareMeters * otherApartment.pricePerSquareMeter;

        if (fiestApartment > secondApartment) {
            return true;
        } else {
            return false;
        }
    }
}
