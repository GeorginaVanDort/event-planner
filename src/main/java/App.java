import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console c = System.console();

    c.printf("Welcome to the Event-o-Matic Machine! \n Please enter the number of guests attending your event:\n");
    Integer guests = Integer.parseInt(c.readLine());

    c.printf("Catering is available at 3 price points:\n Option 1): Canapes at $10pp\n Option 2): Two course meal at $25pp\n Option 3): Four course meal at $35pp\n Please enter an option 1, 2, or 3:\n");
    Integer foodOption = Integer.parseInt(c.readLine());
    if (foodOption == 1) {
      Integer food = 10;
    } else if (foodOption == 2) {
      Integer food = 25;
    } else if (foodOption == 3) {
      Integer food = 35;
    } else {
        c.printf("Please enter 1, 2, or 3:");
        Integer foodOption = Integer.parseInt(c.readLine());
      }

    c.printf("Beverages are available at 3 price points:\n Option 1): Juice & Soda at $10pp\n Option 2): Wine at $15pp\n Option 3): Full Bar at $35pp\n Please enter an option 1, 2, or 3:\n");
    Integer drinks = Integer.parseInt(c.readLine());

    c.printf("Entertain is also available:\n Option 1): Our House DJ  playing all your favorites for a flat fee of $300\n Option 2): Deluxe Jazz Quintet playing live dinner and dance music for a flat fee of $700\n Please enter an option 1, 2, or 0:\n");
  }




    // String stringLength = myConsole.readLine();
    // int intLength = Integer.parseInt(stringLength);
    // System.out.println("Enter the width of your rectangle:");
    // String stringWidth = myConsole.readLine();
    // int intWidth = Integer.parseInt(stringWidth);
    // Rectangle rectangle = new Rectangle(intLength, intWidth);
    // boolean squareResult = rectangle.isSquare();
    // System.out.println("Is your rectangle a square, too? " + squareResult + "!");
  }
