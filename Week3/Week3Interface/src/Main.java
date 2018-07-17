class Start{
    public static void main(String [] zzz){
    Ellipse [] data = {
    new Ellipse(8,5),
    new Ellipse(3,6),
    new Ellipse(8,6)
    };
    
    int i = 0;
    while(i < data.length){
    System.out.println(data[i].area());
    i = i + 1 ;
    }
    }
}

class Ellipse implements Comparable {
    public int compareTo(Object o) {
        Ellipse e = (Ellipse) o;
         if(area() < e.area() ) return -1;
            if(area() > e.area() ) return +1;
        return 0 ;
    }
Ellipse(double a, double b){
major = a;
minor = b;
}
double major;
double minor;

double area() {return Math.PI * major * minor;}

}
// Class ที่จะเรียกกันได้ต้องมีความสามารถ เปรียบเทียบกันได้ 
/*
class Coffee implements Comparable {
    @Override
        public int compareTo(Object o){
            Coffee c = (Coffee)o;
            if(price < c.price ) return -1;
            if(price > c.price ) return +1;
        return 0 ;
        }
        
Coffee(String n,double p){

name = n;
price = p;
}
String name;
double price;
}*/