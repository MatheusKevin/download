package Gerenciadores;

/**
 *
 * @author Matheus
 */
public class GerenciadorDownload {
    
    public void baixarArquivo(String stringUrl){
        String local = "D:\\";
        ThreadDownload th = new ThreadDownload(stringUrl,local);
        th.start();
    }
}