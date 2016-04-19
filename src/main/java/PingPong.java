import java.util.ArrayList;

public class PingPong {
  public static void main(String[] args) {}

  public static ArrayList<Object> runPingPong(Integer yourNumber) {
    ArrayList<Object> results = new ArrayList<Object>();
    String ping = "PING!";
    String pong = "PONG!";
    String pingpong = "PING-PONG!";
    for (Integer changeNumber = 1; changeNumber <= yourNumber; changeNumber++) {
      if (changeNumber% 15 == 0) {
        results.add(pingpong);
      } else if (changeNumber% 3 == 0) {
        results.add(ping);
      } else if (changeNumber% 5 == 0) {
        results.add(pong);
      } else {
        results.add(changeNumber);
      }

    }
    System.out.println(results);
    return results;
  }
}
