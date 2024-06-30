package one.digitalinnovationone.lab_padroes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LabPadroesApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabPadroesApplication.class, args);
        ServicoBancario banco = new ServicoBancario();
        
        String balance = banco.consultaConta(4040);
        System.out.println(balance);
        
        String balance2 = banco.consultaConta(3030);
        System.out.println(balance2);

        Singleton conexao1 = Singleton.getInstance();
        Singleton conexao2 = Singleton.getInstance();
        
        if (conexao1 == conexao2) {
            System.out.println("Ambas as conexoes sao a mesma instancia.");
        } else {
            System.out.println("As conexoes sao de instancias diferentes.");
        }
	}
	
}
