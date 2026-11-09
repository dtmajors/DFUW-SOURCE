/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 *  ep
 */
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class kal {
    private final jta oQa = new jta();

    public Element a(Document document, ej ej2) {
        switch (ej2.getDataType()) {
            case 0: {
                return this.a(document, (eq)ej2);
            }
            case 1: {
                return this.a(document, (es)ej2);
            }
            case 2: {
                return this.a(document, (et)ej2);
            }
            case 3: {
                return this.a(document, (ew)ej2);
            }
            case 4: {
                return this.a(document, (ev)ej2);
            }
            case 5: {
                return this.a(document, (fe)ej2);
            }
            case 6: {
                return this.a(document, (fh)ej2);
            }
            case 7: {
                return this.a(document, (ff)ej2);
            }
        }
        return null;
    }

    public Element a(Document document, ej ej2, cbx cbx2) {
        switch (ej2.getDataType()) {
            case 2: {
                return this.a(document, (et)ej2, cbx2);
            }
        }
        return this.a(document, ej2);
    }

    public Element b(Document document, int n) {
        return this.oQa.a(document, ep.aM((int)n), "SFAttributeName");
    }

    public Element b(Document document, int n, String string) {
        return this.oQa.a(document, ep.aM((int)n), string);
    }

    private Element a(Document document, eq eq2) {
        Element element = document.createElement("SFBooleanAttribute");
        element.appendChild(this.b(document, eq2.getType()));
        element.appendChild(this.oQa.a(document, eq2.getBooleanValue(), "SFValue"));
        return element;
    }

    private Element a(Document document, es es2) {
        Element element = document.createElement("SFEnchantmentAttribute");
        element.appendChild(this.b(document, es2.getType()));
        element.appendChild(this.oQa.a(document, es2.fJ(), "SFEnchantmentName"));
        element.appendChild(this.oQa.a(document, es2.fE(), "SFEnchantmentStrength"));
        return element;
    }

    private Element a(Document document, et et2) {
        Element element = document.createElement("SFFloatAttribute");
        element.appendChild(this.b(document, et2.getType()));
        element.appendChild(this.oQa.a(document, et2.fN(), "SFValue"));
        return element;
    }

    private Element a(Document document, et et2, cbx cbx2) {
        Element element = document.createElement("SFFloatAttribute");
        element.appendChild(this.b(document, et2.getType()));
        if (ep.aR((int)et2.getType())) {
            ez ez2 = (ez)et2;
            element.appendChild(this.oQa.a(document, ez2.fO(), "SFValue"));
            int n = ep.k((int)et2.getType(), (int)4);
            et et3 = cbx2.fi().ah(n);
            element.appendChild(this.oQa.a(document, et3.fN(), "SFMaxMaxValue"));
            n = ep.k((int)et2.getType(), (int)2);
            et3 = cbx2.fi().ah(n);
            element.appendChild(this.oQa.a(document, ((ez)et3).fO(), "SFMaxValue"));
            n = ep.k((int)et2.getType(), (int)1);
            et3 = cbx2.fi().ah(n);
            element.appendChild(this.oQa.a(document, et3.fN(), "SFMinValue"));
        } else {
            element.appendChild(this.oQa.a(document, et2.fN(), "SFValue"));
        }
        return element;
    }

    private Element a(Document document, ev ev2) {
        Element element = document.createElement("SFGUIDAttribute");
        element.appendChild(this.b(document, ev2.getType()));
        if (ev2.fP() != null) {
            element.appendChild(this.oQa.a(document, ev2.fP().toString(), "SFValue"));
        } else {
            element.appendChild(this.oQa.a(document, "NULL", "SFValue"));
        }
        return element;
    }

    private Element a(Document document, ew ew2) {
        Element element = document.createElement("SFIntegerAttribute");
        element.appendChild(this.b(document, ew2.getType()));
        element.appendChild(this.oQa.a(document, ew2.fQ(), "SFValue"));
        return element;
    }

    private Element a(Document document, fe fe2) {
        Element element = document.createElement("SFPositionalInfoAttribute");
        element.appendChild(this.b(document, fe2.getType()));
        return element;
    }

    private Element a(Document document, ff ff2) {
        Element element = document.createElement("SFStringAttribute");
        element.appendChild(this.b(document, ff2.getType()));
        if (ff2.getStringValue() != null) {
            element.appendChild(this.oQa.a(document, ff2.getStringValue(), "SFValue"));
        } else {
            element.appendChild(this.oQa.a(document, "NULL", "SFValue"));
        }
        return element;
    }

    private Element a(Document document, fh fh2) {
        if (fh2.gy() == null) {
            // empty if block
        }
        Element element = document.createElement("SFVector3Attribute");
        element.appendChild(this.b(document, fh2.getType()));
        if (fh2.gy() != null) {
            element.appendChild(this.oQa.a(document, fh2.gy(), "SFValue"));
        } else {
            element.appendChild(this.oQa.a(document, "NULL", "SFVector3"));
        }
        return element;
    }
}

