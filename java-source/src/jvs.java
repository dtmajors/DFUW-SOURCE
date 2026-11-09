/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ep
 *  lcw
 */
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.Annotations;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.w3c.dom.Document;

public class jvs {
    public void dTC() {
        cxj.bfS().clear();
        XStream xStream = new XStream(new DomDriver());
        xStream.setClassLoader(r.cr);
        Annotations.configureAliases(xStream, cuo.class);
        Annotations.configureAliases(xStream, cub.class);
        Annotations.configureAliases(xStream, cuc.class);
        Annotations.configureAliases(xStream, cud.class);
        Annotations.configureAliases(xStream, cue.class);
        String string = "xml-files/gamelogicinfo/skilltrainingrules.xml";
        string = string.toLowerCase();
        String string2 = "";
        try {
            string2 = jry.ti(string);
        }
        catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            return;
        }
        assert (string2.length() > 0);
        Object object = xStream.fromXML(string2);
        assert (object instanceof List);
        les les2 = lea.enZ();
        List list = (List)object;
        for (cuo cuo2 : list) {
            int n = les2.getType(cuo2.SkillTypeName);
            if (n <= 0) {
                throw new bj("SkillName '" + cuo2.SkillTypeName + "' is invalid.");
            }
            cuo2.SkillType = n;
            cuo2.SkillTypeName = null;
            cua[] cuaArray = cuo2.Requirements;
            for (int i2 = 0; i2 < cuaArray.length; ++i2) {
                cua cua2 = cuaArray[i2];
                this.a(cua2);
            }
            if (cxj.yv(cuo2.SkillType)) {
                throw new bg("TrainingRule for skill '" + cuo2.Bu() + "' already exists.");
            }
            cxj.a(cuo2);
        }
    }

    public void dTD() {
        Object object;
        if (!lcw.eng()) {
            lfn.b(5, this.getClass().getSimpleName(), "saveTrainingRulesFile() : NOT WORLDBUILDER MODE!");
        }
        XStream xStream = new XStream(new DomDriver());
        xStream.setClassLoader(r.cr);
        Annotations.configureAliases(xStream, cuo.class);
        Annotations.configureAliases(xStream, cue.class);
        Annotations.configureAliases(xStream, cuc.class);
        Annotations.configureAliases(xStream, cub.class);
        Map<Integer, cuo> map = cxj.bfS();
        ArrayList<cuo> arrayList = lcn.emv();
        for (cuo object22 : map.values()) {
            object22.SkillTypeName = object22.Bu();
            object = object22.Requirements;
            assert (object != null);
            for (int i2 = 0; i2 < ((cua[])object).length; ++i2) {
                cua cua2 = object[i2];
                this.b(cua2);
            }
            arrayList.add(object22);
        }
        String string = xStream.toXML(arrayList);
        Document document = jsy.tL(string);
        object = lcw.qLb + "xml-files/gamelogicinfo/" + "skilltrainingrules.xml";
        jsz.a(document, new jrw((String)object));
    }

    private void a(cua cua2) {
        if (cua2 instanceof cub) {
            cua[] cuaArray = ((cub)cua2).Requirements;
            for (int i2 = 0; i2 < cuaArray.length; ++i2) {
                cua cua3 = cuaArray[i2];
                this.a(cua3);
            }
        } else if (cua2 instanceof cuc) {
            cuc cuc2 = (cuc)cua2;
            int n = ep.as((String)cuc2.AttributeTypeName);
            if (n <= 0) {
                throw new bj("AttributeName '" + cuc2.AttributeTypeName + "' is invalid.");
            }
            cuc2.bnM = n;
            cuc2.AttributeTypeName = null;
        } else if (cua2 instanceof cud) {
            cud cud2 = (cud)cua2;
            int n = lea.enW().getType(cud2.ResourceTypeName);
            if (n <= 0) {
                throw new bj("ResourceName '" + cud2.ResourceTypeName + "' is invalid.");
            }
            cud2.ResourceType = n;
            cud2.ResourceTypeName = null;
        } else if (cua2 instanceof cue) {
            cue cue2 = (cue)cua2;
            int n = lea.enZ().getType(cue2.SkillTypeName);
            if (n <= 0) {
                throw new bj("SkillName '" + cue2.SkillTypeName + "' is invalid.");
            }
            cue2.SkillType = n;
            cue2.SkillTypeName = null;
        }
    }

    private void b(cua cua2) {
        if (cua2 instanceof cub) {
            cua[] cuaArray = ((cub)cua2).Requirements;
            for (int i2 = 0; i2 < cuaArray.length; ++i2) {
                cua cua3 = cuaArray[i2];
                this.b(cua3);
            }
        } else if (cua2 instanceof cuc) {
            cuc cuc2 = (cuc)cua2;
            cuc2.AttributeTypeName = cuc2.getAttributeName();
        } else if (cua2 instanceof cud) {
            cud cud2 = (cud)cua2;
            cud2.ResourceTypeName = cud2.pa();
        } else if (cua2 instanceof cue) {
            cue cue2 = (cue)cua2;
            cue2.SkillTypeName = cue2.Bu();
        }
    }
}

