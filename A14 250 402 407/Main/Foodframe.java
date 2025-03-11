package Main;

import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.util.ArrayList;

public class Foodframe extends JPanel {
    private JFrame f;
    private JLabel logoIcon,text;
    private JPanel p;
    private ImageIcon icon;
    public String menu;

    Foodframe(String menu) {
        f = new JFrame("COOKING GENT");
        f.setSize(500, 525);
        f.setDefaultCloseOperation(1);
        f.setVisible(false);
        f.setLayout(null);
        f.setLocationRelativeTo(null);
        f.setResizable(false);
        Image(menu);
    }

    public void Image(String action) {
        ArrayList<PopupImage> popupImageList = new ArrayList<>();
       // Use getClass().getResource() to load images from resources folder
       popupImageList.add(new PopupImage("/FOODIMG/cake.PNG", "Cake"));
       popupImageList.add(new PopupImage("/FOODIMG/steak.PNG", "Steak"));
       popupImageList.add(new PopupImage("/FOODIMG/sandwich.PNG", "Sandwich"));
       popupImageList.add(new PopupImage("/FOODIMG/omelet.png", "Omelet"));
       popupImageList.add(new PopupImage("/FOODIMG/friedrice.PNG", "FriedRice"));
       popupImageList.add(new PopupImage("/FOODIMG/ramen.PNG", "Ramen"));
       popupImageList.add(new PopupImage("/FOODIMG/pizza.PNG", "Pizza"));
       popupImageList.add(new PopupImage("/FOODIMG/waste.PNG", "FAILED"));

        String tempImage = "";

        for (PopupImage popupImage : popupImageList) {
            if (popupImage.getAction().equals(action)) {
                tempImage = popupImage.getImageName();
                f.setVisible(true);
            }
        }

        // Ensure tempImage has a valid path
        if (!tempImage.isEmpty()) {
            // Using getClass().getResource to load the image correctly from resources
            icon = new ImageIcon(getClass().getResource(tempImage));
            logoIcon = new JLabel(icon);
            logoIcon.setPreferredSize(new Dimension(500, 500));

            // Create panel and add the image
            p = new JPanel();
            p.setSize(500, 500);
            p.add(logoIcon);
            f.add(p);
        } else {
            System.out.println("Image not found!");
        }
        

    }
}