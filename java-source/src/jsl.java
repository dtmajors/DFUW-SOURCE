/*
 * Decompiled with CFR.
 */
import java.io.File;
import java.io.FileFilter;

public class jsl
implements FileFilter {
    private String nVj = null;

    public jsl(String string) {
        this.nVj = "." + string.toLowerCase();
    }

    @Override
    public boolean accept(File file) {
        if (file.isFile()) {
            return file.getAbsolutePath().toLowerCase().endsWith(this.nVj);
        }
        return true;
    }
}

