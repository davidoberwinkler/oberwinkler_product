public class Product{

 private String name = "Coca Cola";
 private boolean onStock = true;
 public Product(String name, boolean onStock) {
  	this.name = name;
	this.onStock = onStock;
 }
 public void setname(String name){ 
	this.name = name; 
 }
 public String getname(){ 
	return name;
 }
 public void setonStock(boolean onStock){ 
	this.onStock = onStock; 
 }
 public boolean getonStock(){ 
	return onStock;
 }
}