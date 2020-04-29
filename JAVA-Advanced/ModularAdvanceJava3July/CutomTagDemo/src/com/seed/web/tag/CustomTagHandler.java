package com.seed.web.tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

public class CustomTagHandler extends TagSupport {

	public int doStartTag() throws JspException {
		// TODO Auto-generated method stub
		try {
			for (int i = 0; i < 3; i++) {
				pageContext.getOut().println(
						"<p>Hello from custom tag handler</p>");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return EVAL_BODY_INCLUDE;
	}

	public int doEndTag() throws JspException {
		// TODO Auto-generated method stub
		return EVAL_PAGE;
	}

}
