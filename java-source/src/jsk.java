/*
 * Decompiled with CFR.
 */
import java.io.File;
import java.io.FileFilter;

public class jsk
implements FileFilter {
    @Override
    public boolean accept(File file) {
        return file.isDirectory();
    }
}

