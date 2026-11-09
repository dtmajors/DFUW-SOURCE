/*
 * Decompiled with CFR.
 */
public class dyf
extends dyk {
    public int aZF = 0;
    public boolean iiE = false;

    dyf() {
        super(13322);
    }

    public static int jP(String string) {
        if ("speed_very_fast".equalsIgnoreCase(string)) {
            return 36;
        }
        if ("speed_fast".equalsIgnoreCase(string)) {
            return 37;
        }
        if ("speed_normal".equalsIgnoreCase(string)) {
            return 38;
        }
        if ("speed_slow".equalsIgnoreCase(string)) {
            return 39;
        }
        if ("speed_very_slow".equalsIgnoreCase(string)) {
            return 40;
        }
        if ("idle".equalsIgnoreCase(string)) {
            return 33;
        }
        if ("spawning".equalsIgnoreCase(string)) {
            return 32;
        }
        if ("despawning".equalsIgnoreCase(string)) {
            return 31;
        }
        if ("chatter".equalsIgnoreCase(string)) {
            return 34;
        }
        if ("br".equalsIgnoreCase(string)) {
            return 30;
        }
        return 0;
    }
}

