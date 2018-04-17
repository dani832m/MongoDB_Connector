import com.mongodb.MongoClient;

public class MongoDB_Connector {

    public void connect() {

        try {
            // Create a Mongo Client
            MongoClient mongo = new MongoClient("localhost", 27017);
            System.out.println("Forbindelse til MongoDB oprettet!");

        } catch(Exception e) {
            System.out.println("Forbindelsen til MongoDB blev IKKE oprettet!!!");
            e.printStackTrace();
        }

    }
}