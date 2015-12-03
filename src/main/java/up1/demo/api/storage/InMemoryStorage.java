package up1.demo.api.storage;

import up1.demo.api.model.Employee;

import java.sql.SQLException;

public class InMemoryStorage implements Storage {
    @Override
    public void connect() throws SQLException {

    }

    @Override
    public void cleanUp() throws SQLException {

    }

    @Override
    public Long addEmployee(Employee employee) {
        return new Long(123);
    }
}
