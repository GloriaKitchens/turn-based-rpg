// Gloria Kitchens
// Menu
import java.awt.BorderLayout;
import javax.swing.JPanel;

public class Menu extends Screen {
    private JPanel titleSection;
    private JPanel bottomSection; // holds buttons can change this as the user proceeds thru menu options
    private Title title;
    private Button startButton;

    public Menu() {
        initOrientation();
        initTitleSection();
        initBottomSection();
    }

    private void initTitleSection() {
        titleSection = new JPanel();
        title = new Title(Themes.GAME_TITLE);
        title.setForeground(Themes.gameFontColor);
        titleSection.setOpaque(false);
        titleSection.add(title);
        this.add(titleSection, BorderLayout.NORTH);
    }

    private void initBottomSection() {
        bottomSection = new JPanel();
        bottomSection.setOpaque(false);
        startButton = new Button(Themes.startButtonText);
        bottomSection.add(startButton);
        this.add(bottomSection, BorderLayout.CENTER);
    }

    public Button getStartButton() { return startButton; }
}
