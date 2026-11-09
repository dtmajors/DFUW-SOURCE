/*
 * Decompiled with CFR.
 */
import java.io.File;
import javax.swing.filechooser.FileFilter;

public class myt
extends FileFilter {
    private String jD;
    private String EUC;

    public myt(String string, String string2) {
        this.EUC = string;
        this.jD = string2;
    }

    @Override
    public boolean accept(File file) {
        if (file != null) {
            if (file.isDirectory()) {
                return true;
            }
            String string = this.j(file);
            if (string != null && string.equals(this.EUC)) {
                return true;
            }
        }
        return false;
    }

    private String j(File file) {
        String string;
        int n2;
        if (file != null && (n2 = (string = file.getName()).lastIndexOf(46)) > 0 && n2 < string.length() - 1) {
            return string.substring(n2 + 1).toLowerCase();
        }
        return null;
    }

    @Override
    public String getDescription() {
        return this.jD;
    }
}

