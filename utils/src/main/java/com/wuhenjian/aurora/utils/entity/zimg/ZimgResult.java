package com.wuhenjian.aurora.utils.entity.zimg;

/**
 * zimg服务器请求返回的结果
 * @author 無痕剑
 * @date 2018/1/3 16:59
 */
public class ZimgResult {

	private Boolean ret;

	private info info;

	private error error;

	public Boolean getRet() {
		return ret;
	}

	public void setRet(Boolean ret) {
		this.ret = ret;
	}

	public ZimgResult.info getInfo() {
		return info;
	}

	public void setInfo(ZimgResult.info info) {
		this.info = info;
	}

	public ZimgResult.error getError() {
		return error;
	}

	public void setError(ZimgResult.error error) {
		this.error = error;
	}

	/**
	 * 上传、删除、查询返回的字段
	 */
	class info {
		//公用字段，上传返回的字段
		private String md5;
		private Long size;
		//查询信息返回的字段
		private Integer width;
		private Integer height;
		private Integer quality;
		private String format;
		//删除返回的字段
		private Integer t;

		public String getMd5() {
			return md5;
		}

		public void setMd5(String md5) {
			this.md5 = md5;
		}

		public Long getSize() {
			return size;
		}

		public void setSize(Long size) {
			this.size = size;
		}

		public Integer getWidth() {
			return width;
		}

		public void setWidth(Integer width) {
			this.width = width;
		}

		public Integer getHeight() {
			return height;
		}

		public void setHeight(Integer height) {
			this.height = height;
		}

		public Integer getQuality() {
			return quality;
		}

		public void setQuality(Integer quality) {
			this.quality = quality;
		}

		public String getFormat() {
			return format;
		}

		public void setFormat(String format) {
			this.format = format;
		}

		public Integer getT() {
			return t;
		}

		public void setT(Integer t) {
			this.t = t;
		}
	}

	/**
	 * 发生错误返回的字段
	 */
	class error {
		private Integer code;
		private String message;

		public Integer getCode() {
			return code;
		}

		public void setCode(Integer code) {
			this.code = code;
		}

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}
	}
}
