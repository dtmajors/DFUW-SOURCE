/*
 * Decompiled with CFR.
 */
public class lyj
extends lyi {
    private static final lyj tFo = new lyj();
    @lok(value="Toggle Timestamps")
    @lpl(value="Used in the left menu bar. The tooltip for the toggle timestamps button.")
    public static final lox tFp = tFo.BC("ToggleTimestamps");
    @lok(value="Small Font")
    @lpl(value="Used in the left menu bar. The tooltip for the small font button.")
    public static final lox tFq = tFo.BC("SmallFont");
    @lok(value="Medium Font")
    @lpl(value="Used in the left menu bar. The tooltip for the medium font button.")
    public static final lox tFr = tFo.BC("MediumFont");
    @lok(value="Large Font")
    @lpl(value="Used in the left menu bar. The tooltip for the large font button.")
    public static final lox tFs = tFo.BC("LargeFont");

    protected lyj(String string) {
        super("Chat." + string);
    }

    private lyj() {
        super("Chat");
    }
}

