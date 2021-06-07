package com.cloudfuze.crud;

import org.bson.Document;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;

public class UpdateCollections {
	public static void main(String[] args) {
		MongoClient client = MongoClients.create("mongodb://localhost:27017");
		MongoDatabase database = client.getDatabase("College");
		MongoCollection<Document> collection = database.getCollection("Employee");
		collection.updateOne(Filters.eq("Name", "Pallavi"), Updates.set("College", "KCEA"));
		System.out.println("Updated Successfully");
	}
}
