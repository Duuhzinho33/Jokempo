import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.LinkedTransferQueue;

public class Jokenpo {

   public static void main(String[]  args) {

       /** Declarar Variaveis*/
       int aleatorio;
       int number;
       String nome;

       /** Instancia Scanner*/
       Scanner teclado = new Scanner(System.in);


       /** Instancia Random */
       Random random = new Random();

       /** Coleta dados*/
       System.out.println("--------------");
       System.out.println("---- Bem vindo----");
       System.out.println("digete seu Nome: ");
       nome = teclado.next();
       System.out.println("olá," + nome + "Escolha Uma jogada [1-pedra 2- papel 3-tesoura");
       number = teclado.nextInt();

       /** Gerar Opção do pc */
       aleatorio = random.nextInt(3)+1;
       /**
       * 1 - pedra;
        * 2 - papel
        * 3 - tesoura
        * */

       /** Logica jogo */

       if (number==aleatorio){
           System.out.println("empate !!");
       }else if (number==1 && aleatorio==2 || number== 2 && aleatorio==3 || number== 3){
           System.out.println("Pc Ganhou !!");
       }else {
           System.out.println("Você Ganhou !! ");

       }
        switch (aleatorio){
            case 1:
                System.out.println("O PC escolheu Pedra ! ");
                break;

            case 2:
                System.out.println("O pc escolheu papel ! ");
                break;

            case 3:
                System.out.println("O pc Escolheu Tesoura ! ");
                break;
        }





   }








}
