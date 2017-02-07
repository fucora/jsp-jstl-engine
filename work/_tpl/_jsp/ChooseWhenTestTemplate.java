/*
 * $RCSfile: ChooseWhenTestTemplate.java,v $$
 * $Revision: 1.1 $
 * $Date: 2017-02-07 $
 *
 * Copyright (C) 2008 Skin, Inc. All rights reserved.
 *
 * This software is the proprietary information of Skin, Inc.
 * Use is subject to license terms.
 *
 * home: E:/WorkSpace/ayada/webapp
 * path: /chooseWhenTest.jsp
 * lastModified: 2015-12-30 10:39:14 000
 * options: -fastJstl true
 * template.dependencies
 * -- /chooseWhenTest.jsp
 *
 * JSP generated by JspCompiler-1.0.1.2 (built 2017-02-07 20:41:15 099)
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
 * <p>Title: ChooseWhenTestTemplate</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2006</p>
 * @author JspCompiler
 * @version 1.0
 */
@SuppressWarnings("unused")
public class ChooseWhenTestTemplate extends JspTemplate {
    /**
     * @param args
     */
    public static void main(String[] args){
        java.io.StringWriter writer = new java.io.StringWriter();
        PageContext pageContext = com.skin.ayada.runtime.JspFactory.getPageContext(writer);
        ChooseWhenTestTemplate template = new ChooseWhenTestTemplate();

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
        // out.write("<!--\r\nc:choose 类型是tagdependent, 子节点只允许是标签，不能存在文本\r\n如果有文本将自动忽略\r\n-->\r\n");
        out.write(_jsp_string_1, 0, _jsp_string_1.length);

        // NODE START: lineNumber: 5, offset: 1, length: 10, tagClassName: com.skin.ayada.jstl.core.ChooseTag, tagInstanceName: _jsp_ChooseTag_2
        // <c:choose>...</c:choose>
        boolean _jsp_ChooseTag_2 = true;

        // NODE START: lineNumber: 7, offset: 2, length: 3, tagClassName: com.skin.ayada.jstl.core.WhenTag, tagInstanceName: _jsp_WhenTag_3
        // <c:when test=\"${1 == 1}\">...</c:when>
        if(_jsp_ChooseTag_2 && ExpressionUtil.getBoolean(expressionContext, "${1 == 1}")) {
            _jsp_ChooseTag_2 = false;
            // TEXT: lineNumber: 7
            // out.write("        <p>1==1</p>\r\n");
            out.write(_jsp_string_4, 0, _jsp_string_4.length);
        } // jsp.jstl.core.WhenTag END
        // NODE END: lineNumber: 7, tagClassName: com.skin.ayada.jstl.core.WhenTag, tagInstanceName: _jsp_WhenTag_3

        // NODE START: lineNumber: 10, offset: 5, length: 3, tagClassName: com.skin.ayada.jstl.core.WhenTag, tagInstanceName: _jsp_WhenTag_6
        // <c:when test=\"${1 == 1}\">...</c:when>
        if(_jsp_ChooseTag_2 && ExpressionUtil.getBoolean(expressionContext, "${1 == 1}")) {
            _jsp_ChooseTag_2 = false;
            // TEXT: lineNumber: 10
            // out.write("        <p>2==2</p>\r\n");
            out.write(_jsp_string_7, 0, _jsp_string_7.length);
        } // jsp.jstl.core.WhenTag END
        // NODE END: lineNumber: 10, tagClassName: com.skin.ayada.jstl.core.WhenTag, tagInstanceName: _jsp_WhenTag_6

        // NODE START: lineNumber: 13, offset: 8, length: 2, tagClassName: com.skin.ayada.jstl.core.OtherwiseTag, tagInstanceName: _jsp_OtherwiseTag_9
        // <c:otherwise>...</c:otherwise>
        if(_jsp_ChooseTag_2) {
            _jsp_ChooseTag_2 = false;
        } // jsp.jstl.core.OtherwiseTag END
        // NODE END: lineNumber: 13, tagClassName: com.skin.ayada.jstl.core.OtherwiseTag, tagInstanceName: _jsp_OtherwiseTag_9

        // jsp.jstl.core.ChooseTag END
        // NODE END: lineNumber: 5, tagClassName: com.skin.ayada.jstl.core.ChooseTag, tagInstanceName: _jsp_ChooseTag_2


        out.flush();
        jspWriter.flush();
    }

    protected static final char[] _jsp_string_1 = "<!--\r\nc:choose 类型是tagdependent, 子节点只允许是标签，不能存在文本\r\n如果有文本将自动忽略\r\n-->\r\n".toCharArray();
    protected static final char[] _jsp_string_4 = "        <p>1==1</p>\r\n".toCharArray();
    protected static final char[] _jsp_string_7 = "        <p>2==2</p>\r\n".toCharArray();

}
