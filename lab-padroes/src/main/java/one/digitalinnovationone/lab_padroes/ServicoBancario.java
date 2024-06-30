package one.digitalinnovationone.lab_padroes;

public class ServicoBancario {
        private Singleton conexao ;
    
        public ServicoBancario() {
            this.conexao = Singleton.getInstance();
        }
    
        public String consultaConta(int numeroConta) {
            return conexao.consultaConta(numeroConta);
        }
    }
    
