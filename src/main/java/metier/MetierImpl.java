package metier;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class MetierImpl implements ImetierCatalogue {
@Override
public List<Evenement> getEvenementsParMotCle(String mc) {
List<Evenement> env= new ArrayList<Evenement>();
Connection conn=SingletonConnection.getConnection();
try {

PreparedStatement ps= conn.prepareStatement("select * from evenement where NOM_EVENEMENT LIKE ?");

ps.setString(1, "%"+mc+"%");
ResultSet rs = ps.executeQuery();
while (rs.next()) {
Evenement e = new Evenement();
e.setIdEvenement(rs.getLong("ID_EVENEMENT"));
e.setNomEvenement(rs.getString("NOM_EVENEMENT"));
e.setDateEvenement(rs.getString("DATE_EVENEMENT"));
env.add(e);
}
} catch (SQLException e) {
e.printStackTrace();
}
return env;
}
@Override
public void addEvenement(Evenement p) {
// TODO Auto-generated method stub
}
}