package metier;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MetierImpl implements ImetierCatalogue {
@Override
public List<Film> getProduitsParMotCle(String mc) {
List<Film> prods= new ArrayList<Film>();
Connection conn=SingletonConnection.getConnection();
try {

PreparedStatement ps= conn.prepareStatement("select * from films where nom_film LIKE ?");

ps.setString(1, "%"+mc+"%");
ResultSet rs = ps.executeQuery();
while (rs.next()) {
Film p = new Film();
p.setIdFilm(rs.getLong("id_film"));
p.setNomFilm(rs.getString("nom_film"));
p.setPrix(rs.getDouble("PRIX"));
prods.add(p);
}
} catch (SQLException e) {
e.printStackTrace();
}
return prods;
}
@Override
public void addProduit(Film p) {
// TODO Auto-generated method stub
}
}