package chapter1509;

import java.io.File;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;


public class RandomFileChannelTest {
	public static void main(String[] args) {
		File f=new File("a.txt");
		try{
			RandomAccessFile raf=new RandomAccessFile(f, "rw");
			FileChannel randomChannel=raf.getChannel();
			ByteBuffer buffer=randomChannel.map(FileChannel.MapMode.READ_ONLY, 0, f.length());
			randomChannel.position(f.length());
			randomChannel.write(buffer);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
