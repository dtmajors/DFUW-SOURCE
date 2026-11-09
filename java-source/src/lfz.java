/*
 * Decompiled with CFR.
 */
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class lfz
extends lfy {
    protected static final lfr Out = lfr.rkC;
    private lht rkG = new lht();

    public static boolean a(lbr lbr2, lfy.a a2, String string, String string2, boolean bl) {
        lfz lfz2 = new lfz();
        boolean bl2 = true;
        if (a2 == lfy.a.rkK) {
            bl2 &= lfz2.g(string, string2, true);
        }
        lfu lfu2 = lfz2.d(a2);
        if (bl) {
            lfu2 = new lfv(lfu2);
        }
        lbr2.a(lfu2);
        if (a2 == lfy.a.rkL) {
            bl2 &= lfz2.aB(string, string2);
        }
        return bl2;
    }

    @Override
    protected lfu e(lfy.a a2) {
        switch (a2) {
            case rkK: {
                return new lfw(this.rkG);
            }
            case rkL: {
                return new lfx(this.rkG);
            }
        }
        assert (false);
        return null;
    }

    @Override
    protected boolean d(lfu lfu2) {
        if (lfu2 instanceof lfw) {
            lfw lfw2 = (lfw)lfu2;
            this.rkG = (lht)lfw2.rkG.esp();
            assert (this.rkG.esq() == lfw2.rkG.esq());
            return true;
        }
        if (lfu2.eqB()) {
            lfz.a(lfu2, this.rkG);
            return false;
        }
        assert (false) : lfu2;
        return false;
    }

    public String toString() {
        return null;
    }

    private boolean g(String string, String string2, boolean bl) {
        try {
            jtb jtb2 = new jtb();
            jtb2.a(string, string2, this.rkG);
            return true;
        }
        catch (Exception exception) {
            Out.ad(bl ? 4 : 5, "loading '" + string + "' failed: " + exception.toString());
            this.aB(string, string2);
            return false;
        }
    }

    public boolean aB(String string, String string2) {
        try {
            Object object2;
            jta jta2 = new jta();
            Document document = jta2.dSD();
            lju lju2 = new lju(0, 1, 0);
            Element element = jta2.a(document, string2, lju2);
            document.appendChild(element);
            for (Object object2 : this.rkG) {
                this.a((lht)object2, element, document);
            }
            object2 = new ByteArrayOutputStream();
            PrintStream printStream = new PrintStream((OutputStream)object2);
            if (!jsz.a(document, printStream)) {
                throw new bg("Error writing " + string);
            }
            printStream.flush();
            ((OutputStream)object2).flush();
            Object object3 = ((ByteArrayOutputStream)object2).toByteArray();
            object2 = loi.exd();
            if (!((loi)object2).a(string, false, (byte[])object3)) {
                throw new bg("Error writing " + string);
            }
        }
        catch (Exception exception) {
            return false;
        }
        return true;
    }

    private void a(lht lht2, Node node, Document document) {
        assert (lin.An(lht2.aFo));
        if (lht2.isLeaf()) {
            return;
        }
        Element element = document.createElement(lht2.aFo);
        node.appendChild(element);
        if (lht2.size() == 1 && ((lht)lht2.get(0)).isLeaf()) {
            Attr attr = document.createAttribute("Value");
            attr.setNodeValue(((lht)lht2.get((int)0)).aFo);
            element.setAttributeNode(attr);
        } else {
            for (lht lht3 : lht2) {
                this.a(lht3, element, document);
            }
        }
    }

    private static void a(lfu lfu2, lht lht2) {
        for (lht lht3 : lht2) {
            Object object;
            if (lht3.size() == 1 && ((lht)lht3.get(0)).size() == 0) {
                object = (lht)lht3.get(0);
                String string = ((lht)object).aFo;
                String string2 = lfu2.aA(lht3.aFo, string);
                assert (string2.equals(string));
                continue;
            }
            object = lfu2.zC(lht3.aFo);
            lfz.a((lfu)object, lht3);
        }
    }
}

