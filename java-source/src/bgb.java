/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class bgb
extends btk {
    private static final double dif = 60.0;
    private ldv Rs = null;
    private Map<ldv, bgd> dig = null;
    private Map<ldv, bge> dih = null;
    private Map<ldv, lfs<eeg, Double>> dii = null;
    private Map<ldv, lfs<Float, Boolean>> dij = null;
    private Queue<fay> dik = null;
    private boolean dil = false;
    private boolean dim = false;
    private float din = 0.0f;
    private float dio = 0.0f;
    private Set<lil<ldv, Float, Float>> dip = null;
    private Queue<ldv> diq = null;

    public bgb(ldv ldv2) {
        this.Rs = ldv2;
        this.dih = lcn.emw();
        this.dig = lcn.emw();
        this.dii = lcn.emw();
        this.dij = lcn.emw();
        this.dik = lcn.emA();
        this.dip = lcn.emx();
        this.diq = lcn.emA();
    }

    public void o(float f2, float f3) {
        this.dio = f2;
        this.din = f3;
    }

    public void anh() {
        if (!this.dik.isEmpty()) {
            this.dil = true;
            return;
        }
        this.dip.clear();
        this.dih.clear();
        this.dig.clear();
        this.dio = this.din;
        this.dim = false;
    }

    public void aot() {
        if (this.dim) {
            for (bgd bgd2 : this.dig.values()) {
                if (!bgd2.aov()) continue;
                bgd2.df(false);
                break;
            }
            for (bge bge2 : this.dih.values()) {
                if (!bge2.aov()) continue;
                for (bgd bgd2 : bge2.aoy()) {
                    if (!bgd2.aov()) continue;
                    bgd2.df(false);
                    break;
                }
                bge2.df(false);
                break;
            }
            this.dim = false;
        }
    }

    public void a(bge bge2) {
        if (bge2 == null) {
            return;
        }
        bge bge3 = this.dih.remove(bge2.getGUID());
        if (bge3 != null) {
            for (bgd bgd2 : bge3.aoy()) {
                this.dig.remove(bgd2.getGUID());
                this.dii.remove(bgd2.getGUID());
            }
            if (bge3.aov()) {
                this.aot();
            }
        }
    }

    public void a(float f2, ldv ldv2, boolean bl, float f3, float f4) {
        this.din = f3;
        this.dio = f4;
        this.dio += f2;
        this.d(f2, ldv2, bl);
    }

    public void d(float f2, ldv ldv2, boolean bl) {
        assert (ldv2 != null);
        if (this.dim && bl) {
            return;
        }
        float f3 = Math.abs(f2);
        ldv ldv3 = lcr.tQ((ldv)ldv2);
        lfs<eeg, Double> lfs2 = this.dii.get(ldv3);
        if (lfs2 == null) {
            lfs<Float, Boolean> lfs3 = this.dij.get(ldv3);
            if (lfs3 == null) {
                lfs3 = new lfs<Float, Boolean>(Float.valueOf(f3), bl);
                this.dij.put(ldv3, lfs3);
                this.fo(ldv3);
            } else {
                lfs3.reX = Float.valueOf(((Float)lfs3.reX).floatValue() + f3);
                lfs3.reY = (Boolean)lfs3.reY | bl;
            }
        } else {
            Object object;
            double d2 = this.MessageDelegator.arc().rgz;
            double d3 = d2 - (Double)lfs2.reY;
            if (d3 >= 60.0) {
                object = this.dij.get(ldv3);
                if (object == null) {
                    object = new lfs<Float, Boolean>(Float.valueOf(f3), bl);
                    this.dij.put(ldv3, (lfs<Float, Boolean>)object);
                    this.fo(ldv3);
                } else {
                    ((lfs)object).reX = Float.valueOf(((Float)((lfs)object).reX).floatValue() + f3);
                    ((lfs)object).reY = (Boolean)((lfs)object).reY | bl;
                }
            } else {
                object = this.dig.get(ldv3);
                if (object == null) {
                    lfn.b(5, this.getClass().getSimpleName(), "countDamage() : Player values cached, but no player damage found!!!");
                    assert (false);
                    return;
                }
                ((bgd)object).a(f3, ((bgd)object).getGUID(), ((bgd)object).getName(), bl);
                bge bge2 = this.dih.get(((eeg)lfs2.reX).iG());
                if (bge2 != null) {
                    bge2.a(f3, ldv3, ((bgd)object).getName(), bl);
                }
            }
        }
        for (lil<ldv, Float, Float> lil2 : this.dip) {
            lil2.reZ = Float.valueOf(((Float)lil2.reZ).floatValue() + f3);
            if (!(((Float)lil2.reZ).floatValue() >= ((Float)lil2.reY).floatValue())) continue;
            if (!this.dij.isEmpty()) {
                this.diq.add((ldv)lil2.reX);
            } else {
                this.hg((ldv)lil2.reX);
            }
            lil2.reZ = Float.valueOf(0.0f);
        }
        if (bl) {
            this.dim = true;
        }
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 12812: {
                this.a((eeg)dxq2);
                break;
            }
            case 12549: {
                this.b((fay)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void fo(ldv ldv2) {
        eef eef2 = (eef)this.MessageDelegator.h(12811, this.GUID, ldv2);
        this.MessageDelegator.F(eef2);
    }

    private void hg(ldv ldv2) {
        bgd bgd2;
        int n;
        int n2 = 0;
        bgd[] bgdArray = new bgd[this.dig.size()];
        for (bgd object : this.dig.values()) {
            bgdArray[n2++] = object.aox();
        }
        n2 = 0;
        bge[] bgeArray = new bge[this.dih.size()];
        for (bge bge2 : this.dih.values()) {
            bgeArray[n2++] = bge2.aoA();
        }
        int n3 = bgdArray.length - 1;
        boolean bl = false;
        while (!bl) {
            int n4;
            bl = true;
            for (n = 0; n < n4; ++n) {
                if (!(bgdArray[n].aou() < bgdArray[n + 1].aou())) continue;
                bgd2 = bgdArray[n + 1];
                bgdArray[n + 1] = bgdArray[n];
                bgdArray[n] = bgd2;
                bl = false;
            }
            --n4;
        }
        int n5 = bgeArray.length - 1;
        bl = false;
        while (!bl) {
            int n6;
            bl = true;
            for (n = 0; n < n6; ++n) {
                if (!(bgeArray[n].aou() < bgeArray[n + 1].aou())) continue;
                bgd2 = bgeArray[n + 1];
                bgeArray[n + 1] = bgeArray[n];
                bgeArray[n] = bgd2;
                bl = false;
            }
            --n6;
        }
        faz faz2 = (faz)this.MessageDelegator.h(12550, this.Rs, ldv2);
        faz2.hC(this.Rs);
        faz2.iU(this.dio);
        faz2.cj(this.din);
        faz2.a(bgeArray);
        faz2.b(bgdArray);
        this.MessageDelegator.F(faz2);
    }

    private void a(eeg eeg2) {
        Object object;
        lfs<Float, Boolean> lfs2 = this.dij.remove(eeg2.aO());
        if (lfs2 == null) {
            return;
        }
        lfs<eeg, Double> lfs3 = this.dii.get(eeg2.aO());
        if (lfs3 == null) {
            lfs3 = new lfs<eeg, Double>(eeg2, 0.0);
            this.dii.put(eeg2.aO(), lfs3);
        }
        lfs3.reX = eeg2;
        lfs3.reY = this.MessageDelegator.arc().rgz;
        bgd bgd2 = this.dig.get(eeg2.aO());
        if (bgd2 == null) {
            bgd2 = new bgd(eeg2.aO(), eeg2.iP() + " " + eeg2.iR(), 0.0f, false);
            this.dig.put(eeg2.aO(), bgd2);
        }
        bgd2.dg(eeg2.kv());
        bgd2.a(((Float)lfs2.reX).floatValue(), bgd2.getGUID(), bgd2.getName(), (Boolean)lfs2.reY);
        if (eeg2.iG() != null) {
            object = this.dih.get(eeg2.iG());
            if (object == null) {
                object = new bge(eeg2.iG(), eeg2.iV(), new bgd[0]);
                this.dih.put(eeg2.iG(), (bge)object);
            }
            ((bge)object).a(((Float)lfs2.reX).floatValue(), eeg2.aO(), eeg2.iP() + " " + eeg2.iR(), (Boolean)lfs2.reY);
        }
        if (!(this.dik.isEmpty() && this.diq.isEmpty() || !this.dij.isEmpty())) {
            while (!this.diq.isEmpty()) {
                this.hg(this.diq.poll());
            }
            while (!this.dik.isEmpty()) {
                object = this.dik.poll();
                this.hg(((dxq)object).aO());
                if (!((fay)object).bNZ()) continue;
                this.anh();
            }
            if (this.dil) {
                this.anh();
            }
            this.dil = false;
        }
    }

    private void b(fay fay2) {
        if (!this.dij.isEmpty()) {
            this.dik.add(fay2);
        } else {
            this.hg(fay2.aO());
            if (fay2.bNZ()) {
                this.anh();
            }
        }
        if (fay2.bOa() > 0.0f) {
            for (lil<ldv, Float, Float> lil2 : this.dip) {
                if (!((ldv)lil2.reX).equals(fay2.aO())) continue;
                return;
            }
            this.dip.add(new lil<ldv, Float, Float>(fay2.aO(), Float.valueOf(fay2.bOa()), Float.valueOf(0.0f)));
        }
    }
}

