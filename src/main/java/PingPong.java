import java.util.ArrayList;

public class PingPong {
  public static void main(String[] args) {}

  public ArrayList<Object> runPingPong(Integer yourNumber) {
    ArrayList<Object> results = new ArrayList<Object>();
    String ping = "PING!";
    for (Integer changeNumber = 1; changeNumber <= yourNumber; changeNumber++) {
      if (changeNumber%3 == 0) {
      results.add(ping);
      } else {
      results.add(changeNumber);
      }

    }
    System.out.println(results);
    return results;
  }
}
