public class Product{

 private String name = "Coca Cola";
 private float price = 10
 public Product(String name, float price) {
  	this.name = name;
	this.price = price;
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
}