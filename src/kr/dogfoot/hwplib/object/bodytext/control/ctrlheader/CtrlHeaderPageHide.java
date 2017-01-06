package kr.dogfoot.hwplib.object.bodytext.control.ctrlheader;

import kr.dogfoot.hwplib.object.bodytext.control.ControlType;
import kr.dogfoot.hwplib.object.bodytext.control.ctrlheader.pagehide.PagehideHeaderProperty;

/**
 * 감추기 컨트롤을 위한 컨트롤 헤더 레코드
 * 
 * @author neolord
 */
public class CtrlHeaderPageHide extends CtrlHeader {
	/**
	 * 속성
	 */
	private PagehideHeaderProperty property;

	/**
	 * 생성자
	 */
	public CtrlHeaderPageHide() {
		super(ControlType.PageHide.getCtrlId());

		property = new PagehideHeaderProperty();
	}

	/**
	 * 감추기 컨트롤의 속성 객체를 반환한다.
	 * 
	 * @return 감추기 컨트롤의 속성 객체
	 */
	public PagehideHeaderProperty getProperty() {
		return property;
	}
}
