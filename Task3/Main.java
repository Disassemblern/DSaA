public class Main {
    public static void main(String[] args) {

        T3_Q3<String> stack = new T3_Q3<>();

        System.out.println("\n\n");

        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");

        System.out.println("Top element (peek): " + stack.peek());

        stack.down();
        System.out.println("Peek after moving down: " + stack.peek());

        stack.down();
        System.out.println("Peek after moving down: " + stack.peek());

        stack.down();
        System.out.println("Peek after moving down: " + stack.peek());

        stack.down();

        stack.top();
        System.out.println("Cursor reset to top. Peek: " + stack.peek());

        stack.pop();
        System.out.println("Peek after pop: " + stack.peek());

        stack.pop();
        stack.pop();
        System.out.println("Peek after popping all elements: " + stack.peek());
    }
}
