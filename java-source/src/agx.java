/*
 * Decompiled with CFR.
 */
public class agx
extends ahz {
    protected String FileName = null;
    private ljq Position = null;
    private lgl Rotation = null;
    private int ResourceType = 0;

    public agx() {
        super(5);
        this.bls = ahu.c.bmu;
    }

    public agx(int n) {
        super(n);
        this.bls = ahu.c.bmu;
    }

    public final void setFileName(String string) {
        this.FileName = string;
    }

    public final void c(ljq ljq2) {
        this.Position = ljq2;
    }

    public final void a(lgl lgl2) {
        this.Rotation = lgl2;
    }

    public final void l(int n) {
        this.ResourceType = n;
    }

    public final int az() {
        return this.ResourceType;
    }

    @Override
    public String eB(int n) {
        switch (n) {
            case 1: {
                return "FileName";
            }
            case 2: {
                return "Position";
            }
            case 3: {
                return "Rotation";
            }
            case 4: {
                return "ResourceType";
            }
        }
        return super.eB(n);
    }

    @Override
    public void a(gym gym2, int n) {
        if (gym2.bEz() != 12041) {
            lfn.b(5, "SFMeshStateObject", "handleUpdateMessage() Invalid UpdateMessage received: " + gym2.getClass().getName());
            return;
        }
        gyl gyl2 = (gyl)gym2;
        Integer n2 = new Integer(n);
        boolean bl = false;
        if ((gyl2.ija & 1) > 0) {
            assert (gyl2.Position != null);
            assert (gyl2.Rotation != null);
            if (!this.Position.equals(gyl2.Position)) {
                this.Position = gyl2.Position;
                this.L(2, n);
                bl = true;
            }
            if (!this.Rotation.equals(gyl2.Rotation)) {
                this.Rotation = gyl2.Rotation;
                this.L(3, n);
                bl = true;
            }
        }
        if ((gyl2.ija & 2) > 0) {
            assert (gyl2.ResourceType > 0);
            if (this.ResourceType != gyl2.ResourceType) {
                this.ResourceType = gyl2.ResourceType;
                this.L(4, n);
                bl = true;
            }
        }
        if (bl) {
            this.BE();
        }
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append(" ");
        stringBuilder.append((Object)bve.a.getMeshType(this.Bz()));
        stringBuilder.append(" '");
        stringBuilder.append(this.FileName);
        stringBuilder.append("'");
        return stringBuilder.toString();
    }

    protected ljq Bc() {
        return this.Position;
    }

    protected lgl Bd() {
        return this.Rotation;
    }

    @Override
    protected uk G(int n, int n2) {
        switch (n) {
            case 1: {
                uo uo2 = new uo();
                uo2.Uo = n;
                uo2.Value = this.FileName;
                return uo2;
            }
            case 2: {
                uq uq2 = new uq();
                uq2.Uo = n;
                uq2.Qi = new ljq(this.Bc());
                return uq2;
            }
            case 3: {
                um um2 = new um();
                um2.Uo = n;
                um2.aXj = new lgl(this.Bd());
                return um2;
            }
            case 4: {
                uh uh2 = new uh();
                uh2.Uo = n;
                uh2.PC = this.ResourceType;
                return uh2;
            }
        }
        return super.G(n, n2);
    }
}

