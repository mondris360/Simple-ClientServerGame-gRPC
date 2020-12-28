
const grpc =  require("grpc");
const protoLoader = require("@grpc/proto-loader");
const packageDef = protoLoader.loadSync("./bank-service.proto");
const protoDefinition =  grpc.loadPackageDefinition(packageDef)

const client =  new protoDefinition.BankService("localhost:9000", grpc.credentials.createInsure());

client.getBalance({accountNumber:2540}, (err, balance) => {
    if(err){
        console.log("an error occured" + err);
    } else {
        console.log("Response from server"+ balance);
    }
})



