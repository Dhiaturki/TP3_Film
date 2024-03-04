package metier;
import java.io.Serializable;

public class Film implements Serializable {
    private Long idFilm;
    private String nomFilm;
    private double prix;

    public Film() {
        super();
    }

    public Film(String nomFilm, double prix) {
        super();
        this.nomFilm = nomFilm;
        this.prix = prix;
    }

    public Long getIdFilm() {
        return idFilm;
    }

    public void setIdFilm(Long idFilm) {
        this.idFilm = idFilm;
    }

    public String getNomFilm() {
        return nomFilm;
    }

    public void setNomFilm(String nomFilm) {
        this.nomFilm = nomFilm;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
}
