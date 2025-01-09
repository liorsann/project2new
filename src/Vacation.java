public class Vacation extends Residential {
    private int guests;

    public void setLevels(int levels) {
        this.guests= Math.max(levels, 1);
    }

    public int getLevels() {
        return guests;
    }
    public Vacation(int guests, int parkingLots, String address, int area, int price){
        super(parkingLots, address, area, price);
        setLevels(guests);
    }

    @Override
    public String toString() {
        return super.toString()+ "guests "+ guests;
    }

    @Override
    public void taxIt() {
        System.out.println("25%");
    }
}
