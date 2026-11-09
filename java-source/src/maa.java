/*
 * Decompiled with CFR.
 */
public class maa
extends lzz {
    private static final maa tZu = new maa();
    @lok(value="Your nets are working well for you. Your crates are slowly filling up!")
    @lol(value="too much spam")
    public static final lox tZv = tZu.BC("SuccessfullCommon");
    @lok(value="This is a nice place to fish! Plenty of fish are entering your fishing crate!")
    @lol(value="too much spam")
    public static final lox tZw = tZu.BC("SuccessfullOuter");
    @lok(value="Call all deckhands, deploy all nets, and bait the waters! You have struck rich fishing grounds!")
    @lol(value="too much spam")
    public static final lox tZx = tZu.BC("SuccessfullDanger");
    @lok(value="Your ship's nets have caught $(Quantity) $(Resource.Name$(Quantity.Plurality)), that is now contained in the ship's $(CrateResource.NameSingular).")
    @lpl(value="Displayed to the player on the ship helmet everytime some new resources are added in the fish barrel.")
    public static final lox tZy = tZu.a("Successfull", maa.Bl("Resource"), maa.Bh("Quantity"), maa.Bl("CrateResource"));
    @lok(value="Your ship has scraped  $(Quantity) $(Resource.Name$(Quantity.Plurality)), that has been placed in the $(CrateResource.NameSingular).")
    @lpl(value="Displayed to the player on the ship helmet everytime some new resources are added in the fish barrel.")
    public static final lox tZz = tZu.a("SuccessfullScrape", maa.Bl("Resource"), maa.Bh("Quantity"), maa.Bl("CrateResource"));
    @lok(value="The decks are awash with fish! Head to port, unload your catch and come back for more action!")
    @lol(value="too much spam")
    public static final lox tZA = tZu.BC("ScreenBarrelFull");
    @lok(value="No more resources can be added to your ship's fishing crate because it is full.")
    @lpl(value="Displayed to the player on the ship helmet notifying him that the fish barrel is full. System message.")
    public static final lox tZB = tZu.BC("BarrelFull");
    @lok(value="There are no more fish left to be caught in this area. Try again later.")
    @lpl(value="Displayed to the player on the ship helmet notifying him that this fishing node is empty. System message.")
    public static final lox tZC = tZu.BC("WaterEmpty");
    @lok(value="There is nothing more to get dredged up from the sea bed. Try again later.")
    @lpl(value="Displayed to the player on the ship helmet notifying him that this sea treasure node is empty. System message.")
    public static final lox tZD = tZu.BC("WaterTreasureEmpty");
    @lok(value="Make sail to other shoals. These waters are barren!")
    @lol(value="too much spam")
    public static final lox tZE = tZu.BC("ScreenWaterEmpty");
    @lok(value="You cannot fish near land. Head out to deeper waters!")
    @lpl(value="Displayed to the player on the ship helmet notifying him that he can not fish in the current tile. System message.")
    public static final lox tZF = tZu.BC("InvalidFishingTile");
    @lok(value="Hmm... the nets are still empty! Maybe it's time to head to deeper waters!")
    @lol(value="too much spam")
    public static final lox tZG = tZu.BC("ScreenInvalidFishingTile");

    protected maa(String string) {
        super("Fishing." + string);
    }

    private maa() {
        super("Fishing");
    }
}

