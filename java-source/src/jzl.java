/*
 * Decompiled with CFR.
 */
import java.util.Iterator;
import java.util.Map;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class jzl {
    public static final lju oRy = new lju(0, 1, 0);
    private jta oQa = new jta();

    public void f(Map map, String string) {
        if (map == null) {
            return;
        }
        if (string == null) {
            return;
        }
        Document document = this.oQa.dSD();
        Element element = this.oQa.a(document, "SFXML", oRy);
        document.appendChild(element);
        Iterator<Object> iterator = map.values().iterator();
        Object var6_6 = null;
        while (iterator.hasNext()) {
            var6_6 = iterator.next();
            if (!(var6_6 instanceof dug)) continue;
            element.appendChild(this.a(document, (dug)var6_6));
        }
        iterator = map.entrySet().iterator();
        Map.Entry entry = null;
        String string2 = null;
        while (iterator.hasNext()) {
            entry = (Map.Entry)iterator.next();
            string2 = (String)entry.getKey();
            if (!string2.startsWith("EffectClass") && !string2.startsWith("Component") || !(entry.getValue() instanceof duf)) continue;
            element.appendChild(this.a(document, (duf)entry.getValue()));
        }
        jsz.b(document, new jrw(string));
    }

    private Element a(Document document, duf duf2) {
        Element element = document.createElement("SFClass");
        element.appendChild(this.oQa.a(document, duf2.getName(), "SFName"));
        element.appendChild(this.oQa.a(document, duf2.getPackageName(), "SFPackageName"));
        if (duf2.bAZ() == null) {
            element.appendChild(this.oQa.a(document, "NULL", "SFConstantName"));
        } else {
            element.appendChild(this.oQa.a(document, duf2.bAZ(), "SFConstantName"));
        }
        duj[] dujArray = duf2.bBa();
        for (int i2 = 0; i2 < dujArray.length; ++i2) {
            element.appendChild(this.a(document, dujArray[i2]));
        }
        return element;
    }

    private Element a(Document document, duj duj2) {
        Element element = document.createElement("SFField");
        element.appendChild(this.oQa.a(document, duj2.getName(), "SFName"));
        element.appendChild(this.oQa.a(document, duj2.bBd(), "SFValueName"));
        element.appendChild(this.oQa.a(document, duj2.bBh(), "SFConstraintName"));
        return element;
    }

    private Element a(Document document, dug dug2) {
        Element element = document.createElement("SFEnumeration");
        element.appendChild(this.oQa.a(document, dug2.getName(), "SFName"));
        element.appendChild(this.oQa.a(document, dug2.getClassName(), "SFClassName"));
        element.appendChild(this.oQa.a(document, dug2.bBd(), "SFValueName"));
        dui[] duiArray = dug2.bBc();
        for (int i2 = 0; i2 < duiArray.length; ++i2) {
            element.appendChild(this.a(document, duiArray[i2]));
        }
        return element;
    }

    private Element a(Document document, dui dui2) {
        Element element = document.createElement("SFEnumerationItem");
        element.appendChild(this.oQa.a(document, dui2.getName(), "SFName"));
        element.appendChild(this.oQa.a(document, dui2.getValue(), "SFValue"));
        return element;
    }
}

