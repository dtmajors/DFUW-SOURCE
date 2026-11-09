/*
 * Decompiled with CFR.
 */
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;

public class jsd
implements jse {
    @Override
    public boolean xo() {
        return false;
    }

    @Override
    public void nh() {
    }

    @Override
    public InputStream tC(String string) {
        BufferedInputStream bufferedInputStream = null;
        try {
            bufferedInputStream = new BufferedInputStream(new FileInputStream(string));
        }
        catch (FileNotFoundException fileNotFoundException) {
            System.out.println("SFFile not found when trying to load: " + fileNotFoundException);
        }
        return bufferedInputStream;
    }

    @Override
    public OutputStream dSb() {
        return null;
    }
}

