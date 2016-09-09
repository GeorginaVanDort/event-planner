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


}
