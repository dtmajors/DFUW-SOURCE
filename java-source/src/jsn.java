/*
 * Decompiled with CFR.
 */
import com.thoughtworks.xstream.core.util.QuickWriter;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.io.xml.PrettyPrintWriter;
import java.io.Writer;

class jsn
extends DomDriver {
    jsn() {
    }

    @Override
    public HierarchicalStreamWriter createWriter(Writer writer) {
        return new PrettyPrintWriter(this, writer){
            boolean nVn;
            final /* synthetic */ jsn nVo;
            {
                this.nVo = jsn2;
                super(writer);
                this.nVn = false;
            }

            public void startNode(String string) {
                super.startNode(string);
                this.nVn = string.equals("string");
            }

            protected void writeText(QuickWriter quickWriter, String string) {
                if (this.nVn) {
                    quickWriter.write("<![CDATA[");
                    quickWriter.write(string);
                    quickWriter.write("]]>");
                } else {
                    quickWriter.write(string);
                }
            }
        };
    }
}

