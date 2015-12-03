package up1.demo.api;

import up1.demo.api.storage.InMemoryStorage;
import up1.demo.api.storage.Storage;

import static spark.Spark.get;
import static spark.Spark.post;

public class APIServer {

    private static Storage storage = new InMemoryStorage();

    public static void main(String[] args) {
        post("/employee", new AddEmployee(storage) );
        get("/", (req, res) -> "Hello World");
    }

}
