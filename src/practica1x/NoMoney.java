package practica1x;

import java.util.ResourceBundle;

public class NoMoney extends Exception{

	public NoMoney(ResourceBundle messages) {
		super(messages.getString("nomoney"));
	}
}
