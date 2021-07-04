package yilanoyunu;
import java.awt.Dimension;
import java.awt.Label;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.util.Random;
import javax.swing.*;
public class Anaframe extends javax.swing.JFrame implements KeyListener,ActionListener{
    
    int puan=0; int kuyruki=0; public boolean durdur = false;
    int timergecikme=100;
    Random rnd = new Random();
    int genislik=15; int yükseklik=15;  
    double harekethizi=1;
    final int kuyruksayisi =200;
    int kuyrukyondurumu[] =new int[kuyruksayisi];
    JLabel [] kuyruk = new JLabel[kuyruksayisi];
    int yondurumu=0; //1 sağ 2 sol 3 asagi 4 yukarı
    public Timer timer;public Timer timer2;
    JLabel Ryem = new  JLabel("");
    public Anaframe() {      
        initComponents();
        ortadabasla();
        Loyna.setFocusable(false);
        Ryem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yilanoyunu/Resimler/yem.png"))); 
        Ryem.setBounds(150, 150, 15, 15);
        Ryem.setVisible(true);
        oyunpaneli.add(Ryem);
        addKeyListener(this);
        timer = new Timer(timergecikme,this);
        timer.start();
        for (int i = 0; i <kuyruksayisi; i++) {
            kuyruk[i]=new JLabel();
            if (i==0) {
                kuyruk[i].setBounds(0, 0, 15, 15);
                kuyruk[i].setIcon(new javax.swing.ImageIcon(getClass().getResource("/yilanoyunu/Resimler/bassag.png")));
                kuyruk[i].setVisible(true);
                kuyruki++;
                oyunpaneli.add(kuyruk[i]);
                kuyrukyondurumu[i]=1;
            }
            else{
            kuyruk[i].setBounds(-15, -15, 15, 15);
            kuyruk[i].setIcon(new javax.swing.ImageIcon(getClass().getResource("/yilanoyunu/Resimler/govde.png")));
            kuyruk[i].setVisible(false);
            oyunpaneli.add(kuyruk[i]);
            kuyrukyondurumu[i]=0;
            }
        }
       
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        oyunpaneli = new javax.swing.JPanel();
        Loyna = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        skorsl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        kullaniciAdi = new javax.swing.JLabel();
        Labelsonuc = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("YILAN OYUNU");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setSize(new java.awt.Dimension(600, 600));

        oyunpaneli.setBackground(new java.awt.Color(204, 255, 204));
        oyunpaneli.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 0));
        oyunpaneli.setToolTipText("");
        oyunpaneli.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        oyunpaneli.setPreferredSize(new java.awt.Dimension(510, 510));

        Loyna.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Loyna.setForeground(new java.awt.Color(255, 51, 51));
        Loyna.setText("OYNAMAK İÇİN BOŞLUK TUŞUNA BASABİLİRSİNİZ.");

        javax.swing.GroupLayout oyunpaneliLayout = new javax.swing.GroupLayout(oyunpaneli);
        oyunpaneli.setLayout(oyunpaneliLayout);
        oyunpaneliLayout.setHorizontalGroup(
            oyunpaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(oyunpaneliLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Loyna)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        oyunpaneliLayout.setVerticalGroup(
            oyunpaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(oyunpaneliLayout.createSequentialGroup()
                .addGap(194, 194, 194)
                .addComponent(Loyna)
                .addContainerGap(236, Short.MAX_VALUE))
        );

        jPanel1.setFocusable(false);

        skorsl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        skorsl.setText("SKOR:");
        skorsl.setToolTipText("");
        skorsl.setName("labelx"); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("KULLANICI ADI:");

        kullaniciAdi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        kullaniciAdi.setText("İsimsiz");

        Labelsonuc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Labelsonuc.setText(" 0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(kullaniciAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(skorsl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Labelsonuc, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kullaniciAdi)
                    .addComponent(skorsl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Labelsonuc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );

        skorsl.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(oyunpaneli, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(oyunpaneli, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void Restart()  {
       kuyruki=0;
        yondurumu=0;
        durdur=false;
        
        Ryem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yilanoyunu/Resimler/yem.png")));
        Ryem.setBounds(150, 150, 15, 15);
        Ryem.setVisible(true);
        for (int i = 0; i <kuyruksayisi; i++) {
            if (i==0) {
                kuyruk[i].setBounds(0, 0, 15, 15);
                kuyruk[i].setIcon(new javax.swing.ImageIcon(getClass().getResource("/yilanoyunu/Resimler/bassag.png")));
                kuyruk[i].setVisible(true);
                kuyruki++;
                kuyrukyondurumu[i]=1;
            }
            else{
                kuyruk[i].setBounds(-15, -15, 15, 15);
                kuyruk[i].setIcon(new javax.swing.ImageIcon(getClass().getResource("/yilanoyunu/Resimler/govde.png")));
                kuyruk[i].setVisible(false);
                kuyrukyondurumu[i]=0;
            }
        }
        timer.start();
        Loyna.setVisible(false);
        
    } 
    public void oyunsonu(){
        for (int i = 1; i < kuyruksayisi; i++) {
                if (kuyruk[0].getX() == kuyruk[i].getX() && kuyruk[0].getY()==kuyruk[i].getY()) {
                timer.stop(); 
                durdur = true;
                Loyna.setVisible(true);
                Loyna.setText("YANDIN!.TEKRAR OYNAMAK İÇİN BOŞLUK TUŞUNA BAS.");
                if (kuyrukyondurumu[0]==1) {
                 kuyruk[0].setIcon(new javax.swing.ImageIcon(getClass().getResource("/yilanoyunu/Resimler/bassagolu.png")));   
                }
                else if (kuyrukyondurumu[0]==2) {
                 kuyruk[0].setIcon(new javax.swing.ImageIcon(getClass().getResource("/yilanoyunu/Resimler/bassololu.png")));   
                }
                else if (kuyrukyondurumu[0]==3) {
                 kuyruk[0].setIcon(new javax.swing.ImageIcon(getClass().getResource("/yilanoyunu/Resimler/basasagiolu.png")));   
                }
                else if (kuyrukyondurumu[0]==4) {
                 kuyruk[0].setIcon(new javax.swing.ImageIcon(getClass().getResource("/yilanoyunu/Resimler/basyukariolu.png")));   
                }
                for (int j = 1; j < kuyruksayisi; j++) {
                 kuyruk[j].setIcon(new javax.swing.ImageIcon(getClass().getResource("/yilanoyunu/Resimler/govdeolu.png")));   
                }
            }
        }
    }
    public void hareket(){
        int x = kuyruk[0].getX(); int y = kuyruk[0].getY();
        int oncekiyon=kuyrukyondurumu[0];
        if (yondurumu==1) {
           kuyruk[0].setIcon(new javax.swing.ImageIcon(getClass().getResource("/yilanoyunu/Resimler/bassag.png")));
           kuyruk[0].setBounds(kuyruk[0].getX()+(int)(genislik/harekethizi), kuyruk[0].getY(), 15, 15);  
        }
         if (yondurumu==2) {
            kuyruk[0].setIcon(new javax.swing.ImageIcon(getClass().getResource("/yilanoyunu/Resimler/bassol.png")));
            kuyruk[0].setBounds(kuyruk[0].getX()-(int)(genislik/harekethizi), kuyruk[0].getY(), 15, 15);  
        }
          if (yondurumu==4) {
              kuyruk[0].setIcon(new javax.swing.ImageIcon(getClass().getResource("/yilanoyunu/Resimler/basyukari.png")));
              kuyruk[0].setBounds(kuyruk[0].getX(), kuyruk[0].getY()-(int)(genislik/harekethizi), 15, 15);  
        }
           if (yondurumu==3) {
           kuyruk[0].setIcon(new javax.swing.ImageIcon(getClass().getResource("/yilanoyunu/Resimler/basasagi.png")));
           kuyruk[0].setBounds(kuyruk[0].getX(), kuyruk[0].getY()+(int)(genislik/harekethizi), 15, 15);  
        }
        for(int i = 1; i < kuyruksayisi;i++){
            if(kuyruk[i].isVisible()){
                 
                int gecicix=kuyruk[i].getX(); int geciciy=kuyruk[i].getY();
                kuyruk[i].setBounds(x, y, 15, 15);
                
                x = gecicix; y = geciciy;
            }
            else break;
        }
    }
    public void carpisma(){
    if (kuyruk[0].getX()==Ryem.getX() && kuyruk[0].getY()==Ryem.getY()) {
          Labelsonuc.setText(""+(++puan));
          yemekle();  
          for(int i=0; i < kuyruksayisi; i++){
              if(kuyrukyondurumu[i] == 0){
                  kuyrukyondurumu[i]=kuyrukyondurumu[i-1];
                  if(kuyrukyondurumu[i] == 1){
                    kuyruk[kuyruki].setIcon(new javax.swing.ImageIcon(getClass().getResource("/yilanoyunu/Resimler/govde.png")));
                  }
                  else if(kuyrukyondurumu[i] == 2){
                      kuyruk[kuyruki].setIcon(new javax.swing.ImageIcon(getClass().getResource("/yilanoyunu/Resimler/govde.png")));
                  }
                  else if(kuyrukyondurumu[i] == 3){
                      kuyruk[kuyruki].setIcon(new javax.swing.ImageIcon(getClass().getResource("/yilanoyunu/Resimler/govde.png")));
                  }
                  else if(kuyrukyondurumu[i] == 4){
                      kuyruk[kuyruki].setIcon(new javax.swing.ImageIcon(getClass().getResource("/yilanoyunu/Resimler/govde.png")));
                  }
              }
          }
          
          kuyruk[kuyruki].setVisible(true);
          kuyruki++;
        }
         
    }
    public void yemekle(){
        int x = rnd.nextInt(450);
        int y = rnd.nextInt(450);
        x = x - x%15;
        y = y - y%15;
        Ryem.setBounds(x,y, 15, 15);
    }  
    public void ortadabasla() {
    Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (int) ((dimension.getWidth() - getWidth()) / 2);
    int y = (int) ((dimension.getHeight() -getHeight()) / 2);
    setLocation(x, y);
    }
    public void ısınlanma(){
        if (kuyruk[0].getX()<0) {
            kuyruk[0].setBounds(450,kuyruk[0].getY() , WIDTH, HEIGHT);
        }
        if (kuyruk[0].getX()>450) {
            kuyruk[0].setBounds(0,kuyruk[0].getY() , WIDTH, HEIGHT);
        }
        if (kuyruk[0].getY()<0) {
            kuyruk[0].setBounds(kuyruk[0].getX(),450 , WIDTH, HEIGHT);
        }
        if (kuyruk[0].getY()>450) {
            kuyruk[0].setBounds(kuyruk[0].getX(),0 , WIDTH, HEIGHT);
        }
    }
    public void kalpekle(){
    JLabel Rkalp =new JLabel();
    Rkalp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yilanoyunu/Resimler/yem.png")));
    Rkalp.setVisible(true);
    Rkalp.setBounds(rnd.nextInt(450), rnd.nextInt(450), 15, 15);
    }
    public static void main(String args[]) {
            java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new Anaframe().setVisible(true);
            }
        });
        
        
    }
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel Labelsonuc;
    private javax.swing.JLabel Loyna;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel kullaniciAdi;
    private javax.swing.JPanel oyunpaneli;
    private javax.swing.JLabel skorsl;
    // End of variables declaration//GEN-END:variables
    @Override
    public void keyTyped(KeyEvent e) {
        
    }
    
    @Override
    public void keyPressed(KeyEvent e) {
        if (((e.getKeyCode()==KeyEvent.VK_RIGHT && yondurumu!=2) || (e.getKeyCode()==KeyEvent.VK_D && yondurumu!=2 )) && yondurumu!=0) {
            yondurumu=1;
            kuyrukyondurumu[0]=1;
        }
        if(((e.getKeyCode()==KeyEvent.VK_LEFT &&  yondurumu!=1) || (e.getKeyCode()==KeyEvent.VK_A &&  yondurumu!=1)) && yondurumu!=0){
          yondurumu=2;
          kuyrukyondurumu[0]=2;
        }
        if(((e.getKeyCode()==KeyEvent.VK_DOWN &&yondurumu!=4)|| (e.getKeyCode()==KeyEvent.VK_S &&yondurumu!=4)) && yondurumu!=0){
            yondurumu=3;
            kuyrukyondurumu[0]=3;
        }
        if(((e.getKeyCode()==KeyEvent.VK_UP && yondurumu!=3) || (e.getKeyCode()==KeyEvent.VK_W &&yondurumu!=4)) && yondurumu!=0){
             yondurumu=4;
             kuyrukyondurumu[0]=4;
        }
        if (e.getKeyCode()==KeyEvent.VK_SPACE) {
      
            if (durdur==true) {
               
                Restart(); 
                puan=0;
                Labelsonuc.setText(""+0);
                yondurumu=1;
            }
                else{
                      Loyna.setVisible(false);
                      yondurumu=1;
                }
        }
    }    

    @Override
    public void keyReleased(KeyEvent e) {
       
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
          if (durdur==false) {
             hareket();
            }
           carpisma();
           oyunsonu();
           ısınlanma();
           kalpekle();
    }
}
