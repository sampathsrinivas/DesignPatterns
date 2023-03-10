package singleton;

public class DBConn {

    private static DBConn dbConn;

    private DBConn() {
    }

    public static DBConn getDBConnObject() {
        if (dbConn == null) {
            dbConn = new DBConn();
        }

        return dbConn;

    }

}

