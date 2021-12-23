// Author: Gloria Kitchens
// Themes - contains all of the color themes and fonts used
import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.io.File;
import java.io.IOException;

public class Themes {
    public static final String GAME_TITLE = "DIGI";

    // window dimensions
    public static final int VIEW_WIDTH = 1024;
    public static final int VIEW_HEIGHT = 768;

    // board dimensions
    public static final int WORLD_WIDTH = 2048;
    public static final int WORLD_HEIGHT = 1536;

    // color themes
    public static Color darkBlue = new Color(40, 48, 68);
    public static Color lightBlue = new Color(119, 133, 172);
    public static Color green = new Color(164, 194, 165);
    public static Color white = new Color(252, 239, 249);
    public static Color orange = new Color(219, 138, 116);

    //
    public static Color menuColor = darkBlue;
    public static Color backgroundColor = darkBlue;
    
    public static Color defaultButtonColor = Color.WHITE;
    public static Color accentButtonColor = lightBlue;

    // font themes
    public Font gameFont;
    public Font gameButtonFont;
    public static final float gameFontSize = 100f;
    public static final float buttonFontSize = 50f;
    public static final Color gameFontColor = Color.WHITE;

    // spacing
    public static final int padding = 50;

    // text
    public static final String startButtonText = "START";

    public Themes() {
        File fontFile = new File("resources/Fonts/Quinquefive-Ea6d4.ttf");
        try {
            Font tempFont = Font.createFont(Font.TRUETYPE_FONT, fontFile);
            Font fontTitleSize = tempFont.deriveFont(gameFontSize);
            Font fontMiddleSize = tempFont.deriveFont(buttonFontSize);
            gameFont = fontTitleSize;
            gameButtonFont = fontMiddleSize;
        } catch (FontFormatException | IOException ex) {
            System.out.println("failed to create font");
            gameFont = new Font("Consolas", Font.PLAIN, (int)gameFontSize);
            gameButtonFont = new Font("Consolas", Font.PLAIN, (int)buttonFontSize);
        }
    }

}
