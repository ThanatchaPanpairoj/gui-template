import java.awt.Graphics;
import java.awt.Graphics2D;

import java.util.ArrayList;

import javax.swing.JComponent;

/**
 * Basic GUI component GUITemplateComponent
 * 
 * @author Thanatcha Panpairoj
 * @version (a version number or a date)
 */
public class GUITemplateComponent extends JComponent
{
    private int width, height;

    public GUITemplateComponent(int width, int height) {
        this.width = width;
        this.height = height;
    }
    
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
    }

    public void updateMouse(int mouseX, int mouseY) {
        //
    }

    public void click() {
        //
    }
}
