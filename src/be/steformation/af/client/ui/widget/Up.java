package be.steformation.af.client.ui.widget;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiConstructor;
import com.google.gwt.user.client.Window;

import be.steformation.af.client.event.EventManager;
import be.steformation.af.client.event.direction.Direction;
import gwt.material.design.client.ui.MaterialButton;

public class Up extends MaterialButton implements ClickHandler{
	

	public Up() {
		GWT.log("Up.Up()");
		this.addClickHandler(this);

	}



	@Override
	public void onClick(ClickEvent event) {
		GWT.log("Up.onClick()");
		Direction evenement = new Direction("up");
		EventManager.getInstance().fireEvent(evenement);
	}

}
