package suporteNiteroi;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class VNC extends Thread {
    private Process p;
    private final String host;
    
    public VNC(String host) {
        this.host = host;
    }
    
    private void executa() {        
        try {            
            p = Runtime.getRuntime().exec("vncviewer.exe " + host);
            p.waitFor();
        } catch (IOException | InterruptedException ex) {
            Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    @Override
    public void run() {
        executa();
    }
    
}
