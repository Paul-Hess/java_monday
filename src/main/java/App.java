import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/ping-pong.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/print-pong", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/print-pong.vtl");

      String stringNumber = request.queryParams("your-number");
      Integer yourNumber = Integer.parseInt(stringNumber);
      ArrayList<Object> yourNumberArrayList = PingPong.runPingPong(yourNumber);

      model.put("yourNumberArrayList", yourNumberArrayList);
      return new ModelAndView(model, layout);   
    }, new VelocityTemplateEngine());

  }
}
