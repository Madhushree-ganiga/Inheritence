class Tester{
public static void main(String[] mad)
{
Battry battry=new Battry("SAMSUNG",(short)6000,"Lithium-ion",599.9f );

Mobile mobile=new Mobile("SAMSUNG",(byte)8,"Smart phone",battry);
mobile.getDetails();
}
}
