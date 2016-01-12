/*
 * $RCSfile: EachTest3Template.java,v $$
 * $Revision: 1.1 $
 * $Date: 2016-01-12 $
 *
 * Copyright (C) 2008 Skin, Inc. All rights reserved.
 *
 * This software is the proprietary information of Skin, Inc.
 * Use is subject to license terms.
 *
 * home: E:/WorkSpace/ayada/webapp
 * path: /eachTest3.jsp
 * lastModified: 2014-06-12 11:02:00 000
 * options: -fastJstl true
 * JSP generated by JspCompiler-1.0.1.2 (built 2016-01-12 23:30:01 239)
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
 * <p>Title: EachTest3Template</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2006</p>
 * @author JspCompiler
 * @version 1.0
 */
@SuppressWarnings("unused")
public class EachTest3Template extends JspTemplate {
    public static void main(String[] args){
        java.io.StringWriter writer = new java.io.StringWriter();
        PageContext pageContext = com.skin.ayada.runtime.JspFactory.getPageContext(writer);
        EachTest3Template template = new EachTest3Template();

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
        // NODE START: lineNumber: 1, offset: 0, length: 7, tagClassName: com.skin.ayada.jstl.core.ForEachTag, tagInstanceName: _jsp_ForEachTag_1
        // <c:forEach items=\"a,b,c\" var=\"mystring\" varStatus=\"status2\">...</c:forEach>
        Object _jsp_old_var_1 = pageContext.getAttribute("mystring");
        Object _jsp_old_var_status_1 = pageContext.getAttribute("status2");
        com.skin.ayada.jstl.core.ForEachTag _jsp_ForEachTag_1 = new com.skin.ayada.jstl.core.ForEachTag();
        _jsp_ForEachTag_1.setParent((Tag)null);
        _jsp_ForEachTag_1.setPageContext(pageContext);
        _jsp_ForEachTag_1.setVar("mystring");
        _jsp_ForEachTag_1.setItems("a,b,c");
        _jsp_ForEachTag_1.setVarStatus("status2");
        if(_jsp_ForEachTag_1.doStartTag() != Tag.SKIP_BODY) {
            while(true) {
                // TEXT: lineNumber: 1
                // out.write("<p>status.index: ");
                out.write(_jsp_string_2, 0, _jsp_string_2.length);
                // EXPRESSION: lineNumber: 2
                expressionContext.print(out, expressionContext.getString("status2.index"));
                // TEXT: lineNumber: 2
                // out.write(": mystring: ");
                out.write(_jsp_string_4, 0, _jsp_string_4.length);
                // VARIABLE: lineNumber: 2
                expressionContext.print(out, pageContext.getAttribute("mystring"));
                // TEXT: lineNumber: 2
                // out.write("</p>\r\n");
                out.write(_jsp_string_6, 0, _jsp_string_6.length);
                if(_jsp_ForEachTag_1.doAfterBody() != IterationTag.EVAL_BODY_AGAIN) {
                    break;
                }
            }
        }
        _jsp_ForEachTag_1.release();
        pageContext.setAttribute("mystring", _jsp_old_var_1);
        pageContext.setAttribute("status2", _jsp_old_var_status_1);
        // jsp.jstl.core.ForEachTag END
        // NODE END: lineNumber: 1, tagClassName: com.skin.ayada.jstl.core.ForEachTag, tagInstanceName: _jsp_ForEachTag_1


        out.flush();
        jspWriter.flush();
    }

    public static final char[] _jsp_string_2 = "<p>status.index: ".toCharArray();
    public static final char[] _jsp_string_4 = ": mystring: ".toCharArray();
    public static final char[] _jsp_string_6 = "</p>\r\n".toCharArray();

}
