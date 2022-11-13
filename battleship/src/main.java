import game.Game;
import network.Network;
import GUI.Window;

import javax.swing.*;
import javax.swing.text.BadLocationException;
import javax.swing.text.Position;
import javax.swing.text.View;
import java.awt.*;
import java.util.Scanner;

public class main {
    public static void main(String[] argv){

        Window window = new Window();

        window.setPreferredSize(new Dimension(window.WIDTH * window.SCALE, window.HEIGHT * window.SCALE));
        window.setMaximumSize(new Dimension(window.WIDTH * window.SCALE, window.HEIGHT * window.SCALE));
        window.setMinimumSize(new Dimension(window.WIDTH * window.SCALE, window.HEIGHT * window.SCALE));

        JFrame frame = new JFrame(window.TITLE);
        JPanel panel = new JPanel();
        JButton startbutton = new JButton("Spiele gegen die KI");
        panel.add(startbutton);
        frame.add(panel);
        frame.add(window);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        window.start();
    }
}
