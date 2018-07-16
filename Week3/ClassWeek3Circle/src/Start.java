class Strat{
public static void main(String [] zzz){
    Circle c = new Circle(5);
    //double a = c.area();   
    //double b = c.area(5, 9);
     double a = Tool.area(5);
     double b = Tool.area(5,9);
    System.out.println("วงกลม" + a);
    System.out.println("วงรี" + b);
    System.out.println(Tool.companaName);
   
}
}
// หาพื้นที่วงกลม 
// สมาชิก แบบ Static คือ สามารถ ใช้งานได้เลย 
class Circle{
double radia;
// java constructor
Circle(double r){
radia = r ;
}
//หาพื้นที่วงกลม 
double area(double r){
    return Math.PI * r * r ;
}
// หาพื้นที่วงรี 
double area(double a, double b){
    return Math.PI * a * b ;
}
}
// Static 
class Tool{
    static String companaName = "iCoffee";
static double area(double r){
    return Math.PI * r * r ;
}
// หาพื้นที่วงรี 
static double area(double a, double b){
    return Math.PI * a * b ;
}
}