package org.example.services;

import java.lang.reflect.InvocationTargetException;

public interface ImageOperation {
     float[] execute(float[] rgb) throws InvocationTargetException, IllegalAccessException;
}
