package com.cloudfuze.crud;

import org.bson.Document;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;

public class PrintDocuments {
	public static void main(String[] args) {
		MongoClient client = MongoClients.create("mongodb://localhost:27017");
		MongoDatabase database = client.getDatabase("College");
		MongoCollection<Document> collection = database.getCollection("Employee");
		FindIterable<Document> findIterable = collection.find(Filters.eq("Name", "charan"));
		@SuppressWarnings("unused")
		int i = 0;
		MongoCursor<Document> cursor = findIterable.iterator();
		while(cursor.hasNext()) {
			System.out.println(cursor.next());
			i++;
		}
	}
}
