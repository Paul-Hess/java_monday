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
    ArrayList<Integer> expected = new ArrayList<Integer>();
    expected.add(1);
    ArrayList<Integer> testReturn = testPingPong.runPingPong(1);
    assertEquals(expected, testReturn);
  }
}
