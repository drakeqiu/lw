package com.jarvis.lw.core.constants;

import java.io.Serializable;

public abstract class BaseConstant implements Serializable {

	private final transient String name;

	protected BaseConstant(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return this.name;
	}

	@Override
	public final int hashCode() {
		return super.hashCode();
	}

	@Override
	public final boolean equals(Object obj) {
		return super.equals(obj);
	}
}
