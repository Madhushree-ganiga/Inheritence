class Mobile{
String brand;
byte ram;
String type;
Battry battry;
Mobile(String brand,byte ram,String type,Battry battry)
{
this.brand=brand;
this.ram=ram;
this.type=type;
this.battry=battry;
}
void getDetails()
{
System.out.println(brand + "\t" + ram + "\t" + type + "\t" + battry);
}
}