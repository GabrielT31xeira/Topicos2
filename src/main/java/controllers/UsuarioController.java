package controllers;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import org.primefaces.event.SelectEvent;

import controllers.listing.UsuarioListing;
import model.Usuario;
import repository.UsuarioRepository;

@Named
@ViewScoped
public class UsuarioController extends Controller<Usuario> implements Serializable {
	private static final long serialVersionUID = -7942096441195213746L;
	
	public UsuarioController() {
		super(new UsuarioRepository());
	}
	@Override
	public Usuario getEntity() {
		if (entity == null)
			entity = new Usuario();
		return entity;
	}
	public void editar(Usuario user) {
		setEntity(user);
	}
	
	public void abrirUsuarioListing() {
		UsuarioListing listing = new UsuarioListing();
		listing.open();
	}
	
	public void obterUsuarioListing(SelectEvent<Usuario> event) {
		setEntity(event.getObject());
	}
}
