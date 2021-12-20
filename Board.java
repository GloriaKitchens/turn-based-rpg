import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class Board extends JPanel {
    private Menu menu;
    public Board() {
        menu = new Menu();
        this.add(menu);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        //this.repaint();
    }

    private void drawBoardBackground(Graphics2D g2) {
        g2.setColor(Themes.backgroundColor);
        g2.fillRect(0, 0, Themes.WORLD_WIDTH, Themes.WORLD_HEIGHT);
    }
}