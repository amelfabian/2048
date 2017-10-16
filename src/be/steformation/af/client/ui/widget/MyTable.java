package be.steformation.af.client.ui.widget;


import java.util.Set;

import com.google.gwt.cell.client.Cell;
import com.google.gwt.cell.client.ValueUpdater;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.NativeEvent;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;

import gwt.material.design.client.ui.MaterialLabel;

public class MyTable extends MaterialLabel implements Cell<Integer>{


	
	public MyTable() {
		super();
		
	}

	@Override
	public boolean dependsOnSelection() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Set<String> getConsumedEvents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean handlesSelection() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEditing(com.google.gwt.cell.client.Cell.Context context, Element parent, Integer value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void onBrowserEvent(com.google.gwt.cell.client.Cell.Context context, Element parent, Integer value,
			NativeEvent event, ValueUpdater<Integer> valueUpdater) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(com.google.gwt.cell.client.Cell.Context context, Integer value, SafeHtmlBuilder sb) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean resetFocus(com.google.gwt.cell.client.Cell.Context context, Element parent, Integer value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setValue(com.google.gwt.cell.client.Cell.Context context, Element parent, Integer value) {
		// TODO Auto-generated method stub
		
	}

		
	

}
