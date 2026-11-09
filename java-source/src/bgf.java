/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 *  lcw
 */
import java.util.Map;

public class bgf
extends btk
implements bto {
    private int div = 1;
    private lid<a> diw = new lid();
    private Map<ldv, a> dix = lcn.emG();
    private Map<Integer, a> diy = lcn.emG();
    private double diz;
    private static b[] diA = new b[0];

    private int aoB() {
        return this.div++;
    }

    @Override
    public void initialize() {
        super.initialize();
    }

    public void i(String string, int n) {
        if (n < 50000) {
            return;
        }
        if (n >= 0x100000) {
            return;
        }
        a a2 = new a(string, n);
        a2.diG = this.aoB();
        kdj kdj2 = (kdj)this.MessageDelegator.i(259, this.getGUID(), lcr.qyX);
        kdj2.setContext(a2.diG);
        kdj2.wA("Darkfall_Read");
        kdj2.wB("SELECT Resources from login_onetimeresource where GameID=" + lcw.qGe + " AND WorldID=" + lcw.qGf + " AND AccountName='" + string + "'");
        this.MessageDelegator.b(kdj2);
        this.diy.put(a2.diG, a2);
    }

    public void a(kdk kdk2) {
        a a2 = this.diy.remove(kdk2.getContext());
        if (a2 == null) {
            return;
        }
        if (kdk2.getContext() == a2.diG) {
            a2.diE = 0;
            boolean bl = a2.diC = kdk2.dVr().euT() != null && kdk2.dVr().euT().length > 0;
            if (a2.diC) {
                if (kdk2.dVr().euT().length != 1) {
                    return;
                }
                a2.diE = ((lml)kdk2.dVr().euT()[0].euV()[0]).getValue();
            }
            for (int i = 0; i < diA.length; ++i) {
                int n = 1 << i;
                if ((a2.diE & n) != 0) continue;
                a2.diF |= n;
            }
            if (a2.diF == 0) {
                return;
            }
            a2.diG = 0;
            a2.diD = this.diz + 300.0;
            this.diw.a(this.diz + 10.0, a2);
        } else if (kdk2.getContext() == a2.diH) {
            ldv ldv2 = lcr.abW((int)a2.SN);
            for (int i = 0; i < diA.length; ++i) {
                int n = 1 << i;
                if ((a2.diF & n) == 0) continue;
                fmz fmz2 = (fmz)this.MessageDelegator.h(7955, this.getGUID(), ldv2);
                int[] nArray = new int[1];
                int[] nArray2 = new int[1];
                nArray[0] = lea.enW().getType(bgf.diA[i].ResourceName);
                nArray2[0] = bgf.diA[i].ctJ;
                fmz2.iIY = nArray2;
                fmz2.bqd = nArray;
                fmz2.hsP = true;
                fmz2.b(bqy.dFT);
                this.MessageDelegator.F(fmz2);
            }
            a2.diH = 0;
        } else assert (false);
    }

    private void b(fuu fuu2) {
        a a2 = this.dix.remove(fuu2.aO());
        if (a2 == null) {
            return;
        }
        if (fuu2.Ui != null) {
            a2.diB = true;
        }
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 5636: {
                this.b((fuu)dxq2);
                return;
            }
            case 7956: {
                return;
            }
        }
        super.receiveMessage(dxq2);
    }

    @Override
    public void receiveMiddlewareMessage(kcz kcz2) {
        if (kcz2.getMessageType() == 260) {
            this.a((kdk)kcz2);
        } else {
            super.receiveMiddlewareMessage(kcz2);
        }
    }

    @Override
    public void doTick(ldz ldz2) {
        this.diz = ldz2.rgz;
        a a2 = this.diw.eg(this.diz);
        if (a2 == null) {
            return;
        }
        if (!a2.diB) {
            if (this.diz > a2.diD) {
                return;
            }
            fut fut2 = (fut)this.MessageDelegator.h(5635, this.getGUID(), lcr.abW((int)a2.SN));
            fut2.iXt = 2;
            this.MessageDelegator.E(fut2);
            this.dix.put(fut2.amk(), a2);
            this.diw.a(this.diz + 10.0, a2);
            return;
        }
        a2.diE |= a2.diF;
        String string = !a2.diC ? "INSERT INTO login_onetimeresource(GameID, WorldID, AccountName, Resources) VALUES(" + lcw.qGe + "," + lcw.qGf + "," + "'" + a2.hE + "'," + a2.diE + ")" : "UPDATE login_onetimeresource SET Resources=" + a2.diE + " WHERE " + "GameID=" + lcw.qGe + " AND WorldID=" + lcw.qGf + " AND AccountName='" + a2.hE + "'";
        a2.diH = this.aoB();
        kdj kdj2 = (kdj)this.MessageDelegator.i(259, this.getGUID(), lcr.qyX);
        kdj2.setContext(a2.diH);
        kdj2.wA("Darkfall");
        kdj2.wB(string);
        this.MessageDelegator.b(kdj2);
        this.diy.put(a2.diH, a2);
    }
}

