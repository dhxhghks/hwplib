package kr.dogfoot.hwplib.object.etc;

import kr.dogfoot.hwplib.util.binary.BitFlag;

/**
 * 4byte 색상 객체. windows API의 COLORREF에 대응하는 객체
 * 
 * @author neolord
 */
public class Color4Byte {
	/**
	 * unsigned 4 byte color 값을 저장
	 */
	private long color;

	public Color4Byte() {
	}

	/**
	 * unsigned 4 byte color 값을 반환한다.
	 * 
	 * @return unsigned 4 byte color 값
	 */
	public long getColor() {
		return color;
	}

	/**
	 * unsigned 4 byte color 값을 설정한다.
	 * 
	 * @param color
	 *            unsigned 4 byte color 값, windows API에서 COLORREF의 값
	 */
	public void setColor(long color) {
		this.color = color;
	}

	/**
	 * 색상의 red 값을 반환한다.
	 * 
	 * @return red 값(0~255)
	 */
	public short getR() {
		return (short) BitFlag.get(color, 0, 7);
	}

	/**
	 * 색상의 red 값을 설정한다.
	 * 
	 * @param r
	 *            red 값(0~255)
	 */
	public void setR(short r) {
		BitFlag.set(color, 0, 7, r);
	}

	/**
	 * 색상의 green 값을 반환한다.
	 * 
	 * @return green 값(0~255)
	 */
	public short getG() {
		return (short) BitFlag.get(color, 8, 15);
	}

	/**
	 * 색상의 green 값을 설정한다.
	 * 
	 * @param g
	 *            green 값(0~255)
	 */
	public void setG(short g) {
		BitFlag.set(color, 8, 15, g);
	}

	/**
	 * 색상의 blue 값을 반환한다.
	 * 
	 * @return blue 값(0~255)
	 */
	public short getB() {
		return (short) BitFlag.get(color, 16, 23);
	}

	/**
	 * 색상의 blue 값을 설정한다.
	 * 
	 * @param b
	 *            blue 값(0~255)
	 */
	public void setB(short b) {
		BitFlag.set(color, 16, 23, b);
	}

	/**
	 * 색상의 alpha 값을 반환한다.
	 * 
	 * @return alpha 값(0~255)
	 */
	public short getA() {
		return (short) BitFlag.get(color, 24, 31);
	}

	/**
	 * 색상의 alpha 값을 설정한다.
	 * 
	 * @param a
	 *            alpha 값(0~255)
	 */
	public void setA(short a) {
		BitFlag.set(color, 24, 31, a);
	}
}
