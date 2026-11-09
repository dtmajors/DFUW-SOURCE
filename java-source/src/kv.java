/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ha
 */
public class kv
extends jl {
    private final amf asd;

    public kv(amf amf2) {
        this.asd = amf2;
        this.a(kt.class);
        this.a(kk.class);
        this.a(kn.class);
        this.a(kd.class);
        this.a(kq.class);
        this.a(kc.class);
        this.a(kj.class);
        this.a(kr.class);
        this.a(ki.class);
        this.a(kh.class);
        this.a(kp.class);
        this.a(kf.class);
        this.a(kg.class);
        this.a(kb.class);
        lea.epN();
        if (cid.eAW) {
            // empty if block
        }
        this.a(ku.class);
        this.nZ();
    }

    @Override
    protected hc hf() {
        if (this.asd instanceof ha) {
            return ((ha)this.asd).jT();
        }
        if (this.asd instanceof hy) {
            return ((hy)this.asd).jT();
        }
        return hc.aaz;
    }

    @Override
    protected void a(jm jm2) {
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 29697: {
                this.a((ewv)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(ewv ewv2) {
        for (jm jm2 : this.alb.values()) {
            ewr ewr2 = (ewr)this.MessageDelegator.h(29698, this.getGUID(), ewv2.aO());
            ewr2.akV = jm2.akV;
            ewr2.alg = jm2.alg;
            ewr2.aqs = ewv2.aqs;
            ewr2.a(jm2.SC);
            ewr2.a(jm2.alf);
            ewr2.iEx = jm2.alh.getIdentifier();
            this.MessageDelegator.E(ewr2);
        }
    }
}

