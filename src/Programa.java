import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Sistema de Banco Coffe Quente");
        System.out.println("Selecione uma opção. \n 1.Ver Saldo \n 2.Selecionar Conta Corrente");


        int option = sc.nextInt();

        switch (option){
            case 1:
                System.out.println();
                break;
            case 2:
                System.out.println("");
                break;
        }
    }
}
