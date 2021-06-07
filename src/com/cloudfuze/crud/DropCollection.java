package com.cloudfuze.crud;

import org.bson.Document;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class DropCollection {
	public static void main(String[] args) {
		MongoClient client = MongoClients.create("mongodb://localhost:27017");
		MongoDatabase database = client.getDatabase("College");
		MongoCollection<Document> collection = database.getCollection("Employee");
		collection.drop();
		System.out.println("Drop success");
	}
}
