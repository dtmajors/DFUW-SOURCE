/*
 * Decompiled with CFR.
 */
public class awl {
    public final awe crd;
    public final awm crC;
    public final awq crD;
    public final boolean crE;
    public final boolean crF;
    public Object crG;

    public awl(awe awe2, awm awm2, awq awq2, boolean bl, boolean bl2, Object object) {
        this.crd = awe2;
        this.crC = awm2;
        this.crD = awq2;
        this.crE = bl;
        this.crF = bl2;
        this.crG = object;
        assert (this.crD != null);
        if (this.crG != null) {
            switch (this.crD) {
                case crL: {
                    assert (this.crG instanceof Boolean);
                    break;
                }
                case crK: {
                    assert (this.crG instanceof Integer);
                    break;
                }
                case crJ: 
                case crM: {
                    assert (this.crG instanceof String);
                    break;
                }
            }
        }
    }
}

