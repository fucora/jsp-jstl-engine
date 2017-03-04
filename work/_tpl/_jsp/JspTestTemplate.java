/*
 * $RCSfile: JspTestTemplate.java,v $
 * $Revision: 1.1 $
 * $Date: 2017-03-04 $
 *
 * Copyright (C) 2008 Skin, Inc. All rights reserved.
 *
 * This software is the proprietary information of Skin, Inc.
 * Use is subject to license terms.
 *
 * home: E:/WorkSpace/ayada/webapp
 * path: jspTest.jsp
 * lastModified: 2017-03-04 12:15:20 400
 * options: -fastJstl true
 * template.dependencies
 * -- /jspTest.jsp
 *
 * JSP generated by JspCompiler-1.0.1.6 (built 2017-03-04 12:22:40 338)
 */
package _tpl._jsp;

import java.io.Writer;
import com.skin.ayada.ExpressionContext;
import com.skin.ayada.JspWriter;
import com.skin.ayada.PageContext;
import com.skin.ayada.tagext.BodyContent;
import com.skin.ayada.tagext.BodyTag;
import com.skin.ayada.tagext.IterationTag;
import com.skin.ayada.tagext.JspFragment;
import com.skin.ayada.tagext.Tag;
import com.skin.ayada.JspTemplate;
import com.skin.ayada.util.ELUtil;


/**
 * <p>Title: JspTestTemplate</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2006</p>
 * @author JspCompiler
 * @version 1.0
 */
@SuppressWarnings("unused")
public class JspTestTemplate extends JspTemplate {
    /**
     * @param args
     */
    public static void main(String[] args) {
        java.io.StringWriter writer = new java.io.StringWriter();
        PageContext pageContext = com.skin.ayada.runtime.JspFactory.getPageContext(writer);
        JspTestTemplate template = new JspTestTemplate();

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

        /**
         * 自定义隐含变量, 允许不同的运行环境定义不同的隐含变量
         * 如果需要定义隐含变量请配置编译模板: ayada.properties
         * ayada.compile.java-template=com/skin/ayada/compile/class.jsp
         * 重新指定一个新的模板文件即可
         * 例如在web环境可定义如下的隐含变量:
         * 
         * ServletContext servletContext = (ServletContext)(pageContext.getAttribute("servletContext"));
         * HttpServletRequest request = (HttpServletRequest)(pageContext.getAttribute("request"));
         * HttpServletResponse response = (HttpServletResponse)(pageContext.getAttribute("response"));
         * 注: 隐含变量必须在模板运行之前由应用方注入到pageContext中.
         */

        // [1] <jsp:directive.page contentType="text/html;charset=UTF-8"/>
        // [2] <jsp:directive.taglib prefix="c" taglib="" uri="http://java.sun.com/jsp/jstl/core"/>
        // [3] <jsp:directive.taglib prefix="fmt" taglib="" uri="http://java.sun.com/jsp/jstl/fmt"/>
        // [4] <jsp:scriptlet>...</jsp:scriptlet>
    String myTest = "myTest";

        // [4] end.
        // [7] offset: 4, length: 2, name: _jsp_OutTag_5, tag: com.skin.ayada.jstl.core.OutTag
        // <c:out value=\"myTest + &quot;abc\\&quot;n&quot;\"/>
        com.skin.ayada.jstl.core.OutTag.write(out, (myTest + "abc\"n"), false);
        // [7] name: _jsp_OutTag_5, tag: com.skin.ayada.jstl.core.OutTag

        // [7] out.write("\r\n");
        out.write(_jsp_string_7, 0, _jsp_string_7.length);

        // [8] offset: 7, length: 2, name: _jsp_OutTag_8, tag: com.skin.ayada.jstl.core.OutTag
        // <c:out value=\"abc\\r\\n&quot;\"/>
        com.skin.ayada.jstl.core.OutTag.write(out, "abc\\r\\n\"", false);
        // [8] name: _jsp_OutTag_8, tag: com.skin.ayada.jstl.core.OutTag

        // [8] out.write("\r\n<h1>Hello World !</h1>\r\n\r\n");
        out.write(_jsp_string_10, 0, _jsp_string_10.length);

        out.flush();
        jspWriter.flush();
    }

    protected static final char[] _jsp_string_7 = "\r\n".toCharArray();
    protected static final char[] _jsp_string_10 = "\r\n<h1>Hello World !</h1>\r\n\r\n".toCharArray();

}
