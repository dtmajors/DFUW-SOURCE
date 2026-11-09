/*
 * Decompiled with CFR.
 */
import java.util.Comparator;

public class inp
implements Comparator<itn> {
    public int a(itn itn2, itn itn3) {
        return itn2.getText().compareTo(itn3.getText());
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((itn)object, (itn)object2);
    }
}

