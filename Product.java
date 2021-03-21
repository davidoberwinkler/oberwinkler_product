public class Product{

 private String name = "Coca Cola";
 private float price = 10
 private int id;
 public Product(String name, float price, int id) {
  	this.name = name;
	this.price = price;
	this.id = id;
 }
 public void setname(String name){ 
	this.name = name; 
 }
 public String getname(){ 
	return name;
 }
 public void setprice(String price){ 
	this.price = price; 
 }
 public float getprice(){ 
	return price;
 }
 public void setid(int id){ 
	this.id = id; 
 }
 public int getid(){ 
	return id;
 }
}