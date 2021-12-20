import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.Graphics2D;

import javax.swing.JButton;
import javax.swing.JPanel;
//import javax.swing.event.MouseInputListener;

public class Button extends JButton{
    private String buttonText;
    private Color buttonColor;

    public Button(String buttonText) {
        this.buttonText = buttonText;
        buttonColor = Themes.defaultButtonColor;
    }

    // public void drawButton(Graphics2D g2) {
    //     g2.setColor(buttonColor);
    // }

    // @Override
    // public void mouseClicked(MouseEvent e) {
    //     // TODO Auto-generated method stub
        
    // }

    // @Override
    // public void mousePressed(MouseEvent e) {
    //     // TODO Auto-generated method stub
        
    // }

    // @Override
    // public void mouseReleased(MouseEvent e) {
    //     // TODO Auto-generated method stub
        
    // }

    // @Override
    // public void mouseEntered(MouseEvent e) {
    //     // change buttoncolor to accent color
    //     buttonColor = Themes.accentButtonColor;
        
    // }

    // @Override
    // public void mouseExited(MouseEvent e) {
    //     // change back to default button color
    //     buttonColor = Themes.defaultButtonColor;
        
    // }

    // @Override
    // public void mouseDragged(MouseEvent e) {
    //     // TODO Auto-generated method stub
        
    // }

    // @Override
    // public void mouseMoved(MouseEvent e) {
    //     // TODO Auto-generated method stub
        
    // }
}
