package src;

import java.util.HashMap;
import java.util.Scanner;

public class UserInput {

    public static void userInputAndInfo(){

        System.out.println("************ WELCOME TO FAST AND SAFE DELIVERY *********");

        System.out.println("We are available in : ");

        HashMap<String,Integer> cityList = new HashMap<>();

        cityList.put("delhi",0);
        cityList.put("mumbai",1);
        cityList.put("pune",2);
        cityList.put("chennai",3);
        cityList.put("hyderabad",4);
        cityList.put("amritsar",5);
        cityList.put("bangalore",6);
        cityList.put("patna",7);

        System.out.println(cityList.keySet());

        int sourceCity;
        int destinationCity;
        Scanner sc  = new Scanner(System.in);

        while(true){
            System.out.println("Choose your parcel pickup city : ");
            String pickupCity = sc.nextLine();

            if(cityList.containsKey(pickupCity.toLowerCase())){
                sourceCity = cityList.get(pickupCity.toLowerCase());
                break;
            }else{
                System.out.println("You entered a wrong city. Enter again : ");
            }
        }

        while(true){
            System.out.println("Choose your parcel drop city : ");
            String dropCity = sc.nextLine();

            if(cityList.containsKey(dropCity.toLowerCase())){
                destinationCity = cityList.get(dropCity.toLowerCase());
                break;
            }else{
                System.out.println("You entered a wrong city. Enter again : ");
            }
        }

        System.out.println("Enter weight of parcel(in Kgs) : ");
        int weightOfParcel = sc.nextInt();

        CityDistance.cityDistances(sourceCity,weightOfParcel,destinationCity);

    }


}
