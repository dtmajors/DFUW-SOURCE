/*
 * Decompiled with CFR.
 */
public class jnx {
    public int id = -1;
    public float x = 0.0f;
    public float y = 0.0f;
    public float width = 0.0f;
    public float height = 0.0f;

    public jnx(String string) {
        try {
            String[] stringArray = string.split(";");
            try {
                this.id = Integer.valueOf(stringArray[0]);
            }
            catch (Exception exception) {
                // empty catch block
            }
            this.x = Float.valueOf(stringArray[1]).floatValue();
            this.y = Float.valueOf(stringArray[2]).floatValue();
            this.width = Float.valueOf(stringArray[3]).floatValue();
            this.height = Float.valueOf(stringArray[4]).floatValue();
        }
        catch (Exception exception) {
            // empty catch block
        }
    }
}

