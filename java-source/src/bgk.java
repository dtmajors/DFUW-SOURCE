/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.Map;

public class bgk
extends btk
implements bto {
    String dlh = null;
    protected biv dli = null;
    protected ldv dlj = null;
    protected String akV = null;
    protected biv.a dlk = null;
    public static final String dll = "4D0709D2-A7F7-4b37-8515-1A0FD4BFCC0F";
    protected Map<String, String> dlm;

    @Override
    public String toString() {
        return "SFExternalCommandHandler Command='" + this.akV + "' CommandID='" + this.dlh + "' RequestSource=" + this.dlj + " GUID=" + this.getGUID();
    }

    @Override
    public void doTick(ldz ldz2) {
    }

    protected void aoT() {
    }

    protected void fw(String string) {
        this.dli.a(this, string);
    }

    protected void aoU() {
        this.dli.a(this);
    }

    protected void aoV() {
        Map<String, String> map = lcn.emw();
        map.put(dll, "TRUE");
        this.t(map);
        this.aoU();
    }

    protected void s(Map<String, String> map) {
        map.put(dll, "TRUE");
        this.t(map);
        this.aoU();
    }

    protected void t(Map<String, String> map) {
        this.dli.a(this.dlj, this.akV, this.dlh, map);
    }

    protected void a(loz loz2, int n) {
        fgo fgo2 = (fgo)this.MessageDelegator.h(29447, this.GUID, lcr.qAL);
        fgo2.r(loz2);
        fgo2.GH(n);
        this.MessageDelegator.F(fgo2);
    }

    protected void c(ldv ldv2, loz loz2) {
        fgs fgs2 = (fgs)this.MessageDelegator.h(29446, this.GUID, ldv2);
        fgs2.r(loz2);
        this.MessageDelegator.F(fgs2);
    }
}

