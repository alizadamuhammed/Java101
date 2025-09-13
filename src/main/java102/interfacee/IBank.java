package main.java102.interfacee;

public interface IBank {

    String host = "333.1.2.4";

    boolean connect(String ipAddress);

    boolean sendCardInfo(double price, String cardNumber, String cardExpiry, String cardCVV);


}
