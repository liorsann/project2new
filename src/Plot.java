public class Plot extends Property{
    public static enum Type{
        URBAN,
        AGRICULTURAL,
        INDUSTRIAL

    }
    private Type type;
    @Override
    public void taxIt() {
        if(type==Type.URBAN){
            System.out.println("10%");
        }
        else if(type==Type.AGRICULTURAL){
            System.out.println("2%");
        }
        else if(type== Type.INDUSTRIAL){
            System.out.println("5%");
        }
    }
    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
    public Plot(Type type, String address, int area, int price){
        super(address, area, price);
        this.type=type;

    }
    public String toString(){
        return super.toString()+ "plot type "+ this.type;
    }

}
