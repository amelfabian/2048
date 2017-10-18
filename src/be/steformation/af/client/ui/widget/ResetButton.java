package be.steformation.af.client.ui.widget;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;

import be.steformation.af.client.event.EventManager;
import be.steformation.af.client.event.reset.IReset;
import be.steformation.af.client.event.reset.Reset;
import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialLabel;
import javafx.scene.control.Alert;

public class ResetButton extends MaterialButton implements IReset,ClickHandler{

		public ResetButton() {
			super();
			GWT.log("ResetButton.ResetButton()");
			EventManager.getInstance().addHandler(Reset.type, this);
		}
	@Override
	public void OnReset(Reset event) {
		GWT.log("ResetButton.OnReset()");
		this.addClickHandler(this);


	}

	@Override
	public void onClick(ClickEvent event) {
		System.out.println("ResetButton.onClick()");
		Window.alert("Reset");
	}

}
