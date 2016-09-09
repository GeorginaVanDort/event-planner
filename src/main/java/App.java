import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console c = System.console();

    c.printf("Welcome to the Event-o-Matic Machine! Event-o-Matic will estimate the cost of your event.\n Please enter the number of guests attending your event:\n");
    Integer guests = Integer.parseInt(c.readLine());

    c.printf("Catering is available at 3 price points:\n Option 1): Canapes at $10pp\n Option 2): Two course meal at $25pp\n Option 3): Four course meal at $35pp\n Please enter an option 1, 2, or 3:\n");
    Integer food = Integer.parseInt(c.readLine());
    if (food == 1) {
        food = 10;
      } else if (food == 2) {
        food = 25;
      } else if (food == 3) {
        food = 35;
      }
    c.printf("So far we have %d guests at a cost of %d per person\n Let's continue:\n", guests, food);

    c.printf("Beverages are available at 3 price points:\n Option 1): Juice & Soda at $10pp\n Option 2): Wine at $15pp\n Option 3): Full Bar at $35pp\n Please enter an option 1, 2, or 3:\n");
    Integer drinks = Integer.parseInt(c.readLine());
    if (drinks == 1) {
        drinks = 10;
      } else if (drinks == 2) {
        drinks = 15;
      } else if (drinks == 3) {
        drinks = 35;
      }
    c.printf("That's a cost of %d per person\n Let's continue:\n", guests, drinks);

    c.printf("Entertainment is also available:\n Option 1): Our House DJ  playing all your favorites for a flat fee of $300\n Option 2): Deluxe Jazz Quintet playing live dinner and dance music for a flat fee of $700\n Please enter an option 1, 2, or 0:\n");
    Integer band = Integer.parseInt(c.readLine());
    if (band == 1) {
        band = 300;
      } else if (band == 2) {
        band = 700;
      } else if (band == 0) {
        band = 0;
      }
    c.printf("OK. Finally, how many wait staff would you like to serve your guests? Wait staff are $100 per person for the entire event. \n Please enter a number:");
    Integer staff = Integer.parseInt(c.readLine());

    Event event = new Event(guests, food, drinks, band, staff);
    Integer totalFood = event.getTotalFoodPrice();
    Integer totalDrinks = event.getTotalBeveragePrice();
    Integer totalPrice = event.getTotalPrice();

    c.printf("Thank you! Your event details are as follows:\n Total Catering Price is $%d\n Total Beverages Price is $%d\nTotal Price including all options is $%d\n", totalFood, totalDrinks, totalPrice);
  }

}
