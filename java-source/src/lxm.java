/*
 * Decompiled with CFR.
 */
public class lxm
extends lxl {
    private static final lxm tsA = new lxm();
    @lok(value="Master Volume")
    @lpl(value="\"Master Volume\" setting in Audio Options tab")
    public static final lox tsB = tsA.BC("LabelMasterVolume");
    @lok(value="Music Volume")
    @lpl(value="\"Music Volume\" setting in Audio Options tab")
    public static final lox tsC = tsA.BC("LabelMusicVolume");
    @lok(value="Environmental Volume")
    @lpl(value="\"Environmental Volume\" setting in Audio Options tab")
    public static final lox tsD = tsA.BC("LabelEnvironmentalVolume");
    @lok(value="Whisper")
    @lpl(value="Text for the whisper sound enabled label.")
    public static final lox tsE = tsA.BC("LabelWhisperSoundEnabled");
    @lok(value="Friend Online")
    @lpl(value="Text for the friend online sound enabled label.")
    public static final lox tsF = tsA.BC("LabelFriendOnlineSoundEnabled");
    @lok(value="Friend Offline")
    @lpl(value="Text for the friend offline sound enabled label.")
    public static final lox tsG = tsA.BC("LabelFriendOfflineSoundEnabled");

    protected lxm() {
        super("AudioOptions");
    }
}

