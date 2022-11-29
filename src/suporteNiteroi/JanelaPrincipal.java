package suporteNiteroi;

import java.awt.Desktop;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JanelaPrincipal extends javax.swing.JFrame {            
    private final java.util.ResourceBundle passwordVNC = java.util.ResourceBundle.getBundle("suporteNiteroi/passwordVNC"); // NOI18N
    private static final Map<Integer,Equipamento> EQUIPAMENTOS= new HashMap<>();    
    java.util.ResourceBundle recursoIP = java.util.ResourceBundle.getBundle("suporteNiteroi/ips"); // NOI18N
    public JanelaPrincipal() {
        initComponents();        
        criaViewer();
                
        // Informática
        EQUIPAMENTOS.put(1, new Equipamento(recursoIP.getString("INFORMATICA1"), 5900, bINFORMATICA1)); 
        EQUIPAMENTOS.put(2,new Equipamento(recursoIP.getString("INFORMATICA2"), 5900, bINFORMATICA2)); 
        EQUIPAMENTOS.put(63,new Equipamento(recursoIP.getString("INFORMATICA3"), 5900, bINFORMATICA3));
        EQUIPAMENTOS.put(65,new Equipamento(recursoIP.getString("INFORMATICA4"), 5900, bINFORMATICA4)); 
        
        //  Recepção
        EQUIPAMENTOS.put(66,new Equipamento(recursoIP.getString("INFORMATICA5"), 5900, bINFORMATICA5));
        
        // SAC
        EQUIPAMENTOS.put(3,new Equipamento(recursoIP.getString("SAC1"), 5900, bSAC1)); 
        EQUIPAMENTOS.put(4,new Equipamento(recursoIP.getString("SAC2"), 5900, bSAC2));
        EQUIPAMENTOS.put(60,new Equipamento(recursoIP.getString("SAC3"), 5900, bSAC3)); 
        
        // Motoristas
        EQUIPAMENTOS.put(6,new Equipamento(recursoIP.getString("MOTORISTA1"), 5900, bMOTORISTA1));
        EQUIPAMENTOS.put(7,new Equipamento(recursoIP.getString("MOTORISTA2"), 5900, bMOTORISTA2));
        EQUIPAMENTOS.put(8,new Equipamento(recursoIP.getString("MOTORISTA3"), 5900, bMOTORISTA3));
        EQUIPAMENTOS.put(9,new Equipamento(recursoIP.getString("MOTORISTA4"), 5900, bMOTORISTA4));
        EQUIPAMENTOS.put(5,new Equipamento(recursoIP.getString("MOTORISTA5"), 5900, bMOTORISTA5));
        
        // Administração
        EQUIPAMENTOS.put(10,new Equipamento(recursoIP.getString("ADM1"), 5900, bADM1));
        EQUIPAMENTOS.put(11,new Equipamento(recursoIP.getString("ADM2"), 5900, bADM2)); 
        EQUIPAMENTOS.put(12,new Equipamento(recursoIP.getString("ADM3"), 5900, bADM3));
        EQUIPAMENTOS.put(13,new Equipamento(recursoIP.getString("ADM4"), 5900, bADM4));
        EQUIPAMENTOS.put(14,new Equipamento(recursoIP.getString("ADM5"), 5900, bADM5));
        EQUIPAMENTOS.put(15,new Equipamento(recursoIP.getString("ADM6"), 5900, bADM6));
        EQUIPAMENTOS.put(16,new Equipamento(recursoIP.getString("ADM7"), 5900, bADM7));
        EQUIPAMENTOS.put(67,new Equipamento(recursoIP.getString("ADM8"), 5900, bADM8));
        
        // Biblioteca
        EQUIPAMENTOS.put(59,new Equipamento(recursoIP.getString("BIBLIOTECA1"), 5900, bBIBLIOTECA1));
        
        // DIPROC
        EQUIPAMENTOS.put(17,new Equipamento(recursoIP.getString("DIPROC1"), 5900, bDIPROC1));
        EQUIPAMENTOS.put(18,new Equipamento(recursoIP.getString("DIPROC2"), 5900, bDIPROC2));
        EQUIPAMENTOS.put(19,new Equipamento(recursoIP.getString("DIPROC3"), 5900, bDIPROC3));
        EQUIPAMENTOS.put(20,new Equipamento(recursoIP.getString("DIPROC4"), 5900, bDIPROC4));
        EQUIPAMENTOS.put(21,new Equipamento(recursoIP.getString("DIPROC5"), 5900, bDIPROC5));
        EQUIPAMENTOS.put(22,new Equipamento(recursoIP.getString("DIPROC6"), 5900, bDIPROC6));
        
        
        // GAB1 - 2 Andar
        EQUIPAMENTOS.put(23,new Equipamento(recursoIP.getString("GAB11"), 5900, bGAB11));
        EQUIPAMENTOS.put(24,new Equipamento(recursoIP.getString("GAB12"), 5900, bGAB12));
        EQUIPAMENTOS.put(25,new Equipamento(recursoIP.getString("GAB13"), 5900, bGAB13));
        EQUIPAMENTOS.put(26,new Equipamento(recursoIP.getString("GAB14"), 5900, bGAB14));
        EQUIPAMENTOS.put(27,new Equipamento(recursoIP.getString("GAB15"), 5900, bGAB15));
        EQUIPAMENTOS.put(28,new Equipamento(recursoIP.getString("GAB16"), 5900, bGAB16));
        
        // GAB2 - 2 Andar
        EQUIPAMENTOS.put(29,new Equipamento(recursoIP.getString("GAB21"), 5900, bGAB21));
        EQUIPAMENTOS.put(30,new Equipamento(recursoIP.getString("GAB22"), 5900, bGAB22));
        EQUIPAMENTOS.put(31,new Equipamento(recursoIP.getString("GAB23"), 5900, bGAB23));
        EQUIPAMENTOS.put(32,new Equipamento(recursoIP.getString("GAB24"), 5900, bGAB24));
        EQUIPAMENTOS.put(33,new Equipamento(recursoIP.getString("GAB25"), 5900, bGAB25));
        EQUIPAMENTOS.put(34,new Equipamento(recursoIP.getString("GAB26"), 5900, bGAB26));
        
        // GAB3 - 2 Andar
        EQUIPAMENTOS.put(35,new Equipamento(recursoIP.getString("GAB31"), 5900, bGAB31));
        EQUIPAMENTOS.put(36,new Equipamento(recursoIP.getString("GAB32"), 5900, bGAB32));
        EQUIPAMENTOS.put(37,new Equipamento(recursoIP.getString("GAB33"), 5900, bGAB33));
        EQUIPAMENTOS.put(38,new Equipamento(recursoIP.getString("GAB34"), 5900, bGAB34));
        EQUIPAMENTOS.put(39,new Equipamento(recursoIP.getString("GAB35"), 5900, bGAB35));
        EQUIPAMENTOS.put(40,new Equipamento(recursoIP.getString("GAB36"), 5900, bGAB36));
        
        // GAB4 - 3 Andar
        EQUIPAMENTOS.put(41,new Equipamento(recursoIP.getString("GAB41"), 5900, bGAB41));
        EQUIPAMENTOS.put(42,new Equipamento(recursoIP.getString("GAB42"), 5900, bGAB42));
        EQUIPAMENTOS.put(43,new Equipamento(recursoIP.getString("GAB43"), 5900, bGAB43));
        EQUIPAMENTOS.put(44,new Equipamento(recursoIP.getString("GAB44"), 5900, bGAB44));
        EQUIPAMENTOS.put(45,new Equipamento(recursoIP.getString("GAB45"), 5900, bGAB45));
        EQUIPAMENTOS.put(46,new Equipamento(recursoIP.getString("GAB46"), 5900, bGAB46));
        
        // GAB5 - 3 Andar
        EQUIPAMENTOS.put(47,new Equipamento(recursoIP.getString("GAB51"), 5900, bGAB51));
        EQUIPAMENTOS.put(48,new Equipamento(recursoIP.getString("GAB52"), 5900, bGAB52));
        EQUIPAMENTOS.put(49,new Equipamento(recursoIP.getString("GAB53"), 5900, bGAB53));
        EQUIPAMENTOS.put(50,new Equipamento(recursoIP.getString("GAB54"), 5900, bGAB54));
        EQUIPAMENTOS.put(51,new Equipamento(recursoIP.getString("GAB55"), 5900, bGAB55));
        EQUIPAMENTOS.put(52,new Equipamento(recursoIP.getString("GAB56"), 5900, bGAB56));
        
        // Analistas
        EQUIPAMENTOS.put(53,new Equipamento(recursoIP.getString("ANALISTA1"), 5900, bANALISTA1));
        EQUIPAMENTOS.put(54,new Equipamento(recursoIP.getString("ANALISTA2"), 5900, bANALISTA2));
        EQUIPAMENTOS.put(55,new Equipamento(recursoIP.getString("ANALISTA3"), 5900, bANALISTA3));
        EQUIPAMENTOS.put(56,new Equipamento(recursoIP.getString("ANALISTA4"), 5900, bANALISTA4));
        EQUIPAMENTOS.put(57,new Equipamento(recursoIP.getString("ANALISTA5"), 5900, bANALISTA5));
        EQUIPAMENTOS.put(58,new Equipamento(recursoIP.getString("ANALISTA6"), 5900, bANALISTA6));
                
        //IMPRESSORAS        
        EQUIPAMENTOS.put(81,new Equipamento(recursoIP.getString("IMPRESSORA1"), 80, bIMPRESSORA1));
        EQUIPAMENTOS.put(80,new Equipamento(recursoIP.getString("IMPRESSORA2"), 80, bIMPRESSORA2));
        EQUIPAMENTOS.put(92,new Equipamento(recursoIP.getString("IMPRESSORA3"), 80, bIMPRESSORA3));
        EQUIPAMENTOS.put(87,new Equipamento(recursoIP.getString("IMPRESSORA4"), 80, bIMPRESSORA4));
        EQUIPAMENTOS.put(91,new Equipamento(recursoIP.getString("IMPRESSORA5"), 80, bIMPRESSORA5));
        EQUIPAMENTOS.put(96,new Equipamento(recursoIP.getString("IMPRESSORA6"), 80, bIMPRESSORA6));
        EQUIPAMENTOS.put(83,new Equipamento(recursoIP.getString("IMPRESSORA7"), 80, bIMPRESSORA7));
        EQUIPAMENTOS.put(86,new Equipamento(recursoIP.getString("IMPRESSORA8"), 80, bIMPRESSORA8));
        EQUIPAMENTOS.put(84,new Equipamento(recursoIP.getString("IMPRESSORA9"), 80, bIMPRESSORA9));
        EQUIPAMENTOS.put(82,new Equipamento(recursoIP.getString("IMPRESSORA10"), 80, bIMPRESSORA10));
        EQUIPAMENTOS.put(85,new Equipamento(recursoIP.getString("IMPRESSORA11"), 80, bIMPRESSORA11));
    }
    
    private int osType() {
        String arch = System.getenv("PROCESSOR_ARCHITECTURE");
        return arch.contains("64") == true ? 64 : 42;      
    }
    
    private void criaViewer() {                 
        String executavel;
        
        if(osType() == 64) {
            executavel = "vncviewer64.exe";
        } else {
            executavel = "vncviewer32.exe";
        }
        
        try {
            Path p = Paths.get("vncviewer.exe");
            
            if(Files.notExists(p)) {
                InputStream is = getClass().getResource(executavel).openStream();
                OutputStream os = new FileOutputStream("vncviewer.exe");

                byte[] b = new byte[2048];
                int length;

                while ((length = is.read(b)) != -1) {
                    os.write(b, 0, length);
                }

                is.close();            
                os.close();
            }
            
            //Runtime.getRuntime().exec()
        } catch (IOException ex) {
            Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
                     
    }

    private void abrirBrowser(String ip) {
        Desktop desktop = null;
        //Primeiro verificamos se é possível a integração com o desktop
        if (!Desktop.isDesktopSupported()) 
            throw new IllegalStateException("Desktop resources not supported!");
        desktop = Desktop.getDesktop();
        //Agora vemos se é possível disparar o browser default.
        if (!desktop.isSupported(Desktop.Action.BROWSE))
            throw new IllegalStateException("No default browser set!");
        //Pega a URI de um componente de texto.
                URI uri; 
                try {
                    uri = new URI("http://" + ip  );
                    desktop.browse(uri);
                } catch (URISyntaxException ex) {
                    Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
        //Dispara o browser default, que pode ser o Explorer, Firefox ou outro.
        //Dispara o browser default, que pode ser o Explorer, Firefox ou outro.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        terreo = new javax.swing.JPanel();
        INFORMATICA = new javax.swing.JPanel();
        bINFORMATICA1 = new javax.swing.JButton();
        bINFORMATICA2 = new javax.swing.JButton();
        bINFORMATICA3 = new javax.swing.JButton();
        bINFORMATICA4 = new javax.swing.JButton();
        bINFORMATICA5 = new javax.swing.JButton();
        SAC = new javax.swing.JPanel();
        bSAC1 = new javax.swing.JButton();
        bSAC2 = new javax.swing.JButton();
        bSAC3 = new javax.swing.JButton();
        MOTORISTAS = new javax.swing.JPanel();
        bMOTORISTA1 = new javax.swing.JButton();
        bMOTORISTA2 = new javax.swing.JButton();
        bMOTORISTA3 = new javax.swing.JButton();
        bMOTORISTA4 = new javax.swing.JButton();
        bMOTORISTA5 = new javax.swing.JButton();
        andar1 = new javax.swing.JPanel();
        ADMINISTRACAO = new javax.swing.JPanel();
        bADM1 = new javax.swing.JButton();
        bADM2 = new javax.swing.JButton();
        bADM3 = new javax.swing.JButton();
        bADM4 = new javax.swing.JButton();
        bADM5 = new javax.swing.JButton();
        bADM6 = new javax.swing.JButton();
        bADM7 = new javax.swing.JButton();
        bADM8 = new javax.swing.JButton();
        DIPROC = new javax.swing.JPanel();
        bDIPROC1 = new javax.swing.JButton();
        bDIPROC2 = new javax.swing.JButton();
        bDIPROC3 = new javax.swing.JButton();
        bDIPROC4 = new javax.swing.JButton();
        bDIPROC5 = new javax.swing.JButton();
        bDIPROC6 = new javax.swing.JButton();
        BIBLIOTECA = new javax.swing.JPanel();
        bBIBLIOTECA1 = new javax.swing.JButton();
        andar2 = new javax.swing.JPanel();
        GAB1 = new javax.swing.JPanel();
        bGAB11 = new javax.swing.JButton();
        bGAB12 = new javax.swing.JButton();
        bGAB13 = new javax.swing.JButton();
        bGAB14 = new javax.swing.JButton();
        bGAB15 = new javax.swing.JButton();
        bGAB16 = new javax.swing.JButton();
        GAB2 = new javax.swing.JPanel();
        bGAB21 = new javax.swing.JButton();
        bGAB22 = new javax.swing.JButton();
        bGAB23 = new javax.swing.JButton();
        bGAB24 = new javax.swing.JButton();
        bGAB25 = new javax.swing.JButton();
        bGAB26 = new javax.swing.JButton();
        GAB3 = new javax.swing.JPanel();
        bGAB31 = new javax.swing.JButton();
        bGAB32 = new javax.swing.JButton();
        bGAB33 = new javax.swing.JButton();
        bGAB34 = new javax.swing.JButton();
        bGAB35 = new javax.swing.JButton();
        bGAB36 = new javax.swing.JButton();
        andar3 = new javax.swing.JPanel();
        GAB4 = new javax.swing.JPanel();
        bGAB41 = new javax.swing.JButton();
        bGAB42 = new javax.swing.JButton();
        bGAB43 = new javax.swing.JButton();
        bGAB44 = new javax.swing.JButton();
        bGAB45 = new javax.swing.JButton();
        bGAB46 = new javax.swing.JButton();
        GAB5 = new javax.swing.JPanel();
        bGAB51 = new javax.swing.JButton();
        bGAB52 = new javax.swing.JButton();
        bGAB53 = new javax.swing.JButton();
        bGAB54 = new javax.swing.JButton();
        bGAB55 = new javax.swing.JButton();
        bGAB56 = new javax.swing.JButton();
        ANALISTAS = new javax.swing.JPanel();
        bANALISTA1 = new javax.swing.JButton();
        bANALISTA2 = new javax.swing.JButton();
        bANALISTA3 = new javax.swing.JButton();
        bANALISTA4 = new javax.swing.JButton();
        bANALISTA5 = new javax.swing.JButton();
        bANALISTA6 = new javax.swing.JButton();
        impressoras = new javax.swing.JPanel();
        bIMPRESSORA1 = new javax.swing.JButton();
        bIMPRESSORA2 = new javax.swing.JButton();
        bIMPRESSORA3 = new javax.swing.JButton();
        bIMPRESSORA4 = new javax.swing.JButton();
        bIMPRESSORA5 = new javax.swing.JButton();
        bIMPRESSORA6 = new javax.swing.JButton();
        bIMPRESSORA7 = new javax.swing.JButton();
        bIMPRESSORA8 = new javax.swing.JButton();
        bIMPRESSORA9 = new javax.swing.JButton();
        bIMPRESSORA10 = new javax.swing.JButton();
        bIMPRESSORA11 = new javax.swing.JButton();
        senhas = new javax.swing.JPanel();
        jButton64 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Suport Niterói");
        setResizable(false);

        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("suporteNiteroi/Bundle"); // NOI18N
        INFORMATICA.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("INFORMATICA"))); // NOI18N
        INFORMATICA.setToolTipText("Informática");

        bINFORMATICA1.setText(bundle.getString("INFO1")); // NOI18N
        bINFORMATICA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bINFORMATICA1ActionPerformed(evt);
            }
        });

        bINFORMATICA2.setText(bundle.getString("INFO2")); // NOI18N
        bINFORMATICA2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bINFORMATICA2ActionPerformed(evt);
            }
        });

        bINFORMATICA3.setText("Tarifador");
        bINFORMATICA3.setEnabled(false);
        bINFORMATICA3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bINFORMATICA3ActionPerformed(evt);
            }
        });

        bINFORMATICA4.setText("Sala de Reunião");
        bINFORMATICA4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bINFORMATICA4ActionPerformed(evt);
            }
        });

        bINFORMATICA5.setText("Recepção");
        bINFORMATICA5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bINFORMATICA5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout INFORMATICALayout = new javax.swing.GroupLayout(INFORMATICA);
        INFORMATICA.setLayout(INFORMATICALayout);
        INFORMATICALayout.setHorizontalGroup(
            INFORMATICALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(INFORMATICALayout.createSequentialGroup()
                .addComponent(bINFORMATICA1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bINFORMATICA2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bINFORMATICA3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bINFORMATICA4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bINFORMATICA5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        INFORMATICALayout.setVerticalGroup(
            INFORMATICALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(INFORMATICALayout.createSequentialGroup()
                .addGroup(INFORMATICALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bINFORMATICA1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bINFORMATICA2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bINFORMATICA3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bINFORMATICA4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bINFORMATICA5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        SAC.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("SAC"))); // NOI18N
        SAC.setToolTipText("SAC");

        bSAC1.setText(bundle.getString("SAC1")); // NOI18N
        bSAC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSAC1ActionPerformed(evt);
            }
        });

        bSAC2.setText(bundle.getString("SAC2")); // NOI18N
        bSAC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSAC2ActionPerformed(evt);
            }
        });

        bSAC3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSAC3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SACLayout = new javax.swing.GroupLayout(SAC);
        SAC.setLayout(SACLayout);
        SACLayout.setHorizontalGroup(
            SACLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SACLayout.createSequentialGroup()
                .addComponent(bSAC1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bSAC2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bSAC3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        SACLayout.setVerticalGroup(
            SACLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SACLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(bSAC1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(bSAC2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(bSAC3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        MOTORISTAS.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("MOTORISTAS"))); // NOI18N
        MOTORISTAS.setToolTipText("Motoristas");

        bMOTORISTA1.setText(bundle.getString("MOTORISTA1")); // NOI18N
        bMOTORISTA1.setEnabled(false);
        bMOTORISTA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMOTORISTA1ActionPerformed(evt);
            }
        });

        bMOTORISTA2.setText(bundle.getString("MOTORISTA2")); // NOI18N
        bMOTORISTA2.setEnabled(false);
        bMOTORISTA2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMOTORISTA2ActionPerformed(evt);
            }
        });

        bMOTORISTA3.setText(bundle.getString("MOTORISTA3")); // NOI18N
        bMOTORISTA3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMOTORISTA3ActionPerformed(evt);
            }
        });

        bMOTORISTA4.setText(bundle.getString("MOTORISTA4")); // NOI18N
        bMOTORISTA4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMOTORISTA4ActionPerformed(evt);
            }
        });

        bMOTORISTA5.setText(bundle.getString("MOTORISTA5")); // NOI18N
        bMOTORISTA5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMOTORISTA5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MOTORISTASLayout = new javax.swing.GroupLayout(MOTORISTAS);
        MOTORISTAS.setLayout(MOTORISTASLayout);
        MOTORISTASLayout.setHorizontalGroup(
            MOTORISTASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MOTORISTASLayout.createSequentialGroup()
                .addComponent(bMOTORISTA1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bMOTORISTA2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bMOTORISTA3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bMOTORISTA4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bMOTORISTA5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 30, Short.MAX_VALUE))
        );
        MOTORISTASLayout.setVerticalGroup(
            MOTORISTASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MOTORISTASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(bMOTORISTA1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(bMOTORISTA2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(bMOTORISTA3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(bMOTORISTA4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(bMOTORISTA5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout terreoLayout = new javax.swing.GroupLayout(terreo);
        terreo.setLayout(terreoLayout);
        terreoLayout.setHorizontalGroup(
            terreoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(terreoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(terreoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(INFORMATICA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SAC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MOTORISTAS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        terreoLayout.setVerticalGroup(
            terreoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(terreoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(INFORMATICA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SAC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MOTORISTAS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(364, Short.MAX_VALUE))
        );

        INFORMATICA.getAccessibleContext().setAccessibleName("");
        INFORMATICA.getAccessibleContext().setAccessibleDescription("");

        jTabbedPane1.addTab("Térreo", terreo);

        ADMINISTRACAO.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("ADM"))); // NOI18N
        ADMINISTRACAO.setToolTipText("Administração");

        bADM1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        bADM1.setText(bundle.getString("ADM1")); // NOI18N
        bADM1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bADM1ActionPerformed(evt);
            }
        });

        bADM2.setText(bundle.getString("ADM2")); // NOI18N
        bADM2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bADM2ActionPerformed(evt);
            }
        });

        bADM3.setText(bundle.getString("ADM3")); // NOI18N
        bADM3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bADM3ActionPerformed(evt);
            }
        });

        bADM4.setText(bundle.getString("ADM4")); // NOI18N
        bADM4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bADM4ActionPerformed(evt);
            }
        });

        bADM5.setText(bundle.getString("ADM5")); // NOI18N
        bADM5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bADM5ActionPerformed(evt);
            }
        });

        bADM6.setText(bundle.getString("ADM6")); // NOI18N
        bADM6.setEnabled(false);
        bADM6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bADM6ActionPerformed(evt);
            }
        });

        bADM7.setText(bundle.getString("ADM7")); // NOI18N
        bADM7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bADM7ActionPerformed(evt);
            }
        });

        bADM8.setText(bundle.getString("ADM8")); // NOI18N
        bADM8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bADM8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ADMINISTRACAOLayout = new javax.swing.GroupLayout(ADMINISTRACAO);
        ADMINISTRACAO.setLayout(ADMINISTRACAOLayout);
        ADMINISTRACAOLayout.setHorizontalGroup(
            ADMINISTRACAOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ADMINISTRACAOLayout.createSequentialGroup()
                .addGroup(ADMINISTRACAOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ADMINISTRACAOLayout.createSequentialGroup()
                        .addComponent(bADM1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bADM2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bADM3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bADM4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bADM5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ADMINISTRACAOLayout.createSequentialGroup()
                        .addComponent(bADM6, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bADM7, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bADM8, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 30, Short.MAX_VALUE))
        );
        ADMINISTRACAOLayout.setVerticalGroup(
            ADMINISTRACAOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ADMINISTRACAOLayout.createSequentialGroup()
                .addGroup(ADMINISTRACAOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bADM1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bADM2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bADM3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bADM4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bADM5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ADMINISTRACAOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bADM6, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bADM7, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bADM8, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        DIPROC.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("DIPROC"))); // NOI18N
        DIPROC.setToolTipText("DIPROC");

        bDIPROC1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        bDIPROC1.setText(bundle.getString("DIPROC1")); // NOI18N
        bDIPROC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDIPROC1ActionPerformed(evt);
            }
        });

        bDIPROC2.setText(bundle.getString("DIPROC2")); // NOI18N
        bDIPROC2.setEnabled(false);
        bDIPROC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDIPROC2ActionPerformed(evt);
            }
        });

        bDIPROC3.setText(bundle.getString("DIPROC3")); // NOI18N
        bDIPROC3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDIPROC3ActionPerformed(evt);
            }
        });

        bDIPROC4.setText(bundle.getString("DIPROC4")); // NOI18N
        bDIPROC4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDIPROC4ActionPerformed(evt);
            }
        });

        bDIPROC5.setText(bundle.getString("DIPROC5")); // NOI18N
        bDIPROC5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDIPROC5ActionPerformed(evt);
            }
        });

        bDIPROC6.setText(bundle.getString("DIPROC6")); // NOI18N
        bDIPROC6.setEnabled(false);
        bDIPROC6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDIPROC6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DIPROCLayout = new javax.swing.GroupLayout(DIPROC);
        DIPROC.setLayout(DIPROCLayout);
        DIPROCLayout.setHorizontalGroup(
            DIPROCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DIPROCLayout.createSequentialGroup()
                .addGroup(DIPROCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DIPROCLayout.createSequentialGroup()
                        .addComponent(bDIPROC1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bDIPROC2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bDIPROC3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bDIPROC4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bDIPROC5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bDIPROC6, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        DIPROCLayout.setVerticalGroup(
            DIPROCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DIPROCLayout.createSequentialGroup()
                .addGroup(DIPROCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bDIPROC1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bDIPROC2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bDIPROC3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bDIPROC4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bDIPROC5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bDIPROC6, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        BIBLIOTECA.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("BIBLIOTECA"))); // NOI18N
        BIBLIOTECA.setToolTipText("Biblioteca");
        BIBLIOTECA.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N

        bBIBLIOTECA1.setText(bundle.getString("BIBLIOTECA1")); // NOI18N
        bBIBLIOTECA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBIBLIOTECA1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BIBLIOTECALayout = new javax.swing.GroupLayout(BIBLIOTECA);
        BIBLIOTECA.setLayout(BIBLIOTECALayout);
        BIBLIOTECALayout.setHorizontalGroup(
            BIBLIOTECALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BIBLIOTECALayout.createSequentialGroup()
                .addComponent(bBIBLIOTECA1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        BIBLIOTECALayout.setVerticalGroup(
            BIBLIOTECALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bBIBLIOTECA1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout andar1Layout = new javax.swing.GroupLayout(andar1);
        andar1.setLayout(andar1Layout);
        andar1Layout.setHorizontalGroup(
            andar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(andar1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(andar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ADMINISTRACAO, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DIPROC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BIBLIOTECA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        andar1Layout.setVerticalGroup(
            andar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(andar1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ADMINISTRACAO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DIPROC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BIBLIOTECA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(243, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("1º andar", andar1);

        GAB1.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("GAB1"))); // NOI18N
        GAB1.setToolTipText("Dr. Paulo Barata");

        bGAB11.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        bGAB11.setText("Procurador");
        bGAB11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGAB11ActionPerformed(evt);
            }
        });

        bGAB12.setText("Secretária");
        bGAB12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGAB12ActionPerformed(evt);
            }
        });

        bGAB13.setText("Assessor");
        bGAB13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGAB13ActionPerformed(evt);
            }
        });

        bGAB14.setText("Estagiário 1");
        bGAB14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGAB14ActionPerformed(evt);
            }
        });

        bGAB15.setText("Estagiário 2");
        bGAB15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGAB15ActionPerformed(evt);
            }
        });

        bGAB16.setText("Gerardo");
        bGAB16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGAB16ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout GAB1Layout = new javax.swing.GroupLayout(GAB1);
        GAB1.setLayout(GAB1Layout);
        GAB1Layout.setHorizontalGroup(
            GAB1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GAB1Layout.createSequentialGroup()
                .addGroup(GAB1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(GAB1Layout.createSequentialGroup()
                        .addComponent(bGAB11, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bGAB12, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bGAB13, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bGAB14, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bGAB15, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bGAB16, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        GAB1Layout.setVerticalGroup(
            GAB1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GAB1Layout.createSequentialGroup()
                .addGroup(GAB1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bGAB11, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bGAB12, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bGAB13, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bGAB14, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bGAB15, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bGAB16, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        GAB2.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("GAB2"))); // NOI18N
        GAB2.setToolTipText("Dr. Antonio Canedo");

        bGAB21.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        bGAB21.setText("Procurador");
        bGAB21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGAB21ActionPerformed(evt);
            }
        });

        bGAB22.setText("Secretária");
        bGAB22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGAB22ActionPerformed(evt);
            }
        });

        bGAB23.setText("Assessor");
        bGAB23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGAB23ActionPerformed(evt);
            }
        });

        bGAB24.setText("Analista");
        bGAB24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGAB24ActionPerformed(evt);
            }
        });

        bGAB25.setText("Estagiário 1");
        bGAB25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGAB25ActionPerformed(evt);
            }
        });

        bGAB26.setText("Estagiário 2");
        bGAB26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGAB26ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout GAB2Layout = new javax.swing.GroupLayout(GAB2);
        GAB2.setLayout(GAB2Layout);
        GAB2Layout.setHorizontalGroup(
            GAB2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GAB2Layout.createSequentialGroup()
                .addGroup(GAB2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(GAB2Layout.createSequentialGroup()
                        .addComponent(bGAB21, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bGAB22, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bGAB23, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bGAB24, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bGAB25, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bGAB26, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        GAB2Layout.setVerticalGroup(
            GAB2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GAB2Layout.createSequentialGroup()
                .addGroup(GAB2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bGAB21, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bGAB22, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bGAB23, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bGAB24, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bGAB25, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bGAB26, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        GAB3.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("GAB3"))); // NOI18N
        GAB3.setToolTipText("Dr. Leonardo Almeida");

        bGAB31.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        bGAB31.setText("Procurador");
        bGAB31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGAB31ActionPerformed(evt);
            }
        });

        bGAB32.setText("Secretária");
        bGAB32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGAB32ActionPerformed(evt);
            }
        });

        bGAB33.setText("Assessor");
        bGAB33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGAB33ActionPerformed(evt);
            }
        });

        bGAB34.setText("Estagiário 1");
        bGAB34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGAB34ActionPerformed(evt);
            }
        });

        bGAB35.setText("Estagiário 2");
        bGAB35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGAB35ActionPerformed(evt);
            }
        });

        bGAB36.setText("Carla");
        bGAB36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGAB36ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout GAB3Layout = new javax.swing.GroupLayout(GAB3);
        GAB3.setLayout(GAB3Layout);
        GAB3Layout.setHorizontalGroup(
            GAB3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GAB3Layout.createSequentialGroup()
                .addGroup(GAB3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(GAB3Layout.createSequentialGroup()
                        .addComponent(bGAB31, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bGAB32, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bGAB33, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bGAB34, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bGAB35, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bGAB36, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 30, Short.MAX_VALUE))
        );
        GAB3Layout.setVerticalGroup(
            GAB3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GAB3Layout.createSequentialGroup()
                .addGroup(GAB3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bGAB31, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bGAB32, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bGAB33, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bGAB34, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bGAB35, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bGAB36, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout andar2Layout = new javax.swing.GroupLayout(andar2);
        andar2.setLayout(andar2Layout);
        andar2Layout.setHorizontalGroup(
            andar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, andar2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(andar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(GAB3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(GAB2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(GAB1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        andar2Layout.setVerticalGroup(
            andar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(andar2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(GAB1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(GAB2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(GAB3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        GAB1.getAccessibleContext().setAccessibleName("");

        jTabbedPane1.addTab("2º andar", andar2);

        GAB4.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("GAB4"))); // NOI18N
        GAB4.setToolTipText("Dr. Leonardo Costa");

        bGAB41.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        bGAB41.setText("Procurador");
        bGAB41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGAB41ActionPerformed(evt);
            }
        });

        bGAB42.setText("Secretária");
        bGAB42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGAB42ActionPerformed(evt);
            }
        });

        bGAB43.setText("Assessor");
        bGAB43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGAB43ActionPerformed(evt);
            }
        });

        bGAB44.setText("Estagiário 1");
        bGAB44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGAB44ActionPerformed(evt);
            }
        });

        bGAB45.setText("Estagiário 2");
        bGAB45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGAB45ActionPerformed(evt);
            }
        });

        bGAB46.setText("Eduardo");
        bGAB46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGAB46ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout GAB4Layout = new javax.swing.GroupLayout(GAB4);
        GAB4.setLayout(GAB4Layout);
        GAB4Layout.setHorizontalGroup(
            GAB4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GAB4Layout.createSequentialGroup()
                .addGroup(GAB4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(GAB4Layout.createSequentialGroup()
                        .addComponent(bGAB41, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bGAB42, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bGAB43, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bGAB44, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bGAB45, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bGAB46, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        GAB4Layout.setVerticalGroup(
            GAB4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GAB4Layout.createSequentialGroup()
                .addGroup(GAB4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bGAB41, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bGAB42, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bGAB43, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bGAB44, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bGAB45, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bGAB46, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        GAB5.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("GAB5"))); // NOI18N
        GAB5.setToolTipText("Dr. Eduardo André");

        bGAB51.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        bGAB51.setText("Procurador");
        bGAB51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGAB51ActionPerformed(evt);
            }
        });

        bGAB52.setText("Secretária");
        bGAB52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGAB52ActionPerformed(evt);
            }
        });

        bGAB53.setText("Assessor");
        bGAB53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGAB53ActionPerformed(evt);
            }
        });

        bGAB54.setText("Estagiário 1");
        bGAB54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGAB54ActionPerformed(evt);
            }
        });

        bGAB55.setText("Estagiário 2");
        bGAB55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGAB55ActionPerformed(evt);
            }
        });

        bGAB56.setText("Cristiane");
        bGAB56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGAB56ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout GAB5Layout = new javax.swing.GroupLayout(GAB5);
        GAB5.setLayout(GAB5Layout);
        GAB5Layout.setHorizontalGroup(
            GAB5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GAB5Layout.createSequentialGroup()
                .addGroup(GAB5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(GAB5Layout.createSequentialGroup()
                        .addComponent(bGAB51, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bGAB52, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bGAB53, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bGAB54, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bGAB55, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bGAB56, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        GAB5Layout.setVerticalGroup(
            GAB5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GAB5Layout.createSequentialGroup()
                .addGroup(GAB5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bGAB51, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bGAB52, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bGAB53, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bGAB54, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bGAB55, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bGAB56, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        ANALISTAS.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("ANALISTAS"))); // NOI18N
        ANALISTAS.setToolTipText("Analistas");

        bANALISTA1.setText(" ");
        bANALISTA1.setEnabled(false);
        bANALISTA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bANALISTA1ActionPerformed(evt);
            }
        });

        bANALISTA2.setText(" ");
        bANALISTA2.setEnabled(false);
        bANALISTA2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bANALISTA2ActionPerformed(evt);
            }
        });

        bANALISTA3.setText(" ");
        bANALISTA3.setEnabled(false);
        bANALISTA3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bANALISTA3ActionPerformed(evt);
            }
        });

        bANALISTA4.setText(" ");
        bANALISTA4.setEnabled(false);
        bANALISTA4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bANALISTA4ActionPerformed(evt);
            }
        });

        bANALISTA5.setEnabled(false);
        bANALISTA5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bANALISTA5ActionPerformed(evt);
            }
        });

        bANALISTA6.setEnabled(false);
        bANALISTA6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bANALISTA6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ANALISTASLayout = new javax.swing.GroupLayout(ANALISTAS);
        ANALISTAS.setLayout(ANALISTASLayout);
        ANALISTASLayout.setHorizontalGroup(
            ANALISTASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ANALISTASLayout.createSequentialGroup()
                .addGroup(ANALISTASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ANALISTASLayout.createSequentialGroup()
                        .addComponent(bANALISTA1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bANALISTA2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bANALISTA3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bANALISTA4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bANALISTA5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bANALISTA6, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        ANALISTASLayout.setVerticalGroup(
            ANALISTASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ANALISTASLayout.createSequentialGroup()
                .addGroup(ANALISTASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bANALISTA1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bANALISTA2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bANALISTA3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bANALISTA4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bANALISTA5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bANALISTA6, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout andar3Layout = new javax.swing.GroupLayout(andar3);
        andar3.setLayout(andar3Layout);
        andar3Layout.setHorizontalGroup(
            andar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(andar3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(andar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(GAB4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(GAB5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ANALISTAS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        andar3Layout.setVerticalGroup(
            andar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(andar3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(GAB4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(GAB5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ANALISTAS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(178, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("3º andar", andar3);

        bIMPRESSORA1.setText("Administração");
        bIMPRESSORA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bIMPRESSORA1ActionPerformed(evt);
            }
        });

        bIMPRESSORA2.setText("Informática");
        bIMPRESSORA2.setMaximumSize(new java.awt.Dimension(115, 25));
        bIMPRESSORA2.setMinimumSize(new java.awt.Dimension(115, 25));
        bIMPRESSORA2.setPreferredSize(new java.awt.Dimension(115, 25));
        bIMPRESSORA2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bIMPRESSORA2ActionPerformed(evt);
            }
        });

        bIMPRESSORA3.setText("DIPROC");
        bIMPRESSORA3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bIMPRESSORA3ActionPerformed(evt);
            }
        });

        bIMPRESSORA4.setText("SEC. Dr. Antônio Canedo");
        bIMPRESSORA4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bIMPRESSORA4ActionPerformed(evt);
            }
        });

        bIMPRESSORA5.setText("SEC. Dr. Eduardo André");
        bIMPRESSORA5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bIMPRESSORA5ActionPerformed(evt);
            }
        });

        bIMPRESSORA6.setText("SEC. Dr. Leonardo Almeida");
        bIMPRESSORA6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bIMPRESSORA6ActionPerformed(evt);
            }
        });

        bIMPRESSORA7.setText("SEC. Dr. Leonardo Costa");
        bIMPRESSORA7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bIMPRESSORA7ActionPerformed(evt);
            }
        });

        bIMPRESSORA8.setText("SEC. Dr. Paulo Barata");
        bIMPRESSORA8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bIMPRESSORA8ActionPerformed(evt);
            }
        });

        bIMPRESSORA9.setText("Sala de Reunião");
        bIMPRESSORA9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bIMPRESSORA9ActionPerformed(evt);
            }
        });

        bIMPRESSORA10.setText("GAB. Dr. Eduardo André");
        bIMPRESSORA10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bIMPRESSORA10ActionPerformed(evt);
            }
        });

        bIMPRESSORA11.setEnabled(false);
        bIMPRESSORA11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bIMPRESSORA11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout impressorasLayout = new javax.swing.GroupLayout(impressoras);
        impressoras.setLayout(impressorasLayout);
        impressorasLayout.setHorizontalGroup(
            impressorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(impressorasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(impressorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(bIMPRESSORA11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bIMPRESSORA1, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                    .addComponent(bIMPRESSORA4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bIMPRESSORA5, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(impressorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(impressorasLayout.createSequentialGroup()
                        .addComponent(bIMPRESSORA2, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bIMPRESSORA3, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(impressorasLayout.createSequentialGroup()
                        .addGroup(impressorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(bIMPRESSORA9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bIMPRESSORA10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bIMPRESSORA8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(impressorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bIMPRESSORA7, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bIMPRESSORA6, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(168, Short.MAX_VALUE))
        );

        impressorasLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {bIMPRESSORA1, bIMPRESSORA2, bIMPRESSORA3, bIMPRESSORA4, bIMPRESSORA5, bIMPRESSORA6, bIMPRESSORA7, bIMPRESSORA8});

        impressorasLayout.setVerticalGroup(
            impressorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(impressorasLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(impressorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bIMPRESSORA3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bIMPRESSORA2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bIMPRESSORA1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(impressorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bIMPRESSORA4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bIMPRESSORA8, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bIMPRESSORA6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(impressorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bIMPRESSORA5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bIMPRESSORA10, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bIMPRESSORA7, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(impressorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bIMPRESSORA11, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bIMPRESSORA9, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(150, 150, 150))
        );

        impressorasLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {bIMPRESSORA1, bIMPRESSORA10, bIMPRESSORA2, bIMPRESSORA3, bIMPRESSORA4, bIMPRESSORA5, bIMPRESSORA6, bIMPRESSORA7, bIMPRESSORA8, bIMPRESSORA9});

        jTabbedPane1.addTab("Impressoras", impressoras);

        jButton64.setText("Senha de acesso");
        jButton64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton64ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("1) Clique no botão correspondente a máquina que será dado suporte.\n2) Peça para o usuário clicar no botão \"Aceitar\" na caixa que aparecerá na tela.\n3) Será aberto em seu monitor uma caixa pedindo a SENHA DE ACESSO.\n");
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout senhasLayout = new javax.swing.GroupLayout(senhas);
        senhas.setLayout(senhasLayout);
        senhasLayout.setHorizontalGroup(
            senhasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(senhasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(senhasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 716, Short.MAX_VALUE)
                    .addGroup(senhasLayout.createSequentialGroup()
                        .addComponent(jButton64)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        senhasLayout.setVerticalGroup(
            senhasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(senhasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(senhasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton64, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(491, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Senha", senhas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 741, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bINFORMATICA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bINFORMATICA1ActionPerformed
       new Thread(new VNC(EQUIPAMENTOS.get(1).host)).start();       
    }//GEN-LAST:event_bINFORMATICA1ActionPerformed

    private void bINFORMATICA2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bINFORMATICA2ActionPerformed
       new Thread(new VNC(EQUIPAMENTOS.get(2).host)).start();       
    }//GEN-LAST:event_bINFORMATICA2ActionPerformed

    private void bSAC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSAC1ActionPerformed
       new Thread(new VNC(EQUIPAMENTOS.get(3).host)).start();       
    }//GEN-LAST:event_bSAC1ActionPerformed

    private void bSAC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSAC2ActionPerformed
       new Thread(new VNC(EQUIPAMENTOS.get(4).host)).start();       
    }//GEN-LAST:event_bSAC2ActionPerformed

    private void bMOTORISTA5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMOTORISTA5ActionPerformed
       new Thread(new VNC(EQUIPAMENTOS.get(5).host)).start();       
    }//GEN-LAST:event_bMOTORISTA5ActionPerformed

    private void bMOTORISTA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMOTORISTA1ActionPerformed
       new Thread(new VNC(EQUIPAMENTOS.get(6).host)).start();       
    }//GEN-LAST:event_bMOTORISTA1ActionPerformed

    private void bMOTORISTA2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMOTORISTA2ActionPerformed
       new Thread(new VNC(EQUIPAMENTOS.get(7).host)).start();       
    }//GEN-LAST:event_bMOTORISTA2ActionPerformed

    private void bMOTORISTA3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMOTORISTA3ActionPerformed
       new Thread(new VNC(EQUIPAMENTOS.get(8).host)).start();       
    }//GEN-LAST:event_bMOTORISTA3ActionPerformed

    private void bMOTORISTA4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMOTORISTA4ActionPerformed
       new Thread(new VNC(EQUIPAMENTOS.get(9).host)).start();       
    }//GEN-LAST:event_bMOTORISTA4ActionPerformed

    private void bADM1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bADM1ActionPerformed
       new Thread(new VNC(EQUIPAMENTOS.get(10).host)).start();       
    }//GEN-LAST:event_bADM1ActionPerformed

    private void bADM2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bADM2ActionPerformed
       new Thread(new VNC(EQUIPAMENTOS.get(11).host)).start();       
    }//GEN-LAST:event_bADM2ActionPerformed

    private void bADM3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bADM3ActionPerformed
       new Thread(new VNC(EQUIPAMENTOS.get(12).host)).start();
    }//GEN-LAST:event_bADM3ActionPerformed

    private void bADM4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bADM4ActionPerformed
       new Thread(new VNC(EQUIPAMENTOS.get(13).host)).start();
    }//GEN-LAST:event_bADM4ActionPerformed

    private void bADM5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bADM5ActionPerformed
       new Thread(new VNC(EQUIPAMENTOS.get(14).host)).start();
    }//GEN-LAST:event_bADM5ActionPerformed

    private void bADM6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bADM6ActionPerformed
       new Thread(new VNC(EQUIPAMENTOS.get(15).host)).start();
    }//GEN-LAST:event_bADM6ActionPerformed

    private void bADM7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bADM7ActionPerformed
       new Thread(new VNC(EQUIPAMENTOS.get(16).host)).start();
    }//GEN-LAST:event_bADM7ActionPerformed

    private void bDIPROC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDIPROC1ActionPerformed
       new Thread(new VNC(EQUIPAMENTOS.get(17).host)).start();
    }//GEN-LAST:event_bDIPROC1ActionPerformed

    private void bDIPROC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDIPROC2ActionPerformed
       new Thread(new VNC(EQUIPAMENTOS.get(18).host)).start();
    }//GEN-LAST:event_bDIPROC2ActionPerformed

    private void bDIPROC3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDIPROC3ActionPerformed
       new Thread(new VNC(EQUIPAMENTOS.get(19).host)).start();
    }//GEN-LAST:event_bDIPROC3ActionPerformed

    private void bDIPROC4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDIPROC4ActionPerformed
       new Thread(new VNC(EQUIPAMENTOS.get(20).host)).start();
    }//GEN-LAST:event_bDIPROC4ActionPerformed

    private void bDIPROC5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDIPROC5ActionPerformed
       new Thread(new VNC(EQUIPAMENTOS.get(21).host)).start();
    }//GEN-LAST:event_bDIPROC5ActionPerformed

    private void bDIPROC6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDIPROC6ActionPerformed
       new Thread(new VNC(EQUIPAMENTOS.get(22).host)).start();
    }//GEN-LAST:event_bDIPROC6ActionPerformed

    private void bGAB11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGAB11ActionPerformed
       new Thread(new VNC(EQUIPAMENTOS.get(23).host)).start();
    }//GEN-LAST:event_bGAB11ActionPerformed

    private void bGAB12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGAB12ActionPerformed
       new Thread(new VNC(EQUIPAMENTOS.get(24).host)).start();
    }//GEN-LAST:event_bGAB12ActionPerformed

    private void bGAB13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGAB13ActionPerformed
       new Thread(new VNC(EQUIPAMENTOS.get(25).host)).start();
    }//GEN-LAST:event_bGAB13ActionPerformed

    private void bGAB14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGAB14ActionPerformed
       new Thread(new VNC(EQUIPAMENTOS.get(26).host)).start();
    }//GEN-LAST:event_bGAB14ActionPerformed

    private void bGAB15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGAB15ActionPerformed
       new Thread(new VNC(EQUIPAMENTOS.get(27).host)).start();
    }//GEN-LAST:event_bGAB15ActionPerformed

    private void bGAB16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGAB16ActionPerformed
       new Thread(new VNC(EQUIPAMENTOS.get(28).host)).start();
    }//GEN-LAST:event_bGAB16ActionPerformed

    private void bGAB21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGAB21ActionPerformed
       new Thread(new VNC(EQUIPAMENTOS.get(29).host)).start();
    }//GEN-LAST:event_bGAB21ActionPerformed

    private void bGAB22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGAB22ActionPerformed
       new Thread(new VNC(EQUIPAMENTOS.get(30).host)).start();
    }//GEN-LAST:event_bGAB22ActionPerformed

    private void bGAB23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGAB23ActionPerformed
       new Thread(new VNC(EQUIPAMENTOS.get(31).host)).start();
    }//GEN-LAST:event_bGAB23ActionPerformed

    private void bGAB24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGAB24ActionPerformed
       new Thread(new VNC(EQUIPAMENTOS.get(32).host)).start();
    }//GEN-LAST:event_bGAB24ActionPerformed

    private void bGAB25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGAB25ActionPerformed
       new Thread(new VNC(EQUIPAMENTOS.get(33).host)).start();
    }//GEN-LAST:event_bGAB25ActionPerformed

    private void bGAB26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGAB26ActionPerformed
       new Thread(new VNC(EQUIPAMENTOS.get(34).host)).start();
    }//GEN-LAST:event_bGAB26ActionPerformed

    private void bGAB31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGAB31ActionPerformed
       new Thread(new VNC(EQUIPAMENTOS.get(35).host)).start();
    }//GEN-LAST:event_bGAB31ActionPerformed

    private void bGAB32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGAB32ActionPerformed
       new Thread(new VNC(EQUIPAMENTOS.get(36).host)).start(); //Sec. José Mauricio
    }//GEN-LAST:event_bGAB32ActionPerformed

    private void bGAB33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGAB33ActionPerformed
       new Thread(new VNC(EQUIPAMENTOS.get(37).host)).start();
    }//GEN-LAST:event_bGAB33ActionPerformed

    private void bGAB34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGAB34ActionPerformed
       new Thread(new VNC(EQUIPAMENTOS.get(38).host)).start();
    }//GEN-LAST:event_bGAB34ActionPerformed

    private void bGAB35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGAB35ActionPerformed
       new Thread(new VNC(EQUIPAMENTOS.get(39).host)).start();
    }//GEN-LAST:event_bGAB35ActionPerformed

    private void bGAB36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGAB36ActionPerformed
       new Thread(new VNC(EQUIPAMENTOS.get(40).host)).start();
    }//GEN-LAST:event_bGAB36ActionPerformed

    private void bINFORMATICA3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bINFORMATICA3ActionPerformed
       new Thread(new VNC(EQUIPAMENTOS.get(63).host)).start();       
    }//GEN-LAST:event_bINFORMATICA3ActionPerformed

    private void jButton64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton64ActionPerformed
        jLabel1.setText(passwordVNC.getString("PASSWORD"));
    }//GEN-LAST:event_jButton64ActionPerformed

    private void bINFORMATICA4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bINFORMATICA4ActionPerformed
       new Thread(new VNC(EQUIPAMENTOS.get(65).host)).start();       
    }//GEN-LAST:event_bINFORMATICA4ActionPerformed

    private void bBIBLIOTECA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBIBLIOTECA1ActionPerformed
        new Thread(new VNC(EQUIPAMENTOS.get(59).host)).start();
    }//GEN-LAST:event_bBIBLIOTECA1ActionPerformed

    private void bIMPRESSORA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bIMPRESSORA1ActionPerformed
        abrirBrowser("10.111.142.81"); // Administração
    }//GEN-LAST:event_bIMPRESSORA1ActionPerformed

    private void bIMPRESSORA2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bIMPRESSORA2ActionPerformed
        abrirBrowser("10.111.142.80"); // Informática
    }//GEN-LAST:event_bIMPRESSORA2ActionPerformed

    private void bIMPRESSORA3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bIMPRESSORA3ActionPerformed
        abrirBrowser("10.111.142.92"); // DIPROC
    }//GEN-LAST:event_bIMPRESSORA3ActionPerformed

    private void bIMPRESSORA4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bIMPRESSORA4ActionPerformed
        abrirBrowser("10.111.142.87"); // SEC Antonio Canedo
    }//GEN-LAST:event_bIMPRESSORA4ActionPerformed

    private void bIMPRESSORA6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bIMPRESSORA6ActionPerformed
        abrirBrowser("10.111.142.96"); // SEC José Mauricio
    }//GEN-LAST:event_bIMPRESSORA6ActionPerformed

    private void bIMPRESSORA5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bIMPRESSORA5ActionPerformed
        abrirBrowser("10.111.142.91"); // SEC Eduardo André
    }//GEN-LAST:event_bIMPRESSORA5ActionPerformed

    private void bIMPRESSORA7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bIMPRESSORA7ActionPerformed
        abrirBrowser("10.111.142.83"); // SEC Leonardo
    }//GEN-LAST:event_bIMPRESSORA7ActionPerformed

    private void bIMPRESSORA8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bIMPRESSORA8ActionPerformed
        abrirBrowser("10.111.142.86"); // SEC Wanderley
    }//GEN-LAST:event_bIMPRESSORA8ActionPerformed

    private void bIMPRESSORA9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bIMPRESSORA9ActionPerformed
        abrirBrowser("10.111.142.84"); // Analistas
    }//GEN-LAST:event_bIMPRESSORA9ActionPerformed

    private void bIMPRESSORA10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bIMPRESSORA10ActionPerformed
        abrirBrowser("10.111.142.82"); // GAB Eduardo Andre
    }//GEN-LAST:event_bIMPRESSORA10ActionPerformed

    private void bADM8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bADM8ActionPerformed
        new Thread(new VNC(EQUIPAMENTOS.get(67).host)).start(); // Gilberto / ADM
    }//GEN-LAST:event_bADM8ActionPerformed

    private void bSAC3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSAC3ActionPerformed
        new Thread(new VNC(EQUIPAMENTOS.get(60).host)).start(); // Felipe SAC
    }//GEN-LAST:event_bSAC3ActionPerformed

    private void bINFORMATICA5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bINFORMATICA5ActionPerformed
        new Thread(new VNC(EQUIPAMENTOS.get(66).host)).start(); // Recepção
    }//GEN-LAST:event_bINFORMATICA5ActionPerformed

    private void bIMPRESSORA11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bIMPRESSORA11ActionPerformed
        abrirBrowser("10.111.142.85"); // GAB Alberto
    }//GEN-LAST:event_bIMPRESSORA11ActionPerformed

    private void bANALISTA6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bANALISTA6ActionPerformed
        new Thread(new VNC(EQUIPAMENTOS.get(58).host)).start();
    }//GEN-LAST:event_bANALISTA6ActionPerformed

    private void bANALISTA5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bANALISTA5ActionPerformed
        new Thread(new VNC(EQUIPAMENTOS.get(57).host)).start();
    }//GEN-LAST:event_bANALISTA5ActionPerformed

    private void bANALISTA4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bANALISTA4ActionPerformed
        new Thread(new VNC(EQUIPAMENTOS.get(56).host)).start();
    }//GEN-LAST:event_bANALISTA4ActionPerformed

    private void bANALISTA3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bANALISTA3ActionPerformed
        new Thread(new VNC(EQUIPAMENTOS.get(55).host)).start();
    }//GEN-LAST:event_bANALISTA3ActionPerformed

    private void bANALISTA2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bANALISTA2ActionPerformed
        new Thread(new VNC(EQUIPAMENTOS.get(54).host)).start();
    }//GEN-LAST:event_bANALISTA2ActionPerformed

    private void bANALISTA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bANALISTA1ActionPerformed
        new Thread(new VNC(EQUIPAMENTOS.get(53).host)).start();
    }//GEN-LAST:event_bANALISTA1ActionPerformed

    private void bGAB56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGAB56ActionPerformed
        new Thread(new VNC(EQUIPAMENTOS.get(52).host)).start();
    }//GEN-LAST:event_bGAB56ActionPerformed

    private void bGAB55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGAB55ActionPerformed
        new Thread(new VNC(EQUIPAMENTOS.get(51).host)).start();
    }//GEN-LAST:event_bGAB55ActionPerformed

    private void bGAB54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGAB54ActionPerformed
        new Thread(new VNC(EQUIPAMENTOS.get(50).host)).start();
    }//GEN-LAST:event_bGAB54ActionPerformed

    private void bGAB53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGAB53ActionPerformed
        new Thread(new VNC(EQUIPAMENTOS.get(49).host)).start();
    }//GEN-LAST:event_bGAB53ActionPerformed

    private void bGAB52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGAB52ActionPerformed
        new Thread(new VNC(EQUIPAMENTOS.get(48).host)).start();
    }//GEN-LAST:event_bGAB52ActionPerformed

    private void bGAB51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGAB51ActionPerformed
        new Thread(new VNC(EQUIPAMENTOS.get(47).host)).start();
    }//GEN-LAST:event_bGAB51ActionPerformed

    private void bGAB46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGAB46ActionPerformed
        new Thread(new VNC(EQUIPAMENTOS.get(46).host)).start();
    }//GEN-LAST:event_bGAB46ActionPerformed

    private void bGAB45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGAB45ActionPerformed
        new Thread(new VNC(EQUIPAMENTOS.get(45).host)).start();
    }//GEN-LAST:event_bGAB45ActionPerformed

    private void bGAB44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGAB44ActionPerformed
        new Thread(new VNC(EQUIPAMENTOS.get(44).host)).start();
    }//GEN-LAST:event_bGAB44ActionPerformed

    private void bGAB43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGAB43ActionPerformed
        new Thread(new VNC(EQUIPAMENTOS.get(43).host)).start();
    }//GEN-LAST:event_bGAB43ActionPerformed

    private void bGAB42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGAB42ActionPerformed
        new Thread(new VNC(EQUIPAMENTOS.get(42).host)).start();
    }//GEN-LAST:event_bGAB42ActionPerformed

    private void bGAB41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGAB41ActionPerformed
        new Thread(new VNC(EQUIPAMENTOS.get(41).host)).start();
    }//GEN-LAST:event_bGAB41ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
                
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JanelaPrincipal().setVisible(true);                
                
                Runnable a = new AtualizaEstado(EQUIPAMENTOS);
                new Thread(a,"AtualizaEstado").start();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ADMINISTRACAO;
    private javax.swing.JPanel ANALISTAS;
    private javax.swing.JPanel BIBLIOTECA;
    private javax.swing.JPanel DIPROC;
    private javax.swing.JPanel GAB1;
    private javax.swing.JPanel GAB2;
    private javax.swing.JPanel GAB3;
    private javax.swing.JPanel GAB4;
    private javax.swing.JPanel GAB5;
    private javax.swing.JPanel INFORMATICA;
    private javax.swing.JPanel MOTORISTAS;
    private javax.swing.JPanel SAC;
    private javax.swing.JPanel andar1;
    private javax.swing.JPanel andar2;
    private javax.swing.JPanel andar3;
    private javax.swing.JButton bADM1;
    private javax.swing.JButton bADM2;
    private javax.swing.JButton bADM3;
    private javax.swing.JButton bADM4;
    private javax.swing.JButton bADM5;
    private javax.swing.JButton bADM6;
    private javax.swing.JButton bADM7;
    private javax.swing.JButton bADM8;
    private javax.swing.JButton bANALISTA1;
    private javax.swing.JButton bANALISTA2;
    private javax.swing.JButton bANALISTA3;
    private javax.swing.JButton bANALISTA4;
    private javax.swing.JButton bANALISTA5;
    private javax.swing.JButton bANALISTA6;
    private javax.swing.JButton bBIBLIOTECA1;
    private javax.swing.JButton bDIPROC1;
    private javax.swing.JButton bDIPROC2;
    private javax.swing.JButton bDIPROC3;
    private javax.swing.JButton bDIPROC4;
    private javax.swing.JButton bDIPROC5;
    private javax.swing.JButton bDIPROC6;
    private javax.swing.JButton bGAB11;
    private javax.swing.JButton bGAB12;
    private javax.swing.JButton bGAB13;
    private javax.swing.JButton bGAB14;
    private javax.swing.JButton bGAB15;
    private javax.swing.JButton bGAB16;
    private javax.swing.JButton bGAB21;
    private javax.swing.JButton bGAB22;
    private javax.swing.JButton bGAB23;
    private javax.swing.JButton bGAB24;
    private javax.swing.JButton bGAB25;
    private javax.swing.JButton bGAB26;
    private javax.swing.JButton bGAB31;
    private javax.swing.JButton bGAB32;
    private javax.swing.JButton bGAB33;
    private javax.swing.JButton bGAB34;
    private javax.swing.JButton bGAB35;
    private javax.swing.JButton bGAB36;
    private javax.swing.JButton bGAB41;
    private javax.swing.JButton bGAB42;
    private javax.swing.JButton bGAB43;
    private javax.swing.JButton bGAB44;
    private javax.swing.JButton bGAB45;
    private javax.swing.JButton bGAB46;
    private javax.swing.JButton bGAB51;
    private javax.swing.JButton bGAB52;
    private javax.swing.JButton bGAB53;
    private javax.swing.JButton bGAB54;
    private javax.swing.JButton bGAB55;
    private javax.swing.JButton bGAB56;
    private javax.swing.JButton bIMPRESSORA1;
    private javax.swing.JButton bIMPRESSORA10;
    private javax.swing.JButton bIMPRESSORA11;
    private javax.swing.JButton bIMPRESSORA2;
    private javax.swing.JButton bIMPRESSORA3;
    private javax.swing.JButton bIMPRESSORA4;
    private javax.swing.JButton bIMPRESSORA5;
    private javax.swing.JButton bIMPRESSORA6;
    private javax.swing.JButton bIMPRESSORA7;
    private javax.swing.JButton bIMPRESSORA8;
    private javax.swing.JButton bIMPRESSORA9;
    private javax.swing.JButton bINFORMATICA1;
    private javax.swing.JButton bINFORMATICA2;
    private javax.swing.JButton bINFORMATICA3;
    private javax.swing.JButton bINFORMATICA4;
    private javax.swing.JButton bINFORMATICA5;
    private javax.swing.JButton bMOTORISTA1;
    private javax.swing.JButton bMOTORISTA2;
    private javax.swing.JButton bMOTORISTA3;
    private javax.swing.JButton bMOTORISTA4;
    private javax.swing.JButton bMOTORISTA5;
    private javax.swing.JButton bSAC1;
    private javax.swing.JButton bSAC2;
    private javax.swing.JButton bSAC3;
    private javax.swing.JPanel impressoras;
    private javax.swing.JButton jButton64;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JPanel senhas;
    private javax.swing.JPanel terreo;
    // End of variables declaration//GEN-END:variables
}
