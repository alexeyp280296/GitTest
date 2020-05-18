public class Main {
    public static void main(String[] args) {
        int vol;
        Box b1 = new Box ("Alex", 23);

    }
}

class Box {
   private int weight, depth, height, age;
    private String name;

     Box () {
         System.out.println("Конструирование Box");
         weight = 10;
         height = 10;
         depth = 10;
     }

     Box (String name, int age ) {
         System.out.println("Констурктор с именем и возрастом : " + name + " " + age);
         this.name = name;
         this.age = age;
     }
    int Volume () {
        return weight*depth*depth;
    }
}