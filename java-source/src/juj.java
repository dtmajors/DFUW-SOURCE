/*
 * Decompiled with CFR.
 */
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.Annotations;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.util.List;

public class juj {
    private les ResourceTree = lea.enW();

    public void uh(String string) {
        XStream xStream = new XStream(new DomDriver());
        xStream.setClassLoader(r.cr);
        Annotations.configureAliases(xStream, cts.class);
        String string2 = null;
        try {
            string2 = jry.ti(string);
        }
        catch (Exception exception) {
            throw new bs("Parsing of file '" + string + "' failed.", exception);
        }
        Object object = xStream.fromXML(string2);
        List list = (List)object;
        for (cts cts2 : list) {
            cts2.ResourceType = this.ResourceTree.getType(cts2.ResourceName);
            if (cts2.ResourceType <= 0) {
                throw new bj("ResourceName '" + cts2.ResourceName + "' is invalid.");
            }
            cts2.ResourceName = null;
            if (cxj.yg(cts2.ResourceType)) {
                throw new bj("MovementSpeedInfo for resource '" + cts2.pa() + "' already exists.");
            }
            cxj.e(cts2);
        }
    }
}

