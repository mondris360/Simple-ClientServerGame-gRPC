package src.main.com.mondris.protobuf;
import com.mondris.generatedProtobufClass.Credential;
import com.mondris.generatedProtobufClass.EmailCredential;
import com.mondris.generatedProtobufClass.PhoneOTP;

public class OneOfDemo {
    public static void main(String[] args) {

        EmailCredential emailCredential =  EmailCredential.newBuilder()
                .setEmail("justmondris@gmail.com")
                .setPassword("1345")
                .build();


        PhoneOTP phoneOTP =  PhoneOTP.newBuilder()
                .setPhoneNo("23408106516740")
                .setCode(1234)
                .build();


        Credential loginCredentials = Credential.newBuilder()
                .setEmailCredential(emailCredential)
                .setPhoneCredential(phoneOTP)
                .build();

        login(loginCredentials);
    }

    // method to login
    public static void login(Credential loginCredentials){

        // to check which of the credential has been set
        switch (loginCredentials.getModeCase()){
            case EMAILCREDENTIAL:
                System.out.println("Email Credential Was Provided");
                break;
            case PHONECREDENTIAL:
                System.out.println("Phone Credential Was Provided");
                break;
        }

    }
}
