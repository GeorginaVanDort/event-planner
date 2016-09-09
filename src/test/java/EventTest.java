import org.junit.*;
import static org.junit.Assert.*;

public class EventTest {

  @Test
    public void newEvent_instantiatesCorrectly_true() {
      Event testEvent = new Event(12, 25, 10, 300, 5);
      assertEquals(true, testEvent instanceof Event);
    }

  @Test
    public void getGuests_returnNumberOfGuests_Integer() {
      Event testEvent = new Event(12, 25, 10, 300, 5);
      assertEquals(12, (int) testEvent.getGuests());
    }

  @Test
    public void getFoodPrice_returnFoodPrice_Integer() {
      Event testEvent = new Event(12, 25, 10, 300, 5);
      assertEquals(25, (int) testEvent.getFoodPrice());
    }

  @Test
    public void getTotalFoodPrice_calculateTotalFoodPrice_Integer() {
      Event testEvent = new Event(12, 25, 10, 300, 5);
      assertEquals(300, (int) testEvent.getTotalFoodPrice());
    }

  @Test
    public void getTotalBeveragePrice_calculateTotalBeveragePrice_Integer() {
      Event testEvent = new Event(12, 25, 10, 300, 5);
      assertEquals(120, (int) testEvent.getTotalBeveragePrice());
    }

  @Test
    public void getTotalWaitStaffPrice_calculateTotalWaitStaffPrice_Integer() {
      Event testEvent = new Event(12, 25, 10, 300, 5);
      assertEquals(500, (int) testEvent.getTotalWaitStaffPrice());
    }
}
