/*
 * Decompiled with CFR.
 */
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.PrintWriter;

public class mzb {
    lfn ga = lfn.eqw();

    public jrw[] a(jrw jrw2, FilenameFilter filenameFilter) {
        jrw[] jrwArray = jrw2.a(filenameFilter);
        lfn.b(0, this.getClass().getName(), "NrOfMathing Files: " + jrwArray.length);
        for (int i = 0; i < jrwArray.length; ++i) {
            if (jrwArray[i].isDirectory()) continue;
            lfn.b(0, this.getClass().getName(), "FileName = " + jrwArray[i].getName());
        }
        return jrwArray;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(jrw jrw2, String string) {
        lfn.b(0, this.getClass().getName(), "The NewFile to be saved: " + jrw2);
        PrintWriter printWriter = null;
        try {
            printWriter = new PrintWriter(new FileWriter(jrw2));
            printWriter.write(string);
        }
        catch (IOException iOException) {
            lfn.b(5, this.getClass().getName(), "Error saving to SFFile: " + jrw2.getName() + " , Exception: " + iOException);
        }
        finally {
            if (printWriter != null) {
                printWriter.close();
            }
        }
    }
}

