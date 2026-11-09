/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  car
 *  cug
 */
public class cas
extends car {
    public final void cleanUp() {
        super.cleanUp();
        if (this.ehJ != null) {
            this.MessageDelegator.hd(this.ehJ.getGUID());
        }
    }

    protected void aGv() {
        assert (this.Initialized);
        assert (!this.ehE);
        assert (this.ehB != null);
        this.ehE = true;
        String string = cug.uP((int)this.aGu());
        this.ehK = ei.ao(string);
        if (this.ehK == null) {
            lfn.b(5, "SFPaperdollManagerPlayer", "initializePaperdollManager() No attachpointmap found for meshobject '" + string + "'");
            lfn.b(5, "SFPaperdollManagerPlayer", "initializePaperdollManager() ResourceType='" + this.aGt() + "'");
            assert (false);
            return;
        }
        this.ehJ = new cal();
        this.ehJ.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(this.ehJ);
        if (cug.vY((int)this.aGu()) && !this.ehU) {
            this.aGF();
        }
        this.aGB();
    }

    protected final void ot(int n) {
        assert (n > 0);
        assert (this.ehB == null);
        assert (this.ehC == null);
        assert (!this.ehE);
        if (cug.vY((int)n)) {
            this.ehC = lea.ack(n);
            if (this.ehC == null) {
                lfn.b(5, "SFPaperdollManagerPlayer", "selectPaperdollItemMap() PaperdollItemMap is null.");
                return;
            }
        } else if (!lea.enW().isDescendant(n, cug.fgD)) {
            lfn.b(5, "SFPaperdollManagerPlayer", "selectPaperdollItemMap() Unknown resource provided: '" + lea.enW().getName(n) + "'");
            assert (false);
        }
    }
}

