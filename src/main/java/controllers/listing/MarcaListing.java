package controllers.listing;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import application.RepositoryException;
import application.Util;
import model.Marca;
import repository.MarcaRepository;


@Named
@ViewScoped
public class MarcaListing extends Listing<Marca>{
	
	private static final long serialVersionUID = 5863259206565740892L;
	private String filtro;
	
	public MarcaListing() {
		super("marcarlisting", new MarcaRepository());
	}


	@Override
	public void pesquisar() {
		MarcaRepository repo = new MarcaRepository();
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
