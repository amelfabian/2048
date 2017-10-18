package be.steformation.af.client.event.reset;

import com.google.gwt.event.shared.GwtEvent;

public class Reset extends GwtEvent<IReset> {

	public final static GwtEvent.Type<IReset> type = new GwtEvent.Type<IReset>();
	@Override
	protected void dispatch(IReset handler) {
		handler.OnReset(this);
	}

	@Override
	public com.google.gwt.event.shared.GwtEvent.Type<IReset> getAssociatedType() {
		// TODO Auto-generated method stub
		return type;
	}

}
