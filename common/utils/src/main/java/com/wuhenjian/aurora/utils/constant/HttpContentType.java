package com.wuhenjian.aurora.utils.constant;

import org.apache.http.entity.ContentType;

/**
 * HttpContentType对照表
 * @author 無痕剑
 * @date 2018/1/4 9:59
 */
public enum HttpContentType {

	GIF("gif", ContentType.create("image/gif", "UTF-8")),
	JPEG("jpeg", ContentType.create("image/jpeg", "UTF-8")),
	JPG("jpg", ContentType.create("image/jpeg", "UTF-8")),
	PNG("png", ContentType.create("image/png", "UTF-8")),
	;

	private String extension;

	private ContentType contentType;

	HttpContentType(String extension, ContentType contentType) {
		this.extension = extension;
		this.contentType = contentType;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public ContentType getContentType() {
		return contentType;
	}

	public void setContentType(ContentType contentType) {
		this.contentType = contentType;
	}

	public static ContentType getContentType(String extension) {
		for (HttpContentType hct : HttpContentType.values()) {
			if (hct.getExtension().equals(extension)) {
				return hct.getContentType();
			}
		}
		return null;
	}
}
