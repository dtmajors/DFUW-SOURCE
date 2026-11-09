/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.Map;

public class jmb
extends btk
implements bto {
    public final jme nuJ;
    public final ldv nuK;
    public final String Name;
    public final String nuL;
    public final short nuM;
    public final short nuN;
    public final int Type;
    public final int nuO;
    private jmc nuP = jmc.nuW;
    private int[] nuQ;
    private ldv Ud;
    private boolean nuR = false;
    private boolean nuS = false;
    private boolean nuT = false;
    private final ArrayList<jmf> nuU = lcn.emv();

    public jmb(jme jme2, jod jod2, int n) {
        this.nuJ = jme2;
        this.nuK = jod2.getGUID();
        this.Name = jod2.getName();
        this.nuL = jod2.getProductName();
        this.nuM = jod2.dOz();
        this.nuN = jod2.dOA();
        this.Type = jod2.getType();
        this.nuO = n;
    }

    @Override
    public String toString() {
        return "InputDevice[Name=" + this.Name + ", ProductName=" + this.nuL + ", Type=" + this.Type + ", Usage=" + this.nuM + ", UsagePage=" + this.nuN + ", Acquire=" + this.nuR + ", AcquireState=" + (Object)((Object)this.nuP) + "]";
    }

    @Override
    public void initialize() {
        super.initialize();
        this.Active = true;
        jqz jqz2 = (jqz)this.MessageDelegator.BW(4);
        jqz2.tk(this.getGUID());
        jqz2.tj(this.nuK);
        this.MessageDelegator.a(jqz2);
    }

    @Override
    public void doTick(ldz ldz2) {
        switch (this.nuP) {
            case nuW: 
            case nva: {
                if (!this.nuR || !this.nuS || !this.nuT) break;
                this.dLQ();
                break;
            }
            case nuY: {
                if (this.nuR) break;
                this.dLR();
            }
        }
    }

    @Override
    public void receiveInputResponse(jrq jrq2) {
        switch (jrq2.getType()) {
            case 8: {
                this.a((jrj)jrq2);
                break;
            }
            case 2: {
                this.a((jrs)jrq2);
                break;
            }
            case 7: {
                this.a((jri)jrq2);
                break;
            }
            case 6: {
                this.a((jrk)jrq2);
                break;
            }
            case 5: {
                this.a((jrm)jrq2);
                break;
            }
            case 9: {
                this.a((jro)jrq2);
                break;
            }
            default: {
                super.receiveInputResponse(jrq2);
            }
        }
    }

    private final void a(jrj jrj2) {
        this.nuS = true;
        joe[] joeArray = jrj2.dRy();
        if (joeArray == null || joeArray.length == 0) {
            this.nuJ.a(this);
            return;
        }
        this.nuQ = new int[joeArray.length];
        Map<Integer, Integer> map = lcn.emw();
        for (int j = 0; j < joeArray.length; ++j) {
            joe joe2 = joeArray[j];
            int n = joe2.dOD();
            Integer n2 = (Integer)map.remove(n);
            if (n2 == null) {
                n2 = 0;
            }
            int n3 = n2;
            jmf jmf2 = new jmf(this, joe2, j, n3);
            map.put(n, ++n3);
            this.nuU.add(jmf2);
            this.nuQ[j] = j;
        }
        if (this.dLU()) {
            this.aZC();
        } else {
            this.nuJ.a(this);
        }
    }

    private final void a(jrs jrs2) {
        if (jrs2.dRv() == 0) {
            this.nuT = true;
            this.Ud = jrs2.dRw();
            this.nuJ.a(this);
        } else {
            this.nuT = false;
            this.Ud = null;
        }
    }

    private final void a(jrm jrm2) {
        jmf jmf2 = this.Vk(jrm2.dRz());
        if (jmf2 == null) {
            assert (false);
            return;
        }
        jmf2.K(jrm2.dRA(), jrm2.dRF(), jrm2.getValue());
    }

    private final void a(jri jri2) {
        if (jri2.getErrorCode() == 0) {
            this.a(jmc.nuY);
        } else {
            this.a(jmc.nuW);
        }
    }

    private final void a(jrk jrk2) {
        if (jrk2.getErrorCode() == 0) {
            this.a(jmc.nuW);
        } else {
            this.a(jmc.nuY);
        }
    }

    private final void a(jro jro2) {
        switch (jro2.dRE()) {
            case 2: {
                this.a(jmc.nva);
                break;
            }
            case 3: {
                break;
            }
            case 0: 
            case 1: {
                break;
            }
        }
    }

    private final void aZC() {
        this.Ud = this.MessageDelegator.bzv();
        jrg jrg2 = (jrg)this.MessageDelegator.BW(2);
        jrg2.tk(this.getGUID());
        jrg2.VN(63);
        jrg2.sy(this.Ud);
        jrg2.VO(0);
        jrg2.tj(this.nuK);
        this.MessageDelegator.a(jrg2);
    }

    public final void uk(boolean bl) {
        this.nuR = bl;
    }

    private final void dLQ() {
        assert (this.nuP == jmc.nuW || this.nuP == jmc.nva);
        jqy jqy2 = (jqy)this.MessageDelegator.BW(5);
        jqy2.tk(this.getGUID());
        jqy2.tj(this.nuK);
        jqy2.aH(this.dLW());
        jqy2.setBufferSize(this.getBufferSize());
        jqy2.uG(false);
        jqy2.uH(true);
        this.MessageDelegator.a(jqy2);
        this.a(jmc.nuX);
    }

    private final void dLR() {
        assert (this.nuP == jmc.nuY);
        jra jra2 = (jra)this.MessageDelegator.BW(6);
        jra2.tk(this.getGUID());
        jra2.tj(this.nuK);
        this.MessageDelegator.a(jra2);
        this.a(jmc.nuZ);
    }

    public String getTypeName() {
        return jly.Vj(this.Type & 0xFF);
    }

    public int dLS() {
        return this.nuO;
    }

    public int dLT() {
        return this.nuU.size();
    }

    public boolean dLU() {
        return !this.nuU.isEmpty();
    }

    public final jmc dLV() {
        return this.nuP;
    }

    public final jmf Vk(int n) {
        return this.nuU.get(n);
    }

    final void a(jmc jmc2) {
        this.nuP = jmc2;
        if (this.nuP == jmc.nva || this.nuP == jmc.nuW) {
            for (jmf jmf2 : this.nuU) {
                jmf2.reset();
            }
        }
    }

    final int[] dLW() {
        return this.nuQ;
    }

    final int getBufferSize() {
        return 2048;
    }

    final void sy(ldv ldv2) {
        this.Ud = ldv2;
    }

    public jmf sE(String string) {
        for (jmf jmf2 : this.nuU) {
            if (jmf2.dMq() != string) continue;
            return jmf2;
        }
        return null;
    }

    public boolean dLX() {
        return this.Type == 19;
    }
}

