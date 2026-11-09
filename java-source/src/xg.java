/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cew
 *  cex
 *  ha
 */
public class xg
extends wy {
    private xc bac = null;

    @Override
    public boolean isPending() {
        return true;
    }

    @Override
    public boolean vV() {
        return this.bac instanceof xd;
    }

    public xg(xc xc2, int n, xa xa2) {
        super(n, xa2);
        this.bac = xc2;
    }

    public xg(xc xc2, int n, xa xa2, String string) {
        super(n, xa2, string);
        this.bac = xc2;
    }

    @Override
    public String vZ() {
        boolean bl = false;
        for (abd object : this.wa()) {
            if (!object.yB()) continue;
            bl = true;
            break;
        }
        if (!bl) {
            return null;
        }
        Object object = xc.dS(this.getID());
        for (abd abd2 : this.wa()) {
            if (!abd2.yB()) continue;
            object = (String)object + ';' + abd2.wJ();
        }
        return object;
    }

    public boolean ck(String string) {
        if (string == null || string.isEmpty()) {
            return false;
        }
        if (xc.cm(string) != 'Q') {
            return false;
        }
        if (xc.cn(string) != this.getID()) {
            return false;
        }
        if (xc.co(string) != 'P') {
            return false;
        }
        String[] stringArray = string.split(";");
        block4: for (int i = 1; i < stringArray.length; ++i) {
            switch (xc.cm(stringArray[i])) {
                case 'N': {
                    Object object = this.dE(xc.cn(stringArray[i]));
                    if (object == null) {
                        return false;
                    }
                    if (((aaz)object).cq(stringArray[i])) continue block4;
                    return false;
                }
                case 'C': {
                    Object object = this.dH(xc.cn(stringArray[i]));
                    if (object == null) {
                        return false;
                    }
                    if (((yy)object).cq(stringArray[i])) continue block4;
                    return false;
                }
                default: {
                    assert (false) : "WTF!!!";
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public void a(abd abd2) {
        for (abd abd3 : this.wa()) {
            abd3.yE();
        }
        this.bac.a(this, abd2);
    }

    public void wD() {
        for (abd abd2 : this.wa()) {
            abd2.yC();
        }
    }

    public void wE() {
        for (abd abd2 : this.wa()) {
            abd2.yD();
        }
    }

    @Override
    public boolean b(aaz aaz2) {
        return aaz2 == null ? false : this.wa().contains(aaz2);
    }

    @Override
    public ldv wf() {
        return this.vV() ? ((xd)this.bac).wf() : null;
    }

    @Override
    public gds cr(ldv ldv2) {
        return this.vV() ? ((xd)this.bac).cr(ldv2) : null;
    }

    @Override
    public gec cs(ldv ldv2) {
        return this.vV() ? ((xd)this.bac).cs(ldv2) : null;
    }

    @Override
    public gdq ct(ldv ldv2) {
        return this.vV() ? ((xd)this.bac).ct(ldv2) : null;
    }

    @Override
    public void a(gdt gdt2) {
        this.bac.a(gdt2);
    }

    @Override
    public xc wg() {
        return this.bac;
    }

    @Override
    public ha mA() {
        return this.bac.mA();
    }

    @Override
    public cex nW() {
        return this.bac.nW();
    }

    @Override
    public cew nY() {
        return this.bac.nY();
    }

    @Override
    public bex wh() {
        return this.bac.wh();
    }

    @Override
    public acj a(ack ack2) {
        return this.bac.a(ack2);
    }

    @Override
    public void a(acj acj2) {
        this.bac.a(acj2);
    }

    @Override
    public void a(gdw gdw2) {
    }

    @Override
    public void a(gds gds2) {
        yy yy2 = this.dH(gds2.bTY());
        if (yy2 == null) {
            assert (false);
            return;
        }
        yy2.a(gds2);
    }

    @Override
    public void a(gec gec2) {
        assert (false) : "Pending Quests Do Not Have Tasks!!!";
    }

    @Override
    public void a(gdq gdq2) {
        assert (false) : "Pending Quests Do Not Have Actions!!!";
    }
}

