package Main;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Screen extends JPanel implements ActionListener{
    Timer creditTimer = new Timer(5,this);//this = .this action listener
    String text;
    int textY=600;
    private JButton backButton;
    Music music =new Music();


    public Screen(){
        playMusic(0);
        JFrame window = new JFrame("Credit Roll Test");
        window.setSize(800,600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);
        window.add(this);
        window.setVisible(true);
        this.setBackground(Color.black);

        text = "Congratulations! \n\n"
        +"Story\n"
        +"Natcha Sinthamrongrak\n"
        +"Thidatip Polken\n\n"
        +"Graphic\n"
        +"Tanvanat Fuangmarayat\n\n"
        +"Coding\n"
        +"Thidatip Polken\n"
        +"Natcha Sinthamrongrak\n"
        +"Tanvanat Fuangmarayat\n\n\n\n\n\n\n"
        +"Thank you for playing";
        creditTimer.start();

        JPanel backPanel = new JPanel();
        backPanel.setBounds(0, 500, 250, 50);
        add(backPanel);
        backButton = new JButton("BACK TO HOME");
        backButton.setFocusPainted(false);
        backButton.setActionCommand("BACK");
        backPanel.add(backButton);
        //1
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              if (e.getSource() == backButton) {
                stop();
                playSE(1);
                    Home home = new Home();
                   window.setVisible(false);
              }
            }
            });
    }
    public void paintComponent(Graphics g){
       super.paintComponent(g); 
       Graphics2D g2d = (Graphics2D)g;
       g2d.setFont(new Font("Times New Roman",Font.PLAIN,28));
       g2d.setColor(Color.white);
       g2d.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
       int y = textY;
       for(String line:text.split("\n")){
            int stringLength = (int)g2d.getFontMetrics().getStringBounds(line,g2d).getWidth();
            int  x = getWidth()/2-stringLength/2;// move every text to the center of the page
            g2d.drawString(line,x,y+=28);//everytime we print out a line, move y by 28
       }
       
    }
    //2
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(textY);
        textY--;
        if(textY<-600){
            creditTimer.stop();
        }
        repaint();//calling paintComponent
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