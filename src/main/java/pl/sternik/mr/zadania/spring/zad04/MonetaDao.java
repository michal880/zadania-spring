package pl.sternik.mr.zadania.spring.zad04;
import java.util.List;
/**
 * Created by Michal on 24.03.2018.
 */

public interface MonetaDao {
    public Moneta addMoneta(Moneta moneta);
    public Moneta getMoneta(int numerKatalogowy) throws NoSuchMonetaException;
    public boolean updateMoneta(Moneta moneta) throws NoSuchMonetaException;
    public boolean deleteMoneta(int numerKatalogowy) throws NoSuchMonetaException;
    public List<Moneta> getAll();
}