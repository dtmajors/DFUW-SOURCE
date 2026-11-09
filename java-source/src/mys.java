/*
 * Decompiled with CFR.
 */
import java.io.File;
import javax.swing.filechooser.FileFilter;

public class mys
extends FileFilter {
    private String jD = "Processable files";

    @Override
    public boolean accept(File file) {
        if (file == null) {
            System.out.println("SFFileChooserFileFilter.accept() --> ERROR: Gave me NULL as SFFile. w000t!");
            return false;
        }
        if (file.isDirectory()) {
            return true;
        }
        String string = file.getAbsolutePath().toLowerCase();
        return string.endsWith(".x") || string.endsWith(".sfm");
    }

    @Override
    public String getDescription() {
        return this.jD;
    }
}

