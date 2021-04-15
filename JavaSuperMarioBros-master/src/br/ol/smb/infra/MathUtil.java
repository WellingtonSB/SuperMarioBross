package br.ol.smb.infra;

public class MathUtil {

    public static int clamp(int v, int min, int max) {
        return Math.min(Math.max(v, min), max);
    }

    public static double clamp(double v, double min, double max) {
        return Math.min(Math.max(v, min), max);
    }
    
}
