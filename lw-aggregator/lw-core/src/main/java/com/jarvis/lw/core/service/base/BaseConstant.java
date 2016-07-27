package com.jarvis.lw.core.service.base;

public class BaseConstant {

	public static class BaseStatus extends BaseConstant {
		private final String name;

		private BaseStatus(String name) {
			super();
			this.name = name;
		};

		@Override
		public String toString() {
			return name;
		}

		public static final BaseConstant.BaseStatus SUCCESS = new BaseConstant.BaseStatus("success");
		public static final BaseConstant.BaseStatus FAILURE = new BaseConstant.BaseStatus("failure");

	};

	private BaseConstant() {
	}

}
