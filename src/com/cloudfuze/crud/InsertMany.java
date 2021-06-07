package com.cloudfuze.crud;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class InsertMany {
	public static void main(String[] args) {
		MongoClient client = MongoClients.create("mongodb://localhost:27017");
		MongoDatabase database = client.getDatabase("College");
		MongoCollection<Document> collection = database.getCollection("Employee");
		Document document = new Document("Name", "Sunil");
		document.append("Specialised", "Core Java");
		document.append("Phone", "741258963");
		document.append("Address", "SEC");
		document.append("College", "VREC");
		Document document2 = new Document("Name", "charan");
		document2.append("Specialised", "Web");
		document2.append("Phone", "741258820");
		document2.append("Address", "VISK");
		document2.append("College", "KAKATIYA");
		Document document3 = new Document("Name", "mahesh");
		document3.append("Specialised", "Html");
		document3.append("Phone", "741258974");
		document3.append("Address", "HYD");
		document3.append("College", "JNTUH");
		List<Document> documents = new ArrayList<Document>();
		documents.add(document);
		documents.add(document2);
		documents.add(document3);
		collection.insertMany(documents);
		System.out.println("Documents are inserted");
		
	}
}
