/*
 * Decompiled with CFR.
 */
import java.util.List;

public abstract class itm
extends itl {
    public itm(itj itj2) {
        super(itj2);
        this.a(iqo.dmT());
    }

    @Override
    public void dqN() {
        this.removeAllChildren();
        List<ith> list = this.dqO().getPath();
        for (int i = 0; i < list.size() - 1; ++i) {
            this.W(this.c(list.get(i)));
        }
        this.W(this.d(list.get(list.size() - 1)));
    }

    public abstract ipf c(ith var1);

    public abstract ipf d(ith var1);
}

