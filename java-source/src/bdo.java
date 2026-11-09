/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  cxd
 */
public class bdo
extends btk {
    private final cqa aeT;

    public bdo(cqa cqa2) {
        this.aeT = cqa2;
    }

    public void a(erq erq2) {
        switch (erq2.bEz()) {
            case 16641: {
                this.b((erc)erq2);
                break;
            }
            default: {
                lfn.b(5, "SFCommandManagerWildlife", "handleCommandMessage() Invalid commandmessage received: " + erq2);
                return;
            }
        }
    }

    protected void b(erc erc2) {
        if (erc2.ixE <= 0) {
            lfn.b(5, "SFCommandManagerWildlife", "handleCommandActionMessage() ActionType is invalid.");
            return;
        }
        switch (erc2.ixE) {
            case 9: {
                fcw fcw2 = (fcw)this.MessageDelegator.h(9227, this.GUID, this.MessageDelegator.getGUID());
                fcw2.bst = bkd.dqy;
                fcw2.aZG = erc2.aYF;
                fcw2.akX = this.aeT.getGUID();
                fcw2.aYF = erc2.aYF;
                fcw2.bsG = cug.fhT;
                fcw2.aYC = cxd.fIa;
                fcw2.Magnitude = 15.0f;
                fcw2.eKm = -3.0;
                fcw2.aSp = 0.0f;
                fcw2.a(cxd.f.fQX);
                fcw2.aYH = this.MessageDelegator.arc().lpr;
                fcw2.aYG = bfk.dgM;
                fcw2.bsE = 0;
                fcw2.bRD = 1;
                fcw2.gpI = -3.0;
                fcw2.aZH = this.aeT.aAG().av();
                this.MessageDelegator.H(fcw2);
                break;
            }
            default: {
                lfn.b(5, "SFCommandManagerWildlife", "handleCommandActionMessage() Unhandled actiontype provided: " + erc2.ixE);
                return;
            }
        }
    }
}

