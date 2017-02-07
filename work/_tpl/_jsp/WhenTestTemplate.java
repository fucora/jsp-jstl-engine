/*
 * $RCSfile: WhenTestTemplate.java,v $$
 * $Revision: 1.1 $
 * $Date: 2017-02-07 $
 *
 * Copyright (C) 2008 Skin, Inc. All rights reserved.
 *
 * This software is the proprietary information of Skin, Inc.
 * Use is subject to license terms.
 *
 * home: E:/WorkSpace/ayada/webapp
 * path: /whenTest.jsp
 * lastModified: 2013-03-07 23:21:08 000
 * options: -fastJstl true
 * template.dependencies
 * -- /whenTest.jsp
 *
 * JSP generated by JspCompiler-1.0.1.2 (built 2017-02-07 20:41:43 769)
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
 * <p>Title: WhenTestTemplate</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2006</p>
 * @author JspCompiler
 * @version 1.0
 */
@SuppressWarnings("unused")
public class WhenTestTemplate extends JspTemplate {
    /**
     * @param args
     */
    public static void main(String[] args){
        java.io.StringWriter writer = new java.io.StringWriter();
        PageContext pageContext = com.skin.ayada.runtime.JspFactory.getPageContext(writer);
        WhenTestTemplate template = new WhenTestTemplate();

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
        // out.write("<html>\r\n<head>\r\n<title>test</title>\r\n</head>\r\n<body version=\"1.0\">\r\n");
        out.write(_jsp_string_1, 0, _jsp_string_1.length);
        // EXPRESSION: lineNumber: 6
        expressionContext.print(out, expressionContext.getString("user.userName"));
        // TEXT: lineNumber: 6
        // out.write("\r\n");
        out.write(_jsp_string_3, 0, _jsp_string_3.length);

        // NODE START: lineNumber: 7, offset: 3, length: 20, tagClassName: com.skin.ayada.jstl.core.ForEachTag, tagInstanceName: _jsp_ForEachTag_4
        // <c:forEach items=\"${userList}\" var=\"user\">...</c:forEach>
        Object _jsp_old_var_4 = pageContext.getAttribute("user");
        com.skin.ayada.jstl.core.ForEachTag _jsp_ForEachTag_4 = new com.skin.ayada.jstl.core.ForEachTag();
        _jsp_ForEachTag_4.setParent((Tag)null);
        _jsp_ForEachTag_4.setPageContext(pageContext);
        _jsp_ForEachTag_4.setVar("user");
        _jsp_ForEachTag_4.setItems(pageContext.getAttribute("userList"));
        if(_jsp_ForEachTag_4.doStartTag() != Tag.SKIP_BODY) {
            while(true) {
                // NODE START: lineNumber: 8, offset: 4, length: 18, tagClassName: com.skin.ayada.jstl.core.ChooseTag, tagInstanceName: _jsp_ChooseTag_5
                // <c:choose>...</c:choose>
                boolean _jsp_ChooseTag_5 = true;

                // NODE START: lineNumber: 9, offset: 5, length: 3, tagClassName: com.skin.ayada.jstl.core.WhenTag, tagInstanceName: _jsp_WhenTag_6
                // <c:when test=\"${user.age == 0}\">...</c:when>
                if(_jsp_ChooseTag_5 && ExpressionUtil.getBoolean(expressionContext, "${user.age == 0}")) {
                    _jsp_ChooseTag_5 = false;
                    // TEXT: lineNumber: 9
                    // out.write("0");
                    out.write(_jsp_string_7, 0, _jsp_string_7.length);
                } // jsp.jstl.core.WhenTag END
                // NODE END: lineNumber: 9, tagClassName: com.skin.ayada.jstl.core.WhenTag, tagInstanceName: _jsp_WhenTag_6

                // NODE START: lineNumber: 10, offset: 8, length: 3, tagClassName: com.skin.ayada.jstl.core.WhenTag, tagInstanceName: _jsp_WhenTag_9
                // <c:when test=\"${user.age == 1}\">...</c:when>
                if(_jsp_ChooseTag_5 && ExpressionUtil.getBoolean(expressionContext, "${user.age == 1}")) {
                    _jsp_ChooseTag_5 = false;
                    // TEXT: lineNumber: 10
                    // out.write("1");
                    out.write(_jsp_string_10, 0, _jsp_string_10.length);
                } // jsp.jstl.core.WhenTag END
                // NODE END: lineNumber: 10, tagClassName: com.skin.ayada.jstl.core.WhenTag, tagInstanceName: _jsp_WhenTag_9

                // NODE START: lineNumber: 11, offset: 11, length: 3, tagClassName: com.skin.ayada.jstl.core.WhenTag, tagInstanceName: _jsp_WhenTag_12
                // <c:when test=\"${user.age == 2}\">...</c:when>
                if(_jsp_ChooseTag_5 && ExpressionUtil.getBoolean(expressionContext, "${user.age == 2}")) {
                    _jsp_ChooseTag_5 = false;
                    // TEXT: lineNumber: 11
                    // out.write("2");
                    out.write(_jsp_string_13, 0, _jsp_string_13.length);
                } // jsp.jstl.core.WhenTag END
                // NODE END: lineNumber: 11, tagClassName: com.skin.ayada.jstl.core.WhenTag, tagInstanceName: _jsp_WhenTag_12

                // NODE START: lineNumber: 12, offset: 14, length: 3, tagClassName: com.skin.ayada.jstl.core.WhenTag, tagInstanceName: _jsp_WhenTag_15
                // <c:when test=\"${user.age == 3}\">...</c:when>
                if(_jsp_ChooseTag_5 && ExpressionUtil.getBoolean(expressionContext, "${user.age == 3}")) {
                    _jsp_ChooseTag_5 = false;
                    // TEXT: lineNumber: 12
                    // out.write("3");
                    out.write(_jsp_string_16, 0, _jsp_string_16.length);
                } // jsp.jstl.core.WhenTag END
                // NODE END: lineNumber: 12, tagClassName: com.skin.ayada.jstl.core.WhenTag, tagInstanceName: _jsp_WhenTag_15

                // NODE START: lineNumber: 13, offset: 17, length: 4, tagClassName: com.skin.ayada.jstl.core.OtherwiseTag, tagInstanceName: _jsp_OtherwiseTag_18
                // <c:otherwise>...</c:otherwise>
                if(_jsp_ChooseTag_5) {
                    _jsp_ChooseTag_5 = false;
                    // TEXT: lineNumber: 13
                    // out.write("other: ");
                    out.write(_jsp_string_19, 0, _jsp_string_19.length);
                    // EXPRESSION: lineNumber: 13
                    expressionContext.print(out, expressionContext.getString("user.age"));
                } // jsp.jstl.core.OtherwiseTag END
                // NODE END: lineNumber: 13, tagClassName: com.skin.ayada.jstl.core.OtherwiseTag, tagInstanceName: _jsp_OtherwiseTag_18

                // jsp.jstl.core.ChooseTag END
                // NODE END: lineNumber: 8, tagClassName: com.skin.ayada.jstl.core.ChooseTag, tagInstanceName: _jsp_ChooseTag_5

                if(_jsp_ForEachTag_4.doAfterBody() != IterationTag.EVAL_BODY_AGAIN) {
                    break;
                }
            }
        }
        _jsp_ForEachTag_4.release();
        pageContext.setAttribute("user", _jsp_old_var_4);
        // jsp.jstl.core.ForEachTag END
        // NODE END: lineNumber: 7, tagClassName: com.skin.ayada.jstl.core.ForEachTag, tagInstanceName: _jsp_ForEachTag_4

        // TEXT: lineNumber: 15
        // out.write("</body>\r\n</html>");
        out.write(_jsp_string_24, 0, _jsp_string_24.length);

        out.flush();
        jspWriter.flush();
    }

    protected static final char[] _jsp_string_1 = "<html>\r\n<head>\r\n<title>test</title>\r\n</head>\r\n<body version=\"1.0\">\r\n".toCharArray();
    protected static final char[] _jsp_string_3 = "\r\n".toCharArray();
    protected static final char[] _jsp_string_7 = "0".toCharArray();
    protected static final char[] _jsp_string_10 = "1".toCharArray();
    protected static final char[] _jsp_string_13 = "2".toCharArray();
    protected static final char[] _jsp_string_16 = "3".toCharArray();
    protected static final char[] _jsp_string_19 = "other: ".toCharArray();
    protected static final char[] _jsp_string_24 = "</body>\r\n</html>".toCharArray();

}
