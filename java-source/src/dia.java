/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dgj
 */
public class dia
extends dgj {
    private ldv gxp = null;

    public dia() {
        this.ObjectType = 73;
        this.gqB = 2;
    }

    public ldv getMainObjectGUID() {
        return this.gxp;
    }

    public void setMainObjectGUID(ldv ldv2) {
        this.gxp = ldv2;
    }

    protected void initializeSpecialEffect() {
        assert (this.gxp != null);
        assert (this.akX == null);
        super.initializeSpecialEffect();
        this.akX = this.gxp;
    }

    protected void copyValues(dgj dgj2) {
        super.copyValues(dgj2);
    }
}

