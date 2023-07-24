package jdbc;

public class First1 {
public static Connection1 getconn() {
	Connection1 connection1 = new Connection1Imp();
	return connection1;
}
public static void main(String args[]) {
	Connection1 connection1 =First1.getconn();
	connection1.test();
}

}
