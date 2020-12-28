package src.main.com.mondris.protobuf;

import com.mondris.generatedProtobufClass.Person;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PersonDemo {
    public static void main(String[] args) throws IOException {
        Person compositionDemo = new CompositionDemo().person1;
        System.out.println(compositionDemo);

//        Person person1 =  Person.newBuilder()
//                .setName("Mondris")
//                .setAge(20)
//                .build();
//
//        // serialize a protobufs
//
//        // will create a new file in the current dir where
//        // the object will be written to
//        Path path = Paths.get("person.ser");
//        // convert the obj to byte array and write it to the file i.e serialization
//        Files.write(path, person1.toByteArray());
//
//        // Deserializing   the array
//
//        byte[] personByte =  Files.readAllBytes(path);
//        // create a new person object from the byteArray
//
//        Person newPerson = Person.parseFrom(personByte);
//        System.out.println("New Person" +  newPerson);

    }
}
