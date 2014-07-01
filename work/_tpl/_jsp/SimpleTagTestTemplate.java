/*
 * $RCSfile: SimpleTagTestTemplate.java,v $$
 * $Revision: 1.1 $
 * $Date: 2014-07-01 $
 *
 * Copyright (C) 2008 Skin, Inc. All rights reserved.
 *
 * This software is the proprietary information of Skin, Inc.
 * Use is subject to license terms.
 *
 * home: D:\workspace2\ayada\webapp
 * path: simpleTagTest.jsp
 * lastModified: 2014-07-01 14:58:49 180
 * options: -fastJstl true
 * JSP generated by JspCompiler-1.0.0.8 (built 2014-07-01 19:24:36 178)
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
 * <p>Title: SimpleTagTestTemplate</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2006</p>
 * @author JspCompiler
 * @version 1.0
 */
@SuppressWarnings("unused")
public class SimpleTagTestTemplate extends JspTemplate{
    public static void main(String[] args){
        java.io.StringWriter writer = new java.io.StringWriter();
        PageContext pageContext = com.skin.ayada.runtime.JspFactory.getDefaultPageContext(writer);
        SimpleTagTestTemplate template = new SimpleTagTestTemplate();

        try{
            template._execute(pageContext);
            System.out.println(writer.toString());
        }
        catch(Throwable throwable)
        {
            throwable.printStackTrace();
        }
    }

    /**
     * @param pageContext
     * @throws Throwable
     */
    @Override
    public void _execute(final PageContext pageContext) throws Throwable{
        JspWriter out = pageContext.getOut();
        JspWriter jspWriter = pageContext.getOut();
        ExpressionContext expressionContext = pageContext.getExpressionContext();

        /* NODE START: lineNumber: 3, offset: 0, length: 20, tagClassName: test.com.skin.ayada.taglib.MySimpleTag, tagInstanceName: _jsp_MySimpleTag_1 */
        /* <test:simpleTag>...</test:simpleTag> */
        test.com.skin.ayada.taglib.MySimpleTag _jsp_MySimpleTag_1 = new test.com.skin.ayada.taglib.MySimpleTag();
        _jsp_MySimpleTag_1.setParent((Tag)null);
        _jsp_MySimpleTag_1.setPageContext(pageContext);

        JspFragment_1 _jsp_fragment_1 = new JspFragment_1();
        _jsp_fragment_1.setPageContext(pageContext);
        _jsp_fragment_1.setParent(_jsp_MySimpleTag_1);

        _jsp_MySimpleTag_1.setJspBody(_jsp_fragment_1);
        _jsp_MySimpleTag_1.doTag();
        _jsp_MySimpleTag_1.release();
        /* NODE END: lineNumber: 3, tagClassName: test.com.skin.ayada.taglib.MySimpleTag, tagInstanceName: _jsp_MySimpleTag_1 */

        /* TEXT: lineNumber: 9 */
        out.write("123\r\nabc");
        out.flush();
        jspWriter.flush();
    }

    /* NODE START: lineNumber: 3, offset: 0, length: 20, tagClassName: test.com.skin.ayada.taglib.MySimpleTag, tagInstanceName: _jsp_MySimpleTag_1 */
    /* <test:simpleTag>...</test:simpleTag> */
    public class JspFragment_1 extends com.skin.ayada.tagext.AbstractJspFragment{
        @Override
        public void execute(JspWriter writer) throws Exception{
            JspWriter out = writer;
            PageContext pageContext = this.getPageContext();
            Tag _jsp_MySimpleTag_1 = this.getParent();

            /* offset: 1, length: 18 */
            /* TEXT: lineNumber: 3 */
            out.write("123");
            /* VARIABLE: lineNumber: 3 */
            out.print(pageContext.getAttribute("mytest"), false);
            /* TEXT: lineNumber: 3 */
            out.write("\r\n    ");

            /* NODE START: lineNumber: 4, offset: 4, length: 4, tagClassName: test.com.skin.ayada.taglib.MySimpleTag, tagInstanceName: _jsp_MySimpleTag_5 */
            /* <test:simpleTag>...</test:simpleTag> */
            test.com.skin.ayada.taglib.MySimpleTag _jsp_MySimpleTag_5 = new test.com.skin.ayada.taglib.MySimpleTag();
            _jsp_MySimpleTag_5.setParent(_jsp_MySimpleTag_1);
            _jsp_MySimpleTag_5.setPageContext(pageContext);

            JspFragment_5 _jsp_fragment_5 = new JspFragment_5();
            _jsp_fragment_5.setPageContext(pageContext);
            _jsp_fragment_5.setParent(_jsp_MySimpleTag_5);

            _jsp_MySimpleTag_5.setJspBody(_jsp_fragment_5);
            _jsp_MySimpleTag_5.doTag();
            _jsp_MySimpleTag_5.release();
            /* NODE END: lineNumber: 4, tagClassName: test.com.skin.ayada.taglib.MySimpleTag, tagInstanceName: _jsp_MySimpleTag_5 */

            /* TEXT: lineNumber: 4 */
            out.write("\r\n    abc");
            /* VARIABLE: lineNumber: 5 */
            out.print(pageContext.getAttribute("mytest"), false);
            /* TEXT: lineNumber: 5 */
            out.write("\r\n    ");

            /* NODE START: lineNumber: 6, offset: 11, length: 7, tagClassName: com.skin.ayada.jstl.core.ForEachTag, tagInstanceName: _jsp_ForEachTag_12 */
            /* <c:forEach items="1,2">...</c:forEach> */
            com.skin.ayada.jstl.core.ForEachTag _jsp_ForEachTag_12 = new com.skin.ayada.jstl.core.ForEachTag();
            _jsp_ForEachTag_12.setParent(_jsp_MySimpleTag_1);
            _jsp_ForEachTag_12.setPageContext(pageContext);
            _jsp_ForEachTag_12.setItems("1,2");
            if(_jsp_ForEachTag_12.doStartTag() != Tag.SKIP_BODY){
                while(true){
                    /* TEXT: lineNumber: 6 */
                    out.write("\r\n        ");

                    /* NODE START: lineNumber: 7, offset: 13, length: 3, tagClassName: com.skin.ayada.jstl.core.ForEachTag, tagInstanceName: _jsp_ForEachTag_14 */
                    /* <c:forEach items="1,2" var="myvar">...</c:forEach> */
                    Object _jsp_old_var_14 = pageContext.getAttribute("myvar");
                    com.skin.ayada.jstl.core.ForEachTag _jsp_ForEachTag_14 = new com.skin.ayada.jstl.core.ForEachTag();
                    _jsp_ForEachTag_14.setParent((Tag)null);
                    _jsp_ForEachTag_14.setPageContext(pageContext);
                    _jsp_ForEachTag_14.setVar("myvar");
                    _jsp_ForEachTag_14.setItems("1,2");
                    if(_jsp_ForEachTag_14.doStartTag() != Tag.SKIP_BODY){
                        while(true){
                            /* VARIABLE: lineNumber: 7 */
                            out.print(pageContext.getAttribute("myvar"), false);
                            if(_jsp_ForEachTag_14.doAfterBody() != IterationTag.EVAL_BODY_AGAIN){
                                break;
                            }
                        }
                    }
                    _jsp_ForEachTag_14.release();
                    pageContext.setAttribute("myvar", _jsp_old_var_14);
                    /* jsp.jstl.core.ForEachTag END */
                    /* NODE END: lineNumber: 7, tagClassName: com.skin.ayada.jstl.core.ForEachTag, tagInstanceName: _jsp_ForEachTag_14 */

                    /* TEXT: lineNumber: 7 */
                    out.write("\r\n    ");
                    if(_jsp_ForEachTag_12.doAfterBody() != IterationTag.EVAL_BODY_AGAIN){
                        break;
                    }
                }
            }
            _jsp_ForEachTag_12.release();
            /* jsp.jstl.core.ForEachTag END */
            /* NODE END: lineNumber: 6, tagClassName: com.skin.ayada.jstl.core.ForEachTag, tagInstanceName: _jsp_ForEachTag_12 */

            /* TEXT: lineNumber: 8 */
            out.write("\r\nss");
            out.flush();
        }
    } /* NODE END: lineNumber: 3, tagClassName: test.com.skin.ayada.taglib.MySimpleTag, tagInstanceName: _jsp_MySimpleTag_1 */

    /* NODE START: lineNumber: 4, offset: 4, length: 4, tagClassName: test.com.skin.ayada.taglib.MySimpleTag, tagInstanceName: _jsp_MySimpleTag_5 */
    /* <test:simpleTag>...</test:simpleTag> */
    public class JspFragment_5 extends com.skin.ayada.tagext.AbstractJspFragment{
        @Override
        public void execute(JspWriter writer) throws Exception{
            JspWriter out = writer;
            PageContext pageContext = this.getPageContext();
            Tag _jsp_MySimpleTag_5 = this.getParent();

            /* offset: 5, length: 2 */
            /* VARIABLE: lineNumber: 4 */
            out.print(pageContext.getAttribute("mytest"), false);
            /* TEXT: lineNumber: 4 */
            out.write("xyz");
            out.flush();
        }
    } /* NODE END: lineNumber: 4, tagClassName: test.com.skin.ayada.taglib.MySimpleTag, tagInstanceName: _jsp_MySimpleTag_5 */
}