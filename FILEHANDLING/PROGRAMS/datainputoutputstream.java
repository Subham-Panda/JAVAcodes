import java.io.*;
public class datainputoutputstream {
	public static void main(String[] args) throws Throwable {
		try {
			File obj = new File("/home/subham/Desktop/JAVACAT2PRACTICE/FILEHANDLING/FILES/test5.txt");
			FileOutputStream fout = new FileOutputStream(obj);
			DataOutputStream dout = new DataOutputStream(fout);
			dout.writeInt(10);
			dout.writeChar('c');
			dout.writeBoolean(true);
			dout.writeDouble(22.5);
			dout.writeUTF("Subham");
			dout.close();
			FileInputStream fin = new FileInputStream(obj);
			DataInputStream din = new DataInputStream(fin);
			System.out.println(din.readInt());
			System.out.println(din.readChar());
			System.out.println(din.readBoolean());
			System.out.println(din.readDouble());
			System.out.println(din.readUTF());
			din.close();
			//! on changing the order of read from write, undesired answer occurs
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
