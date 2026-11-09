/*
 * Decompiled with CFR.
 */
@llc
public class mag
extends maf {
    public static mag Instance = new mag();
    @lok(value="$(PlayerName) bows low to show some respect!")
    @lpl(value="System message for emote bow")
    public static final lox EmoteMessageBow = Instance.a("EmoteMessageBow", mag.Bk("PlayerName"));
    @lok(value="$(PlayerName) cries cause they want to.")
    @lpl(value="System message for emotecry ")
    public static final lox EmoteMessageCry = Instance.a("EmoteMessageCry", mag.Bk("PlayerName"));
    @lok(value="$(PlayerName) gets down and funky with some D.I.S.C.O.")
    @lpl(value="System message for emote disco")
    public static final lox EmoteMessageDisco = Instance.a("EmoteMessageDisco", mag.Bk("PlayerName"));
    @lok(value="$(PlayerName) quaffs a mug for their brethren.")
    @lpl(value="System message for emote drink")
    public static final lox EmoteMessageDrink = Instance.a("EmoteMessageDrink", mag.Bk("PlayerName"));
    @lok(value="$(PlayerName) depairs at the quantity of fail they percieve around them.")
    @lpl(value="System message for emote facepalm")
    public static final lox EmoteMessageFacepalm = Instance.a("EmoteMessageFacepalm", mag.Bk("PlayerName"));
    @lok(value="$(PlayerName) doth rock the scene like a mayhem machine.")
    @lpl(value="System message for emote mosh")
    public static final lox EmoteMessageMosh = Instance.a("EmoteMessageMosh", mag.Bk("PlayerName"));
    @lok(value="$(PlayerName) laughs it up!")
    @lpl(value="System message for emote lol")
    public static final lox EmoteMessageLol = Instance.a("EmoteMessageLol", mag.Bk("PlayerName"));
    @lok(value="$(PlayerName) feels your actions worthy of mockery.")
    @lpl(value="System message for emote mock")
    public static final lox EmoteMessageMock = Instance.a("EmoteMessageMock", mag.Bk("PlayerName"));
    @lok(value="$(PlayerName) celebrates the sheer amount of epic this moment brings with a slamming solo of the air-guitar variety.")
    @lpl(value="System message for emote guitar")
    public static final lox EmoteMessageGuitar = Instance.a("EmoteMessageGuitar", mag.Bk("PlayerName"));
    @lok(value="$(PlayerName) snaps off a smart salute. A Teeen HUT!")
    @lpl(value="System message for emote salute")
    public static final lox EmoteMessageSalute = Instance.a("EmoteMessageSalute", mag.Bk("PlayerName"));
    @lok(value="$(PlayerName) offers you a ticket to the Savage cannon show. Oh yeeaah!")
    @lpl(value="System message for emote flex")
    public static final lox EmoteMessageFlex = Instance.a("EmoteMessageFlex", mag.Bk("PlayerName"));
    @lok(value="$(PlayerName) gnoll-slaps you!")
    @lpl(value="System message for emote slap")
    public static final lox EmoteMessageSlap = Instance.a("EmoteMessageSlap", mag.Bk("PlayerName"));
    @lok(value="$(PlayerName) roars a rousing battle-cry!")
    @lpl(value="System message for emote rouse")
    public static final lox EmoteMessageRouse = Instance.a("EmoteMessageRouse", mag.Bk("PlayerName"));
    @lok(value="$(PlayerName) taunts in your general direction, and if you don't go away, they shall taunt you a second time!")
    @lpl(value="System message for emote taunt")
    public static final lox EmoteMessageTaunt = Instance.a("EmoteMessageTaunt", mag.Bk("PlayerName"));
    @lok(value="$(PlayerName) suggests that you should bring it.")
    @lpl(value="System message for emote bringit")
    public static final lox EmoteMessageBringit = Instance.a("EmoteMessageBringit", mag.Bk("PlayerName"));
    @lok(value="$(PlayerName) rallies their allies! TO ME!")
    @lpl(value="System message for emote rally")
    public static final lox EmoteMessageRally = Instance.a("EmoteMessageRally", mag.Bk("PlayerName"));
    @lok(value="$(PlayerName) decrees...death.")
    @lpl(value="System message for emote death")
    public static final lox EmoteMessageDeath = Instance.a("EmoteMessageDeath", mag.Bk("PlayerName"));
    @lok(value="$(PlayerName) grants...mercy!")
    @lpl(value="System message for emote mercy")
    public static final lox EmoteMessageMercy = Instance.a("EmoteMessageMercy", mag.Bk("PlayerName"));
    @lok(value="$(PlayerName) plays a tiny air-violin in the time honored tradition of evoking sarcasm.")
    @lpl(value="System message for emote violin")
    public static final lox EmoteMessageViolin = Instance.a("EmoteMessageViolin", mag.Bk("PlayerName"));
    @lok(value="$(PlayerName) waves in your general direction.")
    @lpl(value="System message for emote wave")
    public static final lox EmoteMessageWave = Instance.a("EmoteMessageWave", mag.Bk("PlayerName"));
    @lok(value="Bow before $(PlayerName) for they declare their sovereignty over you all! Prepare to be opressed!")
    @lpl(value="System message for emote wave")
    public static final lox EmoteMessageRoyal = Instance.a("EmoteMessageRoyal", mag.Bk("PlayerName"));
    @lok(value="$(PlayerName) quaffs a barrel of Bunny Hops Beer: the cause of, and solution to, all of life's problems!")
    @lpl(value="System message for emote oktoberfest")
    public static final lox EmoteMessageOktoberfest = Instance.a("EmoteMessageOktoberfest", mag.Bk("PlayerName"));
    @lok(value="$(PlayerName) makes a snow angel...run! .")
    @lpl(value="System message for emote snow angel")
    public static final lox EmoteMessageAngel = Instance.a("EmoteMessageAngel", mag.Bk("PlayerName"));
    @lok(value="Darkness falls across the land, the midnight hour is close at hand, $(PlayerName) crawls in search of blood, to terrorize your neighborhood")
    @lpl(value="System message for emote brains")
    public static final lox EmoteMessageBrains = Instance.a("EmoteMessageBrains", mag.Bk("PlayerName"));
    @lok(value="You do not own emote $(EmoteName)")
    @lpl(value="System message for emote usage which a player does not exist")
    public static final lox EmoteMessageDoNotOwn = Instance.a("EmoteMessageDoNotOwn", mag.Bk("EmoteName"));
    @lok(value="You already own $(EmoteName)")
    @lpl(value="System message when a player tries to add an existing emote by double clicking on the emote selentine item")
    public static final lox EmoteMessageAlreadyOwn = Instance.a("EmoteMessageAlreadyOwn", mag.Bk("EmoteName"));
    @lok(value="You already own $(SkinName.NameSingular)")
    @lpl(value="System message when a player tries to add an existing skin by double clicking on the skin selentine item")
    public static final lox SkinMessageAlreadyOwn = Instance.a("SkinMessageAlreadyOwn", mag.Bl("SkinName"));

    protected mag(String string) {
        super("Emotes." + string);
    }

    private mag() {
        super("Emotes");
    }
}

