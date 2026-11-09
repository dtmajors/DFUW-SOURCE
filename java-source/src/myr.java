/*
 * Decompiled with CFR.
 */
import java.io.File;
import javax.swing.filechooser.FileFilter;

public class myr
extends FileFilter {
    private String jD;
    private String EUC;

    public myr(String string, String string2) {
        this.EUC = "." + string.toLowerCase();
        this.jD = string2;
    }

    @Override
    public boolean accept(File file) {
        if (file == null) {
            System.out.println("SFFileChooserFileFilter.accept() --> ERROR: Gave me NULL as SFFile. w000t!");
            return false;
        }
        if (file.isDirectory()) {
            return true;
        }
        if (this.EUC.equals("") || this.EUC.equals(".*")) {
            return true;
        }
        return file.getAbsolutePath().toLowerCase().endsWith(this.EUC);
    }

    @Override
    public String getDescription() {
        return this.jD;
    }
}

