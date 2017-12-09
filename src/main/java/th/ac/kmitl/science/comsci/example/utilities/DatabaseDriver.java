package th.ac.kmitl.science.comsci.example.utilities;

import java.sql.SQLException;

public class DatabaseDriver {

    String url;
    String username;
    String password;

    public DatabaseDriver(String driver,
                          String url,
                          String username,
                          String password) throws ClassNotFoundException, SQLException {
        Class.forName(driver);
        this.url = url;
        this.username = username;
        this.password = password;
    }

    public String getUrl() {
        return url;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
