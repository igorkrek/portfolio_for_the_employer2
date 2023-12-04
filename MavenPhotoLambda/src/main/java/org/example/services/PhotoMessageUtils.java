package org.example.services;

import org.telegram.telegrambots.meta.api.objects.File;

import java.awt.image.BufferedImage;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;


public class PhotoMessageUtils {

    public static List<String> savePhotos(List<File> files, String botToken) throws IOException {
        Random random = new Random();
        ArrayList<String> paths = new ArrayList<>();
        for (File file : files) {
            final String imageUrl = "https://api.telegram.org/file/bot" + botToken + "/" + file.getFilePath();
            System.out.println(" ссылка - " + imageUrl);
            final String localFileName = "C:/Users/user/Desktop/images" + new Date().getTime() + random.nextLong() + ".jpeg";
            System.out.println(" ссылка - " + localFileName);
            saveImage(imageUrl, localFileName);
            paths.add(localFileName);
        }
        return paths;

    }

    public static void saveImage(String url, String filename) throws IOException {
        URL urlModel = new URL(url);
        InputStream inputStream = urlModel.openStream();
        OutputStream outputStream = new FileOutputStream(new java.io.File(filename));
        byte[] b = new byte[2048];
        int length;
        while ((length = inputStream.read(b)) != -1) {
            outputStream.write(b, 0, length);
        }
        inputStream.close();
        outputStream.close();
        System.out.println("главное фото записалось.");
    }

    public static void processingImage(String fileName, ImageOperation operation) throws Exception {
        final BufferedImage image = ImageUtils.getImage(fileName);
        final rgbMaster rgbMaster = new rgbMaster(image);
        rgbMaster.changeImage(operation);
        ImageUtils.saveImage(rgbMaster.getImage(), fileName);

    }


}