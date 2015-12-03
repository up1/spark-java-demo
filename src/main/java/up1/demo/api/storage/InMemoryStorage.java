package up1.demo.api.storage;

import up1.demo.api.model.Employee;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class InMemoryStorage implements Storage {

    private long id = 0;
    private Map<Long, Employee> employees = new HashMap<>();

    @Override
    public void connect() throws SQLException {

    }

    @Override
    public void cleanUp() throws SQLException {

    }

    @Override
    public Long addEmployee(Employee employee) {
        long latestId = id++;
        employee.id = latestId;
        employees.put(latestId, employee);
        return latestId;
    }
}
