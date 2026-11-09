/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 */
public class clc
extends cbx
implements bto {
    protected clf eHB = null;
    protected cle eHC = null;

    public clc(boolean bl) {
        super(bl);
        this.ObjectType = 129;
    }

    public void cleanUp() {
        super.cleanUp();
        if (this.eHC != null) {
            this.eHC.remove();
            this.eHC = null;
        }
    }

    public final clf aRx() {
        return this.eHB;
    }

    public final void a(clf clf2) {
        this.eHB = clf2;
    }

    protected void aIw() {
        super.aIw();
        clf clf2 = lea.eoZ().get(this.az());
        if (clf2 == null) {
            lfn.b(5, "SFHouse", "handleMeshObjectAdded() HouseInfo == null: " + this.pa());
            assert (false);
            return;
        }
        this.a(clf2);
    }

    @Override
    public void doTick(ldz ldz2) {
        super.doTick(ldz2);
        if (this.eHC != null) {
            this.eHC.doTick(ldz2);
        }
    }
}

