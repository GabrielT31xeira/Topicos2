package controllers;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import org.primefaces.event.SelectEvent;

import controllers.listing.MarcaListing;
import model.Marca;
import repository.MarcaRepository;

@Named
@ViewScoped
public class MarcaController extends Controller<Marca> implements Serializable{
	
	private static final long serialVersionUID = -1607162901671403526L;
	public MarcaController() {
		super(new MarcaRepository());
	}


	@Override
	public Marca getEntity() {
		if (entity == null)
			entity = new Marca();
		return entity;
	}

	public void editar(Marca marca) {
		setEntity(marca);
	}
	
	public void abrirMarcaListing() {
		MarcaListing listing = new MarcaListing();
		listing.open();
	}
	
	public void obterMarcaListing(SelectEvent<Marca> event) {
		setEntity(event.getObject());
	}
}
