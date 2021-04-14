/**
 * Lista de Exercicios 1
 * codigo simples sem testar as condicoes para execucao "ideal"
 * assumindo que o usario digitou um tempo superior a 1 minuto, por exemplo
 * @author (Giraffa) 
 * @version (11/8/2020)
 */
import java.util.Scanner;//biblioteca para apoiar E/S
public class Calculohoras
{
    
    
	
	
    public static void main(String args[]){
        System.out.println("\f");//limpando a tela             
        Scanner teclado=new Scanner (System.in);
        
       System.out.println(" Digite o tempo do evento em segundos :");
       int tempoS=teclado.nextInt();
       
       
       int tempoH=tempoS/3600; // 1 hora tem 60min e 1 minuto tem 60 segundos ..logo 1 hora tem 3600 segundos
       int minutos=tempoS%3600;
           
       int tempoM=minutos/60;
       
       int segundos=minutos%60;
           
       
      System.out.println(tempoH + " horas");
      System.out.println(tempoM + " minutos");
      System.out.println(segundos + " segundos");
      

    }

}