/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
public class amf {
    public static final String DEFAULT_DESCRIPTIONFILENAME = "n/a";
    protected a CurrentObjectState = a.buz;
    protected boolean Initialized = false;
    protected boolean ScheduledForRemoval = false;
    protected boolean CleanedUp = false;
    protected ldv GUID = null;
    protected int ObjectType = 0;
    protected String ObjectDescriptionFilename = "n/a";
    protected boolean WorldbuilderSaveable = true;

    public final boolean isInitialized() {
        return this.Initialized;
    }

    public final boolean isScheduledForRemoval() {
        return this.ScheduledForRemoval;
    }

    public void setScheduledForRemoval() {
        this.ScheduledForRemoval = true;
    }

    public final ldv getGUID() {
        return this.GUID;
    }

    public final int hashCode() {
        if (this.GUID == null) {
            return super.hashCode();
        }
        return ~this.GUID.hashCode();
    }

    public final void setGUID(ldv ldv2) {
        this.GUID = this.GUID == null ? ldv2 : ldv2;
    }

    public final int getObjectType() {
        return this.ObjectType;
    }

    public final void setObjectType(int n) {
        this.ObjectType = n;
    }

    public final String getObjectDescriptionFilename() {
        return this.ObjectDescriptionFilename;
    }

    public final void setObjectDescriptionFilename(String string) {
        this.ObjectDescriptionFilename = string;
    }

    public void cleanUp() {
        this.CleanedUp = true;
    }

    public boolean equals(Object object) {
        if (object instanceof amf) {
            return ((amf)object).getGUID().equals(this.GUID);
        }
        return false;
    }

    public final String getObjectName() {
        return amh.gL(this.ObjectType);
    }

    public void initialize() {
        assert (this.GUID != null) : "You must set the GUID before calling Initialize() !";
        this.Initialized = true;
    }

    public void reset() {
        assert (this.ScheduledForRemoval);
        this.Initialized = false;
        this.GUID = null;
    }

    protected final ldv convertToLocalGUID(ldv ldv2) {
        return lcr.ak((ldv)ldv2, (int)this.GUID.ib());
    }

    protected void copyValues(amf amf2) {
        amf2.setObjectType(this.ObjectType);
        amf2.setObjectDescriptionFilename(this.ObjectDescriptionFilename);
    }

    public boolean isCleanedUp() {
        return this.CleanedUp;
    }

    public boolean isReadyToRun() {
        return true;
    }

    public boolean isReadyToShutdown() {
        return true;
    }

    public boolean isRunning() {
        return true;
    }

    public boolean isWorldbuilderSaveable() {
        return this.WorldbuilderSaveable;
    }

    public void setWorldbuilderSaveable(boolean bl) {
        this.WorldbuilderSaveable = bl;
    }
}

