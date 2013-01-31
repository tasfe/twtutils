package com.ternwit.common.file;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @version 1.0
 * 
 */
public final class Combine {

	private List<String> list = new ArrayList<String>();

	/* return a file path list according to root folder path */
	public List<String> process(String rootPath) {
		File rootDir = new File(rootPath);

		recurse(rootDir.listFiles());

		return list;
	}

	/* recurse all folder and store file path in global variable list */
	private void recurse(File[] dirs) {
		for (File tmp : dirs) {
			if (tmp.isDirectory()) {
				recurse(tmp.listFiles());
			}
			if (tmp.isFile()) {
				list.add(tmp.getAbsolutePath());
			}
		}
	}

	/* combine all files' content into target file */
	public void combine(List<String> list, String target) {
		String content = "";
		for (String str : list) {
			content += new TWTFileUtils().readFileToString(str);
		}
		new TWTFileUtils().writeFile(content, target);
	}

}
