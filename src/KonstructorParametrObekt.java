public class KonstructorParametrObekt {
    public static void main (String [] args){
Test t1 = new Test (100,22);
Test t2 = new Test (100,22);
Test t3 = new Test (1,2);
System.out.println(t1.EqualTo(t3));
    }
}
class Test {
    int a,b;

    Test(int a, int b){
        this.a=a; this.b=b;
    }
    boolean EqualTo (Test o){
if (o.a == a && o.b ==b) return true;
else return false;
    }
}
