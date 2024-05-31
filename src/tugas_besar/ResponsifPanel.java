package tugas_besar;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class ResponsifPanel extends JPanel{
    Image gambar;
    public ResponsifPanel() {
        gambar = new ImageIcon(getClass().getResource("/Resource/BG2.jpg")).getImage();
    }
    
    @Override
    protected void paintComponent (Graphics g) {
        super.paintComponents(g);
        Graphics2D gd = (Graphics2D)g.create();
        gd.drawImage(gambar, 0, 0, getWidth(), getHeight(), null);
        gd.dispose();  
    }
}