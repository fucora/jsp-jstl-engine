/*
 * $RCSfile: BookList2Template.java,v $
 * $Revision: 1.1 $
 * $Date: 2017-03-03 $
 *
 * Copyright (C) 2008 Skin, Inc. All rights reserved.
 *
 * This software is the proprietary information of Skin, Inc.
 * Use is subject to license terms.
 *
 * home: E:/WorkSpace/ayada/webapp/benchmark
 * path: bookList2.jsp
 * lastModified: 2017-02-24 16:34:14 000
 * options: -fastJstl true
 * template.dependencies
 * -- /bookList2.jsp
 *
 * JSP generated by JspCompiler-1.0.1.6 (built 2017-03-03 23:16:44 308)
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
import com.skin.ayada.util.DateUtil; // jsp:directive.import: line: 1
import com.skin.ayada.test.model.User; // jsp:directive.import: line: 2
import com.skin.ayada.test.model.Book; // jsp:directive.import: line: 3


/**
 * <p>Title: BookList2Template</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2006</p>
 * @author JspCompiler
 * @version 1.0
 */
@SuppressWarnings("unused")
public class BookList2Template extends JspTemplate {
    /**
     * @param args
     */
    public static void main(String[] args) {
        java.io.StringWriter writer = new java.io.StringWriter();
        PageContext pageContext = com.skin.ayada.runtime.JspFactory.getPageContext(writer);
        BookList2Template template = new BookList2Template();

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

        // [1] <jsp:directive.page import="com.skin.ayada.util.DateUtil"/>
        // [2] <jsp:directive.page import="com.skin.ayada.test.model.User"/>
        // [3] <jsp:directive.page import="com.skin.ayada.test.model.Book"/>
        // [3] out.write("<html>\r\n<head>\r\n");
        out.write(_jsp_string_4, 0, _jsp_string_4.length);

        // [6] <jsp:scriptlet>...</jsp:scriptlet>
    User user = (User)(pageContext.getAttribute("user"));

        // [6] end.
        // [8] out.write("<title>");
        out.write(_jsp_string_6, 0, _jsp_string_6.length);

        // [9] <jsp:scriptlet>...</jsp:scriptlet>
out.write(pageContext.getAttribute("engineName"));
        // [9] end.
        // [9] out.write("</title>\r\n</head>\r\n<body>\r\n");
        out.write(_jsp_string_8, 0, _jsp_string_8.length);

        // [12] <jsp:scriptlet>...</jsp:scriptlet>
    if(user != null) {

        // [12] end.
        // [14] out.write("<h1>");
        out.write(_jsp_string_10, 0, _jsp_string_10.length);

        // [15] <jsp:scriptlet>...</jsp:scriptlet>
out.write(Long.toString(user.getUserId()));
        // [15] end.
        // [15] out.write(" /");
        out.write(_jsp_string_12, 0, _jsp_string_12.length);

        // [15] <jsp:scriptlet>...</jsp:scriptlet>
out.write(user.getUserName());
        // [15] end.
        // [15] out.write("</h1>\r\n");
        out.write(_jsp_string_14, 0, _jsp_string_14.length);

        // [16] <jsp:scriptlet>...</jsp:scriptlet>
    }
    else {
        out.write("<h1> / </h1>");
    }

    if(user != null && "admin".equals(user.getUserName())) {

        // [16] end.
        // [23] out.write("<table>\r\n    <tr>\r\n        <th>NO.</th>\r\n        <th>Title</th>\r\n        <th>Author</th>\r\n        <th>Publisher</th>\r\n        <th>PublicationDate</th>\r\n        <th>Price</th>\r\n        <th>DiscountPercent</th>\r\n        <th>DiscountPrice</th>\r\n    </tr>\r\n");
        out.write(_jsp_string_16, 0, _jsp_string_16.length);

        // [35] <jsp:scriptlet>...</jsp:scriptlet>
        int i = 1;
        Book[] books = (Book[])(pageContext.getAttribute("books"));
        for(Book book : books) {
            if(book.getPrice() > 0) {
                int discountPrice = book.getPrice() * book.getDiscount() / 100;
    
        // [35] end.
        // [41] out.write("    <tr>\r\n        <td>");
        out.write(_jsp_string_18, 0, _jsp_string_18.length);

        // [43] <jsp:scriptlet>...</jsp:scriptlet>
out.write(Integer.toString(i++));
        // [43] end.
        // [43] out.write("</td>\r\n        <td>");
        out.write(_jsp_string_20, 0, _jsp_string_20.length);

        // [44] <jsp:scriptlet>...</jsp:scriptlet>
out.write(book.getTitle());
        // [44] end.
        // [44] out.write("</td>\r\n        <td>");
        out.write(_jsp_string_22, 0, _jsp_string_22.length);

        // [45] <jsp:scriptlet>...</jsp:scriptlet>
out.write(book.getAuthor());
        // [45] end.
        // [45] out.write("</td>\r\n        <td>");
        out.write(_jsp_string_24, 0, _jsp_string_24.length);

        // [46] <jsp:scriptlet>...</jsp:scriptlet>
out.write(book.getPublisher());
        // [46] end.
        // [46] out.write("</td>\r\n        <td>");
        out.write(_jsp_string_26, 0, _jsp_string_26.length);

        // [47] <jsp:scriptlet>...</jsp:scriptlet>
out.write(DateUtil.format(book.getPublication(), "yyyy-MM-dd HH:mm:ss"));
        // [47] end.
        // [47] out.write("</td>\r\n        <td>");
        out.write(_jsp_string_28, 0, _jsp_string_28.length);

        // [48] <jsp:scriptlet>...</jsp:scriptlet>
out.write(Integer.toString(book.getPrice()));
        // [48] end.
        // [48] out.write("</td>\r\n        <td>");
        out.write(_jsp_string_30, 0, _jsp_string_30.length);

        // [49] <jsp:scriptlet>...</jsp:scriptlet>
out.write(Integer.toString(book.getDiscount()));
        // [49] end.
        // [49] out.write("</td>\r\n        <td>");
        out.write(_jsp_string_32, 0, _jsp_string_32.length);

        // [50] <jsp:scriptlet>...</jsp:scriptlet>
out.write(Integer.toString(discountPrice));
        // [50] end.
        // [50] out.write("</td>\r\n    </tr>\r\n");
        out.write(_jsp_string_34, 0, _jsp_string_34.length);

        // [52] <jsp:scriptlet>...</jsp:scriptlet>
            }
        }
    
        // [52] end.
        // [55] out.write("</table>\r\n");
        out.write(_jsp_string_36, 0, _jsp_string_36.length);

        // [57] <jsp:scriptlet>...</jsp:scriptlet>
    }
    else if(user != null) {

        // [57] end.
        // [60] out.write("<table>\r\n    <tr>\r\n        <td>No privilege.</td>\r\n    </tr>\r\n</table>\r\n");
        out.write(_jsp_string_38, 0, _jsp_string_38.length);

        // [66] <jsp:scriptlet>...</jsp:scriptlet>
    }
    else {

        // [66] end.
        // [69] out.write("<table>\r\n    <tr>\r\n        <td>No login.</td>\r\n    </tr>\r\n</table>\r\n");
        out.write(_jsp_string_40, 0, _jsp_string_40.length);

        // [75] <jsp:scriptlet>...</jsp:scriptlet>
    }

        // [75] end.
        // [77] out.write("</body>\r\n</html>\r\n");
        out.write(_jsp_string_42, 0, _jsp_string_42.length);

        out.flush();
        jspWriter.flush();
    }

    protected static final char[] _jsp_string_4 = "<html>\r\n<head>\r\n".toCharArray();
    protected static final char[] _jsp_string_6 = "<title>".toCharArray();
    protected static final char[] _jsp_string_8 = "</title>\r\n</head>\r\n<body>\r\n".toCharArray();
    protected static final char[] _jsp_string_10 = "<h1>".toCharArray();
    protected static final char[] _jsp_string_12 = " /".toCharArray();
    protected static final char[] _jsp_string_14 = "</h1>\r\n".toCharArray();
    protected static final char[] _jsp_string_16 = "<table>\r\n    <tr>\r\n        <th>NO.</th>\r\n        <th>Title</th>\r\n        <th>Author</th>\r\n        <th>Publisher</th>\r\n        <th>PublicationDate</th>\r\n        <th>Price</th>\r\n        <th>DiscountPercent</th>\r\n        <th>DiscountPrice</th>\r\n    </tr>\r\n".toCharArray();
    protected static final char[] _jsp_string_18 = "    <tr>\r\n        <td>".toCharArray();
    protected static final char[] _jsp_string_20 = "</td>\r\n        <td>".toCharArray();
    protected static final char[] _jsp_string_22 = "</td>\r\n        <td>".toCharArray();
    protected static final char[] _jsp_string_24 = "</td>\r\n        <td>".toCharArray();
    protected static final char[] _jsp_string_26 = "</td>\r\n        <td>".toCharArray();
    protected static final char[] _jsp_string_28 = "</td>\r\n        <td>".toCharArray();
    protected static final char[] _jsp_string_30 = "</td>\r\n        <td>".toCharArray();
    protected static final char[] _jsp_string_32 = "</td>\r\n        <td>".toCharArray();
    protected static final char[] _jsp_string_34 = "</td>\r\n    </tr>\r\n".toCharArray();
    protected static final char[] _jsp_string_36 = "</table>\r\n".toCharArray();
    protected static final char[] _jsp_string_38 = "<table>\r\n    <tr>\r\n        <td>No privilege.</td>\r\n    </tr>\r\n</table>\r\n".toCharArray();
    protected static final char[] _jsp_string_40 = "<table>\r\n    <tr>\r\n        <td>No login.</td>\r\n    </tr>\r\n</table>\r\n".toCharArray();
    protected static final char[] _jsp_string_42 = "</body>\r\n</html>\r\n".toCharArray();

}
