/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LoginViewController;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.JComponent;

/**
 *
 * @author HP
 */
public class AccountIcon extends JComponent{
    private Image image;

 

    public AccountIcon() {
        try {
            URL imageUrl = getClass().getResource("/LoginImage/AccountIcon.png");
            if (imageUrl != null) {
                image = ImageIO.read(imageUrl);
            } else {
                throw new IOException("Image not found: ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (image != null) {
            g.drawImage(image, 0, 0, this);
        }
    }

    @Override
    public Dimension getPreferredSize() {
        if (image != null) {
            return new Dimension(getWidth(), getHeight());
        }
        return null;
    }
}
