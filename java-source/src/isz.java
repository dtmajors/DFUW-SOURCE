/*
 * Decompiled with CFR.
 */
public class isz
extends itb {
    private int myv;
    private int mgJ;

    public isz(int n, int n2, boolean bl) {
        super(bl);
        assert (n <= n2);
        this.myv = n;
        this.mgJ = n2;
    }

    @Override
    public void a(isj isj2) {
        isj2.djE().b("ITextInput_setIntegerRange", new Object[]{isj2.getId(), this.myv, this.mgJ, this.dqD()});
    }
}

