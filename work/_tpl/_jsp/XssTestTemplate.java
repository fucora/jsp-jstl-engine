/*
 * $RCSfile: XssTestTemplate.java,v $$
 * $Revision: 1.1 $
 * $Date: 2016-01-12 $
 *
 * Copyright (C) 2008 Skin, Inc. All rights reserved.
 *
 * This software is the proprietary information of Skin, Inc.
 * Use is subject to license terms.
 *
 * home: E:/WorkSpace/ayada/webapp
 * path: /xssTest.jsp
 * lastModified: 2014-08-13 16:35:02 000
 * options: -fastJstl true
 * JSP generated by JspCompiler-1.0.1.2 (built 2016-01-12 23:30:15 217)
 */
package _tpl._jsp;

import java.io.Writer;
import com.skin.ayada.runtime.ExpressionContext;
import com.skin.ayada.runtime.JspWriter;
import com.skin.ayada.runtime.PageContext;
import com.skin.ayada.tagext.BodyContent;
import com.skin.ayada.tagext.BodyTag;
import com.skin.ayada.tagext.IterationTag;
import com.skin.ayada.tagext.JspFragment;
import com.skin.ayada.tagext.Tag;
import com.skin.ayada.template.JspTemplate;
import com.skin.ayada.util.ExpressionUtil;


/**
 * <p>Title: XssTestTemplate</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2006</p>
 * @author JspCompiler
 * @version 1.0
 */
@SuppressWarnings("unused")
public class XssTestTemplate extends JspTemplate {
    public static void main(String[] args){
        java.io.StringWriter writer = new java.io.StringWriter();
        PageContext pageContext = com.skin.ayada.runtime.JspFactory.getPageContext(writer);
        XssTestTemplate template = new XssTestTemplate();

        try {
            template.execute(pageContext);
            System.out.println(writer.toString());
        }
        catch(Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    /**
     * @param pageContext
     * @throws Throwable
     */
    @Override
    @SuppressWarnings("unchecked")
    public void _execute(final PageContext pageContext) throws Throwable {
        JspWriter out = pageContext.getOut();
        JspWriter jspWriter = pageContext.getOut();
        ExpressionContext expressionContext = pageContext.getExpressionContext();
        // NODE START: lineNumber: 1, offset: 0, length: 5, tagClassName: com.skin.ayada.jstl.core.MapTag, tagInstanceName: _jsp_MapTag_1
        // <c:map name=\"user\">...</c:map>
        com.skin.ayada.jstl.core.MapTag _jsp_MapTag_1 = new com.skin.ayada.jstl.core.MapTag();
        _jsp_MapTag_1.setPageContext(pageContext);
        _jsp_MapTag_1.setParent((Tag)null);
        _jsp_MapTag_1.setDynamicAttribute("name", "user");
        int _jsp_start_flag_1 = _jsp_MapTag_1.doStartTag();

        if(_jsp_start_flag_1 == Tag.SKIP_PAGE) {
            return;
        }
        if(_jsp_start_flag_1 != Tag.SKIP_BODY) {
            int _jsp_flag_1 = 0;

            do {
                // NODE START: lineNumber: 2, offset: 1, length: 3, tagClassName: com.skin.ayada.jstl.core.AttributeTag, tagInstanceName: _jsp_AttributeTag_2
                // <c:entry name=\"input\">...</c:entry>
                out = pageContext.pushBody();
                // TEXT: lineNumber: 2
                // out.write("\";\r\nalert(1);\r\n//");
                out.write(_jsp_string_3, 0, _jsp_string_3.length);
                _jsp_MapTag_1.setAttribute("input", ((BodyContent)out).getString());
                out = pageContext.popBody();
                // jsp.jstl.core.AttributeTag END
                // NODE END: lineNumber: 2, tagClassName: com.skin.ayada.jstl.core.AttributeTag, tagInstanceName: _jsp_AttributeTag_2

                _jsp_flag_1 = _jsp_MapTag_1.doAfterBody();
            }
            while(_jsp_flag_1 == IterationTag.EVAL_BODY_AGAIN);
        }
        _jsp_MapTag_1.doEndTag();
        _jsp_MapTag_1.release();
        // NODE END: lineNumber: 1, tagClassName: com.skin.ayada.jstl.core.MapTag, tagInstanceName: _jsp_MapTag_1

        // TEXT: lineNumber: 5
        // out.write("<script type=\"text/javascript\">\r\n// xss\r\nvar a = \"");
        out.write(_jsp_string_6, 0, _jsp_string_6.length);
        // EXPRESSION: lineNumber: 8
        expressionContext.print(out, expressionContext.getString("user.input"));
        // TEXT: lineNumber: 8
        // out.write("\";\r\n</script>\r\n\r\n<script type=\"text/javascript\">\r\n// xss filter\r\nvar a = \"");
        out.write(_jsp_string_8, 0, _jsp_string_8.length);
        // EXPRESSION: lineNumber: 13
        expressionContext.print(out, expressionContext.getString("StringUtil.escape(user.input)"));
        // TEXT: lineNumber: 13
        // out.write("\";\r\n</script>\r\n\r\n<x:escape encoder=\"html\">\r\n<p>");
        out.write(_jsp_string_10, 0, _jsp_string_10.length);
        // EXPRESSION: lineNumber: 17
        expressionContext.print(out, expressionContext.getString("user.input"));
        // TEXT: lineNumber: 17
        // out.write("</p>\r\n</x:escape>\r\n\r\n<x:escape encoder=\"code\">\r\n<script type=\"text/javascript\">\r\nvar a = \"");
        out.write(_jsp_string_12, 0, _jsp_string_12.length);
        // EXPRESSION: lineNumber: 22
        expressionContext.print(out, expressionContext.getString("user.input"));
        // TEXT: lineNumber: 22
        // out.write("\";\r\n</script>\r\n</x:escape>\r\n");
        out.write(_jsp_string_14, 0, _jsp_string_14.length);

        out.flush();
        jspWriter.flush();
    }

    public static final char[] _jsp_string_3 = "\";\r\nalert(1);\r\n//".toCharArray();
    public static final char[] _jsp_string_6 = "<script type=\"text/javascript\">\r\n// xss\r\nvar a = \"".toCharArray();
    public static final char[] _jsp_string_8 = "\";\r\n</script>\r\n\r\n<script type=\"text/javascript\">\r\n// xss filter\r\nvar a = \"".toCharArray();
    public static final char[] _jsp_string_10 = "\";\r\n</script>\r\n\r\n<x:escape encoder=\"html\">\r\n<p>".toCharArray();
    public static final char[] _jsp_string_12 = "</p>\r\n</x:escape>\r\n\r\n<x:escape encoder=\"code\">\r\n<script type=\"text/javascript\">\r\nvar a = \"".toCharArray();
    public static final char[] _jsp_string_14 = "\";\r\n</script>\r\n</x:escape>\r\n".toCharArray();

}
