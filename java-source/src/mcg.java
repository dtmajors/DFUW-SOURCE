/*
 * Decompiled with CFR.
 */
public class mcg
extends lzh {
    private static final mcg utA = new mcg();
    @lok(value="Market Unknown error.")
    @lpl(value="generic error message for market unknown errors.")
    public static final lox uml = utA.BC("UnknownError");
    @lok(value="There was a problem connecting to the database.")
    @lpl(value="error message displayed by the market when there is a problem connecting to the database.")
    public static final lox utB = utA.BC("DatabaseProblem");
    @lok(value="The filter was invalid.")
    @lpl(value="error message displayed by the market when the user enters an invalid filter.")
    public static final lox utC = utA.BC("InvalidFilter");
    @lok(value="You have reached the maximum allowed number of sell orders. You can cancel one of the existing sell orders if you want.")
    @lpl(value="error message displayed by the market when the player attempts to insert more sell orders that he is allowed to.")
    public static final lox utD = utA.BC("TooManyItemsForSale");
    @lok(value="You can not place this item for sale because its durability is below $(Durability)%.")
    @lpl(value="Error message displayed by the market when the sold item has low durability.")
    public static final lox utE = utA.a("DurabilityTooLow", mcg.Bh("Durability"));
    @lok(value="You can not place this item for sale because its health is below $(Health)%.")
    @lpl(value="Error message displayed by the market when the sold item has low health.")
    public static final lox utF = utA.a("HealthTooLow", mcg.Bh("Health"));
    @lok(value="The amount you have entered for this order is too small. Minimum allowed value is $(MinValue).")
    @lpl(value="Error message displayed by the market when the placed order has a small price.")
    public static final lox utG = utA.a("PriceTooLow", mcg.Bh("MinValue"));
    @lok(value="Item does not exist.")
    @lpl(value="error message displayed by the market when the player attempts to sell an item that no longer exists.")
    public static final lox utH = utA.BC("ItemDoesNotExist");
    @lok(value="Item is Locked.")
    @lpl(value="error message displayed by the market when the player attempts to sell an item that is locked.")
    public static final lox utI = utA.BC("ItemIsLocked");
    @lok(value="This type of item can not be sold in the market.")
    @lpl(value="error message displayed by the market when the player attempts to sell an item that can not be sold in the market.")
    public static final lox utJ = utA.BC("TypeOfItemCanNotBeSold");
    @lok(value="You do not have enough gold in your backpack to pay for this transaction.")
    @lpl(value="error message displayed by the market when the player does not have enough gold in their backpack to pay for the transaction.")
    public static final lox utK = utA.BC("NotEnoughGoldToPayForThisTransaction");
    @lok(value="Could not remove item from your inventory.")
    @lpl(value="Error message displayed by the market when the sold item can not be removed from the player's inventory.")
    public static final lox utL = utA.BC("CouldNotRemoveItem");
    @lok(value="Your sell order was succesfully placed in the market.")
    @lpl(value="Confirmation message displayed by the market when a sell order is succesfully placed in the market.")
    public static final lox utM = utA.BC("SellOrderSuccess");
    @lok(value="You cannot sell a bag that is not empty.")
    @lpl(value="Confirmation message displayed by the market when a sell order for a non-empty bag is placed in the market.")
    public static final lox utN = utA.BC("CannotSellBag");
    @lok(value="Sorry, item is no longer available.")
    @lpl(value="Error message displayed by the market when attempting to buy an item that is no longer available.")
    public static final lox utO = utA.BC("ItemNoLongerAvailable");
    @lok(value="You do not have enough gold in your backpack to buy this item.")
    @lpl(value="Error message displayed by the market when the player tries to buy an item without having enough gold in his backpack.")
    public static final lox utP = utA.BC("NotEnoughGoldToBuyItem");
    @lok(value="There was a problem creating the new item in your inventory.")
    @lpl(value="Error message displayed by the market if item creation fails because of a technical problem.")
    public static final lox utQ = utA.BC("ProblemCreatingNewItem");
    @lok(value="Item was succesfully added to your backpack.")
    @lpl(value="Confirmation message displayed by the market if an item was succesfully bought and added to players inventory.")
    public static final lox utR = utA.BC("ItemSuccesfullyBought");
    @lok(value="Your sell order of $(Quantity) $(Res.Name$(Quantity.Plurality)) was fulfilled by $(Buyer). $(Profit) gold was added to your bank.")
    @lpl(value="Message displayed to player when one of his items is sold.")
    public static final lox utS = utA.a("ItemSold", mcg.Bh("Quantity"), mcg.Bl("Res"), mcg.Bk("Buyer"), mcg.Bh("Profit"));
    @lok(value="You can not buy your own items.")
    @lpl(value="Message displayed to player when he is trying to buy one of his own items.")
    public static final lox utT = utA.BC("CanNotBuyOwn");
    @lok(value="You have reached the maximum allowed number of buy orders. You can cancel one of the existing buy orders if you want.")
    @lpl(value="error message displayed by the market when the player attempts to insert more buy orders that he is allowed to.")
    public static final lox utU = utA.BC("TooManyBuyOrders");
    @lok(value="You can not place a buy order for this type of item. Buy orders are allowed only for stackable items.")
    @lpl(value="error message displayed by the market when the player attempts to place a buy order for a non stackable item.")
    public static final lox utV = utA.BC("CanNotAddBuyOrderForItemType");
    @lok(value="Buy order was succesfully placed in the market.")
    @lpl(value="Confirmation message displayed by the market if a buy order was successfuly placed in the market.")
    public static final lox utW = utA.BC("BuyOrderSuccess");
    @lok(value="Sorry, buy order is no longer available.")
    @lpl(value="Error message displayed by the market when attempting to fulfill a buy order that is no longer available.")
    public static final lox utX = utA.BC("OrderNoLongerAvailable");
    @lok(value="You do not have enough resources in your backpack to fulfill this buy order.")
    @lpl(value="Error message displayed by the market when the players attempts to fulfill a buy order without having enough items in his backpack.")
    public static final lox utY = utA.BC("NotEnoughResourcesToFulfill");
    @lok(value="You succesfully fulfilled the buy order.")
    @lpl(value="Confirmation message displayed by the market if the buy order was succesfully fulfilled.")
    public static final lox utZ = utA.BC("BuyOrderFulfilledSuccess");
    @lok(value="Your buy order of $(Quantity) $(Res.Name$(Quantity.Plurality)) was fulfilled by $(Seller). The items were added to your bank.")
    @lpl(value="Message displayed to player when one of his items is sold.")
    public static final lox uua = utA.a("BuyOrderFulfilled", mcg.Bh("Quantity"), mcg.Bl("Res"), mcg.Bk("Seller"));
    @lok(value="You can not fulfill your own buy order.")
    @lpl(value="Message displayed to player when he is trying to fulfill one of his own buy orders.")
    public static final lox uub = utA.BC("CanNotFulfillOwnBuyOrder");
    @lok(value="You can not fulfill this buy order because the courier cost exceeds the profit of this transaction.")
    @lpl(value="Message displayed to player when he is trying to fulfill a buy order whose courier fee is more than the profit.")
    public static final lox uuc = utA.BC("CanNotFulfillBuyOrderProfitSmallerThanCourier");
    @lok(value="Cancelled order was not found.")
    @lpl(value="Error message displayed by the market when the players attempts to cancel an order that could not be found.")
    public static final lox uud = utA.BC("CanceledOrderNotFound");
    @lok(value="Your order was succesfully cancelled.")
    @lpl(value="Confirmation message displayed by the market if the order was succesfully cancelled.")
    public static final lox uue = utA.BC("CancelSuccesful");
    @lok(value="Your sell order of $(Quantity) $(Resource.Name$(Quantity.Plurality)) has expired. The item was returned to your bank.")
    @lpl(value="Message displayed to the player if one of his sell orders expires.")
    public static final lox uuf = utA.a("SellOrderExpired", mcg.Bh("Quantity"), mcg.Bl("Resource"));
    @lok(value="Your buy order of $(Quantity) $(Resource.Name$(Quantity.Plurality)) has expired. Your gold was returned to your bank.")
    @lpl(value="Message displayed to the player if one of his buy orders expires.")
    public static final lox uug = utA.a("BuyOrderExpired", mcg.Bh("Quantity"), mcg.Bl("Resource"));
    @lok(value="You accessed the market at $(TileID).")
    @lpl(value="Message displayed to the player when he starts using a market.")
    @lpk(value="se_market_open", exQ=6.0)
    public static final lox uuh = utA.a("YouOpenedMarket", mcg.Br("TileID"));
    @lok(value="You stopped using the market.")
    @lpl(value="Message displayed to the player when he stops using the market.")
    @lpk(value="se_market_close", exQ=6.0)
    public static final lox uui = utA.BC("YouClosedMarket");
    @lok(value="This transaction can not be performed from this market.")
    @lpl(value="Message displayed to the player when he tries to buy/sell something that is not accesible from his current market.")
    public static final lox uuj = utA.BC("NotAccesible");

    protected mcg(String string) {
        super("Market." + string);
    }

    private mcg() {
        super("Market");
    }
}

