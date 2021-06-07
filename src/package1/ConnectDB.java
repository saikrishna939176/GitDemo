package package1;



import java.util.ArrayList;

import javax.print.Doc;

import org.bson.Document;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;

public class ConnectDB {
	public static void main(String[] args) {
		 MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017");
		 MongoDatabase database = mongoClient.getDatabase("College");
		 MongoCollection<Document> 	collection = database.getCollection("Student");
		 /*Document document = new Document("Name", "vineeth");
		 document.append("RollNo", 29);
		 document.append("Address", "KMR");
		 document.append("Branch", "IT");*/
		 /*//collection.insertOne(document);
		 collection.deleteOne(document);
		 System.out.println("Success");*/
		/* FindIterable<Document>iterable = collection.find();
		 int i=0;
		 MongoCursor<Document>cursor = iterable.iterator();
		 while(cursor.hasNext()) {
			 System.out.println(cursor.next());
			 i++;
		 }*/
		 collection.drop();
		 System.out.println("sucess");
	}
}
