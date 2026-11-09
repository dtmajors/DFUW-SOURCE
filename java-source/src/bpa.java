/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
public class bpa
extends btk {
    @Override
    public void receiveMessage(dxq dxq2) {
        super.receiveMessage(dxq2);
    }

    public void a(String string, ldv ldv2, ldv ldv3, ljq ljq2, ljq ljq3, ldv ldv4) {
        int n = del.dr(string);
        glh glh2 = (glh)this.MessageDelegator.h(13057, this.getGUID(), lcr.qEb);
        glh2.setSpecialEffectType(n);
        glh2.setSourceObjectGUID(ldv2);
        glh2.setTargetObjectGUID(ldv3);
        glh2.setTargetPosition(ljq2);
        glh2.setSourcePosition(ljq3);
        glh2.JQ(3);
        this.MessageDelegator.F(glh2);
    }

    public void a(String string, ldv ldv2, ldv ldv3) {
        assert (ldv2 != null);
    }

    public void a(ldv ldv2, ljq ljq2, ldv ldv3, dty dty2, ldv ldv4) {
        int n = del.dr(dty2.QuestStartSourceSpecialEffect);
        if (n > 0) {
            this.a(n, ldv2, ljq2, ldv3);
        }
        if ((n = del.dr(dty2.QuestStartTargetSpecialEffect)) > 0) {
            this.a(n, ldv2, ljq2, ldv3);
        }
        if ((n = del.dr(dty2.QuestStartClientSpecialEffect)) > 0) {
            this.b(n, ldv2, ljq2, ldv4);
        }
    }

    public void b(ldv ldv2, ljq ljq2, ldv ldv3, dty dty2, ldv ldv4) {
        int n = del.dr(dty2.QuestEndSourceSpecialEffect);
        if (n > 0) {
            this.a(n, ldv2, ljq2, ldv3);
        }
        if ((n = del.dr(dty2.QuestEndTargetSpecialEffect)) > 0) {
            this.a(n, ldv2, ljq2, ldv3);
        }
        if ((n = del.dr(dty2.QuestEndClientSpecialEffect)) > 0) {
            this.b(n, ldv2, ljq2, ldv4);
        }
    }

    public void a(ldv ldv2, ljq ljq2, ldv ldv3, dty dty2, int n, ldv ldv4) {
        due due2 = dty2.Ce(n);
        assert (due2 != null);
        int n2 = del.dr(due2.QuestStartSourceSpecialEffect);
        if (n2 > 0) {
            this.a(n2, ldv2, ljq2, ldv3);
        }
        if ((n2 = del.dr(due2.QuestStartTargetSpecialEffect)) > 0) {
            this.a(n2, ldv2, ljq2, ldv3);
        }
        if ((n2 = del.dr(due2.QuestStartClientSpecialEffect)) > 0) {
            this.b(n2, ldv2, ljq2, ldv4);
        }
    }

    public void b(ldv ldv2, ljq ljq2, ldv ldv3, dty dty2, int n, ldv ldv4) {
        due due2 = dty2.Ce(n);
        assert (due2 != null);
        int n2 = del.dr(due2.QuestEndSourceSpecialEffect);
        if (n2 > 0) {
            this.a(n2, ldv2, ljq2, ldv3);
        }
        if ((n2 = del.dr(due2.QuestEndTargetSpecialEffect)) > 0) {
            this.a(n2, ldv2, ljq2, ldv3);
        }
        if ((n2 = del.dr(due2.QuestEndClientSpecialEffect)) > 0) {
            this.b(n2, ldv2, ljq2, ldv4);
        }
    }

    private void a(int n, ldv ldv2, ljq ljq2, ldv ldv3) {
        glh glh2 = (glh)this.MessageDelegator.h(13057, this.getGUID(), lcr.qEb);
        glh2.setSpecialEffectType(n);
        glh2.setSourceObjectGUID(ldv3);
        glh2.setTargetObjectGUID(ldv2);
        glh2.setTargetPosition(ljq2);
        glh2.setSourcePosition(ljq2);
        glh2.JQ(1);
        this.MessageDelegator.F(glh2);
    }

    private void b(int n, ldv ldv2, ljq ljq2, ldv ldv3) {
        ldv ldv4 = this.MessageDelegator.lL(lcr.qzx);
        dek dek2 = new dek();
        dek2.aZF = 3;
        dek2.SpecialEffectType = n;
        dek2.oV = this.MessageDelegator.arc().rgz;
        dek2.aZG = ldv2;
        dek2.aZH = ljq2;
        dek2.akX = ldv2;
        dek2.aZD = ljq2;
        ldv ldv5 = lcr.ak((ldv)lcr.qEb, (int)ldv3.ib());
        gli gli2 = (gli)this.MessageDelegator.h(13062, this.getGUID(), ldv5);
        gli2.jkO = dek2;
        gli2.aUa = lcr.p((ldv)ldv4, (int)ldv3.ib(), (int)ldv2.enw());
        this.MessageDelegator.F(gli2);
    }
}

