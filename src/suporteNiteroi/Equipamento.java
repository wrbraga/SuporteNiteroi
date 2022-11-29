package suporteNiteroi;

import java.awt.Color;
import java.net.InetSocketAddress;
import java.net.Socket;
import javax.swing.JButton;

public class Equipamento extends Thread{
    public final String host;
    public final JButton botao;
    public final int porta;
    
    public static int contador = 0;
    
    public Equipamento(String h, int p, JButton b) {
        host = h;
        botao = b;
        porta = p;
        b.setToolTipText(h);
    }
    
    private boolean isOnline(int p) {
        // PORTA    SERVIÇO
        // 5900     VNC
        // 9100     IMPRESSORA
        // 80       WEB
        // 515      LPR
        // 139      CIFS
        
        boolean b = true;
        contador += 1;
        InetSocketAddress sa;
        try{            
            sa = new InetSocketAddress(host, p); // Testa se o serviço está ONLINE
            try (Socket ss = new Socket()) {
                ss.connect(sa, 1500);                 
            }
        }catch(Exception e) {
            b = false;
        }
        return b;
    }
    
    public void alterarCor() {                
        if(isOnline(porta)) {
            botao.setBackground(Color.green);
        } else {
            botao.setBackground(Color.red);
        }
    }
    
    @Override
    public void run() {
        alterarCor();        
    }
    
    
}
