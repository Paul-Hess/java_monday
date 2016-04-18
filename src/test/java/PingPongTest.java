import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class PingPongTest {
  // @Test
  // public void PingPong_returnGivenNumber_Integer() {
  //   PingPong testPingPong = new PingPong();
  //   assertEquals((Integer)1, testPingPong.runPingPong(1));
  // }

  @Test
  public void PingPong_countUpToGivenNumber_Array() {
    PingPong testPingPong = new PingPong();
    ArrayList<Object> expected = new ArrayList<Object>();
    expected.add(1);
    expected.add(2);
    ArrayList<Object> testReturn = testPingPong.runPingPong(2);
    assertEquals(expected, testReturn);
  }
}
