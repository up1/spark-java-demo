package up1.demo.api.storage;

import up1.demo.api.model.Employee;

import java.sql.SQLException;

public interface Storage {
    void connect() throws SQLException;
    void cleanUp() throws SQLException;
    Long addEmployee(Employee employee);
}
