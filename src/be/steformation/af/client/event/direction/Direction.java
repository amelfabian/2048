package be.steformation.af.client.event.direction;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.event.shared.GwtEvent;

public class Direction extends GwtEvent<IDirection> {

	public final static GwtEvent.Type<IDirection> type = new GwtEvent.Type<IDirection>();

	String direction;

	public Direction(String direction) {
		this.direction = direction;
	}

	@Override
	public com.google.gwt.event.shared.GwtEvent.Type<IDirection> getAssociatedType() {
		// TODO Auto-generated method stub
		return type;
	}

	@Override
	protected void dispatch(IDirection handler) {
		GWT.log("Direction.dispatch()" + direction);
		switch (direction) {
		case "down":
			handler.OnDown(this);
			break;
		case "up":
			handler.OnUp(this);
			break;
		case "left":
			handler.OnLeft(this);
			break;
		case "right":
			handler.OnRight(this);
			break;
		default:
			break;
		}
	}

}
