package be.steformation.af.client.event.direction;

import com.google.gwt.event.shared.EventHandler;

public interface IDirection extends EventHandler {
	public void OnDown(Direction event);
	public void OnUp(Direction event);
	public void OnLeft(Direction event);
	public void OnRight(Direction event);
	
}
