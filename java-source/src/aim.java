/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 */
public class aim {
    private final int Type;
    private final int ResourceType;
    private boolean jV;
    private String ResourceName;

    @Deprecated
    public aim() {
        this.Type = -1;
        this.ResourceType = -2;
    }

    public aim(ain ain2, int n, boolean bl) {
        this.Type = ain2.ordinal();
        this.ResourceType = n;
        this.jV = bl;
    }

    public ain BP() {
        return ain.getValueByOrdinal(this.Type);
    }

    public boolean isSelected() {
        return this.jV;
    }

    public void setSelected(boolean bl) {
        this.jV = bl;
    }

    public int az() {
        return this.ResourceType;
    }

    public String pa() {
        if (this.ResourceName == null) {
            this.ResourceName = cug.uV((int)this.ResourceType);
        }
        return this.ResourceName;
    }
}

