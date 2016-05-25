//90-days coding challenge
//Vipul Vaibhaw
//Using Java Mongodb client 2.11.3
import com.mongodb.MongoClient;
import com.mongodb.MongoException;
import com.mongodb.WriteConcern;
import com.mongodb.Mongo;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject._;
import com.mongodb.DBCursor;
import com.mongodb.ServerAddress;

object mongodbtest {
  def main (args:Array[String]){
    dbpusher("Vipul",20,123456789);
    dbviewer();
  }
  def dbpusher(Name:String,age:Int,contact:Int){
    val mongoClient = new MongoClient( "localhost" , 27017 );
			
         // Now connect to your databases
         val db = mongoClient.getDB( "test" );
         println("Connect to database successfully");
         val coll = db.getCollection("mongodbtest");
			   println("Collection Found")
			   //inserting doc.
			   val doc = new BasicDBObject("Name", Name).
			   append("age", age).
			   append("contact",contact);
         coll.insert(doc);
         println("Document inserted successfully");
  }
  def dbviewer(){
    val mongoClient = new MongoClient( "localhost" , 27017 );
			
         // Now connect to your databases
         val db = mongoClient.getDB( "test" );
         println("Connect to database successfully");
         val coll = db.getCollection("mongodbtest");
			   println("Collection Found")
			   
			   //printing collection
			   val cursor = coll.find();
         var i = 1;
			
         while (cursor.hasNext()) { 
            System.out.println("Insert Document: "+i); 
            System.out.println(cursor.next());
            i+= 1;
         }
  
  }
  
