package com.jarvis.lw.core.constant;

import java.io.ObjectStreamException;

public class BaseStatus extends BaseConstant {

	protected BaseStatus(String name) {
		super(name);
	}

	public static final BaseConstant SUCCESS = new BaseStatus("success");
	public static final BaseConstant FAILURE = new BaseStatus("failure");

	private static int nextOrdinal = 0;
	private final int ordinal = nextOrdinal++;
	private static final BaseConstant[] VALUES = { SUCCESS, FAILURE };

	Object readResolve() throws ObjectStreamException {
		return VALUES[ordinal];
	}

}
