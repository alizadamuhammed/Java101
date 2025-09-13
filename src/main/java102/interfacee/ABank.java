package main.java102.interfacee;

public class ABank implements IBank {
    private String name;
    private String terminalId;
    private String password;

    public ABank(String name, String terminalId, String password) {
        this.name = name;
        this.terminalId = terminalId;
        this.password = password;
    }

    @Override
    public boolean connect(String ipAddress) {
        System.out.println("User ip:" + ipAddress);
        System.out.println("Host ip:" + IBank.host);
        System.out.println(this.name + " has connected");
        return true;
    }

    @Override
    public boolean sendCardInfo(double price, String cardNumber, String cardExpiry, String cardCVV) {
        System.out.println("Successfully send card info");
        return true;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
