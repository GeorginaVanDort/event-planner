public class Event {
  private Integer mGuests;
  private Integer mFoodPrice;
  private Integer mBeveragePrice;
  private Integer mEntertainmentPrice;
  private Integer mWaitStaffNumber;

//Constructor//
  public Event (Integer guests, Integer foodPrice, Integer beveragePrice, Integer entertainmentPrice, Integer waitStaffNumber) {
    mGuests = guests;
    mFoodPrice = foodPrice;
    mBeveragePrice = beveragePrice;
    mEntertainmentPrice = entertainmentPrice;
    mWaitStaffNumber = waitStaffNumber;
  }

  public Integer getGuests() {
    return mGuests;
  }

  public Integer getFoodPrice() {
      return mFoodPrice;
    }

  public Integer getBeveragePrice() {
    return mBeveragePrice;
  }

  public Integer getEntertainmentPrice() {
    return mEntertainmentPrice;
  }

  public Integer getWaitStaffNumber() {
    return mWaitStaffNumber;
  }
}
