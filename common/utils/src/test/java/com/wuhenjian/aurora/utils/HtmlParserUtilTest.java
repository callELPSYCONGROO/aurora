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


	@Test
	public void getATest() {
		String page = "<!DOCTYPE html>" +
				"<html lang=\"en\">" +
				"  <head>" +
				"    <meta charset=\"utf-8\">" +
				"  <link rel=\"dns-prefetch\" href=\"https://assets-cdn.github.com\">" +
				"  <link rel=\"dns-prefetch\" href=\"https://avatars0.githubusercontent.com\">" +
				"  <link rel=\"dns-prefetch\" href=\"https://avatars1.githubusercontent.com\">" +
				"  <link rel=\"dns-prefetch\" href=\"https://avatars2.githubusercontent.com\">" +
				"  <link rel=\"dns-prefetch\" href=\"https://avatars3.githubusercontent.com\">" +
				"  <link rel=\"dns-prefetch\" href=\"https://github-cloud.s3.amazonaws.com\">" +
				"  <link rel=\"dns-prefetch\" href=\"https://user-images.githubusercontent.com/\">" +
				"  <link crossorigin=\"anonymous\" href=\"https://assets-cdn.github.com/assets/frameworks-700c269c41d75b60698a62d9306dae4a0f840bec4718545615f752400f1fd908.css\" media=\"all\" rel=\"stylesheet\" />" +
				"  <link crossorigin=\"anonymous\" href=\"https://assets-cdn.github.com/assets/github-6cdfd566d21426082955dcd5dcf85dbaf7c40bea4abd487ae5d5d8193bb7f07f.css\" media=\"all\" rel=\"stylesheet\" />" +
				"  <link crossorigin=\"anonymous\" href=\"https://assets-cdn.github.com/assets/site-e2f78def14631b7fd769bf918598cd7d437e67a706a2676aa466634d28ffaabd.css\" media=\"all\" rel=\"stylesheet\" />" +
				"  " +
				"" +
				"  <meta name=\"viewport\" content=\"width=device-width\">" +
				"  <meta content=\"noindex, follow\" name=\"robots\" />" +
				"  <title>Alibaba �� GitHub</title>" +
				"  <link rel=\"search\" type=\"application/opensearchdescription+xml\" href=\"/opensearch.xml\" title=\"GitHub\">" +
				"  <link rel=\"fluid-icon\" href=\"https://github.com/fluidicon.png\" title=\"GitHub\">" +
				"  <meta property=\"fb:app_id\" content=\"1401488693436528\">" +
				"" +
				"    " +
				"    <meta content=\"https://avatars2.githubusercontent.com/u/1961952?s=280&amp;v=4\" property=\"og:image\" /><meta content=\"GitHub\" property=\"og:site_name\" /><meta content=\"profile\" property=\"og:type\" /><meta content=\"Alibaba\" property=\"og:title\" /><meta content=\"https://github.com/alibaba\" property=\"og:url\" /><meta content=\"Alibaba Open Source\" property=\"og:description\" /><meta content=\"alibaba\" property=\"profile:username\" />" +
				"" +
				"  <link rel=\"assets\" href=\"https://assets-cdn.github.com/\">" +
				"  " +
				"  <meta name=\"pjax-timeout\" content=\"1000\">" +
				"  " +
				"  <meta name=\"request-id\" content=\"C0A7:259B2:7E0400:BA05E4:5A570F1C\" data-pjax-transient>" +
				"  " +
				"" +
				"  <meta name=\"selected-link\" value=\"/alibaba\" data-pjax-transient>" +
				"" +
				"    <meta name=\"google-site-verification\" content=\"KT5gs8h0wvaagLKAVWq8bbeNwnZZK1r1XQysX3xurLU\">" +
				"  <meta name=\"google-site-verification\" content=\"ZzhVyEFwb7w3e0-uOTltm8Jsck2F5StVihD0exw2fsA\">" +
				"  <meta name=\"google-site-verification\" content=\"GXs5KoUUkNCoaAZn7wPN-t01Pywp9M3sEjnt_3_ZWPc\">" +
				"    <meta name=\"google-analytics\" content=\"UA-3769691-2\">" +
				"" +
				"<meta content=\"collector.githubapp.com\" name=\"octolytics-host\" /><meta content=\"github\" name=\"octolytics-app-id\" /><meta content=\"https://collector.githubapp.com/github-external/browser_event\" name=\"octolytics-event-url\" /><meta content=\"C0A7:259B2:7E0400:BA05E4:5A570F1C\" name=\"octolytics-dimension-request_id\" /><meta content=\"sea\" name=\"octolytics-dimension-region_edge\" /><meta content=\"iad\" name=\"octolytics-dimension-region_render\" />" +
				"<meta content=\"/&lt;org-login&gt;\" data-pjax-transient=\"true\" name=\"analytics-location\" />" +
				"  <meta class=\"js-ga-set\" name=\"dimension1\" content=\"Logged Out\">" +
				"      <meta name=\"hostname\" content=\"github.com\">" +
				"  <meta name=\"user-login\" content=\"\">" +
				"" +
				"      <meta name=\"expected-hostname\" content=\"github.com\">" +
				"    <meta name=\"js-proxy-site-detection-payload\" content=\"NjM1YTA1YTViMDI1M2Q3MDE5MTJlODkyZDVjZWY1ZmM3ZWQ0MTkwZDg3M2JlMDg4NTc0ZmNiZTI2MjExODI4MXx7InJlbW90ZV9hZGRyZXNzIjoiMTgyLjE1MC41OS42MSIsInJlcXVlc3RfaWQiOiJDMEE3OjI1OUIyOjdFMDQwMDpCQTA1RTQ6NUE1NzBGMUMiLCJ0aW1lc3RhbXAiOjE1MTU2NTQ5NDEsImhvc3QiOiJnaXRodWIuY29tIn0=\">" +
				"    <meta name=\"enabled-features\" content=\"UNIVERSE_BANNER,FREE_TRIALS\">" +
				"  <meta name=\"html-safe-nonce\" content=\"d856b7e445841a2cc0393fc719a706218280a5ce\">" +
				"  <meta http-equiv=\"x-pjax-version\" content=\"ccf80b63b687cc48f3a4a47060104f6b\">" +
				"    <meta name=\"description\" content=\"GitHub is where people build software. More than 27 million people use GitHub to discover, fork, and contribute to over 75 million projects.\">" +
				"  <meta name=\"browser-stats-url\" content=\"https://api.github.com/_private/browser/stats\">" +
				"  <meta name=\"browser-errors-url\" content=\"https://api.github.com/_private/browser/errors\">" +
				"  <link rel=\"mask-icon\" href=\"https://assets-cdn.github.com/pinned-octocat.svg\" color=\"#000000\">" +
				"  <link rel=\"icon\" type=\"image/x-icon\" class=\"js-site-favicon\" href=\"https://assets-cdn.github.com/favicon.ico\">" +
				"<meta name=\"theme-color\" content=\"#1e2327\">" +
				"  </head>" +
				"  <body class=\"logged-out env-production org\">" +
				"  <div class=\"position-relative js-header-wrapper \">" +
				"    <a href=\"#start-of-content\" tabindex=\"1\" class=\"px-2 py-4 show-on-focus js-skip-to-content\">Skip to content</a>" +
				"    <div id=\"js-pjax-loader-bar\" class=\"pjax-loader-bar\"><div class=\"progress\"></div></div>" +
				"        <header class=\"Header header-logged-out  position-relative f4 py-3\" role=\"banner\">" +
				"  <div class=\"container-lg d-flex px-3\">" +
				"    <div class=\"d-flex flex-justify-between flex-items-center\">" +
				"      <a class=\"header-logo-invertocat my-0\" href=\"https://github.com/\" aria-label=\"Homepage\" data-ga-click=\"(Logged out) Header, go to homepage, icon:logo-wordmark\">" +
				"        <svg aria-hidden=\"true\" class=\"octicon octicon-mark-github\" height=\"32\" version=\"1.1\" viewBox=\"0 0 16 16\" width=\"32\"><path fill-rule=\"evenodd\" d=\"M8 0C3.58 0 0 3.58 0 8c0 3.54 2.29 6.53 5.47 7.59.4.07.55-.17.55-.38 0-.19-.01-.82-.01-1.49-2.01.37-2.53-.49-2.69-.94-.09-.23-.48-.94-.82-1.13-.28-.15-.68-.52-.01-.53.63-.01 1.08.58 1.23.82.72 1.21 1.87.87 2.33.66.07-.52.28-.87.51-1.07-1.78-.2-3.64-.89-3.64-3.95 0-.87.31-1.59.82-2.15-.08-.2-.36-1.02.08-2.12 0 0 .67-.21 2.2.82.64-.18 1.32-.27 2-.27.68 0 1.36.09 2 .27 1.53-1.04 2.2-.82 2.2-.82.44 1.1.16 1.92.08 2.12.51.56.82 1.27.82 2.15 0 3.07-1.87 3.75-3.65 3.95.29.25.54.73.54 1.48 0 1.07-.01 1.93-.01 2.2 0 .21.15.46.55.38A8.013 8.013 0 0 0 16 8c0-4.42-3.58-8-8-8z\"/></svg>" +
				"      </a>" +
				"    </div>" +
				"    <div class=\"HeaderMenu HeaderMenu--bright d-flex flex-justify-between flex-auto\">" +
				"        <nav class=\"mt-0\">" +
				"          <ul class=\"d-flex list-style-none\">" +
				"              <li class=\"ml-2\">" +
				"                <a href=\"/features\" class=\"js-selected-navigation-item HeaderNavlink px-0 py-2 m-0\" data-ga-click=\"Header, click, Nav menu - item:features\" data-selected-links=\"/features /features/project-management /features/code-review /features/project-management /features/integrations /features\">" +
				"                  Features" +
				"</a>              </li>" +
				"              <li class=\"ml-4\">" +
				"                <a href=\"/business\" class=\"js-selected-navigation-item HeaderNavlink px-0 py-2 m-0\" data-ga-click=\"Header, click, Nav menu - item:business\" data-selected-links=\"/business /business/security /business/customers /business\">" +
				"                  Business" +
				"</a>              </li>" +
				"              <li class=\"ml-4\">" +
				"                <a href=\"/explore\" class=\"js-selected-navigation-item HeaderNavlink px-0 py-2 m-0\" data-ga-click=\"Header, click, Nav menu - item:explore\" data-selected-links=\"/explore /trending /trending/developers /integrations /integrations/feature/code /integrations/feature/collaborate /integrations/feature/ship showcases showcases_search showcases_landing /explore\">" +
				"                  Explore" +
				"</a>              </li>" +
				"              <li class=\"ml-4\">" +
				"                    <a href=\"/marketplace\" class=\"js-selected-navigation-item HeaderNavlink px-0 py-2 m-0\" data-ga-click=\"Header, click, Nav menu - item:marketplace\" data-selected-links=\" /marketplace\">" +
				"                      Marketplace" +
				"</a>              </li>" +
				"              <li class=\"ml-4\">" +
				"                <a href=\"/pricing\" class=\"js-selected-navigation-item HeaderNavlink px-0 py-2 m-0\" data-ga-click=\"Header, click, Nav menu - item:pricing\" data-selected-links=\"/pricing /pricing/developer /pricing/team /pricing/business-hosted /pricing/business-enterprise /pricing\">" +
				"                  Pricing" +
				"</a>              </li>" +
				"          </ul>" +
				"        </nav>" +
				"      <div class=\"d-flex\">" +
				"          <div class=\"d-lg-flex flex-items-center mr-3\">" +
				"            <div class=\"header-search scoped-search site-scoped-search js-site-search\" role=\"search\">" +
				"  <!-- '\"` --><!-- </textarea></xmp> --></option></form><form accept-charset=\"UTF-8\" action=\"/orgs/alibaba/search\" class=\"js-site-search-form\" data-scoped-search-url=\"/orgs/alibaba/search\" data-unscoped-search-url=\"/search\" method=\"get\"><div style=\"margin:0;padding:0;display:inline\"><input name=\"utf8\" type=\"hidden\" value=\"&#x2713;\" /></div>" +
				"    <label class=\"form-control header-search-wrapper js-chromeless-input-container\">" +
				"        <a href=\"/organizations/alibaba\" class=\"header-search-scope no-underline\">This organization</a>" +
				"      <input type=\"text\"" +
				"        class=\"form-control header-search-input js-site-search-focus js-site-search-field is-clearable\"" +
				"        data-hotkey=\"s\"" +
				"        name=\"q\"" +
				"        value=\"\"" +
				"        placeholder=\"Search\"" +
				"        aria-label=\"Search this repository\"" +
				"        data-unscoped-placeholder=\"Search GitHub\"" +
				"        data-scoped-placeholder=\"Search\"" +
				"        autocapitalize=\"off\">" +
				"        <input type=\"hidden\" class=\"js-site-search-type-field\" name=\"type\" >" +
				"    </label>" +
				"</form></div>" +
				"          </div>" +
				"        <span class=\"d-inline-block\">" +
				"            <div class=\"HeaderNavlink px-0 py-2 m-0\">" +
				"              <a class=\"text-bold text-white no-underline\" href=\"/login?return_to=%2Falibaba%3Ftab%3Drepositories%26page%3D8\" data-ga-click=\"(Logged out) Header, clicked Sign in, text:sign-in\">Sign in</a>" +
				"                <span class=\"text-gray\">or</span>" +
				"                <a class=\"text-bold text-white no-underline\" href=\"/join?source=header\" data-ga-click=\"(Logged out) Header, clicked Sign up, text:sign-up\">Sign up</a>" +
				"            </div>" +
				"        </span>" +
				"      </div>" +
				"    </div>" +
				"  </div>" +
				"</header>" +
				"  </div>" +
				"  <div id=\"start-of-content\" class=\"show-on-focus\"></div>" +
				"    <div id=\"js-flash-container\">" +
				"</div>" +
				"  <div role=\"main\" >" +
				"      <div id=\"js-pjax-container\" data-pjax-container>" +
				"<div itemscope itemtype=\"http://schema.org/Organization\">" +
				"<header class=\"orghead\">" +
				"  <div class=\"container\">" +
				"    <div class=\"TableObject org-header-wrapper mb-4\">" +
				"      <img alt=\"@alibaba\" class=\"TableObject-item avatar\" height=\"100\" itemprop=\"image\" src=\"https://avatars3.githubusercontent.com/u/1961952?s=200&amp;v=4\" width=\"100\" />" +
				"      <div class=\"TableObject-item TableObject-item--primary\">" +
				"        <h1 class=\"org-name lh-condensed\">" +
				"          Alibaba" +
				"        </h1>" +
				"          <p class=\"org-description\" itemprop=\"description\"><div>Alibaba Open Source</div></p>" +
				"          <ul class=\"org-header-meta has-location has-blog\">" +
				"              <li class=\"meta-item\">" +
				"                <svg aria-hidden=\"true\" class=\"octicon octicon-location\" height=\"16\" version=\"1.1\" viewBox=\"0 0 12 16\" width=\"12\"><path fill-rule=\"evenodd\" d=\"M6 0C2.69 0 0 2.5 0 5.5 0 10.02 6 16 6 16s6-5.98 6-10.5C12 2.5 9.31 0 6 0zm0 14.55C4.14 12.52 1 8.44 1 5.5 1 3.02 3.25 1 6 1c1.34 0 2.61.48 3.56 1.36.92.86 1.44 1.97 1.44 3.14 0 2.94-3.14 7.02-5 9.05zM8 5.5c0 1.11-.89 2-2 2-1.11 0-2-.89-2-2 0-1.11.89-2 2-2 1.11 0 2 .89 2 2z\"/></svg>" +
				"                <span itemprop=\"location\" title=\"Hangzhou, China\">Hangzhou, China</span>" +
				"              </li>" +
				"              <li class=\"meta-item\">" +
				"                <svg aria-hidden=\"true\" class=\"octicon octicon-link\" height=\"16\" version=\"1.1\" viewBox=\"0 0 16 16\" width=\"16\"><path fill-rule=\"evenodd\" d=\"M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z\"/></svg>" +
				"                <a href=\"http://www.alibaba.com\" class=\"text-gray\" itemprop=\"url\" title=\"http://www.alibaba.com\">http://www.alibaba.com</a>" +
				"              </li>" +
				"          </ul>" +
				"      </div>" +
				"    </div>" +
				"    <nav class=\"orgnav\" role=\"navigation\">" +
				"  <a class=\"pagehead-tabs-item selected\" href=\"/alibaba\">" +
				"    <svg aria-hidden=\"true\" class=\"octicon octicon-repo\" height=\"16\" version=\"1.1\" viewBox=\"0 0 12 16\" width=\"12\"><path fill-rule=\"evenodd\" d=\"M4 9H3V8h1v1zm0-3H3v1h1V6zm0-2H3v1h1V4zm0-2H3v1h1V2zm8-1v12c0 .55-.45 1-1 1H6v2l-1.5-1.5L3 16v-2H1c-.55 0-1-.45-1-1V1c0-.55.45-1 1-1h10c.55 0 1 .45 1 1zm-1 10H1v2h2v-1h3v1h5v-2zm0-10H2v9h9V1z\"/></svg>" +
				"    Repositories" +
				"    <span class=\"Counter\">175</span>" +
				"  </a>" +
				"    <a class=\"pagehead-tabs-item \" href=\"/orgs/alibaba/people\">" +
				"      <svg aria-hidden=\"true\" class=\"octicon octicon-organization\" height=\"16\" version=\"1.1\" viewBox=\"0 0 16 16\" width=\"16\"><path fill-rule=\"evenodd\" d=\"M16 12.999c0 .439-.45 1-1 1H7.995c-.539 0-.994-.447-.995-.999H1c-.54 0-1-.561-1-1 0-2.634 3-4 3-4s.229-.409 0-1c-.841-.621-1.058-.59-1-3 .058-2.419 1.367-3 2.5-3s2.442.58 2.5 3c.058 2.41-.159 2.379-1 3-.229.59 0 1 0 1s1.549.711 2.42 2.088C9.196 9.369 10 8.999 10 8.999s.229-.409 0-1c-.841-.62-1.058-.59-1-3 .058-2.419 1.367-3 2.5-3s2.437.581 2.495 3c.059 2.41-.158 2.38-1 3-.229.59 0 1 0 1s3.005 1.366 3.005 4\"/></svg>" +
				"      People" +
				"      <span class=\"Counter\">114</span>" +
				"    </a>" +
				"</nav>" +
				"  </div>" +
				"</header>" +
				"  <div class=\"org-profile container js-pinned-repos-reorder-container\">" +
				"    <div id=\"org-repositories\" data-pjax-container>" +
				"      <div class=\"col-8 d-inline-block\">" +
				"  <div class=\"org-repos repo-list\">" +
				"  <div class=\"blankslate mt-0\">" +
				"      <svg aria-hidden=\"true\" class=\"octicon octicon-repo blankslate-icon\" height=\"32\" version=\"1.1\" viewBox=\"0 0 12 16\" width=\"24\"><path fill-rule=\"evenodd\" d=\"M4 9H3V8h1v1zm0-3H3v1h1V6zm0-2H3v1h1V4zm0-2H3v1h1V2zm8-1v12c0 .55-.45 1-1 1H6v2l-1.5-1.5L3 16v-2H1c-.55 0-1-.45-1-1V1c0-.55.45-1 1-1h10c.55 0 1 .45 1 1zm-1 10H1v2h2v-1h3v1h5v-2zm0-10H2v9h9V1z\"/></svg>" +
				"      <h3>This organization has no more repositories.</h3>" +
				"  </div>" +
				"<div class=\"paginate-container\" data-pjax>" +
				"  <div class=\"pagination\"><a class=\"previous_page\" rel=\"prev\" href=\"/alibaba?page=7&amp;tab=repositories\">Previous</a> <a rel=\"start\" href=\"/alibaba?page=1&amp;tab=repositories\">1</a> <a href=\"/alibaba?page=2&amp;tab=repositories\">2</a> <a href=\"/alibaba?page=3&amp;tab=repositories\">3</a> <a href=\"/alibaba?page=4&amp;tab=repositories\">4</a> <a href=\"/alibaba?page=5&amp;tab=repositories\">5</a> <a href=\"/alibaba?page=6&amp;tab=repositories\">6</a> <span class=\"next_page disabled\">Next</span></div>" +
				"</div>" +
				"  </div>" +
				"</div>" +
				"<div class=\"col-4 float-right pl-4\">" +
				"  <include-fragment src=\"/orgs/alibaba/top_languages\">" +
				"  </include-fragment>" +
				"  <include-fragment src=\"/orgs/alibaba/topics/most_used\">" +
				"  </include-fragment>" +
				"    <div class=\"Box mb-3\">" +
				"      <div class=\"Box-body\">" +
				"        <a class=\"d-block text-gray-dark\" href=\"/orgs/alibaba/people\" data-ga-click=\"Orgs, go to people, location:profile people module; text:People\">" +
				"          <span class=\"float-right f5 text-gray\">" +
				"            114" +
				"            <svg aria-hidden=\"true\" class=\"octicon octicon-chevron-right\" height=\"16\" version=\"1.1\" viewBox=\"0 0 8 16\" width=\"8\"><path fill-rule=\"evenodd\" d=\"M7.5 8l-5 5L1 11.5 4.75 8 1 4.5 2.5 3z\"/></svg>" +
				"          </span>" +
				"          <h4 class=\"f4 text-normal mb-3\">People</h4>" +
				"        </a>" +
				"        <div class=\"member-avatar-group\">" +
				"              <a href=\"/778477\" class=\"member-avatar tooltipped tooltipped-s\" aria-label=\"778477\" data-ga-click=\"Orgs, go to person, location:profile people module; text:username tooltip\">" +
				"                <img alt=\"@778477\" class=\"avatar\" height=\"48\" src=\"https://avatars0.githubusercontent.com/u/6553009?s=96&amp;v=4\" width=\"48\" />" +
				"              </a>" +
				"              <a href=\"/abop\" class=\"member-avatar tooltipped tooltipped-s\" aria-label=\"abop\" data-ga-click=\"Orgs, go to person, location:profile people module; text:username tooltip\">" +
				"                <img alt=\"@abop\" class=\"avatar\" height=\"48\" src=\"https://avatars2.githubusercontent.com/u/2064065?s=96&amp;v=4\" width=\"48\" />" +
				"              </a>" +
				"              <a href=\"/agapple\" class=\"member-avatar tooltipped tooltipped-s\" aria-label=\"agapple\" data-ga-click=\"Orgs, go to person, location:profile people module; text:username tooltip\">" +
				"                <img alt=\"@agapple\" class=\"avatar\" height=\"48\" src=\"https://avatars1.githubusercontent.com/u/834743?s=96&amp;v=4\" width=\"48\" />" +
				"              </a>" +
				"              <a href=\"/agentzh\" class=\"member-avatar tooltipped tooltipped-s\" aria-label=\"agentzh\" data-ga-click=\"Orgs, go to person, location:profile people module; text:username tooltip\">" +
				"                <img alt=\"@agentzh\" class=\"avatar\" height=\"48\" src=\"https://avatars0.githubusercontent.com/u/56241?s=96&amp;v=4\" width=\"48\" />" +
				"              </a>" +
				"              <a href=\"/allencloud\" class=\"member-avatar tooltipped tooltipped-s\" aria-label=\"allencloud\" data-ga-click=\"Orgs, go to person, location:profile people module; text:username tooltip\">" +
				"                <img alt=\"@allencloud\" class=\"avatar\" height=\"48\" src=\"https://avatars0.githubusercontent.com/u/9465626?s=96&amp;v=4\" width=\"48\" />" +
				"              </a>" +
				"              <a href=\"/allenzhu\" class=\"member-avatar tooltipped tooltipped-s\" aria-label=\"allenzhu\" data-ga-click=\"Orgs, go to person, location:profile people module; text:username tooltip\">" +
				"                <img alt=\"@allenzhu\" class=\"avatar\" height=\"48\" src=\"https://avatars1.githubusercontent.com/u/1324247?s=96&amp;v=4\" width=\"48\" />" +
				"              </a>" +
				"              <a href=\"/andyghj\" class=\"member-avatar tooltipped tooltipped-s\" aria-label=\"andyghj\" data-ga-click=\"Orgs, go to person, location:profile people module; text:username tooltip\">" +
				"                <img alt=\"@andyghj\" class=\"avatar\" height=\"48\" src=\"https://avatars0.githubusercontent.com/u/4279318?s=96&amp;v=4\" width=\"48\" />" +
				"              </a>" +
				"              <a href=\"/atian25\" class=\"member-avatar tooltipped tooltipped-s\" aria-label=\"atian25\" data-ga-click=\"Orgs, go to person, location:profile people module; text:username tooltip\">" +
				"                <img alt=\"@atian25\" class=\"avatar\" height=\"48\" src=\"https://avatars1.githubusercontent.com/u/227713?s=96&amp;v=4\" width=\"48\" />" +
				"              </a>" +
				"              <a href=\"/axmanwang\" class=\"member-avatar tooltipped tooltipped-s\" aria-label=\"axmanwang\" data-ga-click=\"Orgs, go to person, location:profile people module; text:username tooltip\">" +
				"                <img alt=\"@axmanwang\" class=\"avatar\" height=\"48\" src=\"https://avatars0.githubusercontent.com/u/1586503?s=96&amp;v=4\" width=\"48\" />" +
				"              </a>" +
				"              <a href=\"/bladehd\" class=\"member-avatar tooltipped tooltipped-s\" aria-label=\"bladehd\" data-ga-click=\"Orgs, go to person, location:profile people module; text:username tooltip\">" +
				"                <img alt=\"@bladehd\" class=\"avatar\" height=\"48\" src=\"https://avatars0.githubusercontent.com/u/1169762?s=96&amp;v=4\" width=\"48\" />" +
				"              </a>" +
				"              <a href=\"/boiawang\" class=\"member-avatar tooltipped tooltipped-s\" aria-label=\"boiawang\" data-ga-click=\"Orgs, go to person, location:profile people module; text:username tooltip\">" +
				"                <img alt=\"@boiawang\" class=\"avatar\" height=\"48\" src=\"https://avatars2.githubusercontent.com/u/6340730?s=96&amp;v=4\" width=\"48\" />" +
				"              </a>" +
				"              <a href=\"/brunoyang\" class=\"member-avatar tooltipped tooltipped-s\" aria-label=\"brunoyang\" data-ga-click=\"Orgs, go to person, location:profile people module; text:username tooltip\">" +
				"                <img alt=\"@brunoyang\" class=\"avatar\" height=\"48\" src=\"https://avatars2.githubusercontent.com/u/5086369?s=96&amp;v=4\" width=\"48\" />" +
				"              </a>" +
				"              <a href=\"/bucketli\" class=\"member-avatar tooltipped tooltipped-s\" aria-label=\"bucketli\" data-ga-click=\"Orgs, go to person, location:profile people module; text:username tooltip\">" +
				"                <img alt=\"@bucketli\" class=\"avatar\" height=\"48\" src=\"https://avatars3.githubusercontent.com/u/826821?s=96&amp;v=4\" width=\"48\" />" +
				"              </a>" +
				"              <a href=\"/cfsego\" class=\"member-avatar tooltipped tooltipped-s\" aria-label=\"cfsego\" data-ga-click=\"Orgs, go to person, location:profile people module; text:username tooltip\">" +
				"                <img alt=\"@cfsego\" class=\"avatar\" height=\"48\" src=\"https://avatars2.githubusercontent.com/u/1188207?s=96&amp;v=4\" width=\"48\" />" +
				"              </a>" +
				"              <a href=\"/chaoslawful\" class=\"member-avatar tooltipped tooltipped-s\" aria-label=\"chaoslawful\" data-ga-click=\"Orgs, go to person, location:profile people module; text:username tooltip\">" +
				"                <img alt=\"@chaoslawful\" class=\"avatar\" height=\"48\" src=\"https://avatars2.githubusercontent.com/u/56617?s=96&amp;v=4\" width=\"48\" />" +
				"              </a>" +
				"              <a href=\"/charvenhe\" class=\"member-avatar tooltipped tooltipped-s\" aria-label=\"charvenhe\" data-ga-click=\"Orgs, go to person, location:profile people module; text:username tooltip\">" +
				"                <img alt=\"@charvenhe\" class=\"avatar\" height=\"48\" src=\"https://avatars1.githubusercontent.com/u/6275941?s=96&amp;v=4\" width=\"48\" />" +
				"              </a>" +
				"        </div>" +
				"      </div>" +
				"    </div>" +
				"</div>" +
				"    </div>" +
				"  </div>" +
				"</div>" +
				"      </div>" +
				"      <div class=\"modal-backdrop js-touch-events\"></div>" +
				"  </div>" +
				"<div class=\"footer container-lg px-3\" role=\"contentinfo\">" +
				"  <div class=\"position-relative d-flex flex-justify-between py-6 mt-6 f6 text-gray border-top border-gray-light \">" +
				"    <ul class=\"list-style-none d-flex flex-wrap \">" +
				"      <li class=\"mr-3\">&copy; 2018 <span title=\"0.09504s from unicorn-740291615-d3mhw\">GitHub</span>, Inc.</li>" +
				"        <li class=\"mr-3\"><a href=\"https://github.com/site/terms\" data-ga-click=\"Footer, go to terms, text:terms\">Terms</a></li>" +
				"        <li class=\"mr-3\"><a href=\"https://github.com/site/privacy\" data-ga-click=\"Footer, go to privacy, text:privacy\">Privacy</a></li>" +
				"        <li class=\"mr-3\"><a href=\"https://github.com/security\" data-ga-click=\"Footer, go to security, text:security\">Security</a></li>" +
				"        <li class=\"mr-3\"><a href=\"https://status.github.com/\" data-ga-click=\"Footer, go to status, text:status\">Status</a></li>" +
				"        <li><a href=\"https://help.github.com\" data-ga-click=\"Footer, go to help, text:help\">Help</a></li>" +
				"    </ul>" +
				"    <a href=\"https://github.com\" aria-label=\"Homepage\" class=\"footer-octicon\" title=\"GitHub\">" +
				"      <svg aria-hidden=\"true\" class=\"octicon octicon-mark-github\" height=\"24\" version=\"1.1\" viewBox=\"0 0 16 16\" width=\"24\"><path fill-rule=\"evenodd\" d=\"M8 0C3.58 0 0 3.58 0 8c0 3.54 2.29 6.53 5.47 7.59.4.07.55-.17.55-.38 0-.19-.01-.82-.01-1.49-2.01.37-2.53-.49-2.69-.94-.09-.23-.48-.94-.82-1.13-.28-.15-.68-.52-.01-.53.63-.01 1.08.58 1.23.82.72 1.21 1.87.87 2.33.66.07-.52.28-.87.51-1.07-1.78-.2-3.64-.89-3.64-3.95 0-.87.31-1.59.82-2.15-.08-.2-.36-1.02.08-2.12 0 0 .67-.21 2.2.82.64-.18 1.32-.27 2-.27.68 0 1.36.09 2 .27 1.53-1.04 2.2-.82 2.2-.82.44 1.1.16 1.92.08 2.12.51.56.82 1.27.82 2.15 0 3.07-1.87 3.75-3.65 3.95.29.25.54.73.54 1.48 0 1.07-.01 1.93-.01 2.2 0 .21.15.46.55.38A8.013 8.013 0 0 0 16 8c0-4.42-3.58-8-8-8z\"/></svg>" +
				"</a>" +
				"    <ul class=\"list-style-none d-flex flex-wrap \">" +
				"        <li class=\"mr-3\"><a href=\"https://github.com/contact\" data-ga-click=\"Footer, go to contact, text:contact\">Contact GitHub</a></li>" +
				"      <li class=\"mr-3\"><a href=\"https://developer.github.com\" data-ga-click=\"Footer, go to api, text:api\">API</a></li>" +
				"      <li class=\"mr-3\"><a href=\"https://training.github.com\" data-ga-click=\"Footer, go to training, text:training\">Training</a></li>" +
				"      <li class=\"mr-3\"><a href=\"https://shop.github.com\" data-ga-click=\"Footer, go to shop, text:shop\">Shop</a></li>" +
				"        <li class=\"mr-3\"><a href=\"https://github.com/blog\" data-ga-click=\"Footer, go to blog, text:blog\">Blog</a></li>" +
				"        <li><a href=\"https://github.com/about\" data-ga-click=\"Footer, go to about, text:about\">About</a></li>" +

				"    </ul>" +
				"  </div>" +
				"</div>" +
				"  <div id=\"ajax-error-message\" class=\"ajax-error-message flash flash-error\">" +
				"    <svg aria-hidden=\"true\" class=\"octicon octicon-alert\" height=\"16\" version=\"1.1\" viewBox=\"0 0 16 16\" width=\"16\"><path fill-rule=\"evenodd\" d=\"M8.865 1.52c-.18-.31-.51-.5-.87-.5s-.69.19-.87.5L.275 13.5c-.18.31-.18.69 0 1 .19.31.52.5.87.5h13.7c.36 0 .69-.19.86-.5.17-.31.18-.69.01-1L8.865 1.52zM8.995 13h-2v-2h2v2zm0-3h-2V6h2v4z\"/></svg>" +
				"    <button type=\"button\" class=\"flash-close js-ajax-error-dismiss\" aria-label=\"Dismiss error\">" +
				"      <svg aria-hidden=\"true\" class=\"octicon octicon-x\" height=\"16\" version=\"1.1\" viewBox=\"0 0 12 16\" width=\"12\"><path fill-rule=\"evenodd\" d=\"M7.48 8l3.75 3.75-1.48 1.48L6 9.48l-3.75 3.75-1.48-1.48L4.52 8 .77 4.25l1.48-1.48L6 6.52l3.75-3.75 1.48 1.48z\"/></svg>" +
				"    </button>" +
				"    You can't perform that action at this time." +
				"  </div>" +
				"    <script crossorigin=\"anonymous\" src=\"https://assets-cdn.github.com/assets/compat-e42a8bf9c380758734e39851db04de7cbeeb2f3860efbd481c96ac12c25a6ecb.js\"></script>" +
				"    <script crossorigin=\"anonymous\" src=\"https://assets-cdn.github.com/assets/frameworks-7ad4386210c72170ce8e41e379487f2b8ab89431cd55547610cb6777dae65949.js\"></script>" +
				"    <script async=\"async\" crossorigin=\"anonymous\" src=\"https://assets-cdn.github.com/assets/github-ebee7220465cdb0698f5f0352ab24cbbcb44ede540da76742fc308637649493c.js\"></script>" +
				"  <div class=\"js-stale-session-flash stale-session-flash flash flash-warn flash-banner d-none\">" +
				"    <svg aria-hidden=\"true\" class=\"octicon octicon-alert\" height=\"16\" version=\"1.1\" viewBox=\"0 0 16 16\" width=\"16\"><path fill-rule=\"evenodd\" d=\"M8.865 1.52c-.18-.31-.51-.5-.87-.5s-.69.19-.87.5L.275 13.5c-.18.31-.18.69 0 1 .19.31.52.5.87.5h13.7c.36 0 .69-.19.86-.5.17-.31.18-.69.01-1L8.865 1.52zM8.995 13h-2v-2h2v2zm0-3h-2V6h2v4z\"/></svg>" +
				"    <span class=\"signed-in-tab-flash\">You signed in with another tab or window. <a href=\"\">Reload</a> to refresh your session.</span>" +
				"    <span class=\"signed-out-tab-flash\">You signed out in another tab or window. <a href=\"\">Reload</a> to refresh your session.</span>" +
				"  </div>" +
				"  <div class=\"facebox\" id=\"facebox\" style=\"display:none;\">" +
				"  <div class=\"facebox-popup\">" +
				"    <div class=\"facebox-content\" role=\"dialog\" aria-labelledby=\"facebox-header\" aria-describedby=\"facebox-description\">" +
				"    </div>" +
				"    <button type=\"button\" class=\"facebox-close js-facebox-close\" aria-label=\"Close modal\">" +
				"      <svg aria-hidden=\"true\" class=\"octicon octicon-x\" height=\"16\" version=\"1.1\" viewBox=\"0 0 12 16\" width=\"12\"><path fill-rule=\"evenodd\" d=\"M7.48 8l3.75 3.75-1.48 1.48L6 9.48l-3.75 3.75-1.48-1.48L4.52 8 .77 4.25l1.48-1.48L6 6.52l3.75-3.75 1.48 1.48z\"/></svg>" +
				"    </button>" +
				"  </div>" +
				"</div>" +
				"  </body>" +
				"</html>";
		String s = "" +
				"" +
				"<!DOCTYPE html>" +
				"<html lang=\"en\">" +
				"  <head>" +
				"    <meta charset=\"utf-8\">" +
				"  <link rel=\"dns-prefetch\" href=\"https://assets-cdn.github.com\">" +
				"  <link rel=\"dns-prefetch\" href=\"https://avatars0.githubusercontent.com\">" +
				"  <link rel=\"dns-prefetch\" href=\"https://avatars1.githubusercontent.com\">" +
				"  <link rel=\"dns-prefetch\" href=\"https://avatars2.githubusercontent.com\">" +
				"  <link rel=\"dns-prefetch\" href=\"https://avatars3.githubusercontent.com\">" +
				"  <link rel=\"dns-prefetch\" href=\"https://github-cloud.s3.amazonaws.com\">" +
				"  <link rel=\"dns-prefetch\" href=\"https://user-images.githubusercontent.com/\">" +
				"" +
				"<meta content=\"origin-when-cross-origin\" name=\"referrer\" />" +
				"" +
				"  <link crossorigin=\"anonymous\" href=\"https://assets-cdn.github.com/assets/frameworks-700c269c41d75b60698a62d9306dae4a0f840bec4718545615f752400f1fd908.css\" integrity=\"sha256-cAwmnEHXW2BpimLZMG2uSg+EC+xHGFRWFfdSQA8f2Qg=\" media=\"all\" rel=\"stylesheet\" />" +
				"  <link crossorigin=\"anonymous\" href=\"https://assets-cdn.github.com/assets/github-6cdfd566d21426082955dcd5dcf85dbaf7c40bea4abd487ae5d5d8193bb7f07f.css\" integrity=\"sha256-bN/VZtIUJggpVdzV3PhduvfEC+pKvUh65dXYGTu38H8=\" media=\"all\" rel=\"stylesheet\" />" +
				"  " +
				"  " +
				"  " +
				"  " +
				"" +
				"  <meta name=\"viewport\" content=\"width=device-width\">" +
				"  " +
				"  <title>Your Repositories</title>" +
				"  <link rel=\"search\" type=\"application/opensearchdescription+xml\" href=\"/opensearch.xml\" title=\"GitHub\">" +
				"  <link rel=\"fluid-icon\" href=\"https://github.com/fluidicon.png\" title=\"GitHub\">" +
				"  <meta property=\"fb:app_id\" content=\"1401488693436528\">" +
				"" +
				"    " +
				"    <meta content=\"https://avatars0.githubusercontent.com/u/20263105?s=400&amp;v=4\" property=\"og:image\" /><meta content=\"GitHub\" property=\"og:site_name\" /><meta content=\"profile\" property=\"og:type\" /><meta content=\"callELPSYCONGROO (Mudder)\" property=\"og:title\" /><meta content=\"https://github.com/callELPSYCONGROO\" property=\"og:url\" /><meta content=\"callELPSYCONGROO has 7 repositories available. Follow their code on GitHub.\" property=\"og:description\" /><meta content=\"callELPSYCONGROO\" property=\"profile:username\" />" +
				"" +
				"  <link rel=\"assets\" href=\"https://assets-cdn.github.com/\">" +
				"  <link rel=\"web-socket\" href=\"wss://live.github.com/_sockets/VjI6MjI2NjQxNDQ2OjY1OTY5MjE0Yzc5ZDVjZGQ4YWIzNTQ0NjdiNjM2Njg1OGFjMjQ1MmM1ZTE2NzQwMmExNDY0Njk5Mjg4NzBlY2I=--eeead589c9a814e601deecdbf2920c1c019f2c00\">" +
				"  <meta name=\"pjax-timeout\" content=\"1000\">" +
				"  <link rel=\"sudo-modal\" href=\"/sessions/sudo_modal\">" +
				"  <meta name=\"request-id\" content=\"F9CD:259AF:52C04C:79ADA7:5A570AAB\" data-pjax-transient>" +
				"  " +
				"" +
				"  <meta name=\"selected-link\" value=\"/callELPSYCONGROO\" data-pjax-transient>" +
				"" +
				"    <meta name=\"google-site-verification\" content=\"KT5gs8h0wvaagLKAVWq8bbeNwnZZK1r1XQysX3xurLU\">" +
				"  <meta name=\"google-site-verification\" content=\"ZzhVyEFwb7w3e0-uOTltm8Jsck2F5StVihD0exw2fsA\">" +
				"  <meta name=\"google-site-verification\" content=\"GXs5KoUUkNCoaAZn7wPN-t01Pywp9M3sEjnt_3_ZWPc\">" +
				"    <meta name=\"google-analytics\" content=\"UA-3769691-2\">" +
				"" +
				"<meta content=\"collector.githubapp.com\" name=\"octolytics-host\" /><meta content=\"github\" name=\"octolytics-app-id\" /><meta content=\"https://collector.githubapp.com/github-external/browser_event\" name=\"octolytics-event-url\" /><meta content=\"F9CD:259AF:52C04C:79ADA7:5A570AAB\" name=\"octolytics-dimension-request_id\" /><meta content=\"sea\" name=\"octolytics-dimension-region_edge\" /><meta content=\"iad\" name=\"octolytics-dimension-region_render\" /><meta content=\"20263105\" name=\"octolytics-actor-id\" /><meta content=\"callELPSYCONGROO\" name=\"octolytics-actor-login\" /><meta content=\"c270555d8763d6aa10bd1a38507bdb8604083ce4b5dc7890ba19c68679666c93\" name=\"octolytics-actor-hash\" />" +
				"<meta content=\"/&lt;user-name&gt;\" data-pjax-transient=\"true\" name=\"analytics-location\" />" +
				"" +
				"" +
				"" +
				"" +
				"  <meta class=\"js-ga-set\" name=\"dimension1\" content=\"Logged In\">" +
				"" +
				"" +
				"  " +
				"" +
				"      <meta name=\"hostname\" content=\"github.com\">" +
				"  <meta name=\"user-login\" content=\"callELPSYCONGROO\">" +
				"" +
				"      <meta name=\"expected-hostname\" content=\"github.com\">" +
				"    <meta name=\"js-proxy-site-detection-payload\" content=\"NGZkZmUxNzAyMTRlNGFkMzFjYzk0YWFlNWQwMzVhMDA1ZjBlZmViNzgwOTgyZjk4OTQ1YTBlZTdiNWE2ZGYyZXx7InJlbW90ZV9hZGRyZXNzIjoiMTgyLjE1MC41OS42MSIsInJlcXVlc3RfaWQiOiJGOUNEOjI1OUFGOjUyQzA0Qzo3OUFEQTc6NUE1NzBBQUIiLCJ0aW1lc3RhbXAiOjE1MTU2NTM4NDQsImhvc3QiOiJnaXRodWIuY29tIn0=\">" +
				"" +
				"    <meta name=\"enabled-features\" content=\"UNIVERSE_BANNER,FREE_TRIALS\">" +
				"" +
				"  <meta name=\"html-safe-nonce\" content=\"c22d74f4afe82bd2cb3bcf5a37f89c251dcb93e9\">" +
				"" +
				"  <meta http-equiv=\"x-pjax-version\" content=\"ccf80b63b687cc48f3a4a47060104f6b\">" +
				"  " +
				"" +
				"      <link href=\"/callELPSYCONGROO.atom\" rel=\"alternate\" title=\"atom\" type=\"application/atom+xml\">" +
				"  <meta name=\"description\" content=\"callELPSYCONGROO has 7 repositories available. Follow their code on GitHub.\">" +
				"  <meta content=\"20263105\" name=\"octolytics-dimension-user_id\" /><meta content=\"callELPSYCONGROO\" name=\"octolytics-dimension-user_login\" />" +
				"" +
				"" +
				"" +
				"" +
				"  <meta name=\"browser-stats-url\" content=\"https://api.github.com/_private/browser/stats\">" +
				"" +
				"  <meta name=\"browser-errors-url\" content=\"https://api.github.com/_private/browser/errors\">" +
				"" +
				"  <link rel=\"mask-icon\" href=\"https://assets-cdn.github.com/pinned-octocat.svg\" color=\"#000000\">" +
				"  <link rel=\"icon\" type=\"image/x-icon\" class=\"js-site-favicon\" href=\"https://assets-cdn.github.com/favicon.ico\">" +
				"" +
				"<meta name=\"theme-color\" content=\"#1e2327\">" +
				"" +
				"" +
				"  <meta name=\"u2f-support\" content=\"true\">" +
				"" +
				"  </head>" +
				"" +
				"  <body class=\"logged-in env-production page-profile mine\">" +
				"    " +
				"" +
				"  <div class=\"position-relative js-header-wrapper \">" +
				"    <a href=\"#start-of-content\" tabindex=\"1\" class=\"bg-black text-white p-3 show-on-focus js-skip-to-content\">Skip to content</a>" +
				"    <div id=\"js-pjax-loader-bar\" class=\"pjax-loader-bar\"><div class=\"progress\"></div></div>" +
				"" +
				"    " +
				"    " +
				"    " +
				"" +
				"" +
				"" +
				"        " +
				"<header class=\"Header  f5\" role=\"banner\">" +
				"  <div class=\"d-flex px-3 flex-justify-between container-lg\">" +
				"    <div class=\"d-flex flex-justify-between\">" +
				"      <a class=\"header-logo-invertocat\" href=\"https://github.com/\" data-hotkey=\"g d\" aria-label=\"Homepage\" data-ga-click=\"Header, go to dashboard, icon:logo\">" +
				"  <svg aria-hidden=\"true\" class=\"octicon octicon-mark-github\" height=\"32\" version=\"1.1\" viewBox=\"0 0 16 16\" width=\"32\"><path fill-rule=\"evenodd\" d=\"M8 0C3.58 0 0 3.58 0 8c0 3.54 2.29 6.53 5.47 7.59.4.07.55-.17.55-.38 0-.19-.01-.82-.01-1.49-2.01.37-2.53-.49-2.69-.94-.09-.23-.48-.94-.82-1.13-.28-.15-.68-.52-.01-.53.63-.01 1.08.58 1.23.82.72 1.21 1.87.87 2.33.66.07-.52.28-.87.51-1.07-1.78-.2-3.64-.89-3.64-3.95 0-.87.31-1.59.82-2.15-.08-.2-.36-1.02.08-2.12 0 0 .67-.21 2.2.82.64-.18 1.32-.27 2-.27.68 0 1.36.09 2 .27 1.53-1.04 2.2-.82 2.2-.82.44 1.1.16 1.92.08 2.12.51.56.82 1.27.82 2.15 0 3.07-1.87 3.75-3.65 3.95.29.25.54.73.54 1.48 0 1.07-.01 1.93-.01 2.2 0 .21.15.46.55.38A8.013 8.013 0 0 0 16 8c0-4.42-3.58-8-8-8z\"/></svg>" +
				"</a>" +
				"" +
				"" +
				"    </div>" +
				"" +
				"    <div class=\"HeaderMenu d-flex flex-justify-between flex-auto\">" +
				"      <div class=\"d-flex\">" +
				"            <div class=\"\">" +
				"              <div class=\"header-search   js-site-search\" role=\"search\">" +
				"  <!-- '\"` --><!-- </textarea></xmp> --></option></form><form accept-charset=\"UTF-8\" action=\"/search\" class=\"js-site-search-form\" data-unscoped-search-url=\"/search\" method=\"get\"><div style=\"margin:0;padding:0;display:inline\"><input name=\"utf8\" type=\"hidden\" value=\"&#x2713;\" /></div>" +
				"    <label class=\"form-control header-search-wrapper js-chromeless-input-container\">" +
				"        <a href=\"/callELPSYCONGROO\" class=\"header-search-scope no-underline\">/callELPSYCONGROO</a>" +
				"      <input type=\"text\"" +
				"        class=\"form-control header-search-input js-site-search-focus  \"" +
				"        data-hotkey=\"s\"" +
				"        name=\"q\"" +
				"        value=\"\"" +
				"        placeholder=\"Search GitHub\"" +
				"        aria-label=\"Search GitHub\"" +
				"        data-unscoped-placeholder=\"Search GitHub\"" +
				"        data-scoped-placeholder=\"Search\"" +
				"        autocapitalize=\"off\">" +
				"        <input type=\"hidden\" class=\"js-site-search-type-field\" name=\"type\" >" +
				"    </label>" +
				"</form></div>" +
				"" +
				"            </div>" +
				"" +
				"          <ul class=\"d-flex pl-2 flex-items-center text-bold list-style-none\" role=\"navigation\">" +
				"            <li>" +
				"              <a href=\"/pulls\" aria-label=\"Pull requests you created\" class=\"js-selected-navigation-item HeaderNavlink px-2\" data-ga-click=\"Header, click, Nav menu - item:pulls context:user\" data-hotkey=\"g p\" data-selected-links=\"/pulls /pulls/assigned /pulls/mentioned /pulls\">" +
				"                Pull requests" +
				"</a>            </li>" +
				"            <li>" +
				"              <a href=\"/issues\" aria-label=\"Issues you created\" class=\"js-selected-navigation-item HeaderNavlink px-2\" data-ga-click=\"Header, click, Nav menu - item:issues context:user\" data-hotkey=\"g i\" data-selected-links=\"/issues /issues/assigned /issues/mentioned /issues\">" +
				"                Issues" +
				"</a>            </li>" +
				"                <li>" +
				"                  <a href=\"/marketplace\" class=\"js-selected-navigation-item HeaderNavlink px-2\" data-ga-click=\"Header, click, Nav menu - item:marketplace context:user\" data-selected-links=\" /marketplace\">" +
				"                    Marketplace" +
				"</a>                </li>" +
				"            <li>" +
				"              <a href=\"/explore\" class=\"js-selected-navigation-item HeaderNavlink px-2\" data-ga-click=\"Header, click, Nav menu - item:explore\" data-selected-links=\"/explore /trending /trending/developers /integrations /integrations/feature/code /integrations/feature/collaborate /integrations/feature/ship showcases showcases_search showcases_landing /explore\">" +
				"                Explore" +
				"</a>            </li>" +
				"          </ul>" +
				"      </div>" +
				"" +
				"      <div class=\"d-flex\">" +
				"        " +
				"<ul class=\"user-nav d-flex flex-items-center list-style-none\" id=\"user-links\">" +
				"  <li class=\"dropdown js-menu-container\">" +
				"    <span class=\"d-inline-block  px-2\">" +
				"      " +
				"" +
				"    </span>" +
				"  </li>" +
				"" +
				"  <li class=\"dropdown js-menu-container\">" +
				"    <details class=\"dropdown-details details-reset js-dropdown-details d-flex px-2 flex-items-center\">" +
				"      <summary class=\"HeaderNavlink\"" +
				"         aria-label=\"Create new…\"" +
				"         data-ga-click=\"Header, create new, icon:add\">" +
				"        <svg aria-hidden=\"true\" class=\"octicon octicon-plus float-left mr-1 mt-1\" height=\"16\" version=\"1.1\" viewBox=\"0 0 12 16\" width=\"12\"><path fill-rule=\"evenodd\" d=\"M12 9H7v5H5V9H0V7h5V2h2v5h5z\"/></svg>" +
				"        <span class=\"dropdown-caret mt-1\"></span>" +
				"      </summary>" +
				"" +
				"      <ul class=\"dropdown-menu dropdown-menu-sw\">" +
				"        " +
				"<a class=\"dropdown-item\" href=\"/new\" data-ga-click=\"Header, create new repository\">" +
				"  New repository" +
				"</a>" +
				"" +
				"  <a class=\"dropdown-item\" href=\"/new/import\" data-ga-click=\"Header, import a repository\">" +
				"    Import repository" +
				"  </a>" +
				"" +
				"<a class=\"dropdown-item\" href=\"https://gist.github.com/\" data-ga-click=\"Header, create new gist\">" +
				"  New gist" +
				"</a>" +
				"" +
				"  <a class=\"dropdown-item\" href=\"/organizations/new\" data-ga-click=\"Header, create new organization\">" +
				"    New organization" +
				"  </a>" +
				"" +
				"" +
				"" +
				"" +
				"      </ul>" +
				"    </details>" +
				"  </li>" +
				"" +
				"  <li class=\"dropdown js-menu-container\">" +
				"" +
				"    <details class=\"dropdown-details details-reset js-dropdown-details d-flex pl-2 flex-items-center\">" +
				"      <summary class=\"HeaderNavlink name mt-1\"" +
				"        aria-label=\"View profile and more\"" +
				"        data-ga-click=\"Header, show menu, icon:avatar\">" +
				"        <img alt=\"@callELPSYCONGROO\" class=\"avatar float-left mr-1\" src=\"https://avatars0.githubusercontent.com/u/20263105?s=40&amp;v=4\" height=\"20\" width=\"20\">" +
				"        <span class=\"dropdown-caret\"></span>" +
				"      </summary>" +
				"" +
				"      <ul class=\"dropdown-menu dropdown-menu-sw\">" +
				"        <li class=\"dropdown-header header-nav-current-user css-truncate\">" +
				"          Signed in as <strong class=\"css-truncate-target\">callELPSYCONGROO</strong>" +
				"        </li>" +
				"" +
				"        <li class=\"dropdown-divider\"></li>" +
				"" +
				"        <li><a class=\"dropdown-item\" href=\"/callELPSYCONGROO\" data-ga-click=\"Header, go to profile, text:your profile\">" +
				"          Your profile" +
				"        </a></li>" +
				"        <li><a class=\"dropdown-item\" href=\"/callELPSYCONGROO?tab=stars\" data-ga-click=\"Header, go to starred repos, text:your stars\">" +
				"          Your stars" +
				"        </a></li>" +
				"          <li><a class=\"dropdown-item\" href=\"https://gist.github.com/\" data-ga-click=\"Header, your gists, text:your gists\">Your Gists</a></li>" +
				"" +
				"        <li class=\"dropdown-divider\"></li>" +
				"" +
				"        <li><a class=\"dropdown-item\" href=\"https://help.github.com\" data-ga-click=\"Header, go to help, text:help\">" +
				"          Help" +
				"        </a></li>" +
				"" +
				"        <li><a class=\"dropdown-item\" href=\"/settings/profile\" data-ga-click=\"Header, go to settings, icon:settings\">" +
				"          Settings" +
				"        </a></li>" +
				"" +
				"        <li><!-- '\"` --><!-- </textarea></xmp> --></option></form><form accept-charset=\"UTF-8\" action=\"/logout\" class=\"logout-form\" method=\"post\"><div style=\"margin:0;padding:0;display:inline\"><input name=\"utf8\" type=\"hidden\" value=\"&#x2713;\" /><input name=\"authenticity_token\" type=\"hidden\" value=\"CJinYzm2GQEc+6Fqiy/44kYQ8vnCdoAr0zyvHVuJgwJQBFh3Pk8fIXDP0Y1yaNVFEZEIJ7GV13BWzugF/+dr5Q==\" /></div>" +
				"          <button type=\"submit\" class=\"dropdown-item dropdown-signout\" data-ga-click=\"Header, sign out, icon:logout\">" +
				"            Sign out" +
				"          </button>" +
				"        </form></li>" +
				"      </ul>" +
				"    </details>" +
				"  </li>" +
				"</ul>" +
				"" +
				"" +
				"        <!-- '\"` --><!-- </textarea></xmp> --></option></form><form accept-charset=\"UTF-8\" action=\"/logout\" class=\"sr-only right-0\" method=\"post\"><div style=\"margin:0;padding:0;display:inline\"><input name=\"utf8\" type=\"hidden\" value=\"&#x2713;\" /><input name=\"authenticity_token\" type=\"hidden\" value=\"LIN0HkU5hw5z0rt48tfjjMQsMfRMOWQBZdxioHD8cI90H4sKQsCBLh/my58LkM4rk63LKj/aM1rgLiW41JKYaA==\" /></div>" +
				"          <button type=\"submit\" class=\"dropdown-item dropdown-signout\" data-ga-click=\"Header, sign out, icon:logout\">" +
				"            Sign out" +
				"          </button>" +
				"</form>      </div>" +
				"    </div>" +
				"  </div>" +
				"</header>" +
				"" +
				"      " +
				"" +
				"  </div>" +
				"" +
				"  <div id=\"start-of-content\" class=\"show-on-focus\"></div>" +
				"" +
				"    <div id=\"js-flash-container\">" +
				"</div>" +
				"" +
				"" +
				"" +
				"  <div role=\"main\" >" +
				"      " +
				"      <div id=\"js-pjax-container\" data-pjax-container>" +
				"        " +
				"" +
				"" +
				"<div class=\"container-lg clearfix px-3 mt-4\">" +
				"  <div class=\"h-card col-3 float-left pr-3\" itemscope itemtype=\"http://schema.org/Person\">" +
				"" +
				"    <div class=\"user-profile-sticky-bar js-user-profile-sticky-bar\">" +
				"      <div class=\"user-profile-mini-vcard d-table\">" +
				"        <span class=\"user-profile-mini-avatar d-table-cell v-align-middle lh-condensed-ultra pr-2\">" +
				"          <img alt=\"@callELPSYCONGROO\" class=\"rounded-1\" height=\"32\" src=\"https://avatars3.githubusercontent.com/u/20263105?s=64&amp;v=4\" width=\"32\" />" +
				"        </span>" +
				"        <span class=\"d-table-cell v-align-middle lh-condensed js-user-profile-following-mini-toggle\">" +
				"          <strong>callELPSYCONGROO</strong>" +
				"          " +
				"" +
				"" +
				"        </span>" +
				"      </div>" +
				"    </div>" +
				"" +
				"      <a href=\"/account\" aria-label=\"Change your avatar\" class=\"u-photo d-block tooltipped tooltipped-s\"><img alt=\"\" class=\"avatar width-full rounded-2\" height=\"230\" src=\"https://avatars1.githubusercontent.com/u/20263105?s=460&amp;v=4\" width=\"230\" /></a>" +
				"" +
				"      " +
				"<div class=\"vcard-names-container py-3 js-sticky js-user-profile-sticky-fields \">" +
				"  <h1 class=\"vcard-names\">" +
				"    <span class=\"p-name vcard-fullname d-block\" itemprop=\"name\">Mudder</span>" +
				"    <span class=\"p-nickname vcard-username d-block\" itemprop=\"additionalName\">callELPSYCONGROO</span>" +
				"  </h1>" +
				"</div>" +
				"" +
				"  <div class=\"p-note user-profile-bio\"><div>operation CWAL</div></div>" +
				"" +
				"" +
				"" +
				"" +
				"" +
				"" +
				"<ul class=\"vcard-details border-top border-gray-light py-3\">" +
				"" +
				"    <li aria-label=\"Home location\" class=\"vcard-detail pt-1 css-truncate css-truncate-target\" itemprop=\"homeLocation\" show_title=\"false\"><svg aria-hidden=\"true\" class=\"octicon octicon-location\" height=\"16\" version=\"1.1\" viewBox=\"0 0 12 16\" width=\"12\"><path fill-rule=\"evenodd\" d=\"M6 0C2.69 0 0 2.5 0 5.5 0 10.02 6 16 6 16s6-5.98 6-10.5C12 2.5 9.31 0 6 0zm0 14.55C4.14 12.52 1 8.44 1 5.5 1 3.02 3.25 1 6 1c1.34 0 2.61.48 3.56 1.36.92.86 1.44 1.97 1.44 3.14 0 2.94-3.14 7.02-5 9.05zM8 5.5c0 1.11-.89 2-2 2-1.11 0-2-.89-2-2 0-1.11.89-2 2-2 1.11 0 2 .89 2 2z\"/></svg>" +
				"      <span class=\"p-label\">China</span>" +
				"</li>" +
				"" +
				"  <li aria-label=\"Blog or website\" class=\"vcard-detail pt-1 css-truncate css-truncate-target\" itemprop=\"url\"><svg aria-hidden=\"true\" class=\"octicon octicon-link\" height=\"16\" version=\"1.1\" viewBox=\"0 0 16 16\" width=\"16\"><path fill-rule=\"evenodd\" d=\"M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z\"/></svg>" +
				"    <a href=\"http://blog.csdn.net/qq_20112609\" class=\"u-url\" rel=\"nofollow me\">http://blog.csdn.net/qq_20112609</a>" +
				"</li>" +
				"</ul>" +
				"" +
				"" +
				"  </div>" +
				"" +
				"  <div class=\"col-9 float-left pl-2\">" +
				"" +
				"" +
				"    <div class=\"UnderlineNav user-profile-nav js-sticky top-0\">" +
				"      <nav class=\"UnderlineNav-body\" data-pjax role=\"navigation\">" +
				"        <a href=\"/callELPSYCONGROO\"" +
				"          class=\"UnderlineNav-item \"" +
				"          aria-selected=\"false\"" +
				"          role=\"tab\"" +
				"          title=\"Overview\">" +
				"          Overview" +
				"        </a>" +
				"        <a href=\"/callELPSYCONGROO?tab=repositories\"" +
				"           class=\"UnderlineNav-item selected\"" +
				"           aria-selected=\"true\"" +
				"           role=\"tab\"" +
				"           title=\"Repositories\">" +
				"           Repositories" +
				"           <span class=\"Counter\">" +
				"             7" +
				"           </span>" +
				"        </a>" +
				"" +
				"" +
				"        <a href=\"/callELPSYCONGROO?tab=stars\"" +
				"          class=\"UnderlineNav-item \"" +
				"          aria-selected=\"false\"" +
				"          role=\"tab\"" +
				"          title=\"Stars\">" +
				"          Stars" +
				"          <span class=\"Counter\">" +
				"            3" +
				"          </span>" +
				"        </a>" +
				"        <a href=\"/callELPSYCONGROO?tab=followers\"" +
				"          class=\"UnderlineNav-item \"" +
				"          aria-selected=\"false\"" +
				"          role=\"tab\"" +
				"          title=\"Followers\">" +
				"          Followers" +
				"          <span class=\"Counter\">" +
				"            0" +
				"          </span>" +
				"        </a>" +
				"        <a href=\"/callELPSYCONGROO?tab=following\"" +
				"          class=\"UnderlineNav-item \"" +
				"          aria-selected=\"false\"" +
				"          role=\"tab\"" +
				"          title=\"Following\">" +
				"          Following" +
				"          <span class=\"Counter\">" +
				"            0" +
				"          </span>" +
				"        </a>" +
				"      </nav>" +
				"    </div>" +
				"" +
				"    <div class=\"position-relative\">" +
				"        " +
				"<div class=\"user-profile-repo-filter border-bottom border-gray-dark py-3\">" +
				"  <!-- '\"` --><!-- </textarea></xmp> --></option></form><form accept-charset=\"UTF-8\" action=\"/callELPSYCONGROO\" class=\"TableObject\" data-pjax-preserve-scroll=\"true\" data-pjax=\"true\" data-results-container=\"user-repositories-list\" method=\"get\" role=\"search\"><div style=\"margin:0;padding:0;display:inline\"><input name=\"utf8\" type=\"hidden\" value=\"&#x2713;\" /></div>" +
				"    <div class=\"TableObject-item TableObject-item--primary pr-4\">" +
				"      <input type=\"hidden\" name=\"tab\" value=\"repositories\">" +
				"      <input type=\"search\" id=\"your-repos-filter\" name=\"q\"" +
				"             class=\"form-control width-full js-autosearch-field\"" +
				"             placeholder=\"Search repositories&hellip;\"" +
				"             autocomplete=\"off\"" +
				"             aria-label=\"Search repositories&hellip;\"" +
				"             data-hotkey=\"/\" value=\"\">" +
				"    </div>" +
				"" +
				"    <div class=\"TableObject-item text-right\">" +
				"      <div class=\"select-menu d-inline-block js-menu-container js-select-menu select-menu-modal-right\">" +
				"        <button class=\"btn select-menu-button js-menu-target\" type=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\">" +
				"          <i>Type:</i>" +
				"          <span class=\"js-select-button\">" +
				"            All" +
				"          </span>" +
				"        </button>" +
				"" +
				"        <div class=\"select-menu-modal-holder js-menu-content js-navigation-container\">" +
				"          <div class=\"select-menu-modal\">" +
				"            <div class=\"select-menu-header text-left\">" +
				"              <svg aria-label=\"Close\" class=\"octicon octicon-x js-menu-close\" height=\"16\" role=\"img\" version=\"1.1\" viewBox=\"0 0 12 16\" width=\"12\"><path fill-rule=\"evenodd\" d=\"M7.48 8l3.75 3.75-1.48 1.48L6 9.48l-3.75 3.75-1.48-1.48L4.52 8 .77 4.25l1.48-1.48L6 6.52l3.75-3.75 1.48 1.48z\"/></svg>" +
				"              <span class=\"select-menu-title\">Select type:</span>" +
				"            </div>" +
				"            <div class=\"select-menu-list\" role=\"menu\">" +
				"                <button type=\"submit\" class=\"width-full select-menu-item js-navigation-item selected\">" +
				"                  <input checked=\"checked\" id=\"type_\" name=\"type\" type=\"radio\" value=\"\" />" +
				"                  <svg aria-hidden=\"true\" class=\"octicon octicon-check select-menu-item-icon\" height=\"16\" version=\"1.1\" viewBox=\"0 0 12 16\" width=\"12\"><path fill-rule=\"evenodd\" d=\"M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z\"/></svg>" +
				"                  <span class=\"select-menu-item-text js-select-button-text\">All</span>" +
				"                </button>" +
				"                <button type=\"submit\" class=\"width-full select-menu-item js-navigation-item \">" +
				"                  <input id=\"type_public\" name=\"type\" type=\"radio\" value=\"public\" />" +
				"                  <svg aria-hidden=\"true\" class=\"octicon octicon-check select-menu-item-icon\" height=\"16\" version=\"1.1\" viewBox=\"0 0 12 16\" width=\"12\"><path fill-rule=\"evenodd\" d=\"M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z\"/></svg>" +
				"                  <span class=\"select-menu-item-text js-select-button-text\">Public</span>" +
				"                </button>" +
				"                <button type=\"submit\" class=\"width-full select-menu-item js-navigation-item \">" +
				"                  <input id=\"type_private\" name=\"type\" type=\"radio\" value=\"private\" />" +
				"                  <svg aria-hidden=\"true\" class=\"octicon octicon-check select-menu-item-icon\" height=\"16\" version=\"1.1\" viewBox=\"0 0 12 16\" width=\"12\"><path fill-rule=\"evenodd\" d=\"M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z\"/></svg>" +
				"                  <span class=\"select-menu-item-text js-select-button-text\">Private</span>" +
				"                </button>" +
				"                <button type=\"submit\" class=\"width-full select-menu-item js-navigation-item \">" +
				"                  <input id=\"type_source\" name=\"type\" type=\"radio\" value=\"source\" />" +
				"                  <svg aria-hidden=\"true\" class=\"octicon octicon-check select-menu-item-icon\" height=\"16\" version=\"1.1\" viewBox=\"0 0 12 16\" width=\"12\"><path fill-rule=\"evenodd\" d=\"M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z\"/></svg>" +
				"                  <span class=\"select-menu-item-text js-select-button-text\">Sources</span>" +
				"                </button>" +
				"                <button type=\"submit\" class=\"width-full select-menu-item js-navigation-item \">" +
				"                  <input id=\"type_fork\" name=\"type\" type=\"radio\" value=\"fork\" />" +
				"                  <svg aria-hidden=\"true\" class=\"octicon octicon-check select-menu-item-icon\" height=\"16\" version=\"1.1\" viewBox=\"0 0 12 16\" width=\"12\"><path fill-rule=\"evenodd\" d=\"M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z\"/></svg>" +
				"                  <span class=\"select-menu-item-text js-select-button-text\">Forks</span>" +
				"                </button>" +
				"                <button type=\"submit\" class=\"width-full select-menu-item js-navigation-item \">" +
				"                  <input id=\"type_archived\" name=\"type\" type=\"radio\" value=\"archived\" />" +
				"                  <svg aria-hidden=\"true\" class=\"octicon octicon-check select-menu-item-icon\" height=\"16\" version=\"1.1\" viewBox=\"0 0 12 16\" width=\"12\"><path fill-rule=\"evenodd\" d=\"M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z\"/></svg>" +
				"                  <span class=\"select-menu-item-text js-select-button-text\">Archived</span>" +
				"                </button>" +
				"                <button type=\"submit\" class=\"width-full select-menu-item js-navigation-item \">" +
				"                  <input id=\"type_mirror\" name=\"type\" type=\"radio\" value=\"mirror\" />" +
				"                  <svg aria-hidden=\"true\" class=\"octicon octicon-check select-menu-item-icon\" height=\"16\" version=\"1.1\" viewBox=\"0 0 12 16\" width=\"12\"><path fill-rule=\"evenodd\" d=\"M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z\"/></svg>" +
				"                  <span class=\"select-menu-item-text js-select-button-text\">Mirrors</span>" +
				"                </button>" +
				"            </div>" +
				"          </div>" +
				"        </div>" +
				"      </div>" +
				"" +
				"        <div class=\"select-menu d-inline-block js-menu-container js-select-menu select-menu-modal-right\">" +
				"          <button class=\"btn select-menu-button js-menu-target\" type=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\">" +
				"            <i>Language:</i>" +
				"            <span class=\"js-select-button\">" +
				"              All" +
				"            </span>" +
				"          </button>" +
				"" +
				"          <div class=\"select-menu-modal-holder js-menu-content js-navigation-container\">" +
				"            <div class=\"select-menu-modal\">" +
				"              <div class=\"select-menu-header text-left\">" +
				"                <svg aria-label=\"Close\" class=\"octicon octicon-x js-menu-close\" height=\"16\" role=\"img\" version=\"1.1\" viewBox=\"0 0 12 16\" width=\"12\"><path fill-rule=\"evenodd\" d=\"M7.48 8l3.75 3.75-1.48 1.48L6 9.48l-3.75 3.75-1.48-1.48L4.52 8 .77 4.25l1.48-1.48L6 6.52l3.75-3.75 1.48 1.48z\"/></svg>" +
				"                <span class=\"select-menu-title\">Select language:</span>" +
				"              </div>" +
				"              <div class=\"select-menu-list\" role=\"menu\">" +
				"                <button type=\"submit\" class=\"width-full select-menu-item js-navigation-item selected\">" +
				"                  <input checked=\"checked\" id=\"language_\" name=\"language\" type=\"radio\" value=\"\" />" +
				"                  <svg aria-hidden=\"true\" class=\"octicon octicon-check select-menu-item-icon\" height=\"16\" version=\"1.1\" viewBox=\"0 0 12 16\" width=\"12\"><path fill-rule=\"evenodd\" d=\"M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z\"/></svg>" +
				"                  <span class=\"select-menu-item-text js-select-button-text\">All</span>" +
				"                </button>" +
				"                  <button type=\"submit\" class=\"width-full select-menu-item js-navigation-item \">" +
				"                    <input id=\"language_css\" name=\"language\" type=\"radio\" value=\"css\" />" +
				"                    <svg aria-hidden=\"true\" class=\"octicon octicon-check select-menu-item-icon\" height=\"16\" version=\"1.1\" viewBox=\"0 0 12 16\" width=\"12\"><path fill-rule=\"evenodd\" d=\"M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z\"/></svg>" +
				"                    <span class=\"select-menu-item-text js-select-button-text\">CSS</span>" +
				"                  </button>" +
				"                  <button type=\"submit\" class=\"width-full select-menu-item js-navigation-item \">" +
				"                    <input id=\"language_html\" name=\"language\" type=\"radio\" value=\"html\" />" +
				"                    <svg aria-hidden=\"true\" class=\"octicon octicon-check select-menu-item-icon\" height=\"16\" version=\"1.1\" viewBox=\"0 0 12 16\" width=\"12\"><path fill-rule=\"evenodd\" d=\"M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z\"/></svg>" +
				"                    <span class=\"select-menu-item-text js-select-button-text\">HTML</span>" +
				"                  </button>" +
				"                  <button type=\"submit\" class=\"width-full select-menu-item js-navigation-item \">" +
				"                    <input id=\"language_java\" name=\"language\" type=\"radio\" value=\"java\" />" +
				"                    <svg aria-hidden=\"true\" class=\"octicon octicon-check select-menu-item-icon\" height=\"16\" version=\"1.1\" viewBox=\"0 0 12 16\" width=\"12\"><path fill-rule=\"evenodd\" d=\"M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z\"/></svg>" +
				"                    <span class=\"select-menu-item-text js-select-button-text\">Java</span>" +
				"                  </button>" +
				"              </div>" +
				"            </div>" +
				"          </div>" +
				"        </div>" +
				"" +
				"        <a href=\"/new\" class=\"btn btn-primary ml-3\">" +
				"          <svg aria-hidden=\"true\" class=\"octicon octicon-repo\" height=\"16\" version=\"1.1\" viewBox=\"0 0 12 16\" width=\"12\"><path fill-rule=\"evenodd\" d=\"M4 9H3V8h1v1zm0-3H3v1h1V6zm0-2H3v1h1V4zm0-2H3v1h1V2zm8-1v12c0 .55-.45 1-1 1H6v2l-1.5-1.5L3 16v-2H1c-.55 0-1-.45-1-1V1c0-.55.45-1 1-1h10c.55 0 1 .45 1 1zm-1 10H1v2h2v-1h3v1h5v-2zm0-10H2v9h9V1z\"/></svg>" +
				"          New" +
				"        </a>" +
				"    </div>" +
				"</form></div>" +
				"" +
				"        " +
				"<div id=\"user-repositories-list\">" +
				"" +
				"    <ul data-filterable-for=\"your-repos-filter\" data-filterable-type=\"substring\">" +
				"    " +
				"" +
				"  <li class=\"col-12 d-block width-full py-4 border-bottom public source\" itemprop=\"owns\" itemscope itemtype=\"http://schema.org/Code\">" +
				"    <div class=\"d-inline-block mb-1\">" +
				"      <h3>" +
				"        <a href=\"/callELPSYCONGROO/aurora\" itemprop=\"name codeRepository\">" +
				"        aurora</a>" +
				"      </h3>" +
				"" +
				"" +
				"    </div>" +
				"" +
				"    <div>" +
				"        <p class=\"col-9 d-inline-block text-gray mb-2 pr-4\" itemprop=\"description\">" +
				"          spring cloud构建的集群系统" +
				"        </p>" +
				"" +
				"      <div class=\"col-3 float-right text-right\">" +
				"        <poll-include-fragment" +
				"          src=\"/callELPSYCONGROO/aurora/graphs/participation?h=28&amp;type=sparkline&amp;w=155\">" +
				"        </poll-include-fragment>" +
				"      </div>" +
				"    </div>" +
				"" +
				"" +
				"      <div class=\"topics-row-container col-9 d-inline-flex flex-wrap flex-items-center f6 my-1\">" +
				"          <a href=\"/search?q=topic%3Amicroservice&amp;type=Repositories\" class=\"topic-tag topic-tag-link f6 my-1\" data-ga-click=\"Topic, repository list\" data-octo-click=\"topic_click\" data-octo-dimensions=\"topic:microservice,repository_id:112220373,repository_nwo:callELPSYCONGROO/aurora,repository_public:true,repository_is_fork:false\">" +
				"            microservice" +
				"          </a>" +
				"          <a href=\"/search?q=topic%3Acluster&amp;type=Repositories\" class=\"topic-tag topic-tag-link f6 my-1\" data-ga-click=\"Topic, repository list\" data-octo-click=\"topic_click\" data-octo-dimensions=\"topic:cluster,repository_id:112220373,repository_nwo:callELPSYCONGROO/aurora,repository_public:true,repository_is_fork:false\">" +
				"            cluster" +
				"          </a>" +
				"          <a href=\"/search?q=topic%3Aemail-sender&amp;type=Repositories\" class=\"topic-tag topic-tag-link f6 my-1\" data-ga-click=\"Topic, repository list\" data-octo-click=\"topic_click\" data-octo-dimensions=\"topic:email-sender,repository_id:112220373,repository_nwo:callELPSYCONGROO/aurora,repository_public:true,repository_is_fork:false\">" +
				"            email-sender" +
				"          </a>" +
				"          <a href=\"/search?q=topic%3Aaurora&amp;type=Repositories\" class=\"topic-tag topic-tag-link f6 my-1\" data-ga-click=\"Topic, repository list\" data-octo-click=\"topic_click\" data-octo-dimensions=\"topic:aurora,repository_id:112220373,repository_nwo:callELPSYCONGROO/aurora,repository_public:true,repository_is_fork:false\">" +
				"            aurora" +
				"          </a>" +
				"          <a href=\"/search?q=topic%3Aspringcloud&amp;type=Repositories\" class=\"topic-tag topic-tag-link f6 my-1\" data-ga-click=\"Topic, repository list\" data-octo-click=\"topic_click\" data-octo-dimensions=\"topic:springcloud,repository_id:112220373,repository_nwo:callELPSYCONGROO/aurora,repository_public:true,repository_is_fork:false\">" +
				"            springcloud" +
				"          </a>" +
				"          <a href=\"/search?q=topic%3Azimg&amp;type=Repositories\" class=\"topic-tag topic-tag-link f6 my-1\" data-ga-click=\"Topic, repository list\" data-octo-click=\"topic_click\" data-octo-dimensions=\"topic:zimg,repository_id:112220373,repository_nwo:callELPSYCONGROO/aurora,repository_public:true,repository_is_fork:false\">" +
				"            zimg" +
				"          </a>" +
				"      </div>" +
				"" +
				"    <div class=\"f6 text-gray mt-2\">" +
				"" +
				"          <span class=\"repo-language-color ml-0\" style=\"background-color:#b07219;\"></span>" +
				"        <span class=\"mr-3\" itemprop=\"programmingLanguage\">" +
				"          Java" +
				"        </span>" +
				"" +
				"" +
				"" +
				"        Updated <relative-time datetime=\"2018-01-11T06:03:13Z\">Jan 11, 2018</relative-time>" +
				"    </div>" +
				"  </li>" +
				"" +
				"    " +
				"" +
				"  <li class=\"col-12 d-block width-full py-4 border-bottom public source\" itemprop=\"owns\" itemscope itemtype=\"http://schema.org/Code\">" +
				"    <div class=\"d-inline-block mb-1\">" +
				"      <h3>" +
				"        <a href=\"/callELPSYCONGROO/php\" itemprop=\"name codeRepository\">" +
				"        php</a>" +
				"      </h3>" +
				"" +
				"" +
				"    </div>" +
				"" +
				"    <div>" +
				"        <p class=\"col-9 d-inline-block text-gray mb-2 pr-4\" itemprop=\"description\">" +
				"          个人主页（Personal Hmoe Page）" +
				"        </p>" +
				"" +
				"      <div class=\"col-3 float-right text-right\">" +
				"        <poll-include-fragment" +
				"          src=\"/callELPSYCONGROO/php/graphs/participation?h=28&amp;type=sparkline&amp;w=155\">" +
				"        </poll-include-fragment>" +
				"      </div>" +
				"    </div>" +
				"" +
				"" +
				"      <div class=\"topics-row-container col-9 d-inline-flex flex-wrap flex-items-center f6 my-1\">" +
				"          <a href=\"/search?q=topic%3Avuejs&amp;type=Repositories\" class=\"topic-tag topic-tag-link f6 my-1\" data-ga-click=\"Topic, repository list\" data-octo-click=\"topic_click\" data-octo-dimensions=\"topic:vuejs,repository_id:116943987,repository_nwo:callELPSYCONGROO/php,repository_public:true,repository_is_fork:false\">" +
				"            vuejs" +
				"          </a>" +
				"          <a href=\"/search?q=topic%3Afrontend-web&amp;type=Repositories\" class=\"topic-tag topic-tag-link f6 my-1\" data-ga-click=\"Topic, repository list\" data-octo-click=\"topic_click\" data-octo-dimensions=\"topic:frontend-web,repository_id:116943987,repository_nwo:callELPSYCONGROO/php,repository_public:true,repository_is_fork:false\">" +
				"            frontend-web" +
				"          </a>" +
				"          <a href=\"/search?q=topic%3Apersonal-website&amp;type=Repositories\" class=\"topic-tag topic-tag-link f6 my-1\" data-ga-click=\"Topic, repository list\" data-octo-click=\"topic_click\" data-octo-dimensions=\"topic:personal-website,repository_id:116943987,repository_nwo:callELPSYCONGROO/php,repository_public:true,repository_is_fork:false\">" +
				"            personal-website" +
				"          </a>" +
				"          <a href=\"/search?q=topic%3Apersonal-blog&amp;type=Repositories\" class=\"topic-tag topic-tag-link f6 my-1\" data-ga-click=\"Topic, repository list\" data-octo-click=\"topic_click\" data-octo-dimensions=\"topic:personal-blog,repository_id:116943987,repository_nwo:callELPSYCONGROO/php,repository_public:true,repository_is_fork:false\">" +
				"            personal-blog" +
				"          </a>" +
				"      </div>" +
				"" +
				"    <div class=\"f6 text-gray mt-2\">" +
				"" +
				"          <span class=\"repo-language-color ml-0\" style=\"background-color:#563d7c;\"></span>" +
				"        <span class=\"mr-3\" itemprop=\"programmingLanguage\">" +
				"          CSS" +
				"        </span>" +
				"" +
				"" +
				"" +
				"        Updated <relative-time datetime=\"2018-01-10T14:08:45Z\">Jan 10, 2018</relative-time>" +
				"    </div>" +
				"  </li>" +
				"" +
				"    " +
				"" +
				"  <li class=\"col-12 d-block width-full py-4 border-bottom public source\" itemprop=\"owns\" itemscope itemtype=\"http://schema.org/Code\">" +
				"    <div class=\"d-inline-block mb-1\">" +
				"      <h3>" +
				"        <a href=\"/callELPSYCONGROO/saylove\" itemprop=\"name codeRepository\">" +
				"        saylove</a>" +
				"      </h3>" +
				"" +
				"" +
				"    </div>" +
				"" +
				"    <div>" +
				"        <p class=\"col-9 d-inline-block text-gray mb-2 pr-4\" itemprop=\"description\">" +
				"          表白专用，哈哈，网上爬的前端代码，没有后台" +
				"        </p>" +
				"" +
				"      <div class=\"col-3 float-right text-right\">" +
				"        <poll-include-fragment" +
				"          src=\"/callELPSYCONGROO/saylove/graphs/participation?h=28&amp;type=sparkline&amp;w=155\">" +
				"        </poll-include-fragment>" +
				"      </div>" +
				"    </div>" +
				"" +
				"" +
				"      <div class=\"topics-row-container col-9 d-inline-flex flex-wrap flex-items-center f6 my-1\">" +
				"          <a href=\"/search?q=topic%3Afront-end&amp;type=Repositories\" class=\"topic-tag topic-tag-link f6 my-1\" data-ga-click=\"Topic, repository list\" data-octo-click=\"topic_click\" data-octo-dimensions=\"topic:front-end,repository_id:116685490,repository_nwo:callELPSYCONGROO/saylove,repository_public:true,repository_is_fork:false\">" +
				"            front-end" +
				"          </a>" +
				"          <a href=\"/search?q=topic%3Ahtml5&amp;type=Repositories\" class=\"topic-tag topic-tag-link f6 my-1\" data-ga-click=\"Topic, repository list\" data-octo-click=\"topic_click\" data-octo-dimensions=\"topic:html5,repository_id:116685490,repository_nwo:callELPSYCONGROO/saylove,repository_public:true,repository_is_fork:false\">" +
				"            html5" +
				"          </a>" +
				"          <a href=\"/search?q=topic%3Acss3&amp;type=Repositories\" class=\"topic-tag topic-tag-link f6 my-1\" data-ga-click=\"Topic, repository list\" data-octo-click=\"topic_click\" data-octo-dimensions=\"topic:css3,repository_id:116685490,repository_nwo:callELPSYCONGROO/saylove,repository_public:true,repository_is_fork:false\">" +
				"            css3" +
				"          </a>" +
				"          <a href=\"/search?q=topic%3Alove&amp;type=Repositories\" class=\"topic-tag topic-tag-link f6 my-1\" data-ga-click=\"Topic, repository list\" data-octo-click=\"topic_click\" data-octo-dimensions=\"topic:love,repository_id:116685490,repository_nwo:callELPSYCONGROO/saylove,repository_public:true,repository_is_fork:false\">" +
				"            love" +
				"          </a>" +
				"      </div>" +
				"" +
				"    <div class=\"f6 text-gray mt-2\">" +
				"" +
				"          <span class=\"repo-language-color ml-0\" style=\"background-color:#e34c26;\"></span>" +
				"        <span class=\"mr-3\" itemprop=\"programmingLanguage\">" +
				"          HTML" +
				"        </span>" +
				"" +
				"" +
				"" +
				"        Updated <relative-time datetime=\"2018-01-10T02:11:40Z\">Jan 10, 2018</relative-time>" +
				"    </div>" +
				"  </li>" +
				"" +
				"    " +
				"" +
				"  <li class=\"col-12 d-block width-full py-4 border-bottom public source\" itemprop=\"owns\" itemscope itemtype=\"http://schema.org/Code\">" +
				"    <div class=\"d-inline-block mb-1\">" +
				"      <h3>" +
				"        <a href=\"/callELPSYCONGROO/mybatis-generator\" itemprop=\"name codeRepository\">" +
				"        mybatis-generator</a>" +
				"      </h3>" +
				"" +
				"" +
				"    </div>" +
				"" +
				"    <div>" +
				"        <p class=\"col-9 d-inline-block text-gray mb-2 pr-4\" itemprop=\"description\">" +
				"           Mybatis 插件 Generator 生成 映射 文件" +
				"        </p>" +
				"" +
				"      <div class=\"col-3 float-right text-right\">" +
				"        <poll-include-fragment" +
				"          src=\"/callELPSYCONGROO/mybatis-generator/graphs/participation?h=28&amp;type=sparkline&amp;w=155\">" +
				"        </poll-include-fragment>" +
				"      </div>" +
				"    </div>" +
				"" +
				"" +
				"      <div class=\"topics-row-container col-9 d-inline-flex flex-wrap flex-items-center f6 my-1\">" +
				"          <a href=\"/search?q=topic%3Amybatis-generator&amp;type=Repositories\" class=\"topic-tag topic-tag-link f6 my-1\" data-ga-click=\"Topic, repository list\" data-octo-click=\"topic_click\" data-octo-dimensions=\"topic:mybatis-generator,repository_id:114950897,repository_nwo:callELPSYCONGROO/mybatis-generator,repository_public:true,repository_is_fork:false\">" +
				"            mybatis-generator" +
				"          </a>" +
				"      </div>" +
				"" +
				"    <div class=\"f6 text-gray mt-2\">" +
				"" +
				"          <span class=\"repo-language-color ml-0\" style=\"background-color:#b07219;\"></span>" +
				"        <span class=\"mr-3\" itemprop=\"programmingLanguage\">" +
				"          Java" +
				"        </span>" +
				"" +
				"" +
				"" +
				"        Updated <relative-time datetime=\"2018-01-05T07:58:59Z\">Jan 5, 2018</relative-time>" +
				"    </div>" +
				"  </li>" +
				"" +
				"    " +
				"" +
				"  <li class=\"col-12 d-block width-full py-4 border-bottom public source\" itemprop=\"owns\" itemscope itemtype=\"http://schema.org/Code\">" +
				"    <div class=\"d-inline-block mb-1\">" +
				"      <h3>" +
				"        <a href=\"/callELPSYCONGROO/spring-cloud-demo\" itemprop=\"name codeRepository\">" +
				"        spring-cloud-demo</a>" +
				"      </h3>" +
				"" +
				"" +
				"    </div>" +
				"" +
				"    <div>" +
				"        <p class=\"col-9 d-inline-block text-gray mb-2 pr-4\" itemprop=\"description\">" +
				"          Spring-Cloud-Demo配置文件git保存" +
				"        </p>" +
				"" +
				"      <div class=\"col-3 float-right text-right\">" +
				"        <poll-include-fragment" +
				"          src=\"/callELPSYCONGROO/spring-cloud-demo/graphs/participation?h=28&amp;type=sparkline&amp;w=155\">" +
				"        </poll-include-fragment>" +
				"      </div>" +
				"    </div>" +
				"" +
				"" +
				"      <div class=\"topics-row-container col-9 d-inline-flex flex-wrap flex-items-center f6 my-1\">" +
				"          <a href=\"/search?q=topic%3Aconfiguration&amp;type=Repositories\" class=\"topic-tag topic-tag-link f6 my-1\" data-ga-click=\"Topic, repository list\" data-octo-click=\"topic_click\" data-octo-dimensions=\"topic:configuration,repository_id:105355511,repository_nwo:callELPSYCONGROO/spring-cloud-demo,repository_public:true,repository_is_fork:false\">" +
				"            configuration" +
				"          </a>" +
				"          <a href=\"/search?q=topic%3Aspringcloud&amp;type=Repositories\" class=\"topic-tag topic-tag-link f6 my-1\" data-ga-click=\"Topic, repository list\" data-octo-click=\"topic_click\" data-octo-dimensions=\"topic:springcloud,repository_id:105355511,repository_nwo:callELPSYCONGROO/spring-cloud-demo,repository_public:true,repository_is_fork:false\">" +
				"            springcloud" +
				"          </a>" +
				"      </div>" +
				"" +
				"    <div class=\"f6 text-gray mt-2\">" +
				"" +
				"" +
				"" +
				"" +
				"        Updated <relative-time datetime=\"2018-01-03T14:00:21Z\">Jan 3, 2018</relative-time>" +
				"    </div>" +
				"  </li>" +
				"" +
				"    " +
				"" +
				"  <li class=\"col-12 d-block width-full py-4 border-bottom public source\" itemprop=\"owns\" itemscope itemtype=\"http://schema.org/Code\">" +
				"    <div class=\"d-inline-block mb-1\">" +
				"      <h3>" +
				"        <a href=\"/callELPSYCONGROO/tanchishefightgold\" itemprop=\"name codeRepository\">" +
				"        tanchishefightgold</a>" +
				"      </h3>" +
				"" +
				"" +
				"    </div>" +
				"" +
				"    <div>" +
				"        <p class=\"col-9 d-inline-block text-gray mb-2 pr-4\" itemprop=\"description\">" +
				"          贪吃蛇大作战，使用代理点击连接获取金币" +
				"        </p>" +
				"" +
				"      <div class=\"col-3 float-right text-right\">" +
				"        <poll-include-fragment" +
				"          src=\"/callELPSYCONGROO/tanchishefightgold/graphs/participation?h=28&amp;type=sparkline&amp;w=155\">" +
				"        </poll-include-fragment>" +
				"      </div>" +
				"    </div>" +
				"" +
				"" +
				"      <div class=\"topics-row-container col-9 d-inline-flex flex-wrap flex-items-center f6 my-1\">" +
				"          <a href=\"/search?q=topic%3Acrawler&amp;type=Repositories\" class=\"topic-tag topic-tag-link f6 my-1\" data-ga-click=\"Topic, repository list\" data-octo-click=\"topic_click\" data-octo-dimensions=\"topic:crawler,repository_id:100286760,repository_nwo:callELPSYCONGROO/tanchishefightgold,repository_public:true,repository_is_fork:false\">" +
				"            crawler" +
				"          </a>" +
				"      </div>" +
				"" +
				"    <div class=\"f6 text-gray mt-2\">" +
				"" +
				"          <span class=\"repo-language-color ml-0\" style=\"background-color:#b07219;\"></span>" +
				"        <span class=\"mr-3\" itemprop=\"programmingLanguage\">" +
				"          Java" +
				"        </span>" +
				"" +
				"" +
				"" +
				"        Updated <relative-time datetime=\"2017-12-21T02:35:47Z\">Dec 21, 2017</relative-time>" +
				"    </div>" +
				"  </li>" +
				"" +
				"    " +
				"" +
				"  <li class=\"col-12 d-block width-full py-4 border-bottom public source\" itemprop=\"owns\" itemscope itemtype=\"http://schema.org/Code\">" +
				"    <div class=\"d-inline-block mb-1\">" +
				"      <h3>" +
				"        <a href=\"/callELPSYCONGROO/WeiboCrawler\" itemprop=\"name codeRepository\">" +
				"        WeiboCrawler</a>" +
				"      </h3>" +
				"" +
				"" +
				"    </div>" +
				"" +
				"    <div>" +
				"        <p class=\"col-9 d-inline-block text-gray mb-2 pr-4\" itemprop=\"description\">" +
				"          新浪微博爬虫" +
				"        </p>" +
				"" +
				"      <div class=\"col-3 float-right text-right\">" +
				"        <poll-include-fragment" +
				"          src=\"/callELPSYCONGROO/WeiboCrawler/graphs/participation?h=28&amp;type=sparkline&amp;w=155\">" +
				"        </poll-include-fragment>" +
				"      </div>" +
				"    </div>" +
				"" +
				"" +
				"      <div class=\"topics-row-container col-9 d-inline-flex flex-wrap flex-items-center f6 my-1\">" +
				"          <a href=\"/search?q=topic%3Acrawler&amp;type=Repositories\" class=\"topic-tag topic-tag-link f6 my-1\" data-ga-click=\"Topic, repository list\" data-octo-click=\"topic_click\" data-octo-dimensions=\"topic:crawler,repository_id:78316700,repository_nwo:callELPSYCONGROO/WeiboCrawler,repository_public:true,repository_is_fork:false\">" +
				"            crawler" +
				"          </a>" +
				"          <a href=\"/search?q=topic%3Aweibo&amp;type=Repositories\" class=\"topic-tag topic-tag-link f6 my-1\" data-ga-click=\"Topic, repository list\" data-octo-click=\"topic_click\" data-octo-dimensions=\"topic:weibo,repository_id:78316700,repository_nwo:callELPSYCONGROO/WeiboCrawler,repository_public:true,repository_is_fork:false\">" +
				"            weibo" +
				"          </a>" +
				"      </div>" +
				"" +
				"    <div class=\"f6 text-gray mt-2\">" +
				"" +
				"          <span class=\"repo-language-color ml-0\" style=\"background-color:#b07219;\"></span>" +
				"        <span class=\"mr-3\" itemprop=\"programmingLanguage\">" +
				"          Java" +
				"        </span>" +
				"        <a class=\"muted-link mr-3\" href=\"/callELPSYCONGROO/WeiboCrawler/stargazers\">" +
				"          <svg aria-label=\"star\" class=\"octicon octicon-star\" height=\"16\" role=\"img\" version=\"1.1\" viewBox=\"0 0 14 16\" width=\"14\"><path fill-rule=\"evenodd\" d=\"M14 6l-4.9-.64L7 1 4.9 5.36 0 6l3.6 3.26L2.67 14 7 11.67 11.33 14l-.93-4.74z\"/></svg>" +
				"          4" +
				"        </a>" +
				"        <a class=\"muted-link mr-3\" href=\"/callELPSYCONGROO/WeiboCrawler/network\">" +
				"          <svg aria-label=\"fork\" class=\"octicon octicon-repo-forked\" height=\"16\" role=\"img\" version=\"1.1\" viewBox=\"0 0 10 16\" width=\"10\"><path fill-rule=\"evenodd\" d=\"M8 1a1.993 1.993 0 0 0-1 3.72V6L5 8 3 6V4.72A1.993 1.993 0 0 0 2 1a1.993 1.993 0 0 0-1 3.72V6.5l3 3v1.78A1.993 1.993 0 0 0 5 15a1.993 1.993 0 0 0 1-3.72V9.5l3-3V4.72A1.993 1.993 0 0 0 8 1zM2 4.2C1.34 4.2.8 3.65.8 3c0-.65.55-1.2 1.2-1.2.65 0 1.2.55 1.2 1.2 0 .65-.55 1.2-1.2 1.2zm3 10c-.66 0-1.2-.55-1.2-1.2 0-.65.55-1.2 1.2-1.2.65 0 1.2.55 1.2 1.2 0 .65-.55 1.2-1.2 1.2zm3-10c-.66 0-1.2-.55-1.2-1.2 0-.65.55-1.2 1.2-1.2.65 0 1.2.55 1.2 1.2 0 .65-.55 1.2-1.2 1.2z\"/></svg>" +
				"          1" +
				"        </a>" +
				"" +
				"" +
				"" +
				"        Updated <relative-time datetime=\"2017-01-08T03:20:02Z\">Jan 8, 2017</relative-time>" +
				"    </div>" +
				"  </li>" +
				"" +
				"</ul>" +
				"" +
				"    <div class=\"paginate-container\">" +
				"      " +
				"    </div>" +
				"</div>" +
				"" +
				"    </div>" +
				"  </div>" +
				"</div>" +
				"" +
				"      </div>" +
				"      <div class=\"modal-backdrop js-touch-events\"></div>" +
				"  </div>" +
				"" +
				"      " +
				"<div class=\"footer container-lg px-3\" role=\"contentinfo\">" +
				"  <div class=\"position-relative d-flex flex-justify-between py-6 mt-6 f6 text-gray border-top border-gray-light \">" +
				"    <ul class=\"list-style-none d-flex flex-wrap \">" +
				"      <li class=\"mr-3\">&copy; 2018 <span title=\"0.14774s from unicorn-1350235168-9f97w\">GitHub</span>, Inc.</li>" +
				"        <li class=\"mr-3\"><a href=\"https://github.com/site/terms\" data-ga-click=\"Footer, go to terms, text:terms\">Terms</a></li>" +
				"        <li class=\"mr-3\"><a href=\"https://github.com/site/privacy\" data-ga-click=\"Footer, go to privacy, text:privacy\">Privacy</a></li>" +
				"        <li class=\"mr-3\"><a href=\"https://github.com/security\" data-ga-click=\"Footer, go to security, text:security\">Security</a></li>" +
				"        <li class=\"mr-3\"><a href=\"https://status.github.com/\" data-ga-click=\"Footer, go to status, text:status\">Status</a></li>" +
				"        <li><a href=\"https://help.github.com\" data-ga-click=\"Footer, go to help, text:help\">Help</a></li>" +
				"    </ul>" +
				"" +
				"    <a href=\"https://github.com\" aria-label=\"Homepage\" class=\"footer-octicon\" title=\"GitHub\">" +
				"      <svg aria-hidden=\"true\" class=\"octicon octicon-mark-github\" height=\"24\" version=\"1.1\" viewBox=\"0 0 16 16\" width=\"24\"><path fill-rule=\"evenodd\" d=\"M8 0C3.58 0 0 3.58 0 8c0 3.54 2.29 6.53 5.47 7.59.4.07.55-.17.55-.38 0-.19-.01-.82-.01-1.49-2.01.37-2.53-.49-2.69-.94-.09-.23-.48-.94-.82-1.13-.28-.15-.68-.52-.01-.53.63-.01 1.08.58 1.23.82.72 1.21 1.87.87 2.33.66.07-.52.28-.87.51-1.07-1.78-.2-3.64-.89-3.64-3.95 0-.87.31-1.59.82-2.15-.08-.2-.36-1.02.08-2.12 0 0 .67-.21 2.2.82.64-.18 1.32-.27 2-.27.68 0 1.36.09 2 .27 1.53-1.04 2.2-.82 2.2-.82.44 1.1.16 1.92.08 2.12.51.56.82 1.27.82 2.15 0 3.07-1.87 3.75-3.65 3.95.29.25.54.73.54 1.48 0 1.07-.01 1.93-.01 2.2 0 .21.15.46.55.38A8.013 8.013 0 0 0 16 8c0-4.42-3.58-8-8-8z\"/></svg>" +
				"</a>" +
				"    <ul class=\"list-style-none d-flex flex-wrap \">" +
				"        <li class=\"mr-3\"><a href=\"https://github.com/contact\" data-ga-click=\"Footer, go to contact, text:contact\">Contact GitHub</a></li>" +
				"      <li class=\"mr-3\"><a href=\"https://developer.github.com\" data-ga-click=\"Footer, go to api, text:api\">API</a></li>" +
				"      <li class=\"mr-3\"><a href=\"https://training.github.com\" data-ga-click=\"Footer, go to training, text:training\">Training</a></li>" +
				"      <li class=\"mr-3\"><a href=\"https://shop.github.com\" data-ga-click=\"Footer, go to shop, text:shop\">Shop</a></li>" +
				"        <li class=\"mr-3\"><a href=\"https://github.com/blog\" data-ga-click=\"Footer, go to blog, text:blog\">Blog</a></li>" +
				"        <li><a href=\"https://github.com/about\" data-ga-click=\"Footer, go to about, text:about\">About</a></li>" +
				"" +
				"    </ul>" +
				"  </div>" +
				"</div>" +
				"" +
				"" +
				"" +
				"  <div id=\"ajax-error-message\" class=\"ajax-error-message flash flash-error\">" +
				"    <svg aria-hidden=\"true\" class=\"octicon octicon-alert\" height=\"16\" version=\"1.1\" viewBox=\"0 0 16 16\" width=\"16\"><path fill-rule=\"evenodd\" d=\"M8.865 1.52c-.18-.31-.51-.5-.87-.5s-.69.19-.87.5L.275 13.5c-.18.31-.18.69 0 1 .19.31.52.5.87.5h13.7c.36 0 .69-.19.86-.5.17-.31.18-.69.01-1L8.865 1.52zM8.995 13h-2v-2h2v2zm0-3h-2V6h2v4z\"/></svg>" +
				"    <button type=\"button\" class=\"flash-close js-ajax-error-dismiss\" aria-label=\"Dismiss error\">" +
				"      <svg aria-hidden=\"true\" class=\"octicon octicon-x\" height=\"16\" version=\"1.1\" viewBox=\"0 0 12 16\" width=\"12\"><path fill-rule=\"evenodd\" d=\"M7.48 8l3.75 3.75-1.48 1.48L6 9.48l-3.75 3.75-1.48-1.48L4.52 8 .77 4.25l1.48-1.48L6 6.52l3.75-3.75 1.48 1.48z\"/></svg>" +
				"    </button>" +
				"    You can't perform that action at this time." +
				"  </div>" +
				"" +
				"" +
				"    " +
				"    <script crossorigin=\"anonymous\" integrity=\"sha256-etQ4YhDHIXDOjkHjeUh/K4q4lDHNVVR2EMtnd9rmWUk=\" src=\"https://assets-cdn.github.com/assets/frameworks-7ad4386210c72170ce8e41e379487f2b8ab89431cd55547610cb6777dae65949.js\"></script>" +
				"    " +
				"    <script async=\"async\" crossorigin=\"anonymous\" integrity=\"sha256-6+5yIEZc2waY9fA1KrJMu8tE7eVA2nZ0L8MIY3ZJSTw=\" src=\"https://assets-cdn.github.com/assets/github-ebee7220465cdb0698f5f0352ab24cbbcb44ede540da76742fc308637649493c.js\"></script>" +
				"    " +
				"    " +
				"    " +
				"    " +
				"  <div class=\"js-stale-session-flash stale-session-flash flash flash-warn flash-banner d-none\">" +
				"    <svg aria-hidden=\"true\" class=\"octicon octicon-alert\" height=\"16\" version=\"1.1\" viewBox=\"0 0 16 16\" width=\"16\"><path fill-rule=\"evenodd\" d=\"M8.865 1.52c-.18-.31-.51-.5-.87-.5s-.69.19-.87.5L.275 13.5c-.18.31-.18.69 0 1 .19.31.52.5.87.5h13.7c.36 0 .69-.19.86-.5.17-.31.18-.69.01-1L8.865 1.52zM8.995 13h-2v-2h2v2zm0-3h-2V6h2v4z\"/></svg>" +
				"    <span class=\"signed-in-tab-flash\">You signed in with another tab or window. <a href=\"\">Reload</a> to refresh your session.</span>" +
				"    <span class=\"signed-out-tab-flash\">You signed out in another tab or window. <a href=\"\">Reload</a> to refresh your session.</span>" +
				"  </div>" +
				"  <div class=\"facebox\" id=\"facebox\" style=\"display:none;\">" +
				"  <div class=\"facebox-popup\">" +
				"    <div class=\"facebox-content\" role=\"dialog\" aria-labelledby=\"facebox-header\" aria-describedby=\"facebox-description\">" +
				"    </div>" +
				"    <button type=\"button\" class=\"facebox-close js-facebox-close\" aria-label=\"Close modal\">" +
				"      <svg aria-hidden=\"true\" class=\"octicon octicon-x\" height=\"16\" version=\"1.1\" viewBox=\"0 0 12 16\" width=\"12\"><path fill-rule=\"evenodd\" d=\"M7.48 8l3.75 3.75-1.48 1.48L6 9.48l-3.75 3.75-1.48-1.48L4.52 8 .77 4.25l1.48-1.48L6 6.52l3.75-3.75 1.48 1.48z\"/></svg>" +
				"    </button>" +
				"  </div>" +
				"</div>" +
				"" +
				"" +
				"  </body>" +
				"</html>";
		System.out.println(HtmlParserUtil.getGithubRepoName(s));
		System.out.println(HtmlParserUtil.getGithubRepoMaxPage(page));
	}

}
