package com.cloudfuze.crud;

import org.bson.Document;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;

public class DeleteDocument {
	public static void main(String[] args) {
		MongoClient client = MongoClients.create("mongodb://localhost:27017");
		MongoDatabase database = client.getDatabase("College");
		MongoCollection<Document> collection = database.getCollection("Employee");
		collection.deleteOne(Filters.eq("Name", "charan"));
		System.out.println("Deleted");
		
	}
}
