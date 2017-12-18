package homework;

public class Application {
    public static void main(String[] args) {
        TerminalImpl terminal = new TerminalImpl("1234");
        int code;
        do {
            code = terminal.printActions();
        } while (code != 4);
    }
}
