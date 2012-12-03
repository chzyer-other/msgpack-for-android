package org.chenye.andfree.msgpack;

import java.util.Set;

public interface IListPicker{
	public Object put(Object key);
	public int length();
	public Set<Object> values();
}