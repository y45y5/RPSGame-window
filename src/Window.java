import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame {

    public Window(){
        JFrame jFrame = new JFrame();
        JTextArea textArea = new JTextArea();
        ButtonsPanel buttonsPanel = new ButtonsPanel(textArea);

        textArea.setBorder(new EmptyBorder(10, 10, 10, 10));
        textArea.setFont(new Font("Dialog", Font.BOLD, 14));
        textArea.setText("Welcome in Rock, Paper, Scissors!");
        textArea.setEditable(false);

        jFrame.setSize(300, 200);
        jFrame.setTitle("Rock, paper, scissors!");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.setResizable(false);
        jFrame.setVisible(true);

        jFrame.setLayout(new GridLayout(2,0));
        jFrame.add(buttonsPanel);
        jFrame.add(textArea);
    }

    public static void main(String[] args){
        new Window();
    }

    private class ButtonsPanel extends JPanel implements ActionListener{

        private Game game;
        private JTextArea textArea;
        private JButton rockButton;
        private JButton paperButton;
        private JButton scissorsButton;

        public ButtonsPanel(JTextArea textArea){
            game = new Game();
            this.textArea = textArea;

            rockButton = new JButton("Rock");
            paperButton = new JButton("Paper");
            scissorsButton = new JButton("Scissors");

            rockButton.addActionListener(this);
            paperButton.addActionListener(this);
            scissorsButton.addActionListener(this);

            add(rockButton);
            add(paperButton);
            add(scissorsButton);

            setPreferredSize(new Dimension(300, 100));
            setLayout(new GridLayout(0, 3));
            setBorder(new EmptyBorder(10, 10, 10, 10));
        }

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            Object source = actionEvent.getSource();

            if(source == rockButton) game.humanMove(Option.ROCK, textArea);
            else if(source == paperButton) game.humanMove(Option.PAPER, textArea);
            else if(source == scissorsButton) game.humanMove(Option.SCISSORS, textArea);
        }
    }
}
