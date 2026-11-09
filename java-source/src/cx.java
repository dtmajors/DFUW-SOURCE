/*
 * Decompiled with CFR.
 */
import com.thoughtworks.xstream.annotations.XStreamAlias;
import java.util.List;

@XStreamAlias(value="CharacterSheet")
public class cx {
    private String FirstName;
    private String LastName;
    private int Race;
    private int Gender;
    private List<cy> Features;
    private String BindstoneName;
    private float SkinToneValue;
    private float HairColorValue;

    public String cz() {
        return this.FirstName;
    }

    public void P(String string) {
        this.FirstName = string;
    }

    public String cA() {
        return this.LastName;
    }

    public void Q(String string) {
        this.LastName = string;
    }

    public int cB() {
        return this.Race;
    }

    public void P(int n2) {
        this.Race = n2;
    }

    public int cC() {
        return this.Gender;
    }

    public void Q(int n2) {
        this.Gender = n2;
    }

    public List<cy> cD() {
        return this.Features;
    }

    public void o(List<cy> list) {
        this.Features = list;
    }

    public boolean isValid() {
        return this.FirstName != null && this.LastName != null && this.Race != 0 && this.Gender != 0;
    }

    public String aH() {
        return this.BindstoneName;
    }

    public void D(String string) {
        this.BindstoneName = string;
    }

    public float cE() {
        return this.SkinToneValue;
    }

    public void d(float f2) {
        this.SkinToneValue = f2;
    }

    public float cF() {
        return this.HairColorValue;
    }

    public void e(float f2) {
        this.HairColorValue = f2;
    }
}

