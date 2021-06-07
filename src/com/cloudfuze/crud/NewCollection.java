package com.cloudfuze.crud;

import org.bson.Document;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class NewCollection {
	public static void main(String[] args) {
		MongoClient client = MongoClients.create("mongodb://localhost:27017");
		MongoDatabase database = client.getDatabase("Shop");
		System.out.println("Database created successfully");
	
		
		MongoCollection<Document> collection = database.getCollection("Grociers");
		Document document = new Document("Item", "Sugar");
		document.append("Qty", "1");
		collection.insertOne(document);
		System.out.println("Success");
		
	}
}
