/*
 * JABM - Java Agent-Based Modeling Toolkit
 * Copyright (C) 2013 Steve Phelps
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License as
 * published by the Free Software Foundation; either version 3 of
 * the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License for more details.
 */
package event;



public interface EventScheduler {
	
	

	public void fireEvent(Event event);
	

	
	@SuppressWarnings("rawtypes")
	public void addListener(Class eventClass, EventListener listener);
	
	public void addListener(EventListener listener);

	public void removeListener(EventListener listener);
	
	
	
	
}
