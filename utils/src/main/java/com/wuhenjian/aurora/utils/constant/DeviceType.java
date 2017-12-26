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

	private int code;

	private String type;

	DeviceType(int code, String type) {
		this.code = code;
		this.type = type;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType(int code) {
		for (DeviceType deviceType : DeviceType.values()) {
			if (deviceType.getCode() == code) {
				return deviceType.getType();
			}
		}
		return null;
	}
}
