package up1.demo.api;

import spark.Request;
import spark.Response;
import spark.Route;
import up1.demo.api.model.Employee;
import up1.demo.api.storage.Storage;

public class AddEmployee implements Route {
    private Storage storage;

    public AddEmployee(Storage storage) {
        this.storage = storage;
    }

    @Override
    public Object handle(Request request, Response response) throws Exception {
        String firstName = request.queryParams("firstname");
        String lastName = request.queryParams("lastname");
        Employee employee = new Employee(firstName, lastName);
        Long employeeId = storage.addEmployee(employee);
        return employeeId;
    }
}
