//В этом классе определяется целочисленный стек, где можно хранить до 10 целочисленных значений

public class StackMain {
    public static void main (String [] args){
        Stack myStack1 = new Stack();
        Stack myStack2 = new Stack();
        //размещаем данные в стек
        for (int i=0; i<10; i++) myStack1.push(i);
        for (int j=0; j<10; j++) myStack2.push(j);
        //
        System.out.println("Данные числа стек 1: ");
        for (int i=0; i<10; i++)
            System.out.println(myStack1.pop());

        System.out.println("Данные числа стек 2: ");
        for (int j=0; j<10; j++)
            System.out.println(myStack2.pop());
    }
}
class Stack {

    int stck[] = new int [10];
    int tos;
    //Инициализируем вершину стенка
    Stack(){
        tos = -1;
    }
    //Разместить элемент в списке
    void push (int item) {
        if (tos == 9) {
            System.out.println("Стек заполнен");
        } else {
            stck[++tos] = item;
        }
    }
        //Извлечь элемент из стека
    int pop (){
         if (tos<0) {
             System.out.println("Стек не загружен.");
             return 0;
         }
         else
             return stck [tos--];
    }
}