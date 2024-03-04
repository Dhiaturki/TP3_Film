package metier;
import java.util.List;
public interface ImetierCatalogue {
public List<Film> getProduitsParMotCle(String mc);
public void addProduit(Film p);
}