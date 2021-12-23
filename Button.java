// Author: Gloria Kitchens
// Button
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Button extends JButton{
    private JLabel buttonLabel;
    private Color buttonColor;
    private boolean isPressed;

    public Button(String buttonText) {
        isPressed = false;
        buttonLabel = new JLabel(buttonText);
        buttonLabel.setFont((new Themes()).gameButtonFont);
        this.setBackground(Color.WHITE);
        this.add(buttonLabel);
        buttonColor = Themes.defaultButtonColor;

        this.addActionListener(new ButtonListener());
    }

    public boolean getIsPressed() { return isPressed; }
    public void setIsPressed(boolean isPressed) { this.isPressed = isPressed; }
}