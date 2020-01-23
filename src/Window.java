import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {

    public Window(){
        MainCanvas mainCanvas = new MainCanvas();
        JFrame jFrame = new JFrame();

        jFrame.setSize(300, 200);
        jFrame.setTitle("Rock, paper, scissors!");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.setResizable(false);
        jFrame.setVisible(true);

        jFrame.add(mainCanvas);
        jFrame.add(new ButtonPanel(mainCanvas), BorderLayout.NORTH);
    }

    public static void main(String[] args){
        new Window();
    }
}
