package chapter1510;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest {
	public static void main(String[] args) {
		Path path=Paths.get(".");
		System.out.println("path�������·��������"+path.getNameCount());
		System.out.println("path�ĸ�·����"+path.getRoot());
		Path absolutePath=path.toAbsolutePath();
		System.out.println(absolutePath);
		System.out.println("absolutePath�ĸ�·��"+absolutePath.getRoot());
		System.out.println("absolutePath�������·��������"+absolutePath.getNameCount());
		System.out.println(absolutePath.getName(0));
		System.out.println(absolutePath.getName(1));
		System.out.println(absolutePath.getName(2));
		Path path2=Paths.get("g:", "publish","codes");
		System.out.println(path2);
	}
}
