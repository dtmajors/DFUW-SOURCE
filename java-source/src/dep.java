/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dgj
 *  dta
 */
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class dep
extends btk
implements bto {
    protected boolean dwG = false;
    private int gmF = 1;
    private int gmG = 0;
    private static Map<Integer, dgj> gmH = lea.bkO();
    private Map<ldv, dgj> gmI = lcn.emw();
    private lid<dgj> gmJ = new lid();
    private lid<dgj> gmK = new lid();
    private Map<ldv, dgj> gmL = lcn.emw();
    private List<dgj> gmM = lcn.emv();
    private Set gmN = lcn.emx();
    protected boolean gmO = false;
    private lhw gmP;

    public static final Map<Integer, dgj> bkO() {
        return gmH;
    }

    public void bkP() {
    }

    @Override
    public void doTick(ldz ldz2) {
        this.af(ldz2);
        this.ag(ldz2);
    }

    protected void af(ldz ldz2) {
        if (this.gmO) {
            return;
        }
        this.ai(ldz2);
        this.bkR();
        this.ah(ldz2);
        this.bkS();
    }

    public int bkQ() {
        return this.gmL.size();
    }

    @Override
    public void initialize() {
        super.initialize();
        dey.c(this.MessageDelegator);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 1027: {
                this.handleObjectRemoveMessage((fub)dxq2);
                break;
            }
            case 13057: {
                this.a((glh)dxq2);
                break;
            }
            case 13058: {
                this.a((glj)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    protected final dgj mC(ldv ldv2) {
        return this.gmL.get(ldv2);
    }

    protected final dgj zX(int n2) {
        dgj dgj2 = gmH.get(n2);
        if (dgj2 == null) {
            return null;
        }
        dgj dgj3 = dgj2.createCopy();
        dgj3.setServerObject(false);
        return dgj3;
    }

    protected final void jW(ldv ldv2) {
        if (this.mE(ldv2)) {
            return;
        }
        if (this.mD(ldv2)) {
            return;
        }
        if (this.gmO) {
            this.MessageDelegator.oa(ldv2);
            return;
        }
    }

    protected final void a(dgj dgj2) {
        assert (dgj2 != null);
        if (this instanceof deq) {
            if (!del.giw) {
                return;
            }
            dgj2.setServerObject(false);
        } else {
            dgj2.setServerObject(true);
        }
        ++this.gmF;
        dgj2.setEffectInstanceID(this.gmF);
        if (dgj2.getGUID() == null) {
            dgj2.setGUID(this.MessageDelegator.bzv());
        }
        this.gmI.put(dgj2.getGUID(), dgj2);
        assert (dgj2.getStartTime() != null);
        assert (dgj2.getStartTime().rgz >= 0.1);
        this.gmJ.a(dgj2.getStartTime().rgz, dgj2);
        if (dgj2.getGUID().enw() != this.GUID.enw()) {
            ldv ldv2 = dgj2.getGUID().bFk();
            if (((dta)this.MessageDelegator).bzt().od(ldv2) == null) {
                ((dta)this.MessageDelegator).bzt().a(ldv2);
            }
        }
    }

    protected void ag(ldz ldz2) {
        if (this.gmL.isEmpty()) {
            return;
        }
        for (dgj dgj2 : this.gmL.values()) {
            dgj2.doTick(ldz2);
        }
    }

    private void ah(ldz ldz2) {
        List<dgj> list = this.gmK.eh(ldz2.rgz);
        if (list == null) {
            return;
        }
        for (dgj dgj2 : list) {
            assert (!dgj2.hasInfiniteDuration());
            if (dgj2.getState() != 5) {
                // empty if block
            }
            this.gmL.remove(dgj2.getGUID());
            this.b(dgj2);
        }
    }

    protected void b(dgj dgj2) {
        if (this.gmO) {
            this.MessageDelegator.oa(dgj2.getGUID());
            return;
        }
        if (dgj2.getGUID().enw() == this.GUID.enw()) {
            this.MessageDelegator.hd(dgj2.getGUID());
            return;
        }
        fub fub2 = (fub)this.MessageDelegator.h(1027, this.GUID, dgj2.getGUID());
        fub2.HX(fub.iHB);
        this.MessageDelegator.F(fub2);
    }

    private void ai(ldz ldz2) {
        List<dgj> list = this.gmJ.eh(ldz2.rgz);
        if (list == null) {
            return;
        }
        for (dgj dgj2 : list) {
            this.gmI.remove(dgj2.getGUID());
            if (!dgj2.hasInfiniteDuration()) {
                if (dgj2.getAudioDuration() != null) {
                    this.gmM.add(dgj2);
                } else {
                    this.gmK.a(dgj2.getStartTime().rgz + (double)dgj2.getDuration() + (double)dgj2.getEffectDelayTime(), dgj2);
                }
            }
            this.gmL.put(dgj2.getGUID(), dgj2);
            if (this.gmO) continue;
            this.MessageDelegator.a((amf)dgj2);
        }
    }

    private void bkR() {
        Iterator<dgj> iterator = this.gmM.iterator();
        while (iterator.hasNext()) {
            dgj dgj2 = iterator.next();
            if (dgj2.getAudioDuration().floatValue() == -1.0f) continue;
            double d2 = dgj2.getDuration();
            if (dgj2.getAudioDuration().doubleValue() > d2) {
                d2 = dgj2.getAudioDuration().doubleValue();
            }
            this.gmK.a(dgj2.getStartTime().rgz + d2 + (double)dgj2.getEffectDelayTime(), dgj2);
            iterator.remove();
        }
    }

    private void bkS() {
        if (this.gmN.isEmpty()) {
            return;
        }
        Iterator iterator = this.gmN.iterator();
        while (iterator.hasNext()) {
            ldv ldv2 = (ldv)iterator.next();
            dgj dgj2 = this.mC(ldv2);
            if (dgj2 == null) {
                iterator.remove();
                continue;
            }
            if (dgj2.getState() != 5) continue;
            iterator.remove();
            this.b(dgj2);
        }
    }

    @Override
    protected final void handleObjectRemoveMessage(fub fub2) {
        if (fub2.Rs == null) {
            return;
        }
        if (fub2.oq().equals(this.GUID)) {
            return;
        }
        this.jW(fub2.Rs);
    }

    protected void a(glh glh2) {
        Object object;
        dgj dgj2 = this.zX(glh2.getSpecialEffectType());
        if (dgj2 == null) {
            return;
        }
        if (glh2.bjZ() != null) {
            dgj2.setGUID(glh2.bjZ());
        }
        dgj2.setTargetObjectGUID(glh2.getTargetObjectGUID());
        dgj2.setTargetPosition(glh2.getTargetPosition());
        if (dgj2.isMainEffect()) {
            if (dgj2.getTargetObjectGUID() != null) {
                // empty if block
            }
            object = this.MessageDelegator.bzv();
            dgj2.setTargetObjectGUID((ldv)object);
        } else if (dgj2.getTargetObjectGUID() == null) {
            return;
        }
        if (glh2.bVL() > 0) {
            int n2 = glh2.bVL();
            if ((n2 & 1) > 0) {
                if (glh2.getSourceObjectGUID() == null) {
                    return;
                }
                dgj2.setSourceObjectGUID(glh2.getSourceObjectGUID());
            }
            if ((n2 & 2) > 0) {
                if (glh2.getSourcePosition() == null) {
                    return;
                }
                dgj2.setSourcePosition(glh2.getSourcePosition());
            }
            if ((n2 & 4) > 0) {
                if (glh2.getSourceRotation() == null) {
                    return;
                }
                dgj2.setSourceRotation(glh2.getSourceRotation());
            }
            if ((n2 & 8) > 0) {
                if ((double)glh2.getDuration() <= 0.0 && glh2.getDuration() != -2.0f) {
                    return;
                }
                dgj2.setDuration((double)glh2.getDuration());
            }
            if ((n2 & 0x10) > 0) {
                if (glh2.getPower() <= 0.0f || glh2.getPower() > 1.0f) {
                    return;
                }
                dgj2.setPower(glh2.getPower());
            }
            if ((n2 & 0x20) > 0) {
                dgj2.setTargetObjectExistsInEngineOnly(true);
            }
        }
        object = null;
        object = glh2.bVJ() ? new ldz(0.0, this.MessageDelegator.arc().rgz + glh2.aAw(), 0) : this.MessageDelegator.arc();
        dgj2.setStartTime((ldz)object);
        this.a(dgj2);
        if (glh2.bVK()) {
            glb glb2 = (glb)this.MessageDelegator.h(13059, this.GUID, glh2.aO());
            glb2.aUa = dgj2.getGUID();
            if (dgj2.isMainEffect()) {
                glb2.gxp = dgj2.getTargetObjectGUID();
            }
            this.MessageDelegator.b(glh2, glb2);
            this.MessageDelegator.F(glb2);
        }
    }

    private void a(glj glj2) {
        switch (glj2.jkV) {
            case 1: {
                this.jW(glj2.aUa);
                break;
            }
            case 2: {
                for (dgj dgj2 : this.gmL.values()) {
                    this.b(dgj2);
                }
                this.gmL.clear();
                this.gmK.clear();
                this.gmI.clear();
                this.gmJ.clear();
                break;
            }
            default: {
                return;
            }
        }
    }

    private boolean mD(ldv ldv2) {
        dgj dgj2 = this.gmL.remove(ldv2);
        if (dgj2 == null) {
            return false;
        }
        if (!dgj2.hasInfiniteDuration()) {
            this.gmK.b(dgj2.getStartTime().rgz + (double)dgj2.getDuration(), dgj2);
        }
        this.b(dgj2);
        return true;
    }

    private boolean mE(ldv ldv2) {
        dgj dgj2 = this.gmI.remove(ldv2);
        if (dgj2 != null) {
            this.gmJ.b(dgj2.getStartTime().rgz, dgj2);
            return true;
        }
        return false;
    }
}

