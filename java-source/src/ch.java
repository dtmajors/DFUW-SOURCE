/*
 * Decompiled with CFR.
 */
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias(value="BindstoneLocation")
public class ch {
    private String BindstoneName;
    private String LocationName;
    private String Texture;
    private lgg Location;

    public String aH() {
        return this.BindstoneName;
    }

    public void D(String string) {
        this.BindstoneName = string;
    }

    public lgg aI() {
        return this.Location;
    }

    public void c(lgg lgg2) {
        this.Location = lgg2;
    }

    public String aJ() {
        return this.Texture;
    }

    public void E(String string) {
        this.Texture = string;
    }

    public String aK() {
        return this.LocationName;
    }

    public void F(String string) {
        this.LocationName = string;
    }
}

