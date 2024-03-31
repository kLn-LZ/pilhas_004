package Controller;

import kLN.Pilha;

public class HistoricoController {

    public HistoricoController() {
        super();
    }

    public void inserirEndereco(Pilha p, String endereco) throws Exception {
        if((endereco.contains("http://") || endereco.contains("https://")) && (endereco.contains("www"))) {
            p.push(endereco);
        } else {
            throw new Exception("Site sem 'www' ou 'http://' ");
        }

    }

    public void removerUltimoEndereco(Pilha p) throws Exception {
        if(p.isEmpty() || p.tamanho() < 2) {
            throw new Exception("Tamanho do histórico insuficiente");
        } else {
            p.pop();
        }
    }

    public void consultarUltimoEndereco(Pilha p) throws Exception {
        if(p.isEmpty() || p.tamanho() < 2) {
            throw new Exception("Tamanho do histórico insuficiente");
        } else {
            System.out.println("Último endereço acessado: " + p.top());
        }

    }

}
