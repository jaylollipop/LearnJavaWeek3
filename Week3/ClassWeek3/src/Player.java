class Strat{
public static void main(String [] zzz){
        Player p = new Player();
        p.name = "mbappe" ;
        p.number = 10;
       // p.agency = 0;
        p.showDetail();
        
        Book b = new Book("Biology",240);
        System.out.println(b.titel);
}
}

class Book{
    String titel;
    double price;
    // Method นี้เรียกว่า คอนสตักเตอร์ 
    Book(String t, double p){
    titel = t;
    price = p;
    }
}


class Player{
    String name;
    int number;
    double height;
    void showDetail(){
    System.out.println(name);
    }
    
    Agency agency;
    class Agency {
        String name;
        String phone;
    }

}