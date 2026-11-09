/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ha
 *  lcr
 */
import java.util.Iterator;
import java.util.Map;

public class hj
extends btk {
    private static final String TC = "SFPlayerSocialMentoringManager";
    private final ha hF;
    private ldv acL = null;
    private a acQ = null;
    private b acR = null;
    private boolean acS = false;
    private double acT = -1.0;

    public hj(ha ha2) {
        this.hF = ha2;
    }

    private void N(boolean bl) {
        if (this.acS) {
            this.hF.c(mch.uum.bD(new Object[0]));
            return;
        }
        float f2 = this.hF.kA();
        if (f2 < (float)ls.py()) {
            lfn.b(5, "SFPlayerSocialMentoringManager sendRegistrationUpdateMessage() ", " Player : " + this.hF.getGUID() + " has :" + f2 + " and should have at least : " + ls.py());
            this.hF.c(mch.uuz.bD(new Object[0]));
            assert (false);
            return;
        }
        if (this.acQ != null && this.acQ.acW) {
            lfn.b(5, "SFPlayerSocialMentoringManager sendRegistrationUpdateMessage() ", " Player : " + this.hF.getGUID() + " is blacklisted.");
            this.hF.c(mch.uuA.bD(new Object[0]));
            return;
        }
        if (this.acR != null) {
            if (!this.acR.adg) {
                lfn.b(5, "SFPlayerSocialMentoringManager sendRegistrationUpdateMessage() ", " Player : " + this.hF.getGUID() + " is an apprentice of mentor : " + this.acR.adb + ". THIS SHOULD NOT HAPPEN.");
                this.hF.c(mch.uuq.bD(new Object[0]));
                assert (false);
            } else {
                this.hF.c(mch.uuO.bD(this.acR.adb));
            }
            return;
        }
        if (this.acQ != null) {
            if (bl && this.acQ.acV) {
                lfn.b(5, "SFPlayerSocialMentoringManager sendRegistrationUpdateMessage() ", " Player : " + this.hF.getGUID() + " is already registered as a mentor");
                this.hF.c(mch.uuB.bD(new Object[0]));
                return;
            }
            if (!bl && !this.acQ.acV) {
                lfn.b(5, "SFPlayerSocialMentoringManager sendRegistrationUpdateMessage() ", " Player : " + this.hF.getGUID() + " is not registered as a mentor");
                this.hF.c(mch.uuC.bD(new Object[0]));
                return;
            }
        }
        this.acS = true;
        fqv fqv2 = (fqv)this.MessageDelegator.h(34305, this.hF.getGUID(), lcr.hac);
        fqv2.jT(bl);
        fqv2.P(this.hF.iP());
        fqv2.Q(this.hF.iR());
        this.MessageDelegator.E(fqv2);
    }

    private void a(fqw fqw2) {
        assert (this.acS);
        this.acS = false;
        ls.b b2 = ls.b.getValueByOrdinal(fqw2.getResult());
        switch (b2) {
            case awc: {
                this.hF.c(mch.uuB.bD(new Object[0]));
                assert (false);
                return;
            }
            case awd: {
                this.hF.c(mch.uuA.bD(new Object[0]));
                return;
            }
            case awl: {
                this.hF.c(mch.uul.bD(new Object[0]));
                assert (false);
                return;
            }
            case awe: {
                this.lU();
                return;
            }
            case awf: {
                this.hF.c(mch.uuC.bD(new Object[0]));
                return;
            }
            case awg: {
                this.hF.c(mch.uuF.bD(new Object[0]));
                return;
            }
            case awh: {
                this.lV();
                return;
            }
        }
        assert (false) : "Unhandled operation result : " + (Object)((Object)b2);
    }

    private void lS() {
        if (!ls.pL()) {
            lfn.b(5, "SFPlayerSocialMentoringManager sendMentorRequest() ", " Player :" + this.hF.getGUID() + " can not request a mentor because system is disabled for apprentices.");
            this.hF.c(mch.uul.bD(new Object[0]));
            assert (false);
            return;
        }
        if (this.acS) {
            this.hF.c(mch.uum.bD(new Object[0]));
            return;
        }
        if (this.acQ != null) {
            lfn.b(5, "SFPlayerSocialMentoringManager sendMentorRequest() ", " Player :" + this.hF.getGUID() + " is registered as a mentor. CAN NOT HAPPEN");
            this.hF.c(mch.uuJ.bD(new Object[0]));
            assert (false);
            return;
        }
        float f2 = this.hF.kA();
        if (f2 > (float)ls.pz()) {
            lfn.b(5, "SFPlayerSocialMentoringManager sendMentorRequest() ", " Player :" + this.hF.getGUID() + " has :" + f2 + " and should have at most : " + ls.pz());
            this.hF.c(mch.uuo.bD(new Object[0]));
            assert (false);
            return;
        }
        if (this.acR != null) {
            lfn.b(5, "SFPlayerSocialMentoringManager sendMentorRequest() ", " Player :" + this.hF.getGUID() + " is already an apprentice of mentor : " + this.acR.adb);
            this.hF.c(mch.uur.bD(new Object[0]));
            return;
        }
        this.acS = true;
        fqx fqx2 = (fqx)this.MessageDelegator.h(34307, this.hF.getGUID(), lcr.hac);
        fqx2.oH(this.hF.getGUID());
        fqx2.P(this.hF.iP());
        fqx2.Q(this.hF.iR());
        fqx2.K(this.hF.kA());
        this.MessageDelegator.E(fqx2);
    }

    private void a(fqy fqy2) {
        assert (this.acS);
        this.acS = false;
        ls.b b2 = ls.b.getValueByOrdinal(fqy2.getResult());
        switch (b2) {
            case avZ: {
                this.hF.c(mch.uus.bD(new Object[0]));
                return;
            }
            case awa: {
                this.hF.c(mch.uur.bD(new Object[0]));
                assert (false);
                return;
            }
            case awb: {
                this.a(fqy2.qe(), fqy2.cz(), fqy2.cA());
                break;
            }
            default: {
                assert (false) : "Unhandled Result : " + (Object)((Object)b2);
                return;
            }
        }
    }

    private void aO(ldv ldv2) {
        if (this.acR == null) {
            lfn.b(5, "SFPlayerSocialMentoringManager handleMentorCancelRequest() ", " Player :" + this.hF.getGUID() + " does not have a mentor.");
            this.hF.c(mch.trU.bD(new Object[0]));
            return;
        }
        if (!ldv2.equals(this.acR.Ri)) {
            lfn.b(5, "SFPlayerSocialMentoringManager handleMentorCancelRequest() ", " Player :" + this.hF.getGUID() + " does not have as a mentor player : " + this.acR.Ri);
            this.hF.c(mch.uul.bD(new Object[0]));
            assert (false);
            return;
        }
        if (this.acT != -1.0 && this.acT < this.MessageDelegator.arc().rgz + ls.pC()) {
            lfn.b(5, "SFPlayerSocialMentoringManager handleMentorCancelRequest() ", " Player :" + this.hF.getGUID() + " can not cancel a mentor at this moment.");
            this.hF.c(mch.uuu.bD(new Object[0]));
            return;
        }
        if (this.acS) {
            this.hF.c(mch.uum.bD(new Object[0]));
            return;
        }
        this.acT = this.MessageDelegator.arc().rgz;
        this.acS = true;
        fql fql2 = (fql)this.MessageDelegator.h(34309, this.hF.getGUID(), lcr.hac);
        fql2.EW(ls.a.avP.ordinal());
        fql2.jh(this.hF.kA());
        this.MessageDelegator.E(fql2);
    }

    private void aP(ldv ldv2) {
        if (this.acQ == null) {
            lfn.b(5, "SFPlayerSocialMentoringManager handleApprenticeCancelRequest() ", " Player :" + this.hF.getGUID() + " is not a mentor.");
            this.hF.c(mch.uul.bD(new Object[0]));
            assert (false);
            return;
        }
        if (!this.acQ.acZ.containsKey(ldv2)) {
            lfn.b(5, "SFPlayerSocialMentoringManager handleApprenticeCancelRequest() ", " Mentor :" + this.hF.getGUID() + " does not have an apprentice with GUID : " + ldv2);
            this.hF.c(mch.uuM.bD(new Object[0]));
            return;
        }
        if (this.acT != -1.0 && this.acT < this.MessageDelegator.arc().rgz + ls.pC()) {
            lfn.b(5, "SFPlayerSocialMentoringManager handleApprenticeCancelRequest() ", " Player :" + this.hF.getGUID() + " can not cancel an apprentice at this moment.");
            this.hF.c(mch.uuL.bD(new Object[0]));
            return;
        }
        if (this.acS) {
            this.hF.c(mch.uum.bD(new Object[0]));
            return;
        }
        this.acS = true;
        this.acT = this.MessageDelegator.arc().rgz;
        fql fql2 = (fql)this.MessageDelegator.h(34309, this.hF.getGUID(), lcr.hac);
        fql2.pP(ldv2);
        fql2.EW(ls.a.avQ.ordinal());
        this.MessageDelegator.E(fql2);
    }

    private void a(fqm fqm2) {
        assert (this.acS);
        this.acS = false;
        ls.b b2 = ls.b.getValueByOrdinal(fqm2.getResult());
        switch (b2) {
            case awl: {
                if (fqm2.bRs()) {
                    lfn.b(5, "SFPlayerSocialMentoringManagerhandleMentorCancelResponseMessage()", "Mentor     : " + this.hF.getGUID() + " could not cancel player : " + fqm2.qd());
                } else {
                    lfn.b(5, "SFPlayerSocialMentoringManagerhandleMentorCancelResponseMessage()", "Apprentice : " + this.hF.getGUID() + " could not cancel player : " + fqm2.qd());
                }
                this.hF.c(mch.uul.bD(new Object[0]));
                assert (false);
                break;
            }
            case awk: {
                if (fqm2.bRs()) {
                    lfn.b(5, "SFPlayerSocialMentoringManagerhandleApprenticeCancelRequest() ", "Player : " + this.hF.getGUID() + " does not have as apprentice player : " + fqm2.qd());
                    this.hF.c(mch.uuM.bD(new Object[0]));
                    break;
                }
                lfn.b(5, "SFPlayerSocialMentoringManagerhandleApprenticeCancelRequest() ", "Player " + this.hF.getGUID() + " does not have as a mentor player : " + fqm2.qd());
                this.hF.c(mch.trU.bD(new Object[0]));
                break;
            }
            case awi: {
                this.aQ(fqm2.qd());
                break;
            }
            case awj: {
                this.aR(fqm2.qd());
            }
        }
    }

    private void a(gkt gkt2) {
        int n = gkt2.ed;
        ldv ldv2 = gkt2.YN;
        String string = gkt2.YL;
        switch (n) {
            case 7: {
                this.N(true);
                break;
            }
            case 8: {
                this.N(false);
                break;
            }
            case 10: {
                this.aO(ldv2);
                break;
            }
            case 11: {
                this.aP(ldv2);
                break;
            }
            case 9: {
                this.lS();
                break;
            }
            default: {
                assert (false);
                break;
            }
        }
    }

    private void a(Map<ldv, b> map, int n) {
        if (!map.isEmpty()) {
            ldv[] ldvArray = new ldv[map.size()];
            String[] stringArray = new String[map.size()];
            boolean[] blArray = new boolean[map.size()];
            float[] fArray = new float[map.size()];
            int n2 = 0;
            Iterator<Map.Entry<ldv, b>> iterator = map.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry<ldv, b> entry = iterator.next();
                b b2 = entry.getValue();
                if (b2.Ri == null) {
                    iterator.remove();
                    assert (false);
                    continue;
                }
                ldvArray[n2] = entry.getKey();
                stringArray[n2] = b2.adb;
                blArray[n2] = b2.adc;
                fArray[n2] = b2.adf;
                ++n2;
            }
            this.a(stringArray, ldvArray, blArray, fArray, n);
        }
    }

    private void a(String[] stringArray, ldv[] ldvArray, boolean[] blArray, float[] fArray, int n) {
        gks gks2 = (gks)this.MessageDelegator.h(31490, this.getGUID(), this.acL);
        gks2.JN(n);
        gks2.o(stringArray);
        gks2.k(ldvArray);
        gks2.i(blArray);
        gks2.j(fArray);
        gks2.hsP = true;
        this.MessageDelegator.F(gks2);
    }

    private void O(boolean bl) {
        frc frc2 = (frc)this.MessageDelegator.h(34313, this.getGUID(), this.acL);
        frc2.lw(this.acT != -1.0);
        if (bl) {
            frc2.am(this.acQ != null ? this.acQ.acW : false);
            frc2.cY(this.acQ != null ? this.acQ.acX : 0);
            frc2.lx(this.acQ != null);
            frc2.ab(this.acQ != null ? this.acQ.acV : false);
            frc2.L(this.acQ != null ? this.acQ.acY : 0.0f);
        } else {
            frc2.lv(this.acR != null);
            frc2.lt(this.acR != null && this.acR.adg);
        }
        this.MessageDelegator.F(frc2);
    }

    private void lT() {
        frb frb2 = (frb)this.MessageDelegator.h(34321, this.getGUID(), this.acL);
        frb2.lu(ls.pL());
        this.MessageDelegator.F(frb2);
    }

    private void a(ldv ldv2, String string, float f2, int n, boolean bl) {
        if (string == null || ldv2 == null) {
            assert (false) : "PSOName : " + string + " PSOGUID : " + ldv2 + " for player : " + this.hF.iU() + " InfoType : " + n;
            return;
        }
        if (!this.hF.iN()) {
            return;
        }
        gkr gkr2 = (gkr)this.MessageDelegator.h(31489, this.getGUID(), this.acL);
        gkr2.DL(n);
        gkr2.fm(string);
        gkr2.oH(ldv2);
        gkr2.ac(bl);
        gkr2.K(f2);
        gkr2.hsP = true;
        this.MessageDelegator.F(gkr2);
    }

    private void a(fqz fqz2) {
        boolean bl = fqz2.bRv();
        if (bl) {
            if (this.hF.kA() < (float)ls.py()) {
                lfn.b(5, "SFPlayerSocialMentoringManagerhandleMentorRestoreMessage() ", " Player : " + this.hF.getGUID() + " can not be a mentor. PlayerPointsTotal : " + this.hF.kA() + " while the minimun is : " + ls.py());
                assert (false);
                return;
            }
            if (this.acQ != null) {
                lfn.b(5, "SFPlayerSocialMentoringManagerhandleMentorRestoreMessage() ", " Player : " + this.hF.getGUID() + " is already a mentor. SHOULD NOT HAPPEN.");
                assert (false);
                return;
            }
            this.acQ = new a(this);
            this.acQ.acW = fqz2.pT();
            this.acQ.acX = fqz2.pU();
            this.acQ.acV = fqz2.isRegistered();
            this.acQ.acY = fqz2.tY();
            String[] stringArray = fqz2.bRx();
            int[] nArray = fqz2.bRw();
            float[] fArray = fqz2.bRz();
            if (stringArray != null && nArray != null && stringArray.length > 0 && nArray.length > 0 && stringArray.length == nArray.length) {
                Map<ldv, b> map = lcn.abI(stringArray.length);
                for (int i = 0; i < stringArray.length; ++i) {
                    ldv ldv2 = lcr.abW((int)nArray[i]);
                    b b2 = new b(this);
                    b2.Ri = ldv2;
                    b2.adb = stringArray[i];
                    b2.adc = false;
                    b2.adf = fArray[i];
                    map.put(ldv2, b2);
                }
                this.acQ.acZ = map;
            }
            return;
        }
        if (fqz2.bRw() == null || fqz2.bRw().length != 1 || fqz2.bRx() == null || fqz2.bRx().length != 1) {
            lfn.b(5, "SFPlayerSocialMentoringManagerhandleMentorRestoreMessage() ", " Invalid mentor data for Player : " + this.hF.getGUID() + "FullNames : " + fqz2.bRx() + " IDS : " + fqz2.bRw());
            assert (false);
            return;
        }
        if (this.acR != null) {
            lfn.b(5, "SFPlayerSocialMentoringManagerhandleMentorRestoreMessage() ", " Player : " + this.hF.getGUID() + " has already a mentor. SHOULD NOT HAPPEN.");
            assert (false);
            return;
        }
        if (!fqz2.bRy()) {
            if (this.hF.kA() > (float)ls.pz()) {
                lfn.b(5, "SFPlayerSocialMentoringManagerhandleMentorRestoreMessage() ", " Player : " + this.hF.getGUID() + " can not be an apprentice. PlayerPointsTotal : " + this.hF.kA() + " while the maximum is : " + ls.pz());
                assert (false);
                return;
            }
        } else if (this.hF.kA() < (float)ls.pz()) {
            lfn.b(5, "SFPlayerSocialMentoringManagerhandleMentorRestoreMessage() ", " Player : " + this.hF.getGUID() + " can not be a pending rating apprentice. PlayerPointsTotal : " + this.hF.kA() + " while the minimum is : " + ls.pz());
            assert (false);
            return;
        }
        this.acR = new b(this);
        this.acR.Ri = lcr.abW((int)fqz2.bRw()[0]);
        this.acR.adb = fqz2.bRx()[0];
        this.acR.adc = false;
        this.acR.adg = fqz2.bRy();
    }

    private void a(fqn fqn2) {
        int n = fqn2.bHc();
        switch (n) {
            case 0: {
                this.a(fqn2.qe(), fqn2.cz(), fqn2.cA(), fqn2.pN(), fqn2.qf());
                break;
            }
            case 5: {
                this.aQ(lcr.abW((int)fqn2.qe()));
                break;
            }
            case 1: {
                this.i(fqn2.qe(), fqn2.qf());
                break;
            }
            case 7: {
                this.aQ(lcr.abW((int)fqn2.qe()));
                break;
            }
            case 8: {
                this.c(lcr.abW((int)fqn2.qe()), fqn2.cz(), fqn2.cA());
                break;
            }
            case 9: {
                this.c(lcr.abW((int)fqn2.qe()), fqn2.pN());
                break;
            }
            case 4: {
                this.aR(lcr.abW((int)fqn2.qe()));
                break;
            }
            case 2: {
                this.P(fqn2.qf());
                break;
            }
            case 6: {
                this.aR(lcr.abW((int)fqn2.qe()));
                break;
            }
            case 10: {
                this.d(lcr.abW((int)fqn2.qe()), fqn2.cz(), fqn2.cA());
                break;
            }
            case 3: {
                this.a(fqn2.pV(), fqn2.pT(), fqn2.pU());
                break;
            }
            case 13: {
                this.c(fqn2);
                break;
            }
            case 11: {
                this.b(fqn2);
                break;
            }
            case 12: {
                this.d(fqn2);
                break;
            }
            default: {
                assert (false) : "Unhandled type : " + n;
                break;
            }
        }
    }

    private void lU() {
        if (this.acQ == null) {
            this.acQ = new a(this);
        }
        this.acQ.acV = true;
        this.hF.c(mch.uuD.bD(new Object[0]));
        this.O(true);
    }

    private void lV() {
        assert (this.acQ != null);
        this.acQ.acV = false;
        this.hF.c(mch.uuE.bD(new Object[0]));
        this.O(true);
    }

    private void a(int n, String string, String string2, float f2, boolean bl) {
        if (this.acQ == null) {
            lfn.b(5, "SFPlayerSocialMentoringManager apprenticeAdded() ", " Player :" + this.hF.getGUID() + " is not a mentor");
            assert (false);
            return;
        }
        if (!this.acQ.acV) {
            lfn.b(5, "SFPlayerSocialMentoringManager apprenticeAdded() ", " Player :" + this.hF.getGUID() + " is not registered as a mentor");
            assert (false);
            return;
        }
        float f3 = this.hF.kA();
        if (f3 < (float)ls.py()) {
            lfn.b(5, "SFPlayerSocialMentoringManager apprenticeAdded() ", " Player :" + this.hF.getGUID() + " has :" + f3 + " and should have at least : " + ls.py());
            assert (false);
            return;
        }
        ldv ldv2 = lcr.abW((int)n);
        if (this.acQ.acZ.containsKey(ldv2)) {
            lfn.b(5, "SFPlayerSocialMentoringManager apprenticeAdded() ", " Player :" + this.hF.getGUID() + " has already as an apprentice player : " + ldv2);
            assert (false);
            return;
        }
        b b2 = new b(this);
        b2.adb = string + " " + string2;
        b2.adc = bl;
        b2.Ri = ldv2;
        b2.adf = f2;
        this.acQ.acZ.put(ldv2, b2);
        this.a(b2.Ri, b2.adb, b2.adf, 25, b2.adc);
    }

    private void aQ(ldv ldv2) {
        if (this.acQ == null) {
            lfn.b(5, "SFPlayerSocialMentoringManager apprenticeRemoved()", " Player :" + this.hF.getGUID() + " is not a mentor.");
            assert (false);
            return;
        }
        float f2 = this.hF.kA();
        if (f2 < (float)ls.py()) {
            lfn.b(5, "SFPlayerSocialMentoringManager apprenticeRemoved()", " Player :" + this.hF.getGUID() + " has :" + f2 + " and should have at least : " + ls.py());
            assert (false);
            return;
        }
        b b2 = this.acQ.acZ.remove(ldv2);
        if (b2 == null) {
            lfn.b(5, "SFPlayerSocialMentoringManager apprenticeRemoved()", " Player :" + this.hF.getGUID() + " does not have as an apprentice player : " + ldv2);
            return;
        }
        this.a(b2.Ri, b2.adb, b2.adf, 26, b2.adc);
    }

    private void i(int n, boolean bl) {
        if (this.acQ == null) {
            lfn.b(5, "SFPlayerSocialMentoringManager apprenticeStatusUpdate() ", " Player :" + this.hF.getGUID() + " is not a mentor");
            assert (false);
            return;
        }
        float f2 = this.hF.kA();
        if (f2 < (float)ls.py()) {
            lfn.b(5, "SFPlayerSocialMentoringManager apprenticeStatusUpdate() ", " Player :" + this.hF.getGUID() + " has " + f2 + " and should have at least : " + ls.py());
            assert (false);
            return;
        }
        ldv ldv2 = lcr.abW((int)n);
        b b2 = this.acQ.acZ.get(ldv2);
        if (b2 == null) {
            lfn.b(5, "SFPlayerSocialMentoringManager apprenticeStatusUpdate() ", " Player :" + this.hF.getGUID() + " has not as an apprentice, player : " + ldv2);
            assert (false);
            return;
        }
        b2.adc = bl;
        this.a(b2.Ri, b2.adb, b2.adf, 27, b2.adc);
    }

    private void c(ldv ldv2, String string, String string2) {
        if (this.acQ == null) {
            lfn.b(5, "SFPlayerSocialMentoringManager apprenticeRenamed() ", " Player :" + this.hF.getGUID() + " is not a mentor");
            assert (false);
            return;
        }
        float f2 = this.hF.kA();
        if (f2 < (float)ls.py()) {
            lfn.b(5, "SFPlayerSocialMentoringManager apprenticeRenamed() ", " Player :" + this.hF.getGUID() + " has " + f2 + " and should have at least : " + ls.py());
            assert (false);
            return;
        }
        b b2 = this.acQ.acZ.get(ldv2);
        if (b2 == null) {
            lfn.b(5, "SFPlayerSocialMentoringManager apprenticeRenamed() ", " Player :" + this.hF.getGUID() + " has not as an apprentice, player : " + ldv2);
            assert (false);
            return;
        }
        b2.adb = string + " " + string2;
        this.a(b2.Ri, b2.adb, b2.adf, 29, b2.adc);
    }

    private void c(ldv ldv2, float f2) {
        if (this.acQ == null) {
            lfn.b(5, "SFPlayerSocialMentoringManager apprenticeProwessUpdate() ", " Player :" + this.hF.getGUID() + " is not a mentor");
            assert (false);
            return;
        }
        float f3 = this.hF.kA();
        if (f3 < (float)ls.py()) {
            lfn.b(5, "SFPlayerSocialMentoringManager apprenticeProwessUpdate() ", " Player :" + this.hF.getGUID() + " has " + f3 + " and should have at least : " + ls.py());
            assert (false);
            return;
        }
        b b2 = this.acQ.acZ.get(ldv2);
        if (b2 == null) {
            lfn.b(5, "SFPlayerSocialMentoringManager apprenticeProwessUpdate() ", " Player :" + this.hF.getGUID() + " has not as an apprentice, player : " + ldv2);
            assert (false);
            return;
        }
        b2.adf = f2;
        this.a(b2.Ri, b2.adb, b2.adf, 30, b2.adc);
    }

    private void a(int n, String string, String string2) {
        assert (this.acQ == null);
        float f2 = this.hF.kA();
        if (f2 > (float)ls.pz()) {
            lfn.b(5, "SFPlayerSocialMentoringManager mentorAdded() ", " Player :" + this.hF.getGUID() + " has :" + f2 + " and should have at most : " + ls.pz());
            assert (false);
            return;
        }
        if (this.acR != null) {
            lfn.b(5, "SFPlayerSocialMentoringManager mentorAdded() ", " Player :" + this.hF.getGUID() + " is an apprentice of mentor : " + this.acR.toString());
            assert (false);
            return;
        }
        this.acR = new b(this);
        this.acR.adb = string + " " + string2;
        this.acR.adc = true;
        this.acR.Ri = lcr.abW((int)n);
        this.O(false);
        this.a(this.acR.Ri, this.acR.adb, this.acR.adf, 22, this.acR.adc);
    }

    private void aR(ldv ldv2) {
        if (this.acR == null) {
            lfn.b(5, "SFPlayerSocialMentoringManager mentorRemoved() ", " Player :" + this.hF.getGUID() + " does not have a mentor");
            assert (false);
            return;
        }
        if (!ldv2.equals(this.acR.Ri)) {
            lfn.b(5, "SFPlayerSocialMentoringManager mentorRemoved() ", " Player :" + this.hF.getGUID() + " does not have as mentor player with PSOGUID : " + ldv2 + ". His mentor is : " + this.acR.Ri);
            assert (false);
            return;
        }
        this.a(this.acR.Ri, this.acR.adb, this.acR.adf, 23, this.acR.adc);
        this.acR = null;
        this.O(false);
    }

    private void P(boolean bl) {
        if (this.acR == null) {
            lfn.b(5, "SFPlayerSocialMentoringManager mentorStatusUpdate() ", " Player :" + this.hF.getGUID() + " is not an apprentice");
            assert (false);
            return;
        }
        float f2 = this.hF.kA();
        if (f2 > (float)ls.pz()) {
            lfn.b(5, "SFPlayerSocialMentoringManager mentorStatusUpdate() ", " Player :" + this.hF.getGUID() + " has " + f2 + " and should have at most : " + ls.pz());
            assert (false);
            return;
        }
        this.acR.adc = bl;
        this.a(this.acR.Ri, this.acR.adb, this.acR.adf, 24, this.acR.adc);
    }

    private void a(float f2, boolean bl, int n) {
        if (this.acQ == null) {
            lfn.b(5, "SFPlayerSocialMentoringManager mentorRatingUpdate() ", " Player :" + this.hF.getGUID() + " is not a mentor");
            assert (false);
            return;
        }
        float f3 = this.hF.kA();
        if (f3 < (float)ls.py()) {
            lfn.b(5, "SFPlayerSocialMentoringManager mentorRatingUpdate() ", " Player :" + this.hF.getGUID() + " has " + f3 + " and should have at least : " + ls.py());
            assert (false);
            return;
        }
        this.acQ.acY = f2;
        this.acQ.acW = bl;
        this.acQ.acX = n;
        this.O(true);
    }

    private void d(ldv ldv2, String string, String string2) {
        if (this.acR == null) {
            lfn.b(5, "SFPlayerSocialMentoringManager mentorRenamed() ", " Player :" + this.hF.getGUID() + " does not have a mentor");
            assert (false);
            return;
        }
        if (!ldv2.equals(this.acR.Ri)) {
            lfn.b(5, "SFPlayerSocialMentoringManager mentorRenamed() ", " Player :" + this.hF.getGUID() + " does not have as mentor player with PSOGUID : " + ldv2 + ". His mentor is : " + this.acR.Ri);
            assert (false);
            return;
        }
        this.acR.adb = string + " " + string2;
        this.a(this.acR.Ri, this.acR.adb, this.acR.adf, 28, this.acR.adc);
    }

    private void b(fqn fqn2) {
        if (this.acQ != null) {
            float f2 = this.hF.kA();
            if (f2 < (float)ls.py()) {
                lfn.b(5, "SFPlayerSocialMentoringManager mentoringRatingPending() ", " Player :" + this.hF.getGUID() + " has " + f2 + " and should have at least : " + ls.py());
                assert (false);
                return;
            }
            ldv ldv2 = lcr.abW((int)fqn2.qe());
            b b2 = this.acQ.acZ.remove(ldv2);
            if (b2 == null) {
                lfn.b(5, "SFPlayerSocialMentoringManager mentoringRatingPending() ", " Player :" + this.hF.getGUID() + " does not have an apprentice with PSOGUID : " + ldv2);
                assert (false);
                return;
            }
            this.a(b2.Ri, b2.adb, b2.adf, 31, b2.adc);
            return;
        }
        if (this.acR != null) {
            float f3 = this.hF.kA();
            if (f3 < (float)ls.pz()) {
                lfn.b(5, "SFPlayerSocialMentoringManager mentoringRatingPending() ", " Player :" + this.hF.getGUID() + " has " + f3 + " and should have at least : " + ls.pz());
                assert (false);
                return;
            }
            this.a(this.acR.Ri, this.acR.adb, this.acR.adf, 31, this.acR.adc);
            this.acR.adg = true;
            return;
        }
        assert (false);
    }

    private void c(fqn fqn2) {
        if (this.acR == null) {
            lfn.b(5, "SFPlayerSocialMentoringManager mentorRatingExpired() ", " Player :" + this.hF.getGUID() + " does not have a mentor.");
            assert (false);
            return;
        }
        if (!this.acR.adg) {
            lfn.b(5, "SFPlayerSocialMentoringManager mentorRatingExpired() ", " Player :" + this.hF.getGUID() + " does not have a pending rating for mentor : " + fqn2.cz() + " " + fqn2.cA());
            assert (false);
            return;
        }
        float f2 = this.hF.kA();
        if (f2 < (float)ls.pz()) {
            lfn.b(5, "SFPlayerSocialMentoringManager mentorRatingExpired() ", " Player :" + this.hF.getGUID() + " has " + f2 + " and should have at least : " + ls.pz());
            assert (false);
            return;
        }
        this.acR = null;
        this.O(false);
    }

    private void d(fqn fqn2) {
        if (this.acQ != null) {
            float f2 = this.hF.kA();
            if (f2 < (float)ls.py()) {
                lfn.b(5, "SFPlayerSocialMentoringManager mentoringCompleted() ", " Player :" + this.hF.getGUID() + " has " + f2 + " and should have at least : " + ls.py());
                assert (false);
                return;
            }
            this.a(lcr.abW((int)fqn2.qe()), fqn2.cz() + " " + fqn2.cA(), fqn2.pN(), 32, false);
            return;
        }
        if (this.acR != null) {
            assert (this.acR.adg);
            float f3 = this.hF.kA();
            if (f3 < (float)ls.pz()) {
                lfn.b(5, "SFPlayerSocialMentoringManager mentoringCompleted() ", " Player :" + this.hF.getGUID() + " has " + f3 + " and should have at least : " + ls.pz());
                assert (false);
                return;
            }
            this.a(this.acR.Ri, this.acR.adb, fqn2.pN(), 32, this.acR.adc);
            this.acR = null;
            return;
        }
        assert (false);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        int n = dxq2.bEz();
        switch (n) {
            case 34312: {
                this.a((fqz)dxq2);
                break;
            }
            case 34311: {
                this.a((fqn)dxq2);
                break;
            }
            case 34306: {
                this.a((fqw)dxq2);
                break;
            }
            case 34308: {
                this.a((fqy)dxq2);
                break;
            }
            case 34310: {
                this.a((fqm)dxq2);
                break;
            }
            case 31491: {
                this.a((gkt)dxq2);
                break;
            }
            case 34319: {
                this.a((fqk)dxq2);
            }
        }
    }

    public void aS(ldv ldv2) {
        this.acL = ldv2;
        this.lT();
        if (this.acQ != null) {
            assert (this.acR == null);
            this.O(true);
            this.a(this.acQ.acZ, 5);
            return;
        }
        if (this.acR != null) {
            assert (this.acQ == null);
            if (!this.acR.adg) {
                this.O(false);
                this.a(new String[]{this.acR.adb}, new ldv[]{this.acR.Ri}, new boolean[]{this.acR.adc}, new float[]{this.acR.adf}, 4);
                return;
            }
            fqu fqu2 = (fqu)this.MessageDelegator.h(34314, this.getGUID(), ldv2);
            fqu2.kK(this.acR.adb);
            this.MessageDelegator.F(fqu2);
            return;
        }
        this.lK();
    }

    private void a(fqk fqk2) {
        assert (this.acR != null);
        assert (this.acQ == null);
        assert (this.acR.adg);
        assert (this.hF.kA() >= (float)ls.pz());
        fqk2.f(this.hF.getGUID());
        fqk2.on(lcr.hac);
        fqk2.jg(this.hF.kA());
        this.MessageDelegator.E(fqk2);
    }

    public void lM() {
        if (this.acR == null && this.acQ == null) {
            return;
        }
        fqq fqq2 = (fqq)this.MessageDelegator.h(34315, this.hF.getGUID(), lcr.hac);
        this.MessageDelegator.E(fqq2);
    }

    public void lL() {
        if (this.acR == null && this.acQ == null) {
            return;
        }
        fqs fqs2 = (fqs)this.MessageDelegator.h(34317, this.hF.getGUID(), lcr.hac);
        fqs2.P(this.hF.iP());
        fqs2.Q(this.hF.iR());
        this.MessageDelegator.E(fqs2);
    }

    public void a(float f2, float f3, tv tv2) {
        if (this.acR == null) {
            return;
        }
        fqr fqr2 = (fqr)this.MessageDelegator.h(34318, this.hF.getGUID(), lcr.hac);
        fqr2.ji(f3 - f2);
        fqr2.jg(f3);
        fqr2.HI(tv2.ordinal());
        this.MessageDelegator.E(fqr2);
    }

    public void lK() {
        if (!ls.isEnabled() || !ls.pL()) {
            return;
        }
        float f2 = this.hF.kA();
        if (f2 >= (float)ls.pz()) {
            return;
        }
        fra fra2 = (fra)this.MessageDelegator.h(34320, this.getGUID(), this.acL);
        this.MessageDelegator.E(fra2);
    }

    public boolean aM(ldv ldv2) {
        if (this.acQ == null) {
            return false;
        }
        if (this.acQ.acZ == null || this.acQ.acZ.isEmpty()) {
            return false;
        }
        return this.acQ.acZ.containsKey(ldv2);
    }

    public boolean aN(ldv ldv2) {
        if (this.acR == null) {
            return false;
        }
        if (this.acR.Ri == null) {
            return false;
        }
        return this.acR.Ri.equals(ldv2);
    }
}

