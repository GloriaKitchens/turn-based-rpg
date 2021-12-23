// Author: Gloria Kitchens
// CharacterScreen
import java.awt.BorderLayout;
import javax.swing.JPanel;

public class CharacterScreen extends Screen {
    private JPanel characterSection;
    private Player player;

    public CharacterScreen() {
        initOrientation();
        initCharacterSection();
    }

    private void initCharacterSection() {
        player = new Player(Themes.VIEW_WIDTH / 2, Themes.VIEW_HEIGHT / 2);
        characterSection = new JPanel();
        characterSection.setOpaque(false);
        characterSection.add(player);
        this.add(characterSection, BorderLayout.CENTER);
    }
}
