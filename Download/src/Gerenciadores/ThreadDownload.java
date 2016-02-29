package Gerenciadores;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
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
            String nomeArquivoLocal = url.getPath();
            InputStream is = url.openStream();
            FileOutputStream fos = new FileOutputStream(local+nomeArquivoLocal);
            int umByte = 0;
            while ((umByte = is.read()) != -1){
                fos.write(umByte);
            }
            is.close();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
