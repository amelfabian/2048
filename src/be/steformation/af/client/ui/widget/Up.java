package be.steformation.af.client.ui.widget;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiConstructor;

import gwt.material.design.client.ui.MaterialButton;

public class Up extends MaterialButton implements ClickHandler{
	
	@UiConstructor
	public Up(String placeholder) {
		GWT.log("Up.Up()");
		this.setPlaceholder(placeholder);
	}

	private void setPlaceholder(String placeholder) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onClick(ClickEvent event) {
		GWT.log("Up.onClick()");
	}

}
