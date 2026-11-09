/*
 * Decompiled with CFR.
 */
import java.io.File;
import java.io.FileFilter;

public class kyf
extends javax.swing.filechooser.FileFilter
implements FileFilter {
    private String[] qiT = new String[]{"log", "txt"};

    public kyf() {
    }

    public kyf(String[] stringArray) {
        assert (stringArray != null);
        this.qiT = stringArray;
    }

    @Override
    public boolean accept(File file) {
        if (file.isFile()) {
            String string = file.getName().toLowerCase();
            String string2 = string.substring(string.lastIndexOf(46) + 1, string.length());
            for (int i2 = 0; i2 < this.qiT.length; ++i2) {
                if (!this.qiT[i2].equalsIgnoreCase(string2)) continue;
                return true;
            }
            return false;
        }
        return true;
    }

    @Override
    public String getDescription() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Filter for [ ");
        for (int i2 = 0; i2 < this.qiT.length; ++i2) {
            if (i2 > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(this.qiT[i2]);
        }
        stringBuilder.append(" ]");
        return stringBuilder.toString();
    }
}

