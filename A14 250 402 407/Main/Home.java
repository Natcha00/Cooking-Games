package Main;

import java.awt.event.*;
import javax.swing.*;


public class Home extends JPanel implements ActionListener {
  private JFrame frame;
  private JLabel myLabel;
  private ImageIcon img1,img2,img3,img4;

  Music music =new Music();

  private JButton startButton, starvingButton, creditButton, imageButton;
  public Home() {
    playMusic(0);
    ImageIcon bg = new ImageIcon(getClass().getResource("/IMG/c.gif"));
    myLabel = new JLabel(bg);
    myLabel.setSize(500, 288);


    startButton = new JButton("Start");
    startButton.setBounds(170, 320, 160, 50);
    setButton(startButton);

    imageButton = new JButton("Image");
    imageButton.setBounds(170, 400, 160, 50);
    setButton(imageButton);

    creditButton = new JButton("Credit");
    creditButton.setBounds(380, 320, 160, 50);

    setButton(creditButton);

    starvingButton = new JButton("Starving");
    starvingButton.setBounds(380,400 , 160, 50);

    setButton(starvingButton);

    try {
      img1 = new ImageIcon(getClass().getResource("/bott/1.png"));
      img2 = new ImageIcon(getClass().getResource("/bott/2.png"));
      img3 = new ImageIcon(getClass().getResource("/bott/3.png"));
      img4 = new ImageIcon(getClass().getResource("/bott/4.png"));

      startButton.setIcon(img1);
      imageButton.setIcon(img2);
      creditButton.setIcon(img4);
      starvingButton.setIcon(img3);

  } catch (Exception e) {
     e.printStackTrace();
  }
    // myLabel.add(imageLabel);
    myLabel.add(startButton);
    myLabel.add(imageButton);
    myLabel.add(creditButton);
    myLabel.add(starvingButton);
    startButton.addActionListener(this);
    imageButton.addActionListener(this);
    creditButton.addActionListener(this);
    starvingButton.addActionListener(this);

    frame = new JFrame("CILCK ME BRO");
    frame.add(myLabel);
    frame.setSize(700, 523);
    frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.setResizable(false);
    frame.setLocationRelativeTo(null);// center

  }

  @Override
  public void actionPerformed(ActionEvent e) {
    JButton source = (JButton) e.getSource();
    if (source == startButton) {
      // Code to start the game
      stop();
      Game g = new Game();
      playSE(1);
      g.setVisible(true);
      frame.setVisible(false);
    } else if (source == imageButton) {
      stop();
      playSE(1);
      Menu newGame = new Menu();
      newGame.setVisible(true);
      frame.setVisible(false);
    } else if (source == creditButton) {
      stop();
      playSE(1);
      Screen newGame = new Screen();
      newGame.setVisible(true);
      frame.setVisible(false);
    } else if (source == starvingButton) {
      stop();
      playSE(1);
      Loading newGame = new Loading();
      newGame.setVisible(true);
      frame.setVisible(false);

    }
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
  public void setButton(JButton a) {
    a.setBorderPainted(false);
    a.setContentAreaFilled(false);
    a.setFocusPainted(false);
    a.setOpaque(false);
}
}