/*
 * $RCSfile: Test4Template.java,v $$
 * $Revision: 1.1 $
 * $Date: 2017-02-07 $
 *
 * Copyright (C) 2008 Skin, Inc. All rights reserved.
 *
 * This software is the proprietary information of Skin, Inc.
 * Use is subject to license terms.
 *
 * home: E:/WorkSpace/ayada/webapp
 * path: /test4.jsp
 * lastModified: 2016-01-11 13:12:44 000
 * options: -fastJstl true
 * template.dependencies
 * -- /test4.jsp
 *
 * JSP generated by JspCompiler-1.0.1.2 (built 2017-02-07 20:41:40 352)
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
 * <p>Title: Test4Template</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2006</p>
 * @author JspCompiler
 * @version 1.0
 */
@SuppressWarnings("unused")
public class Test4Template extends JspTemplate {
    /**
     * @param args
     */
    public static void main(String[] args){
        java.io.StringWriter writer = new java.io.StringWriter();
        PageContext pageContext = com.skin.ayada.runtime.JspFactory.getPageContext(writer);
        Test4Template template = new Test4Template();

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
        // TEXT: lineNumber: 1
        // out.write("<div>\r\n<h1>");
        out.write(_jsp_string_1, 0, _jsp_string_1.length);
        // VARIABLE: lineNumber: 2
        expressionContext.print(out, pageContext.getAttribute("name"));
        // TEXT: lineNumber: 2
        // out.write("</h1>\r\n<table border=\"");
        out.write(_jsp_string_3, 0, _jsp_string_3.length);
        // VARIABLE: lineNumber: 3
        expressionContext.print(out, pageContext.getAttribute("border"));
        // TEXT: lineNumber: 3
        // out.write("\">\r\n    <tr>\r\n        <th>&#160;</th>\r\n");
        out.write(_jsp_string_5, 0, _jsp_string_5.length);

        // NODE START: lineNumber: 6, offset: 5, length: 5, tagClassName: com.skin.ayada.jstl.core.ForEachTag, tagInstanceName: _jsp_ForEachTag_6
        // <c:forEach var=\"cell\" items=\"${data}\">...</c:forEach>
        Object _jsp_old_var_6 = pageContext.getAttribute("cell");
        com.skin.ayada.jstl.core.ForEachTag _jsp_ForEachTag_6 = new com.skin.ayada.jstl.core.ForEachTag();
        _jsp_ForEachTag_6.setParent((Tag)null);
        _jsp_ForEachTag_6.setPageContext(pageContext);
        _jsp_ForEachTag_6.setVar("cell");
        _jsp_ForEachTag_6.setItems(pageContext.getAttribute("data"));
        if(_jsp_ForEachTag_6.doStartTag() != Tag.SKIP_BODY) {
            while(true) {
                // TEXT: lineNumber: 6
                // out.write("        <th>");
                out.write(_jsp_string_7, 0, _jsp_string_7.length);
                // VARIABLE: lineNumber: 7
                expressionContext.print(out, pageContext.getAttribute("cell"));
                // TEXT: lineNumber: 7
                // out.write("</th>\r\n");
                out.write(_jsp_string_9, 0, _jsp_string_9.length);
                if(_jsp_ForEachTag_6.doAfterBody() != IterationTag.EVAL_BODY_AGAIN) {
                    break;
                }
            }
        }
        _jsp_ForEachTag_6.release();
        pageContext.setAttribute("cell", _jsp_old_var_6);
        // jsp.jstl.core.ForEachTag END
        // NODE END: lineNumber: 6, tagClassName: com.skin.ayada.jstl.core.ForEachTag, tagInstanceName: _jsp_ForEachTag_6

        // TEXT: lineNumber: 8
        // out.write("    </tr>\r\n\r\n");
        out.write(_jsp_string_11, 0, _jsp_string_11.length);

        // NODE START: lineNumber: 11, offset: 11, length: 12, tagClassName: com.skin.ayada.jstl.core.ForEachTag, tagInstanceName: _jsp_ForEachTag_12
        // <c:forEach var=\"row\" items=\"${data}\">...</c:forEach>
        Object _jsp_old_var_12 = pageContext.getAttribute("row");
        com.skin.ayada.jstl.core.ForEachTag _jsp_ForEachTag_12 = new com.skin.ayada.jstl.core.ForEachTag();
        _jsp_ForEachTag_12.setParent((Tag)null);
        _jsp_ForEachTag_12.setPageContext(pageContext);
        _jsp_ForEachTag_12.setVar("row");
        _jsp_ForEachTag_12.setItems(pageContext.getAttribute("data"));
        if(_jsp_ForEachTag_12.doStartTag() != Tag.SKIP_BODY) {
            while(true) {
                // TEXT: lineNumber: 11
                // out.write("    <tr>\r\n        <th>");
                out.write(_jsp_string_13, 0, _jsp_string_13.length);
                // VARIABLE: lineNumber: 13
                expressionContext.print(out, pageContext.getAttribute("row"));
                // TEXT: lineNumber: 13
                // out.write("</th>\r\n");
                out.write(_jsp_string_15, 0, _jsp_string_15.length);

                // NODE START: lineNumber: 14, offset: 15, length: 6, tagClassName: com.skin.ayada.jstl.core.ForEachTag, tagInstanceName: _jsp_ForEachTag_16
                // <c:forEach var=\"cell\" items=\"${data}\">...</c:forEach>
                Object _jsp_old_var_16 = pageContext.getAttribute("cell");
                com.skin.ayada.jstl.core.ForEachTag _jsp_ForEachTag_16 = new com.skin.ayada.jstl.core.ForEachTag();
                _jsp_ForEachTag_16.setParent((Tag)null);
                _jsp_ForEachTag_16.setPageContext(pageContext);
                _jsp_ForEachTag_16.setVar("cell");
                _jsp_ForEachTag_16.setItems(pageContext.getAttribute("data"));
                if(_jsp_ForEachTag_16.doStartTag() != Tag.SKIP_BODY) {
                    while(true) {
                        // TEXT: lineNumber: 14
                        // out.write("            <td>&#x");
                        out.write(_jsp_string_17, 0, _jsp_string_17.length);
                        // VARIABLE: lineNumber: 15
                        expressionContext.print(out, pageContext.getAttribute("row"));
                        // VARIABLE: lineNumber: 15
                        expressionContext.print(out, pageContext.getAttribute("cell"));
                        // TEXT: lineNumber: 15
                        // out.write(";</td>\r\n");
                        out.write(_jsp_string_20, 0, _jsp_string_20.length);
                        if(_jsp_ForEachTag_16.doAfterBody() != IterationTag.EVAL_BODY_AGAIN) {
                            break;
                        }
                    }
                }
                _jsp_ForEachTag_16.release();
                pageContext.setAttribute("cell", _jsp_old_var_16);
                // jsp.jstl.core.ForEachTag END
                // NODE END: lineNumber: 14, tagClassName: com.skin.ayada.jstl.core.ForEachTag, tagInstanceName: _jsp_ForEachTag_16

                // TEXT: lineNumber: 16
                // out.write("    </tr>\r\n");
                out.write(_jsp_string_22, 0, _jsp_string_22.length);
                if(_jsp_ForEachTag_12.doAfterBody() != IterationTag.EVAL_BODY_AGAIN) {
                    break;
                }
            }
        }
        _jsp_ForEachTag_12.release();
        pageContext.setAttribute("row", _jsp_old_var_12);
        // jsp.jstl.core.ForEachTag END
        // NODE END: lineNumber: 11, tagClassName: com.skin.ayada.jstl.core.ForEachTag, tagInstanceName: _jsp_ForEachTag_12

        // TEXT: lineNumber: 18
        // out.write("</table>\r\n</div>");
        out.write(_jsp_string_24, 0, _jsp_string_24.length);

        out.flush();
        jspWriter.flush();
    }

    protected static final char[] _jsp_string_1 = "<div>\r\n<h1>".toCharArray();
    protected static final char[] _jsp_string_3 = "</h1>\r\n<table border=\"".toCharArray();
    protected static final char[] _jsp_string_5 = "\">\r\n    <tr>\r\n        <th>&#160;</th>\r\n".toCharArray();
    protected static final char[] _jsp_string_7 = "        <th>".toCharArray();
    protected static final char[] _jsp_string_9 = "</th>\r\n".toCharArray();
    protected static final char[] _jsp_string_11 = "    </tr>\r\n\r\n".toCharArray();
    protected static final char[] _jsp_string_13 = "    <tr>\r\n        <th>".toCharArray();
    protected static final char[] _jsp_string_15 = "</th>\r\n".toCharArray();
    protected static final char[] _jsp_string_17 = "            <td>&#x".toCharArray();
    protected static final char[] _jsp_string_20 = ";</td>\r\n".toCharArray();
    protected static final char[] _jsp_string_22 = "    </tr>\r\n".toCharArray();
    protected static final char[] _jsp_string_24 = "</table>\r\n</div>".toCharArray();

}
