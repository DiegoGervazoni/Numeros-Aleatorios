import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        int [] numerosAleatorios =  new int[20];

        for(int i = 0; i < numerosAleatorios.length; i++){
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }

        System.out.print("Numeros aleatorios: ");
        for(int numero : numerosAleatorios){ //no lado esquerdo representa cada elemento, no direito o Array em si
            System.out.print(numero + " ");
        }

        System.out.print("\nAntecessores dos Numeros aleatorios: ");
        for(int numero : numerosAleatorios){
            System.out.print((numero - 1) + " ");
        }

        System.out.print("\nSucessores dos Numeros aleatorios: ");
        for(int numero : numerosAleatorios){
            System.out.print((numero + 1) + " ");
        }



    }
}
