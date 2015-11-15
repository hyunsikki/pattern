/**
 * 
 */
package pattern.decorator.example.inputStream;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * InputStream abstract FilterInputStream --> loweCaseInputStream
 * 
 * extends FilterInputStream  
 * @author hyunny
 *
 */
public class LowerCaseInputStream extends FilterInputStream {

	/**
	 * @param arg0
	 */
	public LowerCaseInputStream(InputStream arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int read() throws IOException {
		// TODO Auto-generated method stub
		int c = super.read();
		return (c == -1 ? c : Character.toLowerCase((char) c));
	}

	@Override
	public int read(byte[] b, int off, int len) throws IOException {
		// TODO Auto-generated method stub
		int result = super.read(b, off, len);
		for (int i = off; i < off + result; i++) {
			b[i] = (byte) Character.toLowerCase((char) b[i]);
		}
		return result;
	}
}
