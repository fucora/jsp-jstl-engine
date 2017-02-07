/*
 * $RCSfile: SetTestTemplate.java,v $$
 * $Revision: 1.1 $
 * $Date: 2017-02-07 $
 *
 * Copyright (C) 2008 Skin, Inc. All rights reserved.
 *
 * This software is the proprietary information of Skin, Inc.
 * Use is subject to license terms.
 *
 * home: E:/WorkSpace/ayada/webapp
 * path: /setTest.jsp
 * lastModified: 2014-11-29 09:58:01 222
 * options: -fastJstl true
 * template.dependencies
 * -- /setTest.jsp
 *
 * JSP generated by JspCompiler-1.0.1.2 (built 2017-02-07 20:41:29 124)
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
 * <p>Title: SetTestTemplate</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2006</p>
 * @author JspCompiler
 * @version 1.0
 */
@SuppressWarnings("unused")
public class SetTestTemplate extends JspTemplate {
    /**
     * @param args
     */
    public static void main(String[] args){
        java.io.StringWriter writer = new java.io.StringWriter();
        PageContext pageContext = com.skin.ayada.runtime.JspFactory.getPageContext(writer);
        SetTestTemplate template = new SetTestTemplate();

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
        // NODE START: lineNumber: 1, offset: 0, length: 8, tagClassName: com.skin.ayada.jstl.core.BeanTag, tagInstanceName: _jsp_BeanTag_1
        // <c:bean name=\"testTag1\" className=\"com.skin.ayada.jstl.core.TestTag\">...</c:bean>
        com.skin.ayada.jstl.core.BeanTag _jsp_BeanTag_1 = new com.skin.ayada.jstl.core.BeanTag();
        try {
            _jsp_BeanTag_1.setPageContext(pageContext);
            _jsp_BeanTag_1.setParent((Tag)null);
            _jsp_BeanTag_1.setName("testTag1");
            _jsp_BeanTag_1.setClassName("com.skin.ayada.jstl.core.TestTag");
            int _jsp_start_flag_1 = _jsp_BeanTag_1.doStartTag();

            if(_jsp_start_flag_1 == Tag.SKIP_PAGE) {
                return;
            }
            if(_jsp_start_flag_1 != Tag.SKIP_BODY) {
                int _jsp_flag_1 = 0;

                do {
                // NODE START: lineNumber: 2, offset: 1, length: 2, tagClassName: com.skin.ayada.jstl.core.ConstructorTag, tagInstanceName: _jsp_ConstructorTag_2
                // <c:constructor type=\"char\" value=\"c\"/>
                com.skin.ayada.jstl.core.ConstructorTag.setArgument(_jsp_BeanTag_1, "char", "c");
                // jsp.jstl.core.ConstructorTag END
                // NODE END: lineNumber: 2, tagClassName: com.skin.ayada.jstl.core.ConstructorTag, tagInstanceName: _jsp_ConstructorTag_2

                // NODE START: lineNumber: 3, offset: 3, length: 2, tagClassName: com.skin.ayada.jstl.core.ConstructorTag, tagInstanceName: _jsp_ConstructorTag_4
                // <c:constructor type=\"byte\" value=\"2\"/>
                com.skin.ayada.jstl.core.ConstructorTag.setArgument(_jsp_BeanTag_1, "byte", 2);
                // jsp.jstl.core.ConstructorTag END
                // NODE END: lineNumber: 3, tagClassName: com.skin.ayada.jstl.core.ConstructorTag, tagInstanceName: _jsp_ConstructorTag_4

                // NODE START: lineNumber: 4, offset: 5, length: 2, tagClassName: com.skin.ayada.jstl.core.PropertyTag, tagInstanceName: _jsp_PropertyTag_6
                // <c:property name=\"pageContext\" value=\"${pageContext}\"/>
                _jsp_BeanTag_1.setProperty("pageContext", pageContext.getAttribute("pageContext"));
                // jsp.jstl.core.PropertyTag END
                // NODE END: lineNumber: 4, tagClassName: com.skin.ayada.jstl.core.PropertyTag, tagInstanceName: _jsp_PropertyTag_6

                    _jsp_flag_1 = _jsp_BeanTag_1.doAfterBody();
                }
                while(_jsp_flag_1 == IterationTag.EVAL_BODY_AGAIN);
            }
            _jsp_BeanTag_1.doEndTag();
        }
        finally {
            this.doFinally(_jsp_BeanTag_1);
        }
        // NODE END: lineNumber: 1, tagClassName: com.skin.ayada.jstl.core.BeanTag, tagInstanceName: _jsp_BeanTag_1

        // TEXT: lineNumber: 5
        // out.write("\r\n");
        out.write(_jsp_string_9, 0, _jsp_string_9.length);

        // NODE START: lineNumber: 7, offset: 9, length: 2, tagClassName: com.skin.ayada.jstl.core.SetTag, tagInstanceName: _jsp_SetTag_10
        // <c:set var=\"a1\" value=\"1\"/>
        pageContext.setAttribute("a1", 1);
        // jsp.jstl.core.SetTag END
        // NODE END: lineNumber: 7, tagClassName: com.skin.ayada.jstl.core.SetTag, tagInstanceName: _jsp_SetTag_10

        // TEXT: lineNumber: 7
        // out.write("<p>a1: ");
        out.write(_jsp_string_12, 0, _jsp_string_12.length);
        // VARIABLE: lineNumber: 7
        expressionContext.print(out, pageContext.getAttribute("a1"));
        // TEXT: lineNumber: 7
        // out.write("</p>\r\n");
        out.write(_jsp_string_14, 0, _jsp_string_14.length);

        // NODE START: lineNumber: 8, offset: 14, length: 3, tagClassName: com.skin.ayada.jstl.core.SetTag, tagInstanceName: _jsp_SetTag_15
        // <c:set var=\"a1\">...</c:set>
        out = pageContext.pushBody();
        // TEXT: lineNumber: 8
        // out.write("0 - Hello World!");
        out.write(_jsp_string_16, 0, _jsp_string_16.length);
        pageContext.setAttribute("a1", ((BodyContent)out).getString().trim());
        out = pageContext.popBody();
        // jsp.jstl.core.SetTag END
        // NODE END: lineNumber: 8, tagClassName: com.skin.ayada.jstl.core.SetTag, tagInstanceName: _jsp_SetTag_15

        // TEXT: lineNumber: 8
        // out.write("<p>a1: ");
        out.write(_jsp_string_18, 0, _jsp_string_18.length);
        // VARIABLE: lineNumber: 8
        expressionContext.print(out, pageContext.getAttribute("a1"));
        // TEXT: lineNumber: 8
        // out.write("</p>\r\n\r\n");
        out.write(_jsp_string_20, 0, _jsp_string_20.length);

        // NODE START: lineNumber: 10, offset: 20, length: 2, tagClassName: com.skin.ayada.jstl.core.SetTag, tagInstanceName: _jsp_SetTag_21
        // <c:set target=\"${testTag1}\" property=\"myString\" value=\"00 - Hello World !\"/>
        com.skin.ayada.util.ClassUtil.setProperty(pageContext.getAttribute("testTag1"), "myString", "00 - Hello World !");
        // jsp.jstl.core.SetTag END
        // NODE END: lineNumber: 10, tagClassName: com.skin.ayada.jstl.core.SetTag, tagInstanceName: _jsp_SetTag_21

        // NODE START: lineNumber: 11, offset: 22, length: 2, tagClassName: com.skin.ayada.jstl.core.ExecuteTag, tagInstanceName: _jsp_ExecuteTag_23
        // <c:execute value=\"${testTag1.print()}\"/>
        ExpressionUtil.evaluate(expressionContext, "${testTag1.print()}", null);
        // jsp.jstl.core.ExecuteTag END
        // NODE END: lineNumber: 11, tagClassName: com.skin.ayada.jstl.core.ExecuteTag, tagInstanceName: _jsp_ExecuteTag_23

        // NODE START: lineNumber: 12, offset: 24, length: 3, tagClassName: com.skin.ayada.jstl.core.SetTag, tagInstanceName: _jsp_SetTag_25
        // <c:set target=\"${testTag1}\" property=\"myString\">...</c:set>
        out = pageContext.pushBody();
        // TEXT: lineNumber: 12
        // out.write("00 - Hello World !");
        out.write(_jsp_string_26, 0, _jsp_string_26.length);
        com.skin.ayada.util.ClassUtil.setProperty(pageContext.getAttribute("testTag1"), "myString", ((BodyContent)out).getString().trim());
        out = pageContext.popBody();
        // jsp.jstl.core.SetTag END
        // NODE END: lineNumber: 12, tagClassName: com.skin.ayada.jstl.core.SetTag, tagInstanceName: _jsp_SetTag_25

        // NODE START: lineNumber: 13, offset: 27, length: 2, tagClassName: com.skin.ayada.jstl.core.ExecuteTag, tagInstanceName: _jsp_ExecuteTag_28
        // <c:execute value=\"${testTag1.print()}\"/>
        ExpressionUtil.evaluate(expressionContext, "${testTag1.print()}", null);
        // jsp.jstl.core.ExecuteTag END
        // NODE END: lineNumber: 13, tagClassName: com.skin.ayada.jstl.core.ExecuteTag, tagInstanceName: _jsp_ExecuteTag_28

        // TEXT: lineNumber: 13
        // out.write("\r\n\r\n");
        out.write(_jsp_string_30, 0, _jsp_string_30.length);

        // NODE START: lineNumber: 16, offset: 30, length: 2, tagClassName: com.skin.ayada.jstl.core.SetTag, tagInstanceName: _jsp_SetTag_31
        // <c:set var=\"a2\" value=\"&quot;hell&quot;\"/>
        pageContext.setAttribute("a2", "\"hell\"");
        // jsp.jstl.core.SetTag END
        // NODE END: lineNumber: 16, tagClassName: com.skin.ayada.jstl.core.SetTag, tagInstanceName: _jsp_SetTag_31

        // VARIABLE: lineNumber: 17
        expressionContext.print(out, pageContext.getAttribute("a2"));
        // TEXT: lineNumber: 17
        // out.write("\r\n");
        out.write(_jsp_string_34, 0, _jsp_string_34.length);

        // NODE START: lineNumber: 18, offset: 34, length: 2, tagClassName: com.skin.ayada.jstl.core.OutTag, tagInstanceName: _jsp_OutTag_35
        // <c:out value=\"${a2}\"/>
        com.skin.ayada.jstl.core.OutTag.write(out, pageContext.getAttribute("a2"), false);
        // out.print(ExpressionUtil.getString(expressionContext, "${a2}"));
        // jsp.jstl.core.OutTag END
        // NODE END: lineNumber: 18, tagClassName: com.skin.ayada.jstl.core.OutTag, tagInstanceName: _jsp_OutTag_35

        // TEXT: lineNumber: 18
        // out.write("\r\n\r\n");
        out.write(_jsp_string_37, 0, _jsp_string_37.length);

        out.flush();
        jspWriter.flush();
    }

    protected static final char[] _jsp_string_9 = "\r\n".toCharArray();
    protected static final char[] _jsp_string_12 = "<p>a1: ".toCharArray();
    protected static final char[] _jsp_string_14 = "</p>\r\n".toCharArray();
    protected static final char[] _jsp_string_16 = "0 - Hello World!".toCharArray();
    protected static final char[] _jsp_string_18 = "<p>a1: ".toCharArray();
    protected static final char[] _jsp_string_20 = "</p>\r\n\r\n".toCharArray();
    protected static final char[] _jsp_string_26 = "00 - Hello World !".toCharArray();
    protected static final char[] _jsp_string_30 = "\r\n\r\n".toCharArray();
    protected static final char[] _jsp_string_34 = "\r\n".toCharArray();
    protected static final char[] _jsp_string_37 = "\r\n\r\n".toCharArray();

}
