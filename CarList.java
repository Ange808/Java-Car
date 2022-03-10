import java.util.ArrayList;
public class CarList 
{
    private ArrayList<Car> cars;

  
  public CarList() 
  {
    cars = new ArrayList<Car>();
  }

  
  public void add(Car car)
  {
    cars.add(car);
  }

  
  public String toString()
  {
    String temp = "";
    for (Car car : cars)
      {
     temp += car.toString() + "\n";
      }
        return temp;
      }
 
  public String toJSON()
  {
    String temp = "{\n  \"cars\" : [\n";
    for (Car car : cars)
      {
        temp += car.toJSON() + ",\n";
      }
    temp = temp.substring(0, temp.length() - 2) + "\n";
    temp += "  ]\n}";
    return temp;
  }
  
  }