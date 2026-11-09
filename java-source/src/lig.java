/*
 * Decompiled with CFR.
 */
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

public class lig<NODE extends lig<NODE>>
extends ArrayList<NODE> {
    public final NODE esp() {
        lig lig2 = (lig)super.clone();
        for (int i = 0; i < this.size(); ++i) {
            lig2.set(i, ((lig)this.get(i)).esp());
        }
        return (NODE)lig2;
    }

    public final int esq() {
        int n = 1;
        for (lig lig2 : this) {
            n += lig2.esq();
        }
        return n;
    }

    public final boolean a(NODE NODE) {
        assert (NODE != null);
        if (NODE == this) {
            return true;
        }
        for (lig lig2 : this) {
            if (!lig2.a(NODE)) continue;
            return true;
        }
        return false;
    }

    public final boolean isLeaf() {
        return this.size() == 0;
    }

    public final int b(lig<NODE> lig2) {
        assert (lda.by(lig2));
        assert (false);
        return 0;
    }

    public final void a(PrintStream printStream, String string) {
        assert (false);
        printStream.println(string + this.toString());
        for (lig lig2 : this) {
            lig2.a(printStream, string + "    ");
        }
    }

    public final void dump(String string) {
        assert (false);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(string);
            PrintStream printStream = new PrintStream(fileOutputStream);
            this.a(printStream, "");
            fileOutputStream.close();
        }
        catch (Exception exception) {
            assert (false) : exception;
            return;
        }
    }

    @Override
    public String toString() {
        return null;
    }

    @Override
    public /* synthetic */ Object clone() {
        return this.esp();
    }
}

