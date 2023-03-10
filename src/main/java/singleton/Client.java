package singleton;

public class Client {

    public static void main(String[] args) {
        DBConn obj1 = DBConn.getDBConnObject();
        DBConn obj2 = DBConn.getDBConnObject();
        DBConn obj3 = DBConn.getDBConnObject();
        DBConn obj4 = DBConn.getDBConnObject();
    }
}
