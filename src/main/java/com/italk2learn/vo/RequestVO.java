package com.italk2learn.vo;



/**
 * Clase Value Object request of client layer
 * 
 * @author Jose Luis Fernandez
 * @version 1.0
 */
public class RequestVO extends BaseVO {
	public RequestVO() {
		super();
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected LTIObject ltiVO;

	protected HeaderVO headerVO;

	public HeaderVO getHeaderVO() {
		return headerVO;
	}

	public void setHeaderVO(HeaderVO headerVO) {
		this.headerVO = headerVO;
	}
	
	public LTIObject getLtiVO() {
		return ltiVO;
	}

	public void setLtiVO(LTIObject ltiVO) {
		this.ltiVO = ltiVO;
	}
}
