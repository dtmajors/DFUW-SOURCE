/*
 * Decompiled with CFR.
 */
import java.io.File;
import java.io.FileFilter;

public class jsm
implements FileFilter {
    private String nVk = null;
    private boolean nVl = true;
    private boolean nVm = false;

    public jsm(String string) {
        this.nVk = string.toLowerCase();
    }

    public jsm(String string, boolean bl, boolean bl2) {
        this.nVk = string.toLowerCase();
        this.nVl = bl;
        this.nVm = bl2;
    }

    @Override
    public boolean accept(File file) {
        if (file.isFile()) {
            if (this.nVl) {
                return file.getAbsolutePath().toLowerCase().contains(this.nVk);
            }
            return false;
        }
        if (this.nVm) {
            return file.getAbsolutePath().toLowerCase().contains(this.nVk);
        }
        return false;
    }

    public boolean dSd() {
        return this.nVm;
    }

    public void uI(boolean bl) {
        this.nVm = bl;
    }

    public boolean dSe() {
        return this.nVl;
    }

    public void uJ(boolean bl) {
        this.nVl = bl;
    }
}

