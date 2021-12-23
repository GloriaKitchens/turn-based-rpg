// Gloria Kitchens
// Screen - abstract class contains basic setup for each UI screen
import java.awt.Dimension;
import java.awt.BorderLayout;
import javax.swing.JPanel;

public abstract class Screen extends JPanel {
    public void initOrientation() {
        this.setBackground(Themes.backgroundColor);
        this.setPreferredSize(new Dimension(Themes.VIEW_WIDTH, Themes.VIEW_HEIGHT));
        this.setLayout(new BorderLayout(Themes.padding, Themes.padding));
    }
}
