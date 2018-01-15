package com.wuhenjian.aurora.utils;

import org.junit.Test;

import java.util.List;

/**
 * @author 無痕剑
 * @date 2018/1/4 15:19
 */
public class HtmlParserUtilTest {
	
	@Test
	public void getAttrValueTest() {
		String h = "<html><head><title>Upload Result</title></head><body><h1>MD5: c4b1061ef113750a60690d02e1432945</h1>Image upload successfully! You can get this image via this address:<br/><br/><a href='/c4b1061ef113750a60690d02e1432945'>http://yourhostname:4869/c4b1061ef113750a60690d02e1432945</a>?w=width&h=height&g=isgray&x=position_x&y=position_y&r=rotate&q=quality&f=format<h1>MD5: e1ab562951eca6409b793fbbb9299d56</h1>Image upload successfully! You can get this image via this address:<br/><br/><a href='/e1ab562951eca6409b793fbbb9299d56'>http://yourhostname:4869/e1ab562951eca6409b793fbbb9299d56</a>?w=width&h=height&g=isgray&x=position_x&y=position_y&r=rotate&q=quality&f=format<h1>MD5: cec8f053625621c41a7446c39204b362</h1>Image upload successfully! You can get this image via this address:<br/><br/><a href='/cec8f053625621c41a7446c39204b362'>http://yourhostname:4869/cec8f053625621c41a7446c39204b362</a>?w=width&h=height&g=isgray&x=position_x&y=position_y&r=rotate&q=quality&f=format</body></html>";
		String s = "<html><a href='zhe shi a1'></a><span></span></html>";
		List<String> href = HtmlParserUtil.getZimgMd5(h);
		System.out.println(href);
	}
}
