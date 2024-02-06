import java.util.Scanner;

class Stack<E> {
    E stck[];
    int top;
    final int SIZE =10;

    @SuppressWarnings("unchecked")
    Stack()
    {
        stck = (E[]) new Object[SIZE];
        top = -1;
    }

    void push(E item)
    {
        if (top == SIZE - 1) {
            System.out.println("Stack is  full");
        } else {
            stck[++top] = item;
        }
    }
    E pop()
    {
        if (top < 0) {
            System.out.println("Stack is empty");
            return null;
        }
        else {
            return stck[top--];
        }
    }
}

public class TestStack {
    public static void main(String[] args) {
        Stack<Integer> mystack1 = new Stack<Integer>();
        Stack<Double> mystack2 = new Stack<Double>();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter elements in Integer Stack");
        for (int i = 0; i < 5; i++) {
            int n = s.nextInt();
            mystack1.push(n);
        }
        System.out.println("\nElements of Double stack are: ");
        for (int i = 0; i < 5; i++) {
            double m = s.nextDouble();
            mystack2.push(m);
        }
        System.out.println("Elements of stack 1 are");
        for (int i = 0; i < 5; i++) {
            System.out.println(mystack1.pop());
        }
        System.out.println("Elements of Stack 2");
        for (int i = 0; i < 3; i++) {
            System.out.println(mystack2.pop());
        }
        s.close();
    }
}