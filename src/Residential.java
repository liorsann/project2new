public class Residential extends Property{
    private int parkingLots;

    @Override
    public void taxIt() {
        System.out.println("8%");
    }

    public int getParkingLots() {
        return parkingLots;
    }

    public void setParkingLots(int parkingLots) {
        if(parkingLots<0 )
            parkingLots=0;
        else
            this.parkingLots = parkingLots;
    }
    public Residential(int parkingLots, String address, int area, int price){
        super(address,area, price);
        setParkingLots(parkingLots);
    }

    @Override
    public String toString() {
        return super.toString()+"parking lot:"+parkingLots;
    }

}
