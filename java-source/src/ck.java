/*
 * Decompiled with CFR.
 */
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.Annotations;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.io.ByteArrayInputStream;
import java.io.InvalidObjectException;
import java.util.List;

public class ck {
    private static final boolean bC = false;
    private static XStream xStream;
    private static List<lcq[]> hG;
    private static List<lcq[]> hH;

    public static String a(cx cx2) {
        ck.aS();
        String string = xStream.toXML(cx2);
        return string;
    }

    private static cx H(String string) {
        ck.aS();
        Object object = xStream.fromXML(string);
        assert (object instanceof cx);
        return (cx)object;
    }

    private static void aS() {
        if (xStream == null) {
            xStream = new XStream(new DomDriver());
            xStream.setClassLoader(r.cr);
            Annotations.configureAliases(xStream, cx.class);
            Annotations.configureAliases(xStream, cy.class);
        }
    }

    private static final lcq[] I(String string) {
        if (string == null) {
            return new lcq[0];
        }
        try {
            byte[] byArray = jry.tg("bitmap/" + string);
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byArray);
            jru jru2 = new jru();
            jru2.read(byteArrayInputStream);
            if (jru2.dRQ() != 24) {
                throw new InvalidObjectException("expected 24 bits per pixel");
            }
            if (jru2.getHeight() != 1) {
                throw new InvalidObjectException("expected 1 pixel height");
            }
            byteArrayInputStream.close();
            byte[] byArray2 = jru2.dRR();
            lcq[] lcqArray = new lcq[jru2.getWidth()];
            int n = 0;
            for (int i = 0; i < lcqArray.length; ++i) {
                int n2 = byArray2[n++] & 0xFF;
                int n3 = byArray2[n++] & 0xFF;
                int n4 = byArray2[n++] & 0xFF;
                lcqArray[i] = new lcq((float)n4 / 255.0f, (float)n3 / 255.0f, (float)n2 / 255.0f, 1.0f);
            }
            return lcqArray;
        }
        catch (Exception exception) {
            lfn.b(5, "SFCharacterCreatorDataConverter", "loadColorSliderColors() SliderBitmap [" + string + "] not found. Color customization wil not work. Error: " + exception);
            return new lcq[]{lcq.BRIGHT_WHITE};
        }
    }

    static {
        hG = lcn.abH(6);
        hH = lcn.abH(6);
    }
}

