package be.steformation.af.client.event.direction;

import com.google.gwt.event.shared.GwtEvent;

public class Direction extends GwtEvent<IDirection> {
		
		public final static GwtEvent.Type<IDirection> type = new GwtEvent.Type<IDirection>();
	@Override
	public com.google.gwt.event.shared.GwtEvent.Type<IDirection> getAssociatedType() {
		// TODO Auto-generated method stub
		return type;
	}
	


	@Override
	protected void dispatch(IDirection handler) {
		handler.OnDirection(this);
	}
	
	

}
