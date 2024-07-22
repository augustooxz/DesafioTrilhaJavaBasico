package DesafioTrilhaJavaBasico;

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    private ReprodutorMusical reprodutorMusical;

    private AparelhoTelefonico aparelhoTelefonico;

    private NavegadorInternet navegadorInternet;

    public iPhone(ReprodutorMusical reprodutorMusical, AparelhoTelefonico aparelhoTelefonico, NavegadorInternet navegadorInternet) {
        this.reprodutorMusical = reprodutorMusical;
        this.aparelhoTelefonico = aparelhoTelefonico;
        this.navegadorInternet = navegadorInternet;
    }

    
    public void tocar() {
        reprodutorMusical.tocar();
    }

    public void pausar() {
        reprodutorMusical.pausar();
    }

    public void selecionarMusica() {
        reprodutorMusical.selecionarMusica();
    }

    public void ligar() {
        aparelhoTelefonico.ligar();
    }

    public void atender() {
        aparelhoTelefonico.atender();
    }

    public void iniciarCorreioVoz() {
        aparelhoTelefonico.iniciarCorreioVoz();
    }

    public void exibirPagina() {
        navegadorInternet.exibirPagina();
    }

    public void adicionarNovaAba() {
        navegadorInternet.adicionarNovaAba();
    }

    public void atualizarPagina() {
        navegadorInternet.atualizarPagina();
    }

}
