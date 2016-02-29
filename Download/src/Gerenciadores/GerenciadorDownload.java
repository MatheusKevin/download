package Gerenciadores;

import java.io.File;

/**
 *
 * @author Matheus
 */
public class GerenciadorDownload {
    
    public File baixarArquivo(String stringUrl, String local){
        ThreadDownload th = new ThreadDownload(stringUrl,local);
        th.start();
        return null;
    }
}
