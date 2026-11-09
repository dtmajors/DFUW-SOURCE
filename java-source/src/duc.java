/*
 * Decompiled with CFR.
 */
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias(value="Markers")
public class duc {
    private String FileName;
    public String Caption;
    public String MarkerIconType;
    private ljq Position;
    private String MarkerTargetType;
    private boolean Visible = true;

    public boolean a(duc duc2) {
        if (duc2 == null) {
            return false;
        }
        if (duc2.MarkerTargetType == mqm.a.Eel.name()) {
            return duc2.Position == this.Position;
        }
        return duc2.FileName == this.FileName;
    }

    public ljq av() {
        if (this.MarkerTargetType.equals(mqm.a.Eel.name())) {
            return this.Position;
        }
        return null;
    }

    public void c(ljq ljq2) {
        this.Position = ljq2;
    }

    public String bAM() {
        return this.MarkerTargetType;
    }

    public void jw(String string) {
        this.MarkerTargetType = string;
    }

    public String getFileName() {
        if (!this.MarkerTargetType.equals(mqm.a.Eel.name())) {
            return this.FileName;
        }
        return null;
    }

    public void setFileName(String string) {
        this.FileName = string;
    }

    public boolean isVisible() {
        return this.Visible;
    }

    public void setVisible(boolean bl) {
        this.Visible = bl;
    }
}

