/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hvj
 *  hyn
 *  hzo
 *  lcr
 */
import java.util.Map;
import java.util.Set;

public class jme
extends btk
implements bto,
hsn {
    private Map<ldv, jmb> nvh = lcn.emw();
    private jmn nvi = new jmn();
    private jms nvj = new jms(this);
    private jmi nvk = new jmi();
    private int nvl = 0;
    private boolean nvm = false;
    private boolean nvn = false;
    private boolean nvo = false;
    private boolean nvp = false;
    private int nvq = 0;
    private hvj alV;
    private Set<jmf> nvr = lcn.emx();
    private Set<jmj> nvs = lcn.emx();
    private Set<hyn> nvt = lcn.emx();

    @Override
    public void initialize() {
        super.initialize();
        hso.cxK().a(this);
        this.nvi.setGUID(lcr.qCE);
        this.MessageDelegator.a(this.nvi);
        this.cyG();
    }

    @Override
    public void cleanUp() {
        hso.cxK().b(this);
        super.cleanUp();
    }

    @Override
    public void doTick(ldz ldz2) {
        if (!this.nvr.isEmpty()) {
            for (jmf jmf2 : this.nvr) {
                if (jmf2.dMo()) {
                    this.e(jmf2);
                    continue;
                }
                if (!jmf2.dMp()) continue;
                this.d(jmf2);
            }
            this.nvr.clear();
        }
        if (!this.nvk.dMA()) {
            this.nvj.a(this.nvk);
        }
        this.nvi.k(jmq.nza);
        if (this.alV != null) {
            this.alV.czn();
        }
        if (this.nvn) {
            this.nvn = false;
            this.nvm = this.nvo;
        }
    }

    private final void cyG() {
        jrc jrc2 = (jrc)this.MessageDelegator.BW(3);
        jrc2.tk(this.getGUID());
        this.MessageDelegator.a(jrc2);
    }

    private final void b(jrp jrp2) {
        if (jrp2.dRG() == null) {
            assert (false);
            return;
        }
        Map<Integer, Integer> map = lcn.emw();
        for (jod jod2 : jrp2.dRG()) {
            int n = jod2.getType() & 0xFF;
            Integer n2 = (Integer)map.get(n);
            if (n2 == null) {
                n2 = 0;
            }
            jmb jmb2 = new jmb(this, jod2, n2);
            ++this.nvl;
            n2 = n2 + 1;
            map.put(n, n2);
            jmb2.setGUID(this.MessageDelegator.bzv());
            this.nvh.put(jmb2.nuK, jmb2);
            this.MessageDelegator.a(jmb2);
            jmb2.uk(hso.cxK().cxW());
        }
    }

    final void a(jmb jmb2) {
        this.nvk.b(jmb2);
        --this.nvl;
        if (this.nvl == 0) {
            this.dLY();
        }
    }

    private final void dLY() {
    }

    @Override
    public void receiveInputResponse(jrq jrq2) {
        switch (jrq2.getType()) {
            case 3: {
                this.b((jrp)jrq2);
                break;
            }
            default: {
                super.receiveInputResponse(jrq2);
            }
        }
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
        this.dLZ();
    }

    public void dLZ() {
        boolean bl = hso.cxK().cxW();
        boolean bl2 = hso.cxK().cxW();
        for (jmb jmb2 : this.nvh.values()) {
            if (jmb2.Type == 255) {
                jmb2.uk(bl);
                continue;
            }
            jmb2.uk(bl2);
        }
    }

    @Override
    public void oo() {
    }

    @Override
    public boolean op() {
        return !this.nvh.isEmpty() && this.nvl == 0;
    }

    public final void c(jmf jmf2) {
        if (this.alV != null && this.alV.a(jmf2)) {
            return;
        }
        this.nvr.add(jmf2);
    }

    final void d(jmf jmf2) {
        double d2 = jmf2.aG(this.MessageDelegator.arc());
        this.nvj.a(jmf2, this.nvk, d2);
    }

    final void e(jmf jmf2) {
        this.nvk.f(jmf2);
        if (this.nvk.dMA()) {
            return;
        }
        if (jmf2.dMt()) {
            this.nvj.a(jmf2, this.nvk);
        } else {
            this.nvj.b(jmf2, this.nvk);
        }
    }

    public jmn dMa() {
        return this.nvi;
    }

    public final boolean dMb() {
        return this.nvp || this.nvm || this.dMh();
    }

    public final void setIgnoreKeyboard(boolean bl) {
        this.nvo = bl;
        this.nvn = true;
        this.dLZ();
    }

    public jms dMc() {
        return this.nvj;
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 2842: {
                this.a((fiy)dxq2);
                break;
            }
            case 2843: {
                this.a((fiu)dxq2);
                break;
            }
            case 2844: {
                this.a((fjq)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(fiy fiy2) {
        jmr jmr2 = this.nvj.sL("Movement.RotateXAxis.0");
        assert (jmr2 != null);
        jmr2.dA(fiy2.iNs);
        jmr jmr3 = this.nvj.sL("Movement.RotateYAxis.0");
        assert (jmr2 != null);
        float f2 = fiy2.mouseInvertYAxis ? -1.0f : 1.0f;
        jmr3.dA(f2 * fiy2.iNt);
        for (jmb jmb2 : this.nvh.values()) {
            for (int j = 0; j < jmb2.dLT(); ++j) {
                jmf jmf2 = jmb2.Vk(j);
                jmf2.uj(fiy2.mouseSmoothingEnabled);
                jmf2.lb(fiy2.mouseSmoothingAmount);
            }
        }
    }

    private void a(fiu fiu2) {
        hzl hzl2 = this.alV.cxO();
        if (!(hzl2 instanceof hzo)) {
            return;
        }
        hzo hzo2 = (hzo)hzl2;
        hzo2.pp(fiu2.iNr);
    }

    public void a(hvj hvj2) {
        this.alV = hvj2;
    }

    private void a(fjq fjq2) {
        this.nvj.a(fjq2.iNW, fjq2.iMe, 0);
    }

    public void E(hyn hyn2) {
    }

    public void F(hyn hyn2) {
    }

    public void dMd() {
        int n = 0;
        for (hyn hyn2 : this.nvt) {
            n += hyn2.cFV();
        }
        this.setIgnoreKeyboard(n > 0);
    }

    public void G(hyn hyn2) {
        this.nvt.add(hyn2);
        this.dMd();
    }

    public void H(hyn hyn2) {
        this.nvt.remove(hyn2);
        this.dMd();
    }

    public void dMe() {
        this.nvt.clear();
    }

    public void ul(boolean bl) {
        this.nvp = bl;
        this.dLZ();
    }

    public boolean dMf() {
        return this.nvp;
    }

    public int dMg() {
        return this.nvq;
    }

    public boolean dMh() {
        return this.nvq > 0;
    }

    public void dMi() {
        ++this.nvq;
    }

    public void dMj() {
        --this.nvq;
    }

    public boolean dMk() {
        return jmf.nvK;
    }

    public boolean dMl() {
        return jmf.nvL;
    }

    public boolean dIz() {
        return jmf.nvM;
    }

    void cMF() {
        for (jmj jmj2 : this.nvs) {
            jmj2.cMF();
        }
    }

    public void a(jmj jmj2) {
        this.nvs.add(jmj2);
    }

    public void b(jmj jmj2) {
        this.nvs.remove(jmj2);
    }

    public void dMm() {
        jmf.nvK = false;
        jmf.nvL = false;
        jmf.nvM = false;
    }
}

