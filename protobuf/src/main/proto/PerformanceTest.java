import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mondris.generatedProtobufClass.Person;
import src.main.com.mondris.protobuf.PersonJson;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PerformanceTest {

    public static void main(String[] args) {

        //  demonstrate json serialization and deserialization

        PersonJson personJson = new PersonJson();
            personJson.setName("Mondris");
            personJson.setAge(20);

        ObjectMapper objectMapper =  new ObjectMapper();

        Runnable runnable1 = () -> {
            try {
                // serialize the object
                byte[] jpersonbytes = objectMapper.writeValueAsBytes(objectMapper);
                // deserialize  the object
                PersonJson personJson1 = objectMapper.readValue(jpersonbytes, PersonJson.class);
            } catch (Exception e){
                e.getMessage();
            }
        };



        // protobuf serialization and deserialization
        Person  protoBufPerson = Person.newBuilder()
                .setName("Mondris")
                .setAge(20)
                .build();

        Path path = Paths.get("protobufObjTest.ser");

        Runnable runnable2 = () -> {
            try {
                // serialize the object
                byte[] protobufPersonInByte= protoBufPerson.toByteArray();
                // deserialize  the object
                Person person =  Person.parseFrom(protobufPersonInByte);
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        };

        // perform the performance test

        for (int x = 0; x <= 5; x++) {
            runPerformanceTest(runnable1, "JsonObject");
            runPerformanceTest(runnable2, "Protobuf Object");
            System.out.println("======================================");
        }


    }

    public static void runPerformanceTest(Runnable runnable, String methodName){
        long startTime = System.currentTimeMillis();
        for (int x=0; x <= 1000; x++){
            runnable.run();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("time taken: for " + methodName + " " +  (endTime -startTime) +" ms");

    }
}
