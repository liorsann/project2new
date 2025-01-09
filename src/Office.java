public class Office extends  Property {
    public Office(String address, int area, int price){
        super(address, area, price);
    }

    @Override
    public void taxIt() {
        System.out.println("5%");
    }
}
