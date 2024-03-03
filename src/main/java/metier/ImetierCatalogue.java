package metier;
import java.util.List;
public interface ImetierCatalogue {
public List<Evenement> getEvenementsParMotCle(String mc);
public void addEvenement(Evenement E);
}