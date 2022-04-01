import static spark.Spark.post;
import static spark.Spark.staticFiles;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

public class UserMain {

    public static void main(String[] args) {
        staticFiles.location("/static");

        // localhost:4567/hello 요청
        // "Hello World" 응답
        // get("/hello", (req, res) -> "Hello World");

        // localhost:4567/hello/{:name} 요청
        // "Hello {:name}" 응답
        // get("/hello/:name", (req, res) -> "Hello " + req.params(":name"));

        // localhost:4567/hello?name={name} 요청
        // "Hello {name} 응답
        // get("/hello", (req, res) -> "Hello " + req.queryParams("name") + " 나이는 " + req.queryParams("age"));

        List<User> users = new ArrayList<>();

        post("/users", (req, res) -> {
            User user = new User(req.queryParams("name"), req.queryParams("age"));
            users.add(user);

            Map<String, Object> model = new HashMap<>();
            model.put("users", users);

            return render(model, "result.html");
        });
    }

    public static String render(Map<String, Object> model, String templatePath) {
        return new HandlebarsTemplateEngine().render(new ModelAndView(model, templatePath));
    }
}
