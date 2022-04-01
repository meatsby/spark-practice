import static spark.Spark.get;

public class HelloWorld {

    public static void main(String[] args) {
        // localhost:4567/hello 요청
        // "Hello World" 응답
        // get("/hello", (req, res) -> "Hello World");

        // localhost:4567/hello/{:name} 요청
        // "Hello {:name}" 응답
        // get("/hello/:name", (req, res) -> "Hello " + req.params(":name"));

        // localhost:4567/hello?name={name} 요청
        // "Hello {name} 응답
        get("/hello", (req, res) -> "Hello " + req.queryParams("name") + " 나이는 " + req.queryParams("age"));
    }
}
