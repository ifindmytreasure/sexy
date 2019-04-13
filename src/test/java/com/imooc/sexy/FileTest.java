package com.imooc.sexy;

import org.apache.commons.io.FileUtils;
import org.springframework.util.FileCopyUtils;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Unruly Wind on 2019/4/13/013.
 *
 * @author BlueMelancholy
 * @desc:
 */
public class FileTest {
	public static void main(String[] args) throws IOException {
		File file1 = new File("E:\\SpringBoot\\sexy\\src\\test\\resources");
		File file2 = new File("E:\\SpringBoot\\sexy\\src\\test\\resources\\test");

//		FileCopyUtils.copy(file1,file2);
		String[] png = {"png"};
		Collection<File> fileCollections = FileUtils.listFiles(file1,png,false);
		List<String> fileNames = fileCollections.stream().map(File::getName).collect(Collectors.toList());
		System.out.println(fileNames);
	}
}
