import javax.swing.JLabel;

public class Title extends JLabel {
    
    public Title(String gameTitle) {
        this.setText(gameTitle);
        this.setFont((new Themes()).gameFont);
    }
}
