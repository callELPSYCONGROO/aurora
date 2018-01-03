package com.wuhenjian.aurora.utils.entity.zimg;

import com.wuhenjian.aurora.utils.BeanUtil;
import com.wuhenjian.aurora.utils.StringUtil;

import java.beans.IntrospectionException;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

/**
 * zimg图片参数
 * @author 無痕剑
 * @date 2018/1/3 17:50
 */
public class ZimgParam {
	/** 图片md5值 */
	private String md5;
	/** 长 */
	private String w;
	/** 宽 */
	private String h;
	/** g=1获得灰白图片 */
	private String g;
	/** 指定区域x轴 */
	private String x;
	/** 指定区域y轴 */
	private String y;
	/** 旋转角度 */
	private String r;
	/** 压缩比 */
	private String q;
	/** 转换格式 */
	private String f;
	/**
	 * p=0获取原图；
	 * p=1等比例缩放，裁剪为适合观看的比例（默认带有这个参数）；
	 * p=2展示图片核心内容；
	 * p=3按指定百分比缩放，只提供长或宽即可，若同时提供长和宽，则会分别将长和宽缩放至指定比例，有可能造成图片被拉伸；
	 *
	 */
	private String p;
	/** 操作类型，t=1为删除操作 */
	private String t;

	public String getMd5() {
		return md5;
	}

	public void setMd5(String md5) {
		this.md5 = md5;
	}

	public String getW() {
		return w;
	}

	public void setW(String w) {
		this.w = w;
	}

	public String getH() {
		return h;
	}

	public void setH(String h) {
		this.h = h;
	}

	public String getG() {
		return g;
	}

	public void setG(String g) {
		this.g = g;
	}

	public String getX() {
		return x;
	}

	public void setX(String x) {
		this.x = x;
	}

	public String getY() {
		return y;
	}

	public void setY(String y) {
		this.y = y;
	}

	public String getR() {
		return r;
	}

	public void setR(String r) {
		this.r = r;
	}

	public String getQ() {
		return q;
	}

	public void setQ(String q) {
		this.q = q;
	}

	public String getF() {
		return f;
	}

	public void setF(String f) {
		this.f = f;
	}

	public String getP() {
		return p;
	}

	public void setP(String p) {
		this.p = p;
	}

	public String getT() {
		return t;
	}

	public void setT(String t) {
		this.t = t;
	}

	public Map<String,String> convert2Map() throws IllegalAccessException, IntrospectionException, InvocationTargetException {
		Map<String, Object> stringObjectMap = BeanUtil.bean2Map(this);
		Map<String,String> map = new HashMap<>();
		for (String key : stringObjectMap.keySet()) {
			String o = (String) stringObjectMap.get(key);
			if (StringUtil.isBlank(o)) {
				continue;
			}
			map.put(key, o);
		}
		return map;
	}
}
