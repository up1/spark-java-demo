package up1.demo.api;

import static spark.Spark.get;

public class APIServer {

    public static void main(String[] args) {
        get("/", (req, res) -> "Hello World");
    }

}
