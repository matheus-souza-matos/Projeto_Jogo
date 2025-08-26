import java.util.Scanner;
import java.util.Random;
public class jogoNumeroSecreto {

    public static void main(String[] args) {

        Random aleatório = new Random();
        
        int numeroSecreto = aleatório.nextInt(500) + 1;
        int chute;
        int vida = 10;

        Scanner input = new Scanner(System.in);

        System.out.println(" --------------------");
        System.out.println("| Bem vindo ao gamer |");
        System.out.println(" --------------------");
        System.out.println("Para jogar você precisa digitar um número de 0 a 500 até descobrir qual o valor 'SECRETO'\nVocê possuí " + vida + " vidas ao iniciar o jogo...\nQue os jogos comecem, Digite um valor");

        do{
            chute = input.nextInt();
            if(chute == numeroSecreto){
                System.out.println("Parabéns, você acertou :)\nO número secreto era: "+numeroSecreto);
            }else if(chute < numeroSecreto){
                System.out.println("Número errado\nO número secreto é maior que o escolhido");
                vida = vida - 1;
                System.out.println("Você possui " + vida + " vidas");
            }else if(chute > numeroSecreto){
                System.out.println("Número errado\nO número secreto é menor que o escolhido");  
                vida = vida - 1;
                System.out.println("Você possui " + vida + " vidas");  
            }

            if (vida == 0) {
                System.out.println("Você perdeu todas as vidas. O número secreto era: " + numeroSecreto + "\nnão foi dessa vez :(");
                break; // Isso encerrará o loop se as vidas chegarem a 0
            }
        }while(chute != numeroSecreto);
        input.close(); 
    }
}