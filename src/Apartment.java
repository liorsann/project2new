public class Apartment extends Residential {
    private int rooms;

    public void setRooms(int rooms) {
        if(rooms<1){
            this.rooms=1;
        }
        else
         this.rooms = rooms;
    }

    public int getRooms() {
        return rooms;
    }

    public Apartment(int rooms, int parkingLots, String address, int area, int price){
        super( parkingLots,address, area,price);
        setRooms(rooms);

    }

    @Override
    public String toString() {
        return super.toString()+"rooms "+rooms;
    }
}
