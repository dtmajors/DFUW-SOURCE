/*
 * Decompiled with CFR.
 */
import java.io.File;
import java.io.FileFilter;

class kzm
implements FileFilter {
    @Override
    public boolean accept(File file) {
        String string = file.getName().toLowerCase();
        return string.endsWith("statemanager.xml");
    }
}

