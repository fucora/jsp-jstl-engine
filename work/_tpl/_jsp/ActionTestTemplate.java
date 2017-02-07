/*
 * $RCSfile: ActionTestTemplate.java,v $$
 * $Revision: 1.1 $
 * $Date: 2017-02-07 $
 *
 * Copyright (C) 2008 Skin, Inc. All rights reserved.
 *
 * This software is the proprietary information of Skin, Inc.
 * Use is subject to license terms.
 *
 * home: E:/WorkSpace/ayada/webapp
 * path: /actionTest.jsp
 * lastModified: 2014-06-28 16:25:31 999
 * options: -fastJstl true
 * template.dependencies
 * -- /actionTest.jsp
 *
 * JSP generated by JspCompiler-1.0.1.2 (built 2017-02-07 20:41:11 796)
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
 * <p>Title: ActionTestTemplate</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2006</p>
 * @author JspCompiler
 * @version 1.0
 */
@SuppressWarnings("unused")
public class ActionTestTemplate extends JspTemplate {
    /**
     * @param args
     */
    public static void main(String[] args){
        java.io.StringWriter writer = new java.io.StringWriter();
        PageContext pageContext = com.skin.ayada.runtime.JspFactory.getPageContext(writer);
        ActionTestTemplate template = new ActionTestTemplate();

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
        // out.write("<p>Hello World !</p>\r\n");
        out.write(_jsp_string_1, 0, _jsp_string_1.length);

        // NODE START: lineNumber: 2, offset: 1, length: 2, tagClassName: com.skin.ayada.taglib.ActionTag, tagInstanceName: _jsp_ActionTag_2
        // <c:action page=\"/action/action.jsp\"/>
        com.skin.ayada.taglib.ActionTag _jsp_ActionTag_2 = new com.skin.ayada.taglib.ActionTag();
        try {
            _jsp_ActionTag_2.setPageContext(pageContext);
            _jsp_ActionTag_2.setParent((Tag)null);
            _jsp_ActionTag_2.setPage("/action/action.jsp");
            int _jsp_start_flag_2 = _jsp_ActionTag_2.doStartTag();

            if(_jsp_start_flag_2 == Tag.SKIP_PAGE) {
                return;
            }
            if(_jsp_start_flag_2 != Tag.SKIP_BODY) {
                _jsp_ActionTag_2.doAfterBody();
            }
            _jsp_ActionTag_2.doEndTag();
        }
        finally {
            this.doFinally(_jsp_ActionTag_2);
        }
        // NODE END: lineNumber: 2, tagClassName: com.skin.ayada.taglib.ActionTag, tagInstanceName: _jsp_ActionTag_2


        out.flush();
        jspWriter.flush();
    }

    protected static final char[] _jsp_string_1 = "<p>Hello World !</p>\r\n".toCharArray();

}
