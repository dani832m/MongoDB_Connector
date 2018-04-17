/**
 * Test class for methods.
 *
 *      (\_/)
 *      (o.o)
 *      (")")
 *
 */
public class MongoTest {

    public static void main(String[] args) {

        // MongoDB_Connector connect = new MongoDB_Connector();
        // connect.connect();

        MongoDB_InsertData insert = new MongoDB_InsertData();
        insert.insertData();

        MongoDB_RetrieveData data = new MongoDB_RetrieveData();
        data.getCollection();
        // data.getCollection2();

    }
}