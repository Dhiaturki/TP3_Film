package test;

import java.util.List;

import metier.MetierImpl;
import metier.Film;

public class TestMetier {

	public static void main(String[] args) {
		MetierImpl metier= new MetierImpl();
		List<Film> prods = metier.getProduitsParMotCle("HP");
		for (Film p : prods)
		System.out.println(p.getNomFilm());

	}

}
