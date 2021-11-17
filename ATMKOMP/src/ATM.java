package bank;

class ATM extends javax.swing.JFrame{

    int masukan;
    double hasil, saldo;
    String jawab;
    private String username="lanaajaboleh", pass="1234";

    public String getUsername() {
        return username;
    }

    public String getPass() {
        return pass;
    }

    public void setHasil(double hasil) {
        this.hasil = hasil;
    }

    public void setMasukan(int masukan) {
        this.masukan = masukan;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getHasil() {
        return hasil;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getMasukan() {
        return masukan;
    }
}
