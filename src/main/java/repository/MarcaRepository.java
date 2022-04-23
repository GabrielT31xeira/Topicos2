package repository;

import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.persistence.Query;

import application.RepositoryException;
import model.Marca;

@Named
@ViewScoped
public class MarcaRepository extends Repository<Marca>{

	public List<Marca> findByNome(String descricao) throws RepositoryException {
		try { 
			StringBuffer jpql = new StringBuffer();
			jpql.append("SELECT ");
			jpql.append("  m ");
			jpql.append("FROM ");
			jpql.append("  Marca m ");
			jpql.append("WHERE ");
			jpql.append("  u.descricao LIKE :descricao ");
			
			Query query = getEntityManager().createQuery(jpql.toString());
			query.setParameter("descricao", "%" + descricao + "%");
			
			return query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
			throw new RepositoryException("Erro ao executar o findByNome.");
		}
	}
}
