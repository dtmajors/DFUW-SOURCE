/*
 * Decompiled with CFR.
 */
public class lzb
extends lvn {
    private static lzb tNg = new lzb();
    @lok(value="Window Options")
    @lpl(value="Tooltip text for the window options button")
    public static final lox tNh = tNg.BC("TooltipWindowOptions");
    @lok(value="Window Opacity Options")
    @lpl(value="Tooltip text for the window opacity options button")
    public static final lox tNi = tNg.BC("TooltipWindowOpacityOptions");
    @lok(value="Pin Window In Game Mode")
    @lpl(value="Tooltip text for the window pin button")
    public static final lox tNj = tNg.BC("TooltipWindowPin");
    @lok(value="Close Window")
    @lpl(value="Tooltip text for the close button")
    public static final lox tNk = tNg.BC("TooltipWindowClose");
    @lok(value="[$(Text)]")
    @lpl(value="Text for the key binding that opens or toggles this window")
    public static final lox tNl = tNg.a("KeyBindingText", lzb.Bk("Text"));

    protected lzb() {
        super("WindowFrame");
    }
}

