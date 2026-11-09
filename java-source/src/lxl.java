/*
 * Decompiled with CFR.
 */
public class lxl
extends lvn {
    private static final lxl tsp = new lxl();
    @lok(value="Game Options")
    @lpl(value="Tooltip text for game options button")
    public static final lox tsq = tsp.BC("Game");
    @lok(value="Video Options")
    @lpl(value="Tooltip text for video options button")
    public static final lox tsr = tsp.BC("Video");
    @lok(value="Audio Options")
    @lpl(value="Tooltip text for audio options button")
    public static final lox tss = tsp.BC("Audio");
    @lok(value="Input Options")
    @lpl(value="Tooltip text for input options button")
    public static final lox tst = tsp.BC("Input");
    @lok(value="Input Binding Options")
    @lpl(value="Tooltip text for input binding options button")
    public static final lox tsu = tsp.BC("InputBindings");
    @lok(value="Audio Options")
    @lpl(value="Game options window header for audio options tab")
    public static final lox tsv = tsp.BC("HeaderAudioOptions");
    @lok(value="Video Options")
    @lpl(value="Game options window header for video options tab")
    public static final lox tsw = tsp.BC("HeaderVideoOptions");
    @lok(value="Game Options")
    @lpl(value="Game options window header for game options tab")
    public static final lox tsx = tsp.BC("HeaderGameOptions");
    @lok(value="Input Options")
    @lpl(value="Game options window header for input options tab")
    public static final lox tsy = tsp.BC("HeaderInputOptions");
    @lok(value="Input Bindings")
    @lpl(value="Game options window header for input bindings tab")
    public static final lox tsz = tsp.BC("HeaderInputBindings");

    protected lxl() {
        super("Options");
    }

    protected lxl(String string) {
        super("Options." + string);
    }
}

