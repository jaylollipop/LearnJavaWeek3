// enum คือ ข้อมูลที่แจกแจงออกมาว่ามีกี่แบบ 

enum day {Monday , Tuesday , Wednesday , Thursday , Friday ,Saturday , Sunday }

class Shirts{

day day;
}

class Start {
public static void main(String [] zzz){
Shirts s = new Shirts();


s.day = day.Tuesday;
if (s.day == day.Monday) System.out.println("Yellow");
if (s.day == day.Tuesday) System.out.println("Pink");
if (s.day == day.Wednesday) System.out.println("Green");
if (s.day == day.Thursday) System.out.println("Orang");
if (s.day == day.Friday) System.out.println("Blue");
if (s.day == day.Saturday) System.out.println("Violet");
if (s.day == day.Sunday) System.out.println("Red");
}
}
