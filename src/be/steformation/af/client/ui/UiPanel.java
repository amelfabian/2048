package be.steformation.af.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Widget;

import be.steformation.af.client.ui.widget.Down;
import be.steformation.af.client.ui.widget.Left;
import be.steformation.af.client.ui.widget.MyTable;
import be.steformation.af.client.ui.widget.Right;
import be.steformation.af.client.ui.widget.Up;

public class UiPanel extends Composite implements ClickHandler {

	private static UiPanelUiBinder uiBinder = GWT.create(UiPanelUiBinder.class);

	interface UiPanelUiBinder extends UiBinder<Widget, UiPanel> {
	}

	public UiPanel() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@UiField Down down;
	@UiField Up up;
	@UiField Left left;
	@UiField Right right;
	@UiField MyTable mytable;
	



	@Override
	public void onClick(ClickEvent event) {
		GWT.log("UiPanel.onClick()");
		
	}



}
