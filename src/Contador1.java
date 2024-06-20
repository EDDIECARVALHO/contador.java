
import java.util.Scanner;

public class Contador1 {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o primeiro parâmetro: ");
            int inicio = scanner.nextInt();

            System.out.print("Digite o segundo parâmetro: ");
            int fim = scanner.nextInt();
            scanner.close();
            int contagem = fim - inicio + 1;

            for (int i = inicio; i <= fim; i++) {
                System.out.println("Imprimindo o número " + i);
            }
            }catch (Exception e) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
      System.out.println("O segundo parametro deve ser ser maior que o primeiro");
      
        }
    }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroDois < parametroUm ){
            throw new
            ParametrosInvalidosException();
        }
    }


    }