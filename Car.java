public class Car {
  private String manufacturer;
  private String model;
  private double price;

  public Car(String man, String mod, double pr) 
  {
    setManufacturer(man);
    setModel(mod);
    setPrice(pr);
  }
  
  public void setManufacturer(String s)
  {
    manufacturer = s.trim();
    if (manufacturer.equals ("")){
      manufacturer = "Noman";
    }
  }
  
  public void setModel(String s)
  {
    model = s.trim();
    if (model.equals ("")){
      model = "Nomod";
    }
  }
  
  public void setPrice(double pr)
  {
    price = pr;
    if (price <= 0){
      price = 0;
    }
  }
  
  public String getManufacturer() { return manufacturer; }
  public String getModel() { return model; }
  public double getPrice() { return price; }
  public String toString() 
  {
    String temp = manufacturer + " " + model;
    temp = temp + ", price: $" + price;
    return temp;
  }
    public String toJSON() 
  {
    String temp = "    {\n";
    temp += "      \"manufacturer\" : \"" + manufacturer + "\",\n";
    temp += "      \"model\" : \"" + model + "\",\n";
    temp += "      \"price\" : " + price + "\n";
    temp+= "    }";
    return temp;
  }
}