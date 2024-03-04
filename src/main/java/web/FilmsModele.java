package web;
import java.util.ArrayList;
import java.util.List;
import metier.Film;
public class FilmsModele {
private String motCle;
List<Film> produits = new ArrayList<>();
public String getMotCle() {
return motCle;
}
public void setMotCle(String motCle) {
this.motCle = motCle;
}
public List<Film> getProduits() {
return produits;
}
public void setProduits(List<Film> produits) {
this.produits = produits;
}

}