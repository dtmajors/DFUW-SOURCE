/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 */
import java.sql.Timestamp;

public class dvj
extends btk {
    private dvh hfD = null;
    private dvi hfF = null;

    public dvj(dvh dvh2) {
        this.hfD = dvh2;
    }

    public boolean r(dxq dxq2) {
        if (this.hfF.r(dxq2)) {
            return true;
        }
        switch (dxq2.bEz()) {
            case 3585: 
            case 3586: 
            case 3587: 
            case 3596: 
            case 3597: 
            case 3598: 
            case 3599: 
            case 3601: 
            case 3603: {
                return true;
            }
        }
        return false;
    }

    @Override
    public void initialize() {
        super.initialize();
        this.hfF = new dvi(this.hfD);
        this.hfF.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(this.hfF);
    }

    @Override
    public void cleanUp() {
        if (this.hfF != null) {
            this.MessageDelegator.hd(this.hfF.getGUID());
        }
        super.cleanUp();
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        boolean bl = false;
        if (this.hfF.r(dxq2)) {
            this.hfF.receiveMessage(dxq2);
            bl = true;
        }
        switch (dxq2.bEz()) {
            case 3585: {
                this.a((gmb)dxq2);
                bl = true;
                break;
            }
            case 3586: {
                this.a((gmj)dxq2);
                bl = true;
                break;
            }
            case 3587: {
                this.a((gmk)dxq2);
                bl = true;
                break;
            }
            case 3598: {
                this.a((gmh)dxq2);
                bl = true;
                break;
            }
            case 3599: {
                this.a((gmi)dxq2);
                bl = true;
                break;
            }
            case 3601: {
                this.a((gmq)dxq2);
                bl = true;
                break;
            }
            case 3596: {
                this.a((gma)dxq2);
                bl = true;
                break;
            }
            case 3603: {
                this.a((gmm)dxq2);
                bl = true;
            }
        }
        if (!bl) {
            super.receiveMessage(dxq2);
        }
    }

    private void a(gmm gmm2) {
        if (gmm2.iG() == null || gmm2.bJQ() == null || gmm2.bJQ().length == 0) {
            lfn.b(5, this.getClass().getSimpleName(), "handleStatsClanVaultLogMessage() : Invalid Message Fields!!!... ClanGUID = " + gmm2.iG() + ", Log Entries = " + (gmm2.bJQ() == null ? "NULL" : Integer.valueOf(gmm2.bJQ().length)));
            assert (false);
            return;
        }
        for (bda bda2 : gmm2.bJQ()) {
            String string = dvk.a(gmm2.iG(), bda2);
            if (string == null) {
                lfn.b(5, this.getClass().getSimpleName(), "handleStatsClanVaultLogMessage() : Failed to Generate SQL for Stored Procedure Call!!!");
                assert (false);
                continue;
            }
            this.hfD.a(new dvz(string));
        }
    }

    private void a(gmb gmb2) {
        lfn.b(5, this.getClass().getSimpleName(), "handleStatsClanBankLogMessage() : THESE SHOULD NOT BE SENT HERE ANY MORE... USE SFStatsClanVaultLogMessage Instead!!!");
        assert (false);
    }

    private void a(gmj gmj2) {
        String string = dvk.a(new Timestamp(this.MessageDelegator.bzy().getTimeInMillis()), gmj2.ade, gmj2.jlQ.enw(), gmj2.cAw.enw(), gmj2.jlR, gmj2.jlS);
        if (string == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleStatsClanMemberMessage() : Failed to generate an SQL statement to insert a clan membership transaction!!!... Message = " + gmj2);
            assert (false);
            return;
        }
        this.hfD.a(new dvz(string));
    }

    private void a(gmk gmk2) {
        String string = dvk.a(new Timestamp(this.MessageDelegator.bzy().getTimeInMillis()), gmk2.jlT, gmk2.aES, gmk2.jlU.enw(), gmk2.jlV);
        if (string == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleStatsClanPoliticsMessage() : Failed to generate an SQL statement to insert a clan politics transaction!!!... Message = " + gmk2);
            assert (false);
            return;
        }
        this.hfD.a(new dvz(string));
    }

    private void a(gmh gmh2) {
        String string = null;
        if (gmh2.jlN) {
            string = dvk.a((int)gmh2.jln, gmh2.jlp, gmh2.Rs, gmh2.ft, gmh2.ObjectType, gmh2.jlM);
            if (string == null) {
                lfn.b(5, this.getClass().getSimpleName(), "handleStatsClanCityHamletMessage() : Failed to generate an SQL statement to insert a holding ownership transaction!!!... Message = " + gmh2);
                assert (false);
                return;
            }
        } else {
            string = dvk.a(gmh2.jlp, gmh2.jlq, gmh2.Rs, gmh2.ft, gmh2.ObjectType);
            if (string == null) {
                lfn.b(5, this.getClass().getSimpleName(), "handleStatsClanCityHamletMessage() : Failed to generate an SQL statement to insert a holding founding!!!... Message = " + gmh2);
                assert (false);
                return;
            }
        }
        this.hfD.a(new dvz(string));
    }

    private void a(gmi gmi2) {
        String string = dvk.a(gmi2.jlO, gmi2.Rs, gmi2.ft, gmi2.ObjectType, lea.enW().getName(gmi2.csI), cug.uL((int)gmi2.csI), gmi2.jlP, new Timestamp(this.MessageDelegator.bzy().getTimeInMillis()));
        if (string == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleStatsClanElementMessage() : Failed to generate an SQL statement to insert a clan holding structure history entry!!!... Message = " + gmi2);
            assert (false);
            return;
        }
        this.hfD.a(new dvz(string));
    }

    private void a(gmq gmq2) {
        String string = dvk.a(gmq2.ade, gmq2.add, gmq2.cQE, gmq2.cQG, gmq2.cAw.enw(), gmq2.cQF, new Timestamp(this.MessageDelegator.bzy().getTimeInMillis()), gmq2.gKV);
        if (string == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleStatsClanElementMessage() : Failed to generate an SQL statement to insert a clan fortress history entry!!!... Message = " + gmq2);
            assert (false);
            return;
        }
        this.hfD.a(new dvz(string));
    }

    private void a(gma gma2) {
        String string = null;
        if (gma2.jlm.ipJ == null || gma2.jlm.ipJ.length == 0) {
            string = dvk.a(gma2.ade, new Timestamp(this.MessageDelegator.bzy().getTimeInMillis()), gma2.jlm.bGE().ordinal(), "No Parameters", "No Parameters");
        } else {
            StringBuffer stringBuffer = new StringBuffer("");
            for (int i = 1; i < gma2.jlm.ipJ.length; ++i) {
                stringBuffer.append(gma2.jlm.ipJ[i].esy() + (i < gma2.jlm.ipJ.length - 1 ? ":::" : ""));
            }
            string = dvk.a(gma2.ade, new Timestamp(this.MessageDelegator.bzy().getTimeInMillis()), gma2.jlm.bGE().ordinal(), gma2.jlm.ipJ[0].esy(), stringBuffer.toString());
        }
        if (string == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleStatsChatNotificationMessage() : Failed to generate an SQL statement to insert an entry into all clan events!!!... Message = " + gma2);
            assert (false);
            return;
        }
        this.hfD.a(new dvz(string));
    }
}

