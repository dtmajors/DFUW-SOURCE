/*
 * Decompiled with CFR.
 */
import java.util.Comparator;

public class ctp
implements Comparator<cto> {
    public int a(cto cto2, cto cto3) {
        return cto2.Probability < cto3.Probability ? 1 : (cto2.Probability > cto3.Probability ? -1 : 0);
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((cto)object, (cto)object2);
    }
}

