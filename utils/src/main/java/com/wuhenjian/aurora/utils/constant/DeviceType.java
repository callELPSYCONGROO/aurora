package com.wuhenjian.aurora.utils.constant;

/**
 * 设备类型
 * @author 無痕剑
 * @date 2017/12/26 19:05
 */
public enum DeviceType {

	WEB(1, "web"),
	IOS(2, "ios"),
	ANDROID(3, "android");

	private Integer code;

	private String type;

	DeviceType(Integer code, String type) {
		this.code = code;
		this.type = type;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public static String getType(Integer code) {
		for (DeviceType deviceType : DeviceType.values()) {
			if (deviceType.getCode().compareTo(code) == 0) {
				return deviceType.getType();
			}
		}
		return null;
	}

	public static Integer getCode(String type) {
		for (DeviceType deviceType : DeviceType.values()) {
			if (deviceType.getType().equals(type)) {
				return deviceType.getCode();
			}
		}
		return null;
	}
}
