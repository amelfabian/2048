package be.steformation.af.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.shared.GWT;
import com.google.gwt.user.client.ui.RootLayoutPanel;

import be.steformation.af.client.ui.UiPanel;

public class projet2048EntryPoint implements EntryPoint {

	@Override
	public void onModuleLoad() {
		GWT.log("projet2048EntryPoint.onModuleLoad()");
		
		UiPanel panel = new UiPanel();
		RootLayoutPanel.get().add(panel);
	}

}
