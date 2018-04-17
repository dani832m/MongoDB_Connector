import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class MongoDB_InsertData {

    MongoClient mongo = new MongoClient("localhost", 27017);
    MongoDatabase database = mongo.getDatabase("users");
    MongoCollection collection = database.getCollection("users");

    Document document = new Document();

    //Not dynamic yet
    public void insertData() {

        document.put("name", "John Doe");
        document.put("age", 47);
        document.put("gender", "NA");
        document.put("email", "john@doe.com");
        document.put("phone", "+45 1234 5678");
        document.put("address", "Havnegade 8, 4700 Næstved");

        collection.insertOne(document);

    }
}