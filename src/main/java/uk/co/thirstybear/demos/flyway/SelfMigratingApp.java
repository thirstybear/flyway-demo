package uk.co.thirstybear.demos.flyway;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import org.flywaydb.core.Flyway;

import javax.sql.DataSource;

public class SelfMigratingApp {
    public static void main(String[] args) {
        migrateDatabase();

        // Now run the app...
    }

    private static void migrateDatabase() {
        final Flyway flyway = new Flyway();
        flyway.setSchemas("testSchema");
        flyway.setDataSource(buildDataSource());
        flyway.migrate();
    }

    private static DataSource buildDataSource() {
        final MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setURL("jdbc:mysql://localhost:3306");
        dataSource.setUser("root");
        dataSource.setPassword("password");
        return dataSource;
    }
}
