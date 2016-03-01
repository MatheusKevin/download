package Gerenciadores;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Matheus
 */
public class ThreadDownload extends Thread{
    private String StringUrl;
    private String local;

    public ThreadDownload(String StringUrl, String local) {
        this.StringUrl = StringUrl;
        this.local = local;
    }
    
    @Override
    public void run(){
        try {
            URL url = new URL(StringUrl);
            URLConnection conn = url.openConnection();
            String nomeArquivoLocal = getNomeArquivo(StringUrl);
            InputStream is = conn.getInputStream();
            FileOutputStream fos = new FileOutputStream(local+nomeArquivoLocal);
            int umByte = 0;
            while ((umByte = is.read()) != -1){
                fos.write(umByte);
            }
            is.close();
            fos.close();
        } catch (Exception e) {
            e.getMessage();
        }
    }
    
    public String getNomeArquivo(String url){
        String aux[] = url.split("/");
        return aux[(aux.length-1)];
    }
}