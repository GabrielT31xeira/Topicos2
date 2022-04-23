package controllers.listing;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import application.RepositoryException;
import application.Util;
import model.Usuario;
import repository.UsuarioRepository;

@Named
@ViewScoped
public class UsuarioListing extends Listing<Usuario> {
	
	private static final long serialVersionUID = -5778535619449492947L;
	private String filtro;

	public UsuarioListing() {
		super("usuariolisting", new UsuarioRepository());
	}

	@Override
	public void pesquisar() {
		UsuarioRepository repo = new UsuarioRepository();
		try {
			setList(repo.findByNome(filtro));
		} catch (RepositoryException e) {
			e.printStackTrace();
			Util.addErrorMessage("Problema ao realizar a consulta.");
		}	
	}

	public String getFiltro() {
		return filtro;
	}

	public void setFiltro(String filtro) {
		this.filtro = filtro;
	}

}
