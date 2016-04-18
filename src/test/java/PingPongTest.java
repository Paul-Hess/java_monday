import org.junit.*;
import static org.junit.Assert.*;

public class PingPongTest {
  @Test
  public void PingPong_returnGivenNumber_Integer() {
    PingPong testPingPong = new PingPong();
    assertEquals((Integer)1, testPingPong.runPingPong(1));
  }
}
