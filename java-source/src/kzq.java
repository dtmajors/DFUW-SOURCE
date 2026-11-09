/*
 * Decompiled with CFR.
 */
import java.io.File;
import java.io.FileFilter;

class kzq
implements FileFilter {
    private boolean qoF = false;

    public kzq(boolean bl) {
        this.qoF = bl;
    }

    @Override
    public boolean accept(File file) {
        String string = file.getName().toLowerCase();
        if (this.qoF) {
            return string.startsWith("r_") && string.endsWith(".xml");
        }
        return string.startsWith("s_") && string.endsWith(".xml");
    }
}

