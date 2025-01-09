public class Commercial extends Property{
   private boolean storageRoom=false;
    private double yield=0.0;
    public void setStorageRoom(boolean storageRoom) {
        this.storageRoom = storageRoom;
    }

    @Override
    public void taxIt() {
        System.out.println("5%");
    }

    public boolean isStorageRoom() {
        return storageRoom;
    }

    public void setYield(double yield) {
      this.yield=  Math.max(0,yield);
    }

    public double getYield() {
        return yield;
    }
    public Commercial(double yield, String address, int area, int price){
        super(address, area, price);
        setYield(yield);
    }
    public Commercial(boolean storageRoom, double yield, String address, int area, int price){
        super(address, area, price);
        setYield(yield);
        setStorageRoom(storageRoom);
    }

    @Override
    public String toString() {
        return super.toString()+"storage "+ storageRoom+ "yield "+ yield;
    }

    public void gain(){
        System.out.println((double)getPrice()*(yield/100)/12);
    }
}
