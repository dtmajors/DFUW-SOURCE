/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 *  lqf
 */
import java.util.ArrayList;
import java.util.Collections;

public class ka
extends jl
implements hsn {
    private jo anc = new jo();

    public ka() {
        this.a(jv.class);
        this.a(ke.class);
        this.a(jy.class);
        this.a(jz.class);
        this.a(ju.class);
        this.a(jq.class);
        this.a(jr.class);
        this.a(km.class);
        this.a(ko.class);
        this.a(jw.class);
        this.a(ks.class);
        this.a(js.class);
        this.a(jt.class);
        this.a(jx.class);
        this.a(jp.class);
    }

    @Override
    protected hc hf() {
        return lcw.SC;
    }

    @Override
    public void initialize() {
        super.initialize();
        hso.cxK().a(this);
    }

    @Override
    public void cleanUp() {
        hso.cxK().b(this);
        super.cleanUp();
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 29698: {
                this.a((ewr)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    @Override
    public void nZ() {
        super.nZ();
        dsu dsu2 = hso.cxK().bAn();
        ldv ldv2 = dsu2.Tr == null ? dsu2.Ts : dsu2.Tr;
        ewv ewv2 = (ewv)this.MessageDelegator.h(29697, this.getGUID(), ldv2);
        this.MessageDelegator.E(ewv2);
    }

    @Override
    protected void a(jm jm2) {
    }

    private void a(ewr ewr2) {
        lox lox2 = lpd.rHs.BE(ewr2.iEx);
        if (lox2 == null) {
            lox2 = lqf.rXJ;
        }
        this.a(ewr2.akV, ewr2.hf(), ewr2.bNa(), ewr2.alg, ewr2.aO(), lox2);
    }

    public final String[] e(String string, boolean bl) {
        if (string.length() == 0) {
            return new String[0];
        }
        String string2 = string.toLowerCase();
        ArrayList<String> arrayList = lcn.emv();
        for (String string3 : this.alb.keySet()) {
            String string4 = string3.toLowerCase();
            if (!string4.startsWith(string2) && (!bl || !string4.contains(string2))) continue;
            arrayList.add(string4);
        }
        Collections.sort(arrayList);
        String[] stringArray = new String[arrayList.size()];
        stringArray = arrayList.toArray(stringArray);
        return stringArray;
    }

    public jn bm(String string) {
        return this.anc.b(string, this.alb);
    }

    @Override
    public void a(jnz jnz2, jnz jnz3) {
    }

    @Override
    public void a(joa joa2) {
    }

    @Override
    public void b(joa joa2) {
    }

    @Override
    public void cB(int n) {
    }

    @Override
    public void X(boolean bl) {
    }

    @Override
    public void oo() {
        this.nZ();
    }

    @Override
    public boolean op() {
        return true;
    }
}

