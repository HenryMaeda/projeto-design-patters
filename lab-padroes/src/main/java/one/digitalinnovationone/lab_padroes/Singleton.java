package one.digitalinnovationone.lab_padroes;

public class Singleton {
    
    private static Singleton instance;
    
    private Singleton() {
    }
    
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    
    public String consultaConta(int numeroConta) {
        return "Saldo da conta " + numeroConta + "= 200 reais";
    }
}


