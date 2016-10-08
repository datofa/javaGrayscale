/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lib;

/**
 *
 * @author null
 */
import java.awt.*;
import java.awt.image.BufferedImage;

public class GrayScale {

    BufferedImage image;
    int width;
    int height;

    public GrayScale(BufferedImage imageSrc) {
        try {
            this.image = imageSrc;
            width = this.image.getWidth();
            height = this.image.getHeight();

            for (int i = 0; i < height; i++) {

                for (int j = 0; j < width; j++) {

                    Color c = new Color(this.image.getRGB(j, i));
                    int red = (int) (c.getRed() * 0.299);
                    int green = (int) (c.getGreen() * 0.587);
                    int blue = (int) (c.getBlue() * 0.114);
                    Color newColor = new Color(red + green + blue, red + green + blue, red + green + blue);

                    this.image.setRGB(j, i, newColor.getRGB());
                }
            }

        } catch (Exception e) {
        }
    }
    
    public BufferedImage getImage(){
        return this.image;
    }

}
