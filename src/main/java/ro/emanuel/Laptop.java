package ro.emanuel;

public class Laptop {
    private String brand;
    private int price;
    private int ram;

    public Laptop(String brand, int price, int ram) {
        this.brand = brand;
        this.price = price;
        this.ram = ram;
    }

    public String getBrand() {
    	return brand; 
    }
    
    public int getPrice() { 
    	return price; 
    }
    
    public int getRam() { 
    	return ram; 
    }
}
