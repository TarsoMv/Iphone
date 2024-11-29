package Iphone;

import Funções.AparelhoTelefonico.Telefonia;
import Funções.NavegadorInternet.NavegadorInternet;
import Funções.ReprodutorMusical.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, NavegadorInternet, Telefonia {
    public void ligar(){
        System.out.println("Ligando");
    }
    public void atender(){
        System.out.println("Ligação atendida");
    }
    public void iniciarCorreioVoz(){
        System.out.println("Correio de voz iniciado");
    }
    public void tocar(){
        System.out.println("Tocando música");
    }
    public void pausar(){
        System.out.println("Música pausada");
    }
    public void selecionarMusica(){
        System.out.println("Música selecionada");
    }
    public void exibirPagina(){
        System.out.println("Pagina exibida");
    }
    public void adicionarNovaAba() {
        System.out.println("Aba adicionada");
    }
    public void atualizarPagina() {
        System.out.println("Pagina atualizada");
    }
}
