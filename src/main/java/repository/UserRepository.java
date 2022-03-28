package repository;

import javax.persistence.Query;
import java.util.List;
import application.RepositoryException;
import model.User;

public class UserRepository extends Repository<User>{
	public List<User> findByNome(String nome) throws RepositoryException {
		try { 
			StringBuffer jpql = new StringBuffer();
			jpql.append("SELECT ");
			jpql.append("  u ");
			jpql.append("FROM ");
			jpql.append("  User u ");
			jpql.append("WHERE ");
			jpql.append("  u.nome LIKE :nome ");
			
			Query query = getEntityManager().createQuery(jpql.toString());
			query.setParameter("nome", "%" + nome + "%");
			
			return query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
			throw new RepositoryException("Erro ao executar o findByNome.");
		}
	}
}
