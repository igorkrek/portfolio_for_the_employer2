package org.example.services;


import java.awt.image.BufferedImage;

public class rgbMaster {
    BufferedImage image;
    private int height, width;
    private boolean hasAlphaChannel;
    private int[] pixels;

    public rgbMaster(BufferedImage image) {
        this.image = image;
        height = image.getHeight();
        width = image.getWidth();
        hasAlphaChannel = image.getAlphaRaster() != null;
        pixels = image.getRGB(0, 0, width, height, null, 0, height * width);
    }

    public BufferedImage getImage() {
        return image;
    }

    public void changeImage(ImageOperation operation) throws Exception {
        for (int i = 0; i < pixels.length; i++) {
            float[] pixel = ImageUtils.rgbIntToArray(pixels[i]);
            float[] newPixel = operation.execute(pixel);
            pixels[i] = ImageUtils.rgbArrayToInt(newPixel);
        }

        image.setRGB(0, 0, width, height, pixels, 0, width * height);


    }

}





