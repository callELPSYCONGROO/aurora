package com.wuhenjian.aurora.utils;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author 無痕剑
 * @date 2018/1/4 15:04
 */
public class HtmlParserUtil {

	public static List<String> getAttributeValue(String html, String attr) {
		Document document = Jsoup.parse(html);
		Elements elements = document.getElementsByAttribute(attr);
		if (elements.isEmpty()) {
			return null;
		}
		List<String> list = new ArrayList<>();
		for (Element e : elements) {
			String value = e.attr(attr);
			list.add(value);
		}
		return list;
	}

	public static List<String> getTextByElement(String html, String elem) {
		Document document = Jsoup.parse(html);
		Elements elements = document.getElementsByTag(elem);
		if (elements.isEmpty()) {
			return null;
		}
		List<String> list = new ArrayList<>();
		for (Element e : elements) {
			String text = e.text();
			list.add(text);
		}
		return list;
	}

	public static List<String> getZimgMd5(String html) {
		String attr = "href";
		Document document = Jsoup.parse(html);
		Elements elements = document.getElementsByAttribute(attr);
		if (elements.isEmpty()) {
			return null;
		}
		List<String> list = new ArrayList<>();
		for (Element e : elements) {
			String value = e.attr(attr);
			String substring = value.substring(1);
			list.add(substring);
		}
		return list;
	}

	public static List<String> getGithubRepoName(String html) {
		Document document = Jsoup.parse(html);
		Elements elements = document.select("div.d-inline-block.mb-1>h3>a");
		List<String> list = new ArrayList<>();
		for (Element a : elements) {
			String repoName = a.text().trim();
			list.add(repoName);
		}
		return list;
	}

	public static int getGithubRepoMaxPage(String html) {
		Document document = Jsoup.parse(html);
		Elements elements = document.select("div.pagination>a");
		List<Integer> nums = new ArrayList<>();
		for (Element a : elements) {
			String text = a.text();
			if (!StringUtil.isNum(text)) {
				continue;
			}
			nums.add(Integer.valueOf(text));
		}
		if (nums.isEmpty()) {
			return 0;
		}
		nums.sort(Comparator.comparingInt(a -> a));
		return nums.get(nums.size() - 1);
	}
}
