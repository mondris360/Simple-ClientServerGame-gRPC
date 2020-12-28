package src.main.com.mondris.protobuf;

import com.mondris.generatedProtobufClass.BodyColor;
import com.mondris.generatedProtobufClass.Car;
import com.mondris.generatedProtobufClass.Dealer;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {


        Car bmw =  Car.newBuilder()
                .setManufacturer("BMW")
                .setModel("xsdf340")
                .setBodyColor(BodyColor.Green)
                .setPlateNumber("101452")
//                .setBodyColor()
                .build();


        Car accord =  Car.newBuilder()
                .setManufacturer("accord")
                .setModel("xsdf340")
                .setBodyColor(BodyColor.Black)
                .setPlateNumber("101452")
                .build();

        Car benz =  Car.newBuilder()
                .setManufacturer("Benz")
                .setModel("ddw3342")
                .setBodyColor(BodyColor.Red)
                .setPlateNumber("101452")
                .build();

        Map<Integer, Car>  models =  new HashMap<>();
        models.put(100, bmw);
        models.put(500, accord);
        models.put(800, benz);


        Dealer dealer =  Dealer.newBuilder()
               .putModels(20, bmw)
                .putAllModels(models)
                .build();

        System.out.println(dealer.getModelsOrThrow(100).getBodyColor());
        System.out.println(dealer.getModelsOrThrow(500).getBodyColor());
        System.out.println(dealer.getModelsOrThrow(800).getBodyColor());



        // get an item from the protobuf object

//        Car newCar =  dealer.getModelsOrThrow(100);
//        System.out.println("model retrieved from the map of the protobuf");
//        System.out.println(newCar);
//
//        // get all list of all the cars
//        Map<Integer, Car>  myCars =  dealer.getModelsMap();
//        System.out.println("a map of all my cars");
//        System.out.println(myCars);
//
//        dealer.toBuilder().removeModels(100);
//        System.out.println("deleting all the models");
//        System.out.println(dealer.getModelsMap());
//        System.out.println("==============================");
//        System.out.println("set a default value");
//
//        System.out.println(dealer.getModelsOrDefault(100, accord));

//        System.out.println(dealer);
    }
}
