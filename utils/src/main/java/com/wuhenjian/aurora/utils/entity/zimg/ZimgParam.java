package com.wuhenjian.aurora.utils.entity.zimg;

/**
 * zimg图片参数
 * @author 無痕剑
 * @date 2018/1/3 17:50
 */
public class ZimgParam {
	/** 长 */
	private Integer w;
	/** 宽 */
	private Integer h;
	/** g=1获得灰白图片 */
	private Integer g;
	/** 指定区域x轴 */
	private Integer x;
	/** 指定区域y轴 */
	private Integer y;
	/** 旋转角度 */
	private Integer r;
	/** 压缩比 */
	private Integer q;
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
	//TODO zimg参数设置
}
