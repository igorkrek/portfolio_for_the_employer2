package org.example.filters;


import org.example.services.ImageUtils;
import org.example.services.filterOperation;
import org.example.services.rgbMaster;

import java.awt.image.BufferedImage;


public class blue {
    public blue(String fileName) throws Exception {
        final BufferedImage image3 = ImageUtils.getImage(fileName);
        final rgbMaster rgbMaster3 = new rgbMaster(image3);


        rgbMaster3.changeImage(rgb -> filterOperation.onlyBlue(rgb));
        ImageUtils.saveImage(rgbMaster3.getImage(), "C:/Users/user/Desktop/processedPhoto.jpg");

    }
}