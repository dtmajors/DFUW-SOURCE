/*
 * Decompiled with CFR.
 */
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias(value="MovementSpeedInfo")
public class cts {
    public String ResourceName = null;
    public transient int ResourceType = 0;
    public float ContactVelocityClimbing = 0.0f;
    public float ContactVelocityCrouchWalk = 0.0f;
    public float ContactVelocityWalk = 0.0f;
    public float ContactVelocityRun = 0.0f;
    public float ContactVelocityRunStrafe = 0.0f;
    public float ContactVelocitySprint = 0.0f;
    public float ContactVelocitySwim = 0.0f;
    public float ContactVelocitySwimFast = 0.0f;

    public cts bbD() {
        cts cts2 = new cts();
        cts2.ResourceName = this.ResourceName;
        cts2.ResourceType = this.ResourceType;
        cts2.ContactVelocityClimbing = this.ContactVelocityClimbing;
        cts2.ContactVelocityCrouchWalk = this.ContactVelocityCrouchWalk;
        cts2.ContactVelocityRun = this.ContactVelocityRun;
        cts2.ContactVelocityRunStrafe = this.ContactVelocityRunStrafe;
        cts2.ContactVelocitySprint = this.ContactVelocitySprint;
        cts2.ContactVelocitySwim = this.ContactVelocitySwim;
        cts2.ContactVelocitySwimFast = this.ContactVelocitySwimFast;
        cts2.ContactVelocityWalk = this.ContactVelocityWalk;
        return cts2;
    }

    public void c(cts cts2) {
        this.ContactVelocityClimbing = cts2.ContactVelocityClimbing;
        this.ContactVelocityCrouchWalk = cts2.ContactVelocityCrouchWalk;
        this.ContactVelocityRun = cts2.ContactVelocityRun;
        this.ContactVelocityRunStrafe = cts2.ContactVelocityRunStrafe;
        this.ContactVelocitySprint = cts2.ContactVelocitySprint;
        this.ContactVelocitySwim = cts2.ContactVelocitySwim;
        this.ContactVelocitySwimFast = cts2.ContactVelocitySwimFast;
        this.ContactVelocityWalk = cts2.ContactVelocityWalk;
    }

    public void a(cts cts2, float f2) {
        this.ContactVelocityClimbing = cts2.ContactVelocityClimbing * f2;
        this.ContactVelocityCrouchWalk = cts2.ContactVelocityCrouchWalk * f2;
        this.ContactVelocityRun = cts2.ContactVelocityRun * f2;
        this.ContactVelocityRunStrafe = cts2.ContactVelocityRunStrafe * f2;
        this.ContactVelocitySprint = cts2.ContactVelocitySprint * f2;
        this.ContactVelocitySwim = cts2.ContactVelocitySwim * f2;
        this.ContactVelocitySwimFast = cts2.ContactVelocitySwimFast * f2;
        this.ContactVelocityWalk = cts2.ContactVelocityWalk * f2;
    }

    public String pa() {
        return lea.enW().getName(this.ResourceType);
    }

    public int hashCode() {
        int n = 31;
        int n2 = 1;
        n2 = 31 * n2 + (this.ResourceName == null ? 0 : this.ResourceName.hashCode());
        n2 = 31 * n2 + this.ResourceType;
        return n2;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (this.getClass() != object.getClass()) {
            return false;
        }
        cts cts2 = (cts)object;
        if (this.ResourceName == null ? cts2.ResourceName != null : !this.ResourceName.equals(cts2.ResourceName)) {
            return false;
        }
        return this.ResourceType == cts2.ResourceType;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFMovementSpeedInfo: ResourceName='");
        stringBuilder.append(this.pa());
        stringBuilder.append("'");
        return stringBuilder.toString();
    }

    public boolean d(cts cts2) {
        if (this.ContactVelocityClimbing != cts2.ContactVelocityClimbing) {
            return false;
        }
        if (this.ContactVelocityCrouchWalk != cts2.ContactVelocityCrouchWalk) {
            return false;
        }
        if (this.ContactVelocityRun != cts2.ContactVelocityRun) {
            return false;
        }
        if (this.ContactVelocityRunStrafe != cts2.ContactVelocityRunStrafe) {
            return false;
        }
        if (this.ContactVelocitySprint != cts2.ContactVelocitySprint) {
            return false;
        }
        if (this.ContactVelocitySwim != cts2.ContactVelocitySwim) {
            return false;
        }
        if (this.ContactVelocitySwimFast != cts2.ContactVelocitySwimFast) {
            return false;
        }
        return this.ContactVelocityWalk == cts2.ContactVelocityWalk;
    }

    public /* synthetic */ Object clone() {
        return this.bbD();
    }
}

