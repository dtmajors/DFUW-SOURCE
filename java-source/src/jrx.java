/*
 * Decompiled with CFR.
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class jrx {
    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void c(String string, String string2, boolean bl) {
        Object object;
        Object object2;
        File file = new File(string);
        File file2 = new File(string2);
        if (!file.exists()) {
            throw new IOException("SFFileCopier: no such source file: " + string);
        }
        if (!file.isFile()) {
            throw new IOException("SFFileCopier: can't copy directory: " + string);
        }
        if (!file.canRead()) {
            throw new IOException("SFFileCopier: source file is unreadable: " + string);
        }
        if (file2.isDirectory()) {
            file2 = new File(file2, file.getName());
        }
        if (file2.exists()) {
            if (!file2.canWrite()) {
                throw new IOException("SFFileCopier: destination file is unwriteable: " + string2);
            }
            if (!bl) {
                throw new IOException("SFFileCopier: existing file was not overwritten.");
            }
        } else {
            object2 = file2.getParent();
            if (object2 == null) {
                object2 = System.getProperty("user.dir");
            }
            if (!((File)(object = new File((String)object2))).exists()) {
                throw new IOException("SFFileCopier: destination directory doesn't exist: " + (String)object2);
            }
            if (((File)object).isFile()) {
                throw new IOException("SFFileCopier: destination is not a directory: " + (String)object2);
            }
            if (!((File)object).canWrite()) {
                throw new IOException("SFFileCopier: destination directory is unwriteable: " + (String)object2);
            }
        }
        object2 = null;
        object = null;
        try {
            int n;
            object2 = new FileInputStream(file);
            object = new FileOutputStream(file2);
            byte[] byArray = new byte[4096];
            while ((n = ((FileInputStream)object2).read(byArray)) != -1) {
                ((FileOutputStream)object).write(byArray, 0, n);
            }
        }
        finally {
            if (object2 != null) {
                try {
                    ((FileInputStream)object2).close();
                }
                catch (IOException iOException) {
                    iOException.printStackTrace();
                }
            }
            if (object != null) {
                try {
                    ((FileOutputStream)object).close();
                }
                catch (IOException iOException) {
                    iOException.printStackTrace();
                }
            }
        }
    }
}

