import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    static Scanner s=new Scanner(System.in);
    private static RealEstateManager realEstateManager=new RealEstateManager();
    public static void main(String[] args) {

        realEstateManager.setProperties(DataManager.getArr());
        ArrayList<Property> properties=realEstateManager.getProperties();
        while(true){
            System.out.println("enter action");
            int input=s.nextInt();

            if( input==1){
                System.out.println("enter max price:");
                int maxPrice=s.nextInt();
                if(maxPrice<0)throw new RuntimeException("Illegal price");
                ArrayList<Property> arr=realEstateManager.getList(maxPrice);
                for(Property p: arr){
                    System.out.println(p.toString());
                }
            }
            else if(input==2){
                for(Property p: properties){
                    System.out.print(p.getAddress()+"tax: ");
                    p.taxIt();
                    System.out.println("");
                }
            }
            else if(input==3){

                for(Property p: properties){
                    if( p instanceof Commercial){
                        System.out.println("Tesua ");
                        ((Commercial) p).gain();
                    }
                }

            }
            else if(input==4){
                System.out.println("enter city name");

                String inputName =s.nextLine();
                inputName =s.nextLine();
                // remove - _ and space and lower case
                inputName = inputName.replaceAll("[- _]", "");
                inputName=inputName.toLowerCase();
                String cName;
                for(Property p: properties){
                    cName=p.getAddress();
                  cName = cName.replaceAll("[- _]", "");
                    cName=cName.toLowerCase();
                    if(cName.contains(inputName)){
                        System.out.println(p.toString());
                    }
                }
            }
            else if(input==5){
                Set<String> uniqueCities=new HashSet<>();
                for(Property p: properties){
                    String splt[]= p.getAddress().split("\\s+|[-_]+");
                    splt[0]=splt[0].toLowerCase();

                    if(!uniqueCities.contains(splt[0])){
                        uniqueCities.add(splt[0]);
                        System.out.println(splt[0]);
                    }
                }
            }
            else if(input==-1){
                return;
            }
            else{
                continue;
            }

        }


        }


}