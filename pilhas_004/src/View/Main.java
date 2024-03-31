package View;

import Controller.HistoricoController;
import kLN.Pilha;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Pilha p = new Pilha();
        Scanner scan = new Scanner(System.in);
        HistoricoController HC = new HistoricoController();

        int opc = 0;

        while(opc != 9) {
            System.out.print("\n 1 - Inserir novo endereço \n 2 - Remover último endereço \n 3 - Consultar último endereço \n 9 - Encerrar \n Escolha:");
            opc = scan.nextInt();
            switch (opc) {
                case 1:
                    System.out.print("Insira o endereço: ");
                    HC.inserirEndereco(p, scan.next());
                break;
                case 2: HC.removerUltimoEndereco(p);
                break;
                case 3: HC.consultarUltimoEndereco(p);
                break;
                default:
                    System.out.println("Inválido");
                    break;
            }


        }


    }
}
