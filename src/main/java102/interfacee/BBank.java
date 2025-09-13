package main.java102.interfacee;

public class BBank {
    private String name;
    private String terminalId;
    private String password;

    public BBank(String name, String terminalId, String password) {
        this.name = name;
        this.terminalId = terminalId;
        this.password = password;
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
