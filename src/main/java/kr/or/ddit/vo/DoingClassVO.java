package kr.or.ddit.vo;

import java.io.Serializable;

import lombok.Data;
/**
 * @author 작성자명
 * @since 2020. 3. 31.
 * @version 1.0
 * @see javax.servlet.http.HttpServlet
 * <pre>
 * [[개정이력(Modification Information)]]
 * 수정일                          수정자               수정내용
 * --------     --------    ----------------------
 * 2020. 3. 31.      작성자명   박재욱            최초작성 - 진행중인 클래스 프로퍼티
 * 
 * Copyright (c) 2020 by DDIT All right reserved
 * </pre>
 */
@Data
public class DoingClassVO implements Serializable{
	private String pi_nm;
	private String cl_start;
	private String cl_end;
	
}
