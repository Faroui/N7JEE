package ma.n7.dao;

public class DaoImpl2 implements IDao {

    @Override
    public double getData() {
        System.out.println("version 2 de getData");
        return Math.random()*14;
    }
}
