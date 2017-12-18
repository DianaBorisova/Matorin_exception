package homework;

import java.io.BufferedReader;


public class PinValidator {
    private final String pinCode;

    public PinValidator(String pinCode) {
        this.pinCode = pinCode;
    }

    public void validate(BufferedReader reader) {
        System.out.println("Введите PIN-код:");
        try {
            String code = reader.readLine();
            if (code.equals(pinCode)) return;
            System.out.println("Введите PIN-код: (2 попытка)");
            code = reader.readLine();
            if (code.equals(pinCode)) return;
            System.out.println("Введите PIN-код: (3 попытка!!!)");
            code = reader.readLine();
            if (code.equals(pinCode)) return;
            ExceptionThread thread = new ExceptionThread(10);
            thread.join(); //ждем пока отработает поток
            validate(reader);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
