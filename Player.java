// Author: Gloria Kitchens
// Player
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

// https://stackoverflow.com/questions/244164/how-can-i-resize-an-image-using-java
public class Player extends JPanel {
    private int x, y;
    JLabel playerRight, playerLeft;

    public Player(int x, int y) {
        this.x = x;
        this.y = y;
        initSprites(); // need to make the image bigger or just draw it in a different way
    }

    private void initSprites() {
        ImageIcon playerRightIcon = null;
        ImageIcon playerLeftIcon = null;

        try {
            playerRightIcon = new ImageIcon("resources/Sprites/player-right.png");
            playerLeftIcon = new ImageIcon("resources/Sprites/player-left.png");
        } catch (Exception e) {
            System.out.println("Image unable to be loaded.");
        }
        
        if (playerRightIcon != null && playerLeftIcon != null) {
            playerRight = new JLabel(playerRightIcon);
            playerLeft = new JLabel(playerLeftIcon);
            this.add(playerRight);
            this.setOpaque(false);
        }
        
    }
}
