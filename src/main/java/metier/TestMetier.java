package metier;
import java.util.List;
public class TestMetier {
public static void main(String[] args) {
MetierImpl metier= new MetierImpl();
List<Evenement> even = metier.getEvenementsParMotCle("IEE");
for (Evenement e : even)
System.out.println(e.getNomEvenement());
}
}