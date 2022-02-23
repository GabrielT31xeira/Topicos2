package teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.Carro;

public class Main {
	public static void main(String[] args) {
		// teste de selecao em uma tabela para gerar o banco de dados.
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("CarrosUsadosVendas");
		EntityManager em = emf.createEntityManager();
		
		Carro carro = new Carro();
		carro.setId(1);
		carro.setMarca("fiat");
		carro.setModelo("uno de escada");
		carro.setNumero_serie("6666");
		carro.setPlaca("bd3biel");
		
		em.getTransaction().begin();
		carro = em.merge(carro);
		em.getTransaction().commit();
		
		
		
		Query query = em.createQuery("Select c FROM Carro c");
		query.getResultList();
		System.out.println("feito.");
	}
}
