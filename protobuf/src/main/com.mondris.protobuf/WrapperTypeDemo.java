package src.main.com.mondris.protobuf;

import com.google.protobuf.DoubleValue;
import com.google.protobuf.Int32Value;
import com.google.protobuf.StringValue;
import com.mondris.generatedProtobufClass.School;

public class WrapperTypeDemo {

    public static void main(String[] args) {
        School school =  School.newBuilder()
                .setAveragePerformance(DoubleValue.newBuilder().setValue(500.85).build())
                .setName(StringValue.newBuilder().setValue("James International").build())
                .setTotalStudents(Int32Value.newBuilder().setValue(8520).build())
                .build();

        System.out.println(school.hasName());
    }
}
