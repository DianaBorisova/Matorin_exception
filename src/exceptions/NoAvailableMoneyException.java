package exceptions;

public class NoAvailableMoneyException extends Exception {
    public NoAvailableMoneyException(String message) {
        super(message); //Вызываем конструктор родителя
    }}
