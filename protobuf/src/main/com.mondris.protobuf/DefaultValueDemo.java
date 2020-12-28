package src.main.com.mondris.protobuf;

import com.mondris.generatedProtobufClass.Person;

public class DefaultValueDemo {

    public static void main(String[] args) {
        Person person = Person.newBuilder().build();
        System.out.println("City:" + person.hasAddress());
//        System.out.println("Address" +  person.getName());
    }
}
