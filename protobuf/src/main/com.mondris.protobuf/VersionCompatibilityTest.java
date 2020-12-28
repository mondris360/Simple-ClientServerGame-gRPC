package src.main.com.mondris.protobuf;

import com.mondris.generatedProtobufClass.Television;
//import com.mondris.generatedProtobufClass.TvType;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class VersionCompatibilityTest {


    public static void main(String[] args) throws IOException {

//        Television televisionV1 = Television.newBuilder()
//                .setName("Plasma TV V1")
//                .setYear(2019)
//                .build();
//


//    Television televisionV2 = Television.newBuilder()
//                .setName("Plasma TV V2")
//                .setModel(2019)
//                .setTvType(TvType.OLED)
//                .build();

//        // serializing the protobuf

//        Path TV_V1_Path = Paths.get("tv-V1");
//        Files.write(TV_V1_Path, televisionV1.toByteArray());


//        Path TV_V1_Path = Paths.get("tv-V1");
        Path TV_V2_Path = Paths.get("tv-V2");
         // serialize
//        Files.write(TV_V1_Path, televisionV1.toByteArray());
//        Files.write(TV_V2_Path, televisionV2.toByteArray());

        // deserialize it
//        byte[] TelevisionV1Bytes = Files.readAllBytes(TV_V1_Path);
        byte[] TelevisionV2Bytes = Files.readAllBytes(TV_V2_Path);

//        Television deserializedTV_V1 =  Television.parseFrom(TelevisionV1Bytes);

//        Television deserializedTV_V2 =  Television.parseFrom(TV_V1_Path);
        Television deserializedTV_V3 =  Television.parseFrom(TelevisionV2Bytes);

//        System.out.println("Television Version 1");
//        System.out.println(deserializedTV_V1);
        System.out.println("==============================================");
        System.out.println("Television Version 3");
        System.out.println(deserializedTV_V3);
        System.out.println();
    }
}
