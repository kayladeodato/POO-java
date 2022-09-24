package funcionalidades;

import funcionalidades.AparelhoTelefonico;
import funcionalidades.NavegadorInternet;
import funcionalidades.ReprodutorMusical;

public class Funcionalidades implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    public void ligar() {
        System.out.println("LIGANDO PARA CONTATO");
    }
    public void atender() {
        System.out.println("ATENDENDO CHAMADA");
    }
    public void iniciarCorreioVoz() {
        System.out.println("INICIAR CORREIO DE VOZ");
    }

    public void exibirPagina() {
        System.out.println("EXIBIR PÁGINA DO NAVEGADOR");
    }

    public void adicionarNovaAba() {
        System.out.println("ADICIONAR NOVA ABA NO NAVEGADOR");
    }
    public void atualizarPagina() {
        System.out.println("ATUALIZAR PÁGINA DO NAVEGADOR");
    }

    public void tocar() {
        System.out.println("TOCANDO MÚSICA");
    }
    public void pausar() {
        System.out.println("PAUSANDO MÚSICA");
    }
    public void selecionarMusica() {
        System.out.println("MÚSICA SELECIONADA");
    }

}
