package com.tools.test;

import com.tools.utils.Tools;

public class Test {
	public static void main(String[] args) {
		Tools tool =new Tools();
		tool.addUrl("https://blog.csdn.net/weixin_43183850/article/details/125927117");
		tool.addUrl("https://blog.csdn.net/weixin_43183850/article/details/125922140");
		tool.addUrl("https://blog.csdn.net/weixin_43183850/article/details/125741947");
		tool.addUrl("https://blog.csdn.net/weixin_43183850/article/details/124649766");
		tool.addUrl("https://blog.csdn.net/weixin_43183850/article/details/124602569");
		tool.addUrl("https://blog.csdn.net/weixin_43183850/article/details/124596825");
		tool.addUrl("https://blog.csdn.net/weixin_43183850/article/details/124583398");
		tool.addUrl("https://blog.csdn.net/weixin_43183850/article/details/124555432");
		tool.addUrl("https://blog.csdn.net/weixin_43183850/article/details/124546902");
		tool.addUrl("https://blog.csdn.net/weixin_43183850/article/details/124531661");
		tool.addUrl("https://blog.csdn.net/weixin_43183850/article/details/124527887");
		tool.addUrl("https://blog.csdn.net/weixin_43183850/article/details/124482743");
		tool.addUrl("https://blog.csdn.net/weixin_43183850/article/details/124478852");
		tool.addUrl("https://blog.csdn.net/weixin_43183850/article/details/124452611");
		tool.addUrl("https://blog.csdn.net/weixin_43183850/article/details/124308817");
		tool.addUrl("https://blog.csdn.net/weixin_43183850/article/details/124283340");
		tool.addUrl("https://blog.csdn.net/weixin_43183850/article/details/124142198");
		tool.work(180*1000, -1);
	}
}
