package Main;

public class PopupImage {
    String imageName;
    String action;

    PopupImage(String n, String act) {
        this.imageName = n;
        this.action = act;
    }

    public String getAction() {
        return action;
    }

    public String getImageName() {
        return imageName;
    }

}
