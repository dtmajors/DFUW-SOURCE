/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  iba
 *  lcr
 *  lcw
 */
import java.util.List;

public class hzm
extends hzl
implements bto {
    private List<iax> lwl = lcn.emv();
    private int lwm = -1;
    private iba lwn;
    private lie lwo;
    private ibc lwp;
    private iaw lwq;
    private ibd lwr;
    private ibe lws;
    private ibb lwt;
    private boolean lwu = false;

    @Override
    public void initialize() {
        super.initialize();
        this.lwn = new iba(this);
        this.lwn.setGUID(lcr.qEp);
        this.MessageDelegator.a((amf)this.lwn);
    }

    @Override
    public void cleanUp() {
        this.cHr();
        if (this.lwn != null) {
            this.MessageDelegator.hd(this.lwn.getGUID());
        }
        super.cleanUp();
    }

    @Override
    public void cHi() {
        this.lwp = new ibc(this.lwn);
        this.lwp.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a((amf)((Object)this.lwp));
        this.lwp.setVisible(false);
        this.lwl.add(this.lwp);
        this.lwq = new iaw(this.lwn);
        this.lwq.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a((amf)((Object)this.lwq));
        this.lwq.setVisible(false);
        this.lwl.add(this.lwq);
        if (!lcw.aQH()) {
            this.lwr = new ibd(this.lwn);
            this.lwr.setGUID(this.MessageDelegator.bzv());
            this.MessageDelegator.a((amf)((Object)this.lwr));
            this.lwr.setVisible(false);
            this.lwl.add(this.lwr);
            this.lws = new ibe(this.lwn);
            this.lws.setGUID(this.MessageDelegator.bzv());
            this.MessageDelegator.a((amf)((Object)this.lws));
            this.lws.setVisible(false);
            this.lwl.add(this.lws);
        }
        this.lwt = new ibb(this.lwn);
        this.lwt.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a((amf)((Object)this.lwt));
        this.lwt.setVisible(false);
        this.lwl.add(this.lwt);
        this.lwm = 0;
        this.lwl.get(this.lwm).setVisible(true);
        grg grg2 = (grg)this.MessageDelegator.h(11072, this.GUID, lcr.qAG);
        grg2.jqh = false;
        this.MessageDelegator.F(grg2);
    }

    @Override
    protected void cHj() {
        this.cHr();
        if (this.lwp != null) {
            this.MessageDelegator.hd(this.lwp.getGUID());
        }
        if (this.lwq != null) {
            this.MessageDelegator.hd(this.lwq.getGUID());
        }
        if (this.lwr != null) {
            this.MessageDelegator.hd(this.lwr.getGUID());
        }
        if (this.lws != null) {
            this.MessageDelegator.hd(this.lws.getGUID());
        }
        if (this.lwt != null) {
            this.MessageDelegator.hd(this.lwt.getGUID());
        }
    }

    @Override
    public boolean op() {
        return this.lwn != null && this.lwn.op();
    }

    public int cHp() {
        return this.lwm;
    }

    public iax cHq() {
        return this.lwl.get(this.lwm);
    }

    public void goToNextScreen() {
        if (this.lwm < this.lwl.size() - 1) {
            this.lwl.get(this.lwm).pB(false);
            this.lwl.get(this.lwm++).setVisible(false);
            this.lwl.get(this.lwm).setVisible(true);
            if (this.lwl.get(this.lwm) instanceof ibb) {
                ibb ibb2 = (ibb)this.lwl.get(this.lwm);
                ibb2.cMh();
            }
            this.lwn.a(this.lwl.get(this.lwm).cLv());
            this.startTimer();
        }
    }

    public void goToPreviousScreen() {
        if (this.lwm > 0) {
            this.lwl.get(this.lwm).pB(false);
            this.lwl.get(this.lwm--).setVisible(false);
            this.lwl.get(this.lwm).setVisible(true);
            this.lwn.a(this.lwl.get(this.lwm).cLv());
            this.startTimer();
        }
    }

    private void cHr() {
        if (this.lwl != null) {
            this.lwl.clear();
        }
    }

    private void startTimer() {
        this.lwo = new lie(this, 1.0, false){
            final /* synthetic */ hzm lwv;
            {
                this.lwv = hzm2;
                super(d2, bl);
            }

            public void dh(double d2) {
                if (hzm.a(this.lwv) < hzm.b(this.lwv).size()) {
                    ((iax)((Object)hzm.b(this.lwv).get(hzm.a(this.lwv)))).pB(true);
                }
            }
        };
        this.lwo.e(this.MessageDelegator);
    }

    @Override
    public void cHn() {
        super.cHn();
        if (this.lwn != null) {
            this.lwn.cHn();
        }
        this.lwu = true;
    }

    @Override
    public void cHo() {
        super.cHo();
        if (this.lwn != null) {
            this.lwn.cHo();
        }
    }

    @Override
    public void doTick(ldz ldz2) {
        if (this.lwu && this.lwq != null) {
            this.lwu = false;
            if (this.lwp != null) {
                this.lwp.cHn();
            }
            if (this.lwq != null) {
                this.lwq.cHn();
            }
            if (this.lwr != null) {
                this.lwr.cHn();
            }
            if (this.lws != null) {
                this.lws.cHn();
            }
            if (this.lwt != null) {
                this.lwt.cHn();
            }
        }
    }

    static /* synthetic */ int a(hzm hzm2) {
        return hzm2.lwm;
    }

    static /* synthetic */ List b(hzm hzm2) {
        return hzm2.lwl;
    }
}

