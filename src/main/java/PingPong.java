import java.util.ArrayList;

public class PingPong {
  public static void main(String[] args) {}

  public ArrayList<Object> runPingPong(Integer yourNumber) {
    ArrayList<Object> returnList = new ArrayList<Object>();

    for (Integer changeNumber = 1; changeNumber <= yourNumber; changeNumber++) {
      returnList.add(changeNumber);
    }

    System.out.println(returnList);
    return returnList;
  }
}
