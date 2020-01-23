import javax.swing.*;
import java.awt.*;

public class MainCanvas extends JPanel {

    String status = "Begin new game";
    String computerPick = "";

    public MainCanvas(){
        this.setSize(300, 100);
    }

    public void setString(String status, String computerPick){
        this.status = status;
        this.computerPick = computerPick;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawString(status, 60, 55);
        g2d.drawString(computerPick, 60, 75);
    }

    @Override
    public void update(Graphics g) {
        super.update(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawString(status, 60, 55);
        g2d.drawString(computerPick, 60, 75);
    }
}
