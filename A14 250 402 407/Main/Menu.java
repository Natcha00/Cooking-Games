package Main;

import java.awt.Color;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame {
  JFrame f = new JFrame();
  private JPanel imagepanel;
  private JLabel text, myLabel;
  private JButton backButton, pizzaLabel, sandwichLabel, friedriceLabel, cakeLabel, 
  steakLabel, ramenLabel, omeletLabel,wasteLabel;
  static Music music = new Music();


  public Menu() {
    setTitle("CLICK ME BROS");
    setSize(800, 600);
    setLayout(null);
    setVisible(true);
    setLocationRelativeTo(null);
    setResizable(false);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    playMusic(0);
    imagepanel = new JPanel();
    imagepanel.setSize(800, 600);
    imagepanel.setOpaque(false);
    imagepanel.setLayout(null);
    text = new JLabel("MENU");
    ImageIcon menuImage = new ImageIcon(getClass().getResource("/bott/Menu.png"));
    text.setIcon(menuImage);
    text.setBounds(330, 0, 150, 100);
    add(text);

    ImageIcon pizza = new ImageIcon(getClass().getResource("/FOODIMG/pizza1.png"));
    // Icon pizza = new ImageIcon("FOODIMG/pizza1.png");
    pizzaLabel = new JButton(pizza);
    pizzaLabel.setBounds(40, 100, 160, 160);
    setButton(pizzaLabel);
    pizzaLabel.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
          if (e.getSource() == pizzaLabel) {
            Object[] options = { "CLOSE",
           };
              int n = JOptionPane.showOptionDialog(f,
            "HOW TO MAKE PIZZA? \n add Flour\n add Egg\n add Milk\n add Meat",
            "HOW TO MAKE PIZZA?",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            options,
            options[0]);

            stop();
              }
              playSE(1);
              playMusic(0);

          }
  });
    imagepanel.add(pizzaLabel);

    ImageIcon sandwich = new ImageIcon(getClass().getResource("/FOODIMG/sandwich1.png"));
    // Icon sandwich = new ImageIcon("FOODIMG/sandwich1.png");
    sandwichLabel = new JButton(sandwich);
    sandwichLabel.setBounds(230, 100, 160, 160);
    sandwichLabel.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
          if (e.getSource() == sandwichLabel) {
            Object[] options = { "CLOSE",
           };
              int n = JOptionPane.showOptionDialog(f,
            "HOW TO MAKE SANDWICH? \n add Bread\n add Lettuce\n add Meat",
            "HOW TO MAKE SANDWICH?",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            options,
            options[0]);
            stop();
              }
              playSE(1);
              playMusic(0);

          }
  });
    setButton(sandwichLabel);
    
    imagepanel.add(sandwichLabel);

    ImageIcon friedrice = new ImageIcon(getClass().getResource("/FOODIMG/friedrice1.png"));
    // Icon friedrice = new ImageIcon("FOODIMG/friedrice1.png");
    friedriceLabel = new JButton(friedrice);
    friedriceLabel.setBounds(420, 100, 160, 160);
    friedriceLabel.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
          if (e.getSource() == friedriceLabel) {
            Object[] options = { "CLOSE",
           };
              int n = JOptionPane.showOptionDialog(f,
            "HOW TO MAKE FRIEDRICE? \n add Rice\n add Egg\n add Meat\n add Lettuce",
            "HOW TO MAKE FRIEDRICE?",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            options,
            options[0]);
            stop();
              }
              playSE(1);
              playMusic(0);

          }
  });
    setButton(friedriceLabel);
    imagepanel.add(friedriceLabel);

    ImageIcon cake = new ImageIcon(getClass().getResource("/FOODIMG/cake1.png"));
    // Icon cake = new ImageIcon("FOODIMG/cake1.png");
    cakeLabel = new JButton(cake);
    cakeLabel.setBounds(610, 100, 160, 160);
    cakeLabel.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
          if (e.getSource() == cakeLabel) {
            Object[] options = { "CLOSE",
           };
              int n = JOptionPane.showOptionDialog(f,
            "HOW TO MAKE CAKE? \n add Flour\n add Egg\n add Milk\n add Sugar \n add Butter",
            "HOW TO MAKE CAKE?",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            options,
            options[0]);
            stop();
              }
              playSE(1);
              playMusic(0);

          }
  });
    setButton(cakeLabel);
    imagepanel.add(cakeLabel);

    ImageIcon steak = new ImageIcon(getClass().getResource("/FOODIMG/steak1.jpg"));
    // Icon steak = new ImageIcon("FOODIMG/steak1.jpg");
    steakLabel = new JButton(steak);
    steakLabel.setBounds(40, 330, 160, 160);
    steakLabel.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
          if (e.getSource() == steakLabel) {
            Object[] options = { "CLOSE",
           };
              int n = JOptionPane.showOptionDialog(f,
            "HOW TO MAKE STEAK? \n add Meat\n add Butter\n add Lecttuce",
            "HOW TO MAKE STEAK?",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            options,
            options[0]);
            stop();
              }
              playSE(1);
              playMusic(0);
          }
  });
    setButton(steakLabel);
    imagepanel.add(steakLabel);

    ImageIcon ramen = new ImageIcon(getClass().getResource("/FOODIMG/ramen1.png"));
    // Icon ramen = new ImageIcon("FOODIMG/ramen1.png");
    ramenLabel = new JButton(ramen);
    ramenLabel.setBounds(230, 330, 160, 160);
    ramenLabel.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
          if (e.getSource() == ramenLabel) {
            Object[] options = { "CLOSE",
           };
              int n = JOptionPane.showOptionDialog(f,
            "HOW TO MAKE RAMEN? \n add Noodle\n add Egg\n add Meat \n add Lecttuce",
            "HOW TO MAKE RAMEN?",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            options,
            options[0]);
            stop();
              }
              playSE(1);
              playMusic(0);

          }
  });   
   setButton(ramenLabel);
    imagepanel.add(ramenLabel);

    ImageIcon omelet = new ImageIcon(getClass().getResource("/FOODIMG/omelet1.png"));
    // Icon omelet = new ImageIcon("FOODIMG/omelet1.png");
    omeletLabel = new JButton(omelet);
    omeletLabel.setBounds(420, 330, 160, 160);
    omeletLabel.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
          if (e.getSource() == omeletLabel) {
            Object[] options = { "CLOSE",
           };
              int n = JOptionPane.showOptionDialog(f,
            "HOW TO MAKE OMELET? \n add Egg\n add Milk\n add Rice",
            "HOW TO MAKE OMELET?",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            options,
            options[0]);
            stop();
              }
              playSE(1);
              playMusic(0);
          }
  });   
    setButton(omeletLabel);
    imagepanel.add(omeletLabel);

    ImageIcon waste = new ImageIcon(getClass().getResource("/FOODIMG/waste1.png"));
    // Icon waste = new ImageIcon("FOODIMG/waste1.png");
    wasteLabel = new JButton(waste);
    wasteLabel.setBounds(610, 330, 160, 160);
    wasteLabel.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
          if (e.getSource() == wasteLabel) {
            Object[] options = { "CLOSE",
           };
              int n = JOptionPane.showOptionDialog(f,
            "HOW TO MAKE WASTE? \n\n Click anything that you think can't cook.",
            "HOW TO MAKE WASTE?",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            options,
            options[0]);
            stop();
              }
              playSE(1);
              playMusic(0);
          }
  });   
    setButton(wasteLabel);
    imagepanel.add(wasteLabel);
    add(imagepanel);

    JPanel backPanel = new JPanel();
    backPanel.setBounds(0, 500, 250, 50);
    backPanel.setOpaque(false);
    add(backPanel);
    backButton = new JButton("BACK TO HOME");
    backButton.setFocusPainted(false);
    backButton.setActionCommand("BACK");
    backPanel.add(backButton);
    backButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if (e.getSource() == backButton) {
          if(Menu.music != null){
            Menu.stop();
        }
          Home home = new Home();
          setVisible(false);
        }
      }
    });

    ImageIcon bg = new ImageIcon(getClass().getResource("/IMG/a.png"));
    myLabel = new JLabel(bg);
    myLabel.setSize(800, 600);
    add(myLabel);
  }

  public void playMusic(int i) {
    System.out.println(i);
    music.setFiles(i);
    music.play();
    music.loop();
  }

  public static void stop() {
    music.stop();
  }

  public void playSE(int i) {
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
