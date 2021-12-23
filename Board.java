import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class Board extends JPanel {
    private Menu menu;
    private CharacterScreen characterScreen;
    
    public Board() {
        menu = new Menu();
        characterScreen = new CharacterScreen();
        this.add(menu);
        this.add(characterScreen);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        menuActions();
        this.repaint();
    }

    private void menuActions() {
        if(menu.getStartButton().getIsPressed()) {
            menu.setVisible(false);
            //make next panel visible or have all the panels visible from the beginning?
        }
        
        // there's some back button that makes this visible again
    }

    private void drawBoardBackground(Graphics2D g2) {
        g2.setColor(Themes.backgroundColor);
        g2.fillRect(0, 0, Themes.WORLD_WIDTH, Themes.WORLD_HEIGHT);
    }
}