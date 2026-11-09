/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cew
 */
public class ibw
extends ibu {
    private cg.b lGG;

    public ibw(cg.b b2, lox lox2, ics ics2, int n, String string, aud.a a2, aud.a a3, aud.a ... aArray) {
        super(lox2, ics2, n, string, a2, a3, aArray);
        this.lGG = b2;
    }

    @Override
    public boolean cNz() {
        cew cew2 = (cew)hso.cxK().cxP().cxO().getMessageDelegator().bzx().bzt().d(hso.cxK().bAn().gYY);
        if (cew2 == null) {
            return false;
        }
        ew ew2 = (ew)cew2.fi().ae(12256);
        if (ew2 == null) {
            return false;
        }
        return this.lGG.ordinal() == ew2.fQ();
    }
}

