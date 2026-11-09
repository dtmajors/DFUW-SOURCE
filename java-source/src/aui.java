/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dtn
 *  lcr
 *  lcw
 */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class aui
extends btk
implements bto {
    public static final int ccn = 1;
    public static final int bue = 2;
    private ldv QX = null;
    private static avx cco = new avx();
    protected static final avz cbY = avz.crc;
    protected static final lip[] ccp = new lip[0];
    private static final String[] ccq = new String[0];
    private final List<auk> ccr = new LinkedList<auk>();
    private a[] ccs;
    private boolean Initialized;
    private boolean cct;
    private ArrayList<ldv> ccu = new ArrayList();
    private int[] ccv = new int[10];
    int ccw = 0;

    public aui() {
        for (int i = 0; i < this.ccv.length; ++i) {
            this.ccv[i] = 0;
        }
    }

    @Override
    public final void initialize() {
        assert (!this.Initialized);
        this.ccs = new a[2];
        for (int i = 0; i < 2; ++i) {
            this.ccs[i] = new a(null);
        }
        super.initialize();
        this.Initialized = true;
        if (lcw.ena()) {
            kcq kcq2 = (kcq)this.MessageDelegator.i(266, this.getGUID(), new ldv(this.getGUID().ib(), 1800, 2));
            kcq2.gNT = 0;
            kcq2.di = 0;
            kcq2.ev = this.MessageDelegator.bzv();
            kcq2.Ud = ldv.rfd;
            kcq2.pel = 500;
            this.MessageDelegator.b(kcq2);
        }
    }

    @Override
    public final void cleanUp() {
        assert (this.Initialized);
        this.ccr.clear();
        this.ccs = null;
        if (this.QX != null) {
            kcq kcq2 = (kcq)this.MessageDelegator.i(266, this.getGUID(), new ldv(this.getGUID().ib(), 1800, 2));
            kcq2.gNT = 2;
            kcq2.di = 0;
            kcq2.ev = this.MessageDelegator.bzv();
            kcq2.Ud = this.QX;
            kcq2.pel = 500;
            this.MessageDelegator.b(kcq2);
        }
        super.cleanUp();
        this.Initialized = false;
    }

    private void a(lip lip2, String string, String string2) {
        double d2 = this.MessageDelegator.arc().rgz + 30.0;
        String[] stringArray = new String[]{"OK"};
        String string3 = lip2.esy();
        ldv ldv2 = lcr.aTZ;
        ldv ldv3 = lcr.ak((ldv)lcr.aTZ, (int)this.getGUID().ib());
        ldv ldv4 = this.MessageDelegator.bzv();
        bdr bdr2 = new bdr(ldv4, d2, string3, stringArray);
        bdr2.dbz = -1;
        bdr2.dbA = string2;
        bdr2.Title = string == null ? "No title set" : string;
        est est2 = (est)this.MessageDelegator.h(18179, this.getGUID(), ldv3);
        est2.iBv = bdr2;
        this.MessageDelegator.F(est2);
    }

    private void ea(String string) {
        bth bth2 = (bth)this.MessageDelegator.bzx().bzt().d(lcr.qAG);
        if (bth2 != null && bth2.isEnabled()) {
            return;
        }
        int n = del.dr(string);
        if (n <= 0) {
            return;
        }
        this.if(n);
    }

    private void if(int n) {
        assert (n > 0);
        glh glh2 = (glh)this.MessageDelegator.h(13057, this.GUID, lcr.qEa);
        glh2.setSpecialEffectType(n);
        glh2.setTargetObjectGUID(null);
        glh2.setTargetPosition(new ljq());
        this.MessageDelegator.E(glh2);
    }

    private void a(egy egy2) {
        aue aue2 = cco.a(egy2.bGE(), egy2.ccR);
        lip lip2 = null;
        if (aue2 == null || aue2.Strings == null) {
            lip2 = cco.a(egy2.bGE(), egy2.ccR, egy2.ipJ);
        } else {
            if (aue2.Strings.length == 1 && aue2.Strings[0].Value.equals("")) {
                return;
            }
            lip2 = cco.a(aue2, egy2.ipJ);
            if (aue2.Effect != null && !aue2.Effect.equals("")) {
                this.ea(aue2.Effect);
            }
        }
        this.a(egy2.bGE(), egy2.ccR, lip2, egy2.ipJ, egy2.ccT);
    }

    private void a(egv egv2) {
        List<auk> list = this.T(egv2.adk, egv2.ctJ);
        auk[] aukArray = new auk[list.size()];
        list.toArray(aukArray);
        egw egw2 = (egw)this.MessageDelegator.h(2312, this.getGUID(), egv2.aO());
        egw2.adk = egv2.adk;
        egw2.ipG = aukArray;
        egw2.ipH = this.Wb();
        this.MessageDelegator.F(egw2);
    }

    private void a(ehk ehk2) {
        int n = 0;
        for (auk auk2 : this.ccr) {
            egi egi2 = (egi)this.MessageDelegator.h(2328, this.getGUID(), ehk2.aO());
            auk2.ccP = null;
            if (n == this.ccr.size() - 1) {
                auk2.ccP = "E";
            }
            ++n;
            egi2.crz = auk2;
            egi2.ipw = true;
            this.MessageDelegator.F(egi2);
        }
    }

    private void a(egu egu2) {
        this.Wa();
    }

    private void b(fvp fvp2) {
        int n = fvp2.iTm;
        int n2 = fvp2.dTe;
        ldv ldv2 = fvp2.aO();
        if (n != 1) {
            return;
        }
        this.ccs[n].ccx.put(ldv2, n2);
        this.ccu.add(ldv2);
    }

    private void b(fvv fvv2) {
        int n = fvv2.iTm;
        ldv ldv2 = fvv2.aO();
        if (n != 1) {
            return;
        }
        this.ccs[n].ccx.remove(ldv2);
        this.ccu.remove(ldv2);
    }

    private void b(egz egz2) {
        this.a(egz2.ipN, egz2.ipL, egz2.ipM, aud.a.getValue(egz2.ipK), egz2.ipP, egz2.ipQ, egz2.ipR, egz2.ipO, egz2.Ri);
    }

    void a(kcp kcp2) {
        this.ccv[this.ccw] = kcp2.peh;
        ++this.ccw;
        if (this.ccw >= this.ccv.length) {
            this.ccw = 0;
        }
        int n = 0;
        for (int i = 0; i < this.ccv.length; ++i) {
            n += this.ccv[i];
        }
        lcw.qGg = n / this.ccv.length;
        lcw.qGh = kcp2.pef;
        lcw.qGi = kcp2.peg;
    }

    @Override
    public void receiveMiddlewareMessage(kcz kcz2) {
        switch (kcz2.getMessageType()) {
            case 267: {
                this.QX = ((kcr)kcz2).Ud;
                break;
            }
            case 268: {
                this.a((kcp)kcz2);
                break;
            }
            default: {
                super.receiveMiddlewareMessage(kcz2);
            }
        }
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        assert (this.Initialized);
        assert (dxq2.amk().equals(this.GUID));
        switch (dxq2.bEz()) {
            case 2305: {
                this.a((egy)dxq2);
                break;
            }
            case 2310: {
                this.a((egu)dxq2);
                break;
            }
            case 2311: {
                this.a((egv)dxq2);
                break;
            }
            case 12289: {
                this.b((fvp)dxq2);
                break;
            }
            case 12290: {
                this.b((fvv)dxq2);
                break;
            }
            case 2315: {
                this.b((egz)dxq2);
                break;
            }
            case 2327: {
                this.a((ehk)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    @Override
    public void doTick(ldz ldz2) {
        assert (lda.by(ldz2));
        if (this.cct) {
            this.ig(1);
            this.cct = false;
        }
    }

    private void ig(int n) {
        for (ldv ldv2 : this.ccs[n].ccx.keySet()) {
            Integer n2 = this.ccs[n].ccx.get(ldv2);
            fvt fvt2 = (fvt)this.MessageDelegator.h(12291, this.getGUID(), ldv2);
            fvt2.dTe = n2;
            this.MessageDelegator.F(fvt2);
        }
    }

    private void Wa() {
        this.ccr.clear();
        this.cct = true;
    }

    private void a(auk auk2) {
        if (auk.alW == null) {
            dtn dtn2 = (dtn)this.MessageDelegator.bzx().bzt().od(lcr.qzp);
            auk.alW = dtn2.bAn();
        }
        if (this.ccr.size() >= 1000) {
            this.ccr.remove(0);
        }
        this.ccr.add(auk2);
        this.cct = true;
        this.b(auk2);
        for (ldv ldv2 : this.ccu) {
            egi egi2 = (egi)this.MessageDelegator.h(2328, this.getGUID(), ldv2);
            egi2.crz = auk2;
            egi2.ipw = false;
            this.MessageDelegator.F(egi2);
        }
    }

    protected void b(auk auk2) {
        if (lcw.ena() && lcw.SC.ordinal() > hc.aaz.ordinal() && auk2 != null && auk2.ccW != null) {
            String string = null;
            if (auk2.ccW.ordinal() == aud.a.cap.ordinal()) {
                string = "Global";
            } else if (auk2.ccW.ordinal() == aud.a.car.ordinal()) {
                string = "Area";
            } else if (auk2.ccW.ordinal() == aud.a.cax.ordinal()) {
                string = "GMHelp";
            } else if (auk2.ccW.ordinal() == aud.a.caF.ordinal()) {
                string = "GMReport";
            }
            if (string != null) {
                lfn.b(4, "SFChatLog", "GMChatLog" + string + " [" + auk2.ccU + "] " + auk2.aFo);
            }
        }
    }

    private void a(String string, String string2, String string3, aud.a a2, String string4, int n, int n2, ljq ljq2, ldv ldv2) {
        int n3 = string.indexOf(10);
        if (n3 >= 0) {
            string = string.substring(0, n3) + "(Linefeed removed)";
        }
        auk auk2 = new auk(System.currentTimeMillis(), string, string2, string3, a2, string4, n, n2, ljq2, ldv2);
        this.a(auk2);
    }

    private void a(aud.b b2, int n, lip lip2, lip[] lipArray, String string) {
        String string2;
        int n2;
        String[] stringArray = null;
        if (lipArray != null) {
            stringArray = new String[lipArray.length];
            for (int i = 0; i < lipArray.length; ++i) {
                stringArray[i] = lipArray[i].esy();
            }
        } else {
            stringArray = ccq;
        }
        if ((n2 = (string2 = lip2.esy()).indexOf(10)) >= 0) {
            string2 = string2.substring(0, n2) + "(Linefeed removed)";
        }
        auk auk2 = new auk(System.currentTimeMillis(), string2, b2, n, stringArray, string);
        this.a(auk2);
    }

    private List<auk> T(int n, int n2) {
        int n3;
        if (n > this.ccr.size()) {
            n = this.ccr.size();
        }
        if ((n3 = n + n2) > this.ccr.size()) {
            n3 = this.ccr.size();
        }
        return this.ccr.subList(n, n3);
    }

    private int Wb() {
        return this.ccr.size();
    }

    private String Wc() {
        return "xml-files/client/chat/chat_log.xml";
    }
}

