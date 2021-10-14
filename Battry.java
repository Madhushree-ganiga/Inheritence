class Battry{
String brand;
short capacity;
String type;
float price;
Battry(String brand,short capacity,String type,float price)
{
this.brand=brand;
this.capacity=capacity;
this.type=type;
this.price=price;
}
String getDetails()
{
return brand + "\t" + capacity+ "\t" + type + "\t" + price;
}
String getBrand()
{
return brand ;
}
}