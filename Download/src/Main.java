
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
    //Links para teste:
    //http://free.anbient.com/Shingeki no Kyojin/Shingeki_no_Kyojin_01_Dollars-OF-Anbient.mkv
    //http://free.anbient.com/One-Punch Man/One-Punch_Man_01_MDAN-Anbient.mkv
    //http://dl.anbient.com/Ansatsu Kyoushitsu/Ansatsu_Kyoushitsu_01_Koisuru-PA-Anbient.mkv
}
