import java.sql.Array;
import java.util.ArrayList;

public class DataManager {

    public static ArrayList<Property> getArr(){
         ArrayList<Property> properties=new ArrayList<>();
        properties.add(new Plot(Plot.Type.URBAN, "Tel Aviv", 150, 2000000));
        properties.add(new Plot(Plot.Type.URBAN, "Peth tikva", 200, 3000000));


        properties.add(new Apartment(2, 1, "Haifa froyd", 100, 400000));
        properties.add(new Apartment(3, 2, "eilat beach", 130, 550000));


        properties.add(new Villa(4, 2, "Jerusalem 12", 300, 2000000));
        properties.add(new Villa(5, 3, "Jerusalem 8", 400, 2500000));


        properties.add(new Vacation(1, 1, "kineret St", 80, 300000));
        properties.add(new Vacation(2, 1, "Atlit 35", 90, 350000));


        properties.add(new Office("Haifa 90", 150, 200000));
        properties.add(new Office("Atlit 80", 200, 250000));

        properties.add(new Commercial(13, "haifa 89", 170, 190000));
        return properties;

    }

}
