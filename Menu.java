import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JPanel;

public class Menu extends JPanel{
    private JPanel titleSection;
    private Title title;
    private Button startButton;

    public Menu() {
        initMenuOrientation();
        initTitleSection();
        initStartButton();
    }

    private void initMenuOrientation() {
        this.setBackground(Themes.backgroundColor);
        this.setPreferredSize(new Dimension(Themes.VIEW_WIDTH, Themes.VIEW_HEIGHT));
        this.setLayout(new FlowLayout(FlowLayout.CENTER));
    }

    private void initTitleSection() {
        titleSection = new JPanel();
        title = new Title(Themes.GAME_TITLE);
        title.setForeground(Themes.gameFontColor);
        titleSection.setOpaque(false);
        titleSection.add(title);
        this.add(titleSection);
    }

    private void initStartButton() {
        startButton = new Button(Themes.startButtonText);
        //this.add(startButton);
    }
}
