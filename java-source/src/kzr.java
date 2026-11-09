/*
 * Decompiled with CFR.
 */
import java.io.File;
import java.io.FileFilter;

class kzr
implements FileFilter {
    @Override
    public boolean accept(File file) {
        String string = file.getName().toLowerCase();
        return string.endsWith(".xml");
    }
}

