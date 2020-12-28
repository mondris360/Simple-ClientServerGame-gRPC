package src.main.com.mondris.protobuf;

import com.mondris.generatedProtobufClass.Address;
import com.mondris.generatedProtobufClass.Car;
import com.mondris.generatedProtobufClass.Person;

import java.util.Arrays;
import java.util.List;

public class CompositionDemo {
    
    Car bmw =  Car.newBuilder()
            .setManufacturer("BMW")
            .setModel("xsdf340")
            .setPlateNumber("101452")
            .build();


    Car accord =  Car.newBuilder()
            .setManufacturer("accord")
            .setModel("xsdf340")
            .setPlateNumber("101452")
            .build();

    Car benz =  Car.newBuilder()
            .setManufacturer("Benz")
            .setModel("ddw3342")
            .setPlateNumber("101452")
            .build();


    List<Car> cars = Arrays.asList(accord, bmw, benz);

    Address address =  Address.newBuilder()
            .setHouseNo(10)
            .setCity("Benin")
            .setState("Edo")
            .setCountry("Nigeria")
            .setZipcode(4785)
            .build();
    
    
    Person person1 =  Person.newBuilder()
            .setName("Mondris")
            .setAge(10)
            .setAddress(address)
            .addAllCar(cars)
//            .addCar(bmw)
//            .addCar(accord)
            .build();



}
