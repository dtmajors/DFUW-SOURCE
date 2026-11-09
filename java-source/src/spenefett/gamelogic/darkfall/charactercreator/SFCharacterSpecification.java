/*
 * Decompiled with CFR.
 */
package spenefett.gamelogic.darkfall.charactercreator;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.Annotations;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.io.xml.DomDriver;

@XStreamAlias(value="CharacterSpecification")
@lle
public class SFCharacterSpecification {
    private static XStream xStream;
    public String FirstName;
    public String LastName;
    public int Nationality;
    public int Race;
    public int Gender;
    public lcq SkinTone = lcq.BRIGHT_WHITE;
    public lcq HairColor = lcq.BRIGHT_WHITE;
    public int SelectedRoleIndex;
    public int SelectedSpecializationIndex;
    public String[] Features;

    public String cG() {
        if (!this.isValid()) {
            return null;
        }
        if (xStream == null) {
            xStream = new XStream(new DomDriver());
            Annotations.configureAliases(xStream, SFCharacterSpecification.class);
            xStream.setClassLoader(r.cr);
        }
        String string = xStream.toXML(this);
        return string;
    }

    public static SFCharacterSpecification R(String string) {
        if (xStream == null) {
            xStream = new XStream(new DomDriver());
            Annotations.configureAliases(xStream, SFCharacterSpecification.class);
            xStream.setClassLoader(r.cr);
        }
        Object object = null;
        try {
            object = xStream.fromXML(string);
        }
        catch (Throwable throwable) {
            lfn.b(5, "SFCharacterSpecification", "fromXMLData: " + throwable.getMessage());
            return null;
        }
        if (!(object instanceof SFCharacterSpecification)) {
            lfn.b(5, "SFCharacterSpecification", "fromXMLData: Not a SFCharacterSpecification");
            return null;
        }
        SFCharacterSpecification sFCharacterSpecification = (SFCharacterSpecification)object;
        if (!sFCharacterSpecification.isValid()) {
            lfn.b(5, "SFCharacterSpecification", "fromXMLData: Invalid SFCharacterSpecification");
            return null;
        }
        return sFCharacterSpecification;
    }

    public boolean isValid() {
        cjx cjx2 = lea.epx().qU(this.SelectedRoleIndex);
        if (this.FirstName == null || this.FirstName.isEmpty()) {
            return false;
        }
        if (this.LastName == null || this.LastName.isEmpty()) {
            return false;
        }
        if (iaz.PA(this.Race) < 0) {
            return false;
        }
        if (this.Gender != 1 && this.Gender != 2) {
            return false;
        }
        if (this.SkinTone == null) {
            return false;
        }
        if (this.HairColor == null) {
            return false;
        }
        if (cjx2 == null) {
            return false;
        }
        if (cjx2.qQ(this.SelectedSpecializationIndex) == null) {
            return false;
        }
        return this.Features != null && this.Features.length != 0;
    }
}

