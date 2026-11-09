/*
 * Decompiled with CFR.
 */
import java.io.File;
import java.io.FileFilter;

class kzf
implements FileFilter {
    @Override
    public boolean accept(File file) {
        String string = file.getName().toLowerCase();
        if (!string.startsWith("inv_")) {
            return false;
        }
        return string.endsWith(".xml");
    }
}

