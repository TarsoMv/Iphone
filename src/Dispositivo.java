import Funções.AparelhoTelefonico.Telefonia;
import Funções.NavegadorInternet.NavegadorInternet;
import Funções.ReprodutorMusical.ReprodutorMusical;
import Iphone.Iphone;

public class Dispositivo {
    public static void main(String[] args) {
        Iphone iphone0 = new Iphone();
        ReprodutorMusical playerMp3 = iphone0;
        NavegadorInternet explorer = iphone0;
        Telefonia telefone = iphone0;

        playerMp3.pausar();
    }
}