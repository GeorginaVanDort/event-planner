public class Event {
  private Integer mGuests;
  private Integer mFoodPrice;
  private Integer mBeveragePrice;
  private Integer mEntertainmentPrice;
  private Integer mWaitStaffNumber;
  private Integer mTotalFoodPrice;
  private Integer mTotalBeveragePrice;
  private Integer mTotalWaitStaffPrice;
  private Integer mTotalPrice;


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

  public Integer getTotalFoodPrice() {
    mTotalFoodPrice = mGuests*mFoodPrice;
    return mTotalFoodPrice;
  }

  public Integer getTotalBeveragePrice() {
    mTotalBeveragePrice = mGuests*mBeveragePrice;
    return mTotalBeveragePrice;
  }

  public Integer getTotalWaitStaffPrice() {
    mTotalWaitStaffPrice = mWaitStaffNumber*100;
    return mTotalWaitStaffPrice;
  }

  public Integer getTotalPrice() {
    mTotalPrice = (mGuests*mFoodPrice) + (mGuests*mBeveragePrice) + (mWaitStaffNumber*100) + mEntertainmentPrice;
    return mTotalPrice;
  }
}
