/*
 * Decompiled with CFR.
 */
import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class jrw
extends File {
    public static final String separator = "/";

    public jrw(String string) {
        super(string);
    }

    public jrw(jrw jrw2, String string) {
        super(jrw2, string);
    }

    public jrw[] dRT() {
        return this.a(super.listFiles());
    }

    public jrw[] a(FilenameFilter filenameFilter) {
        return this.a(super.listFiles(filenameFilter));
    }

    public jrw[] a(FileFilter fileFilter) {
        return this.a(super.listFiles(fileFilter));
    }

    public jrw dRU() {
        File file = super.getParentFile();
        if (file == null) {
            return null;
        }
        return new jrw(file.getAbsolutePath());
    }

    public jrw dRV() {
        File file = super.getCanonicalFile();
        if (file == null) {
            return null;
        }
        return new jrw(this.getCanonicalPath());
    }

    public jrw dRW() {
        try {
            return new jrw(this.getAbsolutePath());
        }
        catch (Exception exception) {
            return null;
        }
    }

    private jrw[] a(File[] fileArray) {
        if (fileArray == null) {
            jrw[] jrwArray = new jrw[]{};
            return jrwArray;
        }
        jrw[] jrwArray = new jrw[fileArray.length];
        for (int i = 0; i < fileArray.length; ++i) {
            jrwArray[i] = new jrw(fileArray[i].getAbsolutePath());
        }
        return jrwArray;
    }

    @Override
    public /* synthetic */ File[] listFiles(FileFilter fileFilter) {
        return this.a(fileFilter);
    }

    @Override
    public /* synthetic */ File[] listFiles(FilenameFilter filenameFilter) {
        return this.a(filenameFilter);
    }

    @Override
    public /* synthetic */ File[] listFiles() {
        return this.dRT();
    }

    @Override
    public /* synthetic */ File getCanonicalFile() {
        return this.dRV();
    }

    @Override
    public /* synthetic */ File getAbsoluteFile() {
        return this.dRW();
    }

    @Override
    public /* synthetic */ File getParentFile() {
        return this.dRU();
    }
}

