/*
 * Decompiled with CFR.
 */
import java.util.List;
import javax.swing.text.AttributeSet;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.Element;

public class kye
extends DefaultStyledDocument {
    private static final char[] qiR = new char[]{'\n'};
    private List qiS = lcn.emv();

    public void a(String string, AttributeSet attributeSet) {
        attributeSet = attributeSet.copyAttributes();
        char[] cArray = string.toCharArray();
        this.qiS.add(new DefaultStyledDocument.ElementSpec(attributeSet, 3, cArray, 0, string.length()));
    }

    public void a(AttributeSet attributeSet) {
        this.qiS.add(new DefaultStyledDocument.ElementSpec(attributeSet, 3, qiR, 0, 1));
        Element element = this.getParagraphElement(0);
        AttributeSet attributeSet2 = element.getAttributes();
        this.qiS.add(new DefaultStyledDocument.ElementSpec(null, 2));
        this.qiS.add(new DefaultStyledDocument.ElementSpec(attributeSet2, 1));
    }

    public void abi(int n) {
        DefaultStyledDocument.ElementSpec[] elementSpecArray = new DefaultStyledDocument.ElementSpec[this.qiS.size()];
        this.qiS.toArray(elementSpecArray);
        super.insert(n, elementSpecArray);
        this.qiS.clear();
    }
}

