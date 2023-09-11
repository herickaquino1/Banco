
import java.util.Locale;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		/*O metodo useLocale foi implemnetado ao scanner devido ao sistema não reconhecer
		o ponto como separador flutuante*/
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		Conta c1 = new Conta();
		
		System.out.println("Por favor insira o valor do deposito: ");
		double depositoValor = sc.nextDouble();
		c1.depositar(depositoValor);
		
		System.out.println("Deseja consultar seu saldo? digite sim para continuar ou não para encerrar ");
		String confirmacaoDeposito = sc.next();
		
		if(confirmacaoDeposito.equals("sim") || confirmacaoDeposito.equals("Sim")) {
			c1.consultarSaldo();
		}else {
			System.out.println("Operação finalizada");
		}
		
	}

}
