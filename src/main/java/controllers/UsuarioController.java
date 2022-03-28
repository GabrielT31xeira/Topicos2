package controllers;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import model.User;
import repository.UserRepository;

@Named
@ViewScoped
public class UsuarioController extends Controller<User> implements Serializable {
	private static final long serialVersionUID = -7942096441195213746L;
	public UsuarioController() {
		super(new UserRepository());
	}
	@Override
	public User getEntity() {
		if (entity == null)
			entity = new User();
		return entity;
	}
	public void editar(User user) {
		setEntity(user);
	}
}
