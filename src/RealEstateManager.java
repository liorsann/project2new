import java.util.ArrayList;
public class RealEstateManager {
    private String name;
    ArrayList<Property> properties=new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Property> getProperties() {
        return properties;
    }

    public void setProperties(ArrayList<Property> properties) {
        this.properties = properties;
    }
    public void addProperty(Property p){
        properties.add(p);
    }
    public ArrayList<Property> getList(int maxPrice){
        ArrayList<Property> res=new ArrayList<>();
        for(Property p: properties){
            if(p.getPrice()<=maxPrice){
                res.add(p);
            }
        }
        return res;
    }
    public int sumPrice(){
        int sum=0;
        for(Property p: properties){
            sum+=p.getPrice();
        }
        return sum;
    }

}
