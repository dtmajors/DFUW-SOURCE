/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dqk
 */
public class dsf
extends dqk {
    private dsg gXi = null;
    private boolean gXj = false;

    public dsf(dsg dsg2) {
        this.gXi = dsg2;
        this.ObjectType = 149;
    }

    public void initialize() {
        this.ObjectDescriptionFilename = "gizmos\\gizmo_plane.xml";
        super.initialize();
        this.setVisible(this.gXj);
    }

    protected void a(kwp kwp2) {
        super.a(kwp2);
        if (this.gXj) {
            this.gXi.bxG();
        }
    }

    public boolean bxC() {
        return this.gXj;
    }

    public void jl(boolean bl) {
        this.gXj = bl;
    }

    public dsg bxD() {
        return this.gXi;
    }

    public void setVisible(boolean bl) {
        if (bl) {
            super.setVisible(this.gXj);
        } else {
            super.setVisible(false);
        }
    }
}

