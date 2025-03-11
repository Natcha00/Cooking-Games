package Main;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

public class Game extends JFrame {
    String food;
    Foodframe menu = new Foodframe(food);
    JLabel counterLabel, perSecLabel;
    public String arraylist;
    public JLabel itemmenu;
    public JPanel shopPanel, cookiePanel;
    private JButton button1, button2, button3, button4, button5, button6, button7, button8, button9, button10;
    private JButton bakeButton, backButton, cookieButton;
    public static int cookieCounter;
    private ImageIcon cookie;
    public static ArrayList<String> item = new ArrayList<>();
    Font font1, font2;
    CookieHandler cHandler = new CookieHandler();
    JFrame frame = new JFrame();
    Music music = new Music();
    JLabel myLabel;

    // Basket b1 = new Basket();
    public Game() {
        playSE(5);
        cookieCounter = 1700 ;
        createFont();
        createUI();
    }

    public void createFont() {
        font1 = new Font("Comic Sans MS", Font.PLAIN, 30);
        font2 = new Font("Comic Sans MS", Font.PLAIN, 13);
    }

    public void createUI() {

        setSize(800, 600);
        getContentPane().setBackground(Color.black);
        setLayout(null);
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        shopPanel = new JPanel();
        shopPanel.setBounds(350, 420, 400, 50);
        shopPanel.setBackground(Color.white);
        add(shopPanel);
        // JPanel is used to group and oragnize main panel
        cookiePanel = new JPanel();
        cookiePanel.setBounds(30, 100, 350, 300);
        cookiePanel.setOpaque(false);
        add(cookiePanel);
       
        JPanel bakePanel = new JPanel();
        bakePanel.setBounds(600, 20, 200, 80);
        bakePanel.setOpaque(false);
        bakePanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        add(bakePanel);
        
        bakeButton = new JButton();
        ImageIcon a = new ImageIcon(getClass().getResource("/bott/bake.png"));
        // ImageIcon a = new ImageIcon("bott/bake.png");
        Image imgb = a.getImage();
        Image newimgb = imgb.getScaledInstance(120, 60, Image.SCALE_SMOOTH);
        a = new ImageIcon(newimgb);
        setButton(bakeButton);
        bakeButton.setIcon(a);
        bakeButton.setFocusPainted(false);
        bakeButton.addActionListener(cHandler);
        bakePanel.add(bakeButton);
        bakeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (!item.isEmpty()) {
                    if (e.getSource() == bakeButton) {
                        playSE(6);
                        new MM(item);
                        removeList();
                    }
                } else {
                    playSE(4);
                }

            }
        });
     
        JPanel backPanel = new JPanel();
        backPanel.setBounds(0, 450, 250, 100);
        backPanel.setOpaque(false);
        add(backPanel);

        backButton = new JButton();
        ImageIcon b = new ImageIcon(getClass().getResource("/bott/back.png"));
        // ImageIcon b = new ImageIcon("bott/back.png");
        Image imgba = b.getImage();
        Image newimgba = imgba.getScaledInstance(160, 80, Image.SCALE_SMOOTH);
        b = new ImageIcon(newimgba);
        backButton.setIcon(b);
        setButton(backButton);
        backButton.setFocusPainted(false);
        backPanel.add(backButton);
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == backButton) {
                    if (!item.isEmpty()) {
                        removeList();
                    }
                    playSE(1);
                    Home home = new Home();
                    setVisible(false);
                }
            }
        });
        cookie = new ImageIcon(getClass().getResource("/IMG/num.png"));
        cookieButton = new JButton();
        cookieButton.setFocusPainted(false);
        // cookieButton.setBorder(null);
        cookieButton.setIcon(cookie);
        setButton(cookieButton);
        cookiePanel.add(cookieButton);

        JPanel counterPanel = new JPanel();
        counterPanel.setBounds(40, 50, 300, 70);
        counterPanel.setOpaque(false);
        counterPanel.setLayout(new GridLayout(2, 1));
        add(counterPanel);

        counterLabel = new JLabel(cookieCounter + " points ");
        counterLabel.setForeground(Color.BLACK);
        counterLabel.setFont(font1);
        counterPanel.add(counterLabel);
        add(counterPanel);

        perSecLabel = new JLabel();
        perSecLabel.setForeground(Color.white);
        perSecLabel.setFont(font2);
        counterPanel.add(perSecLabel);

        cookieButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == cookieButton) {
                   if (cookieCounter % 2 == 0) {
            cookie = new ImageIcon(getClass().getResource("/IMG/nom.png"));
            cookieButton.setIcon(cookie);
        } else {
            cookie = new ImageIcon(getClass().getResource("/IMG/num.png"));
            cookieButton.setIcon(cookie);
        }
        cookieCounter++;
        cur_num_of_cookie(cookieCounter);
        counterLabel.setText(cookieCounter + " points ");
        playSE(3);
                }
            }
        });
        
        JPanel itemPanel = new JPanel();
        itemPanel.setOpaque(false);
        itemPanel.setBounds(420, 120, 250, 250);
        itemPanel.setLayout(new GridLayout(5, 2));
        add(itemPanel);

        ImageIcon bg = new ImageIcon(getClass().getResource("/IMG/a.png"));
        myLabel = new JLabel(bg);
        myLabel.setSize(800, 600);
        add(myLabel);
        
        button1 = new JButton();
        ImageIcon i = new ImageIcon(getClass().getResource("/bott/fL.png"));
        // ImageIcon i = new ImageIcon("bott/fL.png");
        Image img = i.getImage();
        Image newimg = img.getScaledInstance(125, 60, Image.SCALE_SMOOTH);
        i = new ImageIcon(newimg);
        button1.setIcon(i);
        button1.addActionListener(cHandler);
        button1.setActionCommand("FLOUR");
        setButton(button1);
        itemPanel.add(button1);

        button2 = new JButton();
        ImageIcon i2 = new ImageIcon(getClass().getResource("/bott/SUGAR.png"));
        // ImageIcon i2 = new ImageIcon("bott/SUGAR.png");
        Image img2 = i2.getImage();
        Image newimg2 = img2.getScaledInstance(125, 60, Image.SCALE_SMOOTH);
        i2 = new ImageIcon(newimg2);
        setButton(button2);
        button2.setIcon(i2);
        button2.addActionListener(cHandler);
        button2.setActionCommand("SUGAR");
        itemPanel.add(button2);

        button3 = new JButton();
        ImageIcon i3 = new ImageIcon(getClass().getResource("/bott/EGG.png"));
        // ImageIcon i3 = new ImageIcon("bott/EGG.png");
        Image img3 = i3.getImage();
        Image newimg3 = img3.getScaledInstance(125, 60, Image.SCALE_SMOOTH);
        i3 = new ImageIcon(newimg3);
        setButton(button3);
        button3.setIcon(i3);
        button3.addActionListener(cHandler);
        button3.setActionCommand("EGG");
        itemPanel.add(button3);

        button4 = new JButton();
        ImageIcon i4 = new ImageIcon(getClass().getResource("/bott/MEAT.png"));
        // ImageIcon i4 = new ImageIcon("bott/MEAT.png");
        Image img4 = i4.getImage();
        Image newimg4 = img4.getScaledInstance(125, 60, Image.SCALE_SMOOTH);
        i4 = new ImageIcon(newimg4);
        setButton(button4);
        button4.setIcon(i4);
        button4.addActionListener(cHandler);
        button4.setActionCommand("MEAT");
        itemPanel.add(button4);

        button5 = new JButton();
        ImageIcon i5 = new ImageIcon(getClass().getResource("/bott/MILK.png"));
        // ImageIcon i5 = new ImageIcon("bott/MILK.png");
        Image img5 = i5.getImage();
        Image newimg5 = img5.getScaledInstance(125, 60, Image.SCALE_SMOOTH);
        i5 = new ImageIcon(newimg5);
        setButton(button5);
        button5.setIcon(i5);
        button5.addActionListener(cHandler);
        button5.setActionCommand("MILK");
        itemPanel.add(button5);

        button6 = new JButton();
        ImageIcon i6 = new ImageIcon(getClass().getResource("/bott/RICE.png"));
        // ImageIcon i6 = new ImageIcon("bott/RICE.png");
        Image img6 = i6.getImage();
        Image newimg6 = img6.getScaledInstance(125, 60, Image.SCALE_SMOOTH);
        i6 = new ImageIcon(newimg6);
        button6.setIcon(i6);
        setButton(button6);
        button6.addActionListener(cHandler);
        button6.setActionCommand("RICE");
        itemPanel.add(button6);

        button7 = new JButton();
        ImageIcon i7 = new ImageIcon(getClass().getResource("/bott/NOO.png"));
        // ImageIcon i7 = new ImageIcon("bott/NOO.png");
        Image img7 = i7.getImage();
        Image newimg7 = img7.getScaledInstance(125, 60, Image.SCALE_SMOOTH);
        i7 = new ImageIcon(newimg7);
        button7.setIcon(i7);
        setButton(button7);
        button7.addActionListener(cHandler);
        button7.setActionCommand("NOODLE");
        itemPanel.add(button7);

        button8 = new JButton();
        ImageIcon i8 = new ImageIcon(getClass().getResource("/bott/LET.png"));
        // ImageIcon i8 = new ImageIcon("bott/LET.png");
        Image img8 = i8.getImage();
        Image newimg8 = img8.getScaledInstance(125, 48, Image.SCALE_SMOOTH);
        i8 = new ImageIcon(newimg8);
        button8.setIcon(i8);
        setButton(button8);
        button8.addActionListener(cHandler);
        button8.setActionCommand("LETTUCE");
        itemPanel.add(button8);

        button9 = new JButton();
        ImageIcon i9 = new ImageIcon(getClass().getResource("/bott/BREAD.png"));
        // ImageIcon i9 = new ImageIcon("bott/BREAD.png");
        Image img9 = i9.getImage();
        Image newimg9 = img9.getScaledInstance(125, 48, Image.SCALE_SMOOTH);
        i9 = new ImageIcon(newimg9);
        button9.setIcon(i9);
        setButton(button9);
        button9.addActionListener(cHandler);
        button9.setActionCommand("BREAD");
        itemPanel.add(button9);

        button10 = new JButton();
        ImageIcon i10 = new ImageIcon(getClass().getResource("/bott/BUTTER.png"));
        // ImageIcon i10 = new ImageIcon("bott/BUTTER.png");
        Image img10 = i10.getImage();
        Image newimg10 = img10.getScaledInstance(125, 60, Image.SCALE_SMOOTH);
        i10 = new ImageIcon(newimg10);
        button10.setIcon(i10);
        setButton(button10);
        button10.addActionListener(cHandler);
        button10.setActionCommand("BUTTER");
        itemPanel.add(button10);

        setVisible(true);
    }

    public int cur_num_of_cookie(int cookieCounter) {
        return cookieCounter;
    }

    public class CookieHandler implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            String action = event.getActionCommand();
            if (item.size() < 5) {
                switch (action) {
                    case "FLOUR":
                        if (cur_num_of_cookie(cookieCounter) >= 10) {
                            playSE(1);
                            int i = 0;
                            cookieCounter -= 10;
                            cur_num_of_cookie(cookieCounter);
                            counterLabel.setText(cookieCounter + " points ");
                            item.add("FLOUR");
                            getList();


                            // b1.putInBasket(new LineItem("FLOUR", ++i));
                            break;
                        }
                        playSE(2);

                        // else
                        break;
                    case "SUGAR":
                        if (cur_num_of_cookie(cookieCounter) >= 5) {
                            cookieCounter -= 5;
                            playSE(1);
                            cur_num_of_cookie(cookieCounter);
                            counterLabel.setText(cookieCounter + " points ");
                            item.add("SUGAR");
                            getList();

                            break;
                        }
                        playSE(2);

                        // else
                        break;
                    case "EGG":
                        if (cur_num_of_cookie(cookieCounter) >= 5) {
                            cookieCounter -= 5;
                            playSE(1);
                            cur_num_of_cookie(cookieCounter);
                            counterLabel.setText(cookieCounter + " points ");
                            item.add("EGG");
                            getList();

                            break;
                        }
                        playSE(2);

                        // else
                        break;
                    case "MEAT":
                        if (cur_num_of_cookie(cookieCounter) >= 30) {
                            playSE(1);
                            cookieCounter -= 30;
                            cur_num_of_cookie(cookieCounter);
                            counterLabel.setText(cookieCounter + " points ");
                            item.add("MEAT");
                            getList();

                            break;
                        }
                        playSE(2);

                        // else
                        break;
                    case "MILK":
                        if (cur_num_of_cookie(cookieCounter) >= 10) {
                            playSE(1);
                            cookieCounter -= 10;
                            cur_num_of_cookie(cookieCounter);
                            counterLabel.setText(cookieCounter + " points ");
                            item.add("MILK");
                            getList();
                            break;
                        }
                        playSE(2);

                        // else
                        break;
                    case "RICE":
                        if (cur_num_of_cookie(cookieCounter) >= 60) {
                            cookieCounter -= 60;
                            playSE(1);
                            cur_num_of_cookie(cookieCounter);
                            counterLabel.setText(cookieCounter + " points ");
                            item.add("RICE");
                            getList();
                            break;
                        }
                        playSE(2);

                        // else
                        break;
                    case "NOODLE":
                        if (cur_num_of_cookie(cookieCounter) >= 400) {
                            cookieCounter -= 400;
                            playSE(1);
                            cur_num_of_cookie(cookieCounter);
                            counterLabel.setText(cookieCounter + " points ");
                            item.add("NOODLE");
                            getList();
                            break;
                        }
                        playSE(2);

                        // else
                        break;
                    case "LETTUCE":
                        if (cur_num_of_cookie(cookieCounter) >= 80) {
                            cookieCounter -= 80;
                            playSE(1);
                            cur_num_of_cookie(cookieCounter);
                            counterLabel.setText(cookieCounter + " points ");
                            item.add("LETTUCE");
                            getList();
                            break;
                        }
                        playSE(2);

                        // else
                        break;
                    case "BREAD":
                        playSE(2);
                        if (cur_num_of_cookie(cookieCounter) >= 300) {
                            cookieCounter -= 300;
                            playSE(1);
                            cur_num_of_cookie(cookieCounter);
                            counterLabel.setText(cookieCounter + " points ");
                            item.add("BREAD");
                            getList();
                            break;
                        }
                        playSE(2);
                        // else
                        break;
                    case "BUTTER":
                        if (cur_num_of_cookie(cookieCounter) >= 700) {
                            cookieCounter -= 700;
                            playSE(1);
                            cur_num_of_cookie(cookieCounter);
                            counterLabel.setText(cookieCounter + " points ");
                            item.add("BUTTER");
                            getList();
                            break;
                        }
                        playSE(2);

                        // else
                        break;
                }
            }
        }
    }

    public void getList() {
        if (item.size() == 1) {
            arraylist = String.join(", ", item);
            itemmenu = new JLabel();
            itemmenu.setText(arraylist);
            shopPanel.add(itemmenu);

        }
        if (item.size() == 2) {
            getList2();
        }
        if (item.size() == 3) {
            getList3();
        }
        if (item.size() == 4) {
            getList4();
        }
        if (item.size() == 5) {
            getList5();
        }
    }

    public void getList2() {
        itemmenu.setText("");
        if (item.size() == 2) {
            arraylist = String.join(", ", item);
            itemmenu = new JLabel();
            itemmenu.setText(arraylist);
            shopPanel.add(itemmenu);
        }
    }

    public void getList3() {
        itemmenu.setText("");
        if (item.size() == 3) {
            arraylist = String.join(", ", item);
            itemmenu = new JLabel();
            itemmenu.setBounds(EXIT_ON_CLOSE, ABORT, WIDTH, HEIGHT);
            itemmenu.setText(arraylist);
            shopPanel.add(itemmenu);
        }
    }

    public void getList4() {
        itemmenu.setText("");
        if (item.size() == 4) {
            arraylist = String.join(", ", item);
            itemmenu = new JLabel();
            itemmenu.setText(arraylist);
            shopPanel.add(itemmenu);
        }
    }

    public void getList5() {
        itemmenu.setText("");
        if (item.size() == 5) {
            arraylist = String.join(", ", item);
            itemmenu = new JLabel();
            itemmenu.setText(arraylist);
            shopPanel.add(itemmenu);

        }

    }

    public void removeList() {
        item.clear();
        itemmenu.setText("");
        System.out.println(item);
    }

    public void playMusic(int i) {
        System.out.println(i);
        music.setFiles(i);
        music.play();
        music.loop();
    }

    public void stop() {
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