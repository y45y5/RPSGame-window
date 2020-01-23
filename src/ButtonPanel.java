import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonPanel extends JPanel implements ActionListener {

    private JButton rockButton;
    private JButton paperButton;
    private JButton scissorButton;

    Game game;
    MainCanvas mainCanvas;

    public ButtonPanel(MainCanvas mainCanvas) {
        rockButton = new JButton("Rock");
        paperButton = new JButton("Paper");
        scissorButton = new JButton("Scissors");

        rockButton.addActionListener(this);
        paperButton.addActionListener(this);
        scissorButton.addActionListener(this);

        setSize(300, 100);
        add(rockButton);
        add(paperButton);
        add(scissorButton);

        game = new Game();
        this.mainCanvas = mainCanvas;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Object source = actionEvent.getSource();

        if(source == rockButton) game.humanMove(Option.ROCK, mainCanvas);
        else if(source == paperButton) game.humanMove(Option.PAPER, mainCanvas);
        else if(source == scissorButton) game.humanMove(Option.SCISSORS, mainCanvas);
        mainCanvas.repaint();
    }
}
