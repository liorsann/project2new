public class Villa extends Residential{
    private int levels;

    public void setLevels(int levels) {
       this.levels= Math.max(levels, 1);
    }

    public int getLevels() {
        return levels;
    }
    public Villa(int levels, int parkingLots, String address, int area, int price){
        super(parkingLots, address, area, price);
        setLevels(levels);
    }

    @Override
    public String toString() {
        return super.toString()+ "levels "+ levels;
    }
}
