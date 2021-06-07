package com.cloudfuze.crud;

import org.bson.Document;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class ConnectMongo {
	
	public static void main(String[] args) {
		//Connection to MongoDB server
		MongoClient client = MongoClients.create("mongodb://localhost:27017");
		//connection to database
		MongoDatabase database = client.getDatabase("College");
		//Get collection
		MongoCollection<Document> collection = database.getCollection("Employee");
		Document document = new Document("Name","Pallavi");
		document.append("Specialied", "Java");
		document.append("Phone", "4896314140");
		document.append("Address", "BNGLR");
		document.append("College", "VNR");
		
		collection.insertOne(document);
		System.out.println("Inserted Successfully");
	}
}
