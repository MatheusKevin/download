
import Gerenciadores.GerenciadorDownload;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String url;
        Scanner sc = new Scanner(System.in);
        GerenciadorDownload gd = new GerenciadorDownload();
        do{
            System.out.println("Digite a URL do arquivo para download:");
            url = sc.next();
            gd.baixarArquivo(url);
        }while(true);
    }
    
}
