package Main;

import javax.swing.*;
import java.awt.event.*;
import java.util.Random;
import java.awt.event.ActionListener;

public class Loading extends JFrame {
    private JLabel characterLabel;
    private Timer timer;
    private Random random;
    private int x, y, dx, dy;
    private JButton backButton;
    private JLabel myLabel;
    Music music =new Music();

    public Loading() {
        // Set the properties of the JFrame


        playMusic(0);
        setTitle("MY TUMMY IS TALKING TO ME,BROS");
        setSize(800, 600);
        setLayout(null);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create the JLabel for the character
        characterLabel = new JLabel(new ImageIcon("IMG/num.png"));
        characterLabel.setBounds(0, 0, characterLabel.getIcon().getIconWidth(),
                characterLabel.getIcon().getIconHeight());
        add(characterLabel);

        // Initialize the random object and set the character's initial position and
        // direction
        random = new Random();
        x = random.nextInt(getWidth() - characterLabel.getWidth());
        y = random.nextInt(getHeight() - characterLabel.getHeight());
        dx = random.nextInt(3) - 1;
        dy = random.nextInt(3) - 1;
        if (dx == 0 && dy == 0)
            dx = 1;

        // Create the timer for updating the character's position
        timer = new Timer(1, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Move the character randomly
                x += dx;
                y += dy;
                if (x < 0 || x > getWidth() - characterLabel.getWidth())
                    dx = -dx;
                if (y < 0 || y > getHeight() - characterLabel.getHeight())
                    dy = -dy;
                characterLabel.setLocation(x, y);
            }
        });
        timer.start();

        JPanel backPanel = new JPanel();
        backPanel.setBounds(0, 500, 250, 50);
        add(backPanel);
        backButton = new JButton("BACK TO HOME");
        backButton.setFocusPainted(false);
        backButton.setActionCommand("BACK");
        backPanel.add(backButton);
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              if (e.getSource() == backButton) {
                stop();
                playSE(1);
                    Home home = new Home();
                   setVisible(false);
              }
            }
            });
            ImageIcon bg = new ImageIcon(getClass().getResource("/IMG/Bake.gif"));
            myLabel = new JLabel(bg);
            myLabel.setSize(800, 600);
            add(myLabel);
    
    }
    public void playMusic(int i){
        System.out.println(i);
        music.setFiles(i);
        music.play();
        music.loop();
      }
      public void stop(){
        music.stop();
      }
      public void playSE(int i){
        music.setFiles(i);
        music.play();
      }
}