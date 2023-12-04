package org.example.services;

import commands.AppBotCommand;

import java.util.Random;

public class filterOperation {
    @AppBotCommand(name = "/gray", description = "Серый светофильтр", showInKeyboard = true)
    public static float[] greyScale(float[] rgb) {
        final float mean = (rgb[0] + rgb[1] + rgb[2]) / 3;
        rgb[0] = mean;
        rgb[1] = mean;
        rgb[2] = mean;
        return rgb;
    }

    @AppBotCommand(name = "/red", description = "Красный светофильтр", showInKeyboard = true)

    public static float[] onlyRead(float[] rgb) {
        rgb[1] = 0;
        rgb[2] = 0;
        return rgb;
    }

    @AppBotCommand(name = "green", description = "зеленый светофильтр", showInKeyboard = true)

    public static float[] onlyGreen(float[] rgb) {
        rgb[0] = 0;
        rgb[2] = 0;
        return rgb;
    }

    @AppBotCommand(name = "/blue", description = "синий светофильтр", showInKeyboard = true)

    public static float[] onlyBlue(float[] rgb) {
        rgb[0] = 0;
        rgb[1] = 0;
        return rgb;
    }

    @AppBotCommand(name = "/sepia", description = "Светофильтр сепия", showInKeyboard = true)
    public static float[] sepia(float[] rgb) {
        Random random = new Random();
        final float randomValue = random.nextFloat() * 100 / 255;
        rgb[0] = randomValue;

        for (int i = 0; i < rgb.length; i++) {
            if (rgb[i] > 1) {
                rgb[i] = 1;
            }
        }
        return rgb;
    }
}


