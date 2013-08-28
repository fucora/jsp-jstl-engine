/*
 * $RCSfile: ExecutorTest.java,v $$
 * $Revision: 1.1  $
 * $Date: 2013-3-2  $
 *
 * Copyright (C) 2008 Skin, Inc. All rights reserved.
 *
 * This software is the proprietary information of Skin, Inc.
 * Use is subject to license terms.
 */
package test.com.skin.ayada.template;

import java.io.File;
import java.io.StringWriter;
import java.io.Writer;
import java.util.List;

import test.com.skin.ayada.handler.UserHandler;
import test.com.skin.ayada.model.User;

import com.skin.ayada.compile.TemplateCompiler;
import com.skin.ayada.jstl.TagLibrary;
import com.skin.ayada.jstl.TagLibraryFactory;
import com.skin.ayada.runtime.JspFactory;
import com.skin.ayada.runtime.PageContext;
import com.skin.ayada.template.DefaultExecutor;
import com.skin.ayada.template.Template;
import com.skin.ayada.util.IO;

/**
 * <p>Title: ExecutorTest</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2006</p>
 * @author xuesong.net
 * @version 1.0
 */
public class ExecutorTest
{
    public static PageContext getPageContext(Writer out)
    {
        User user = new User();
        user.setUserId(1L);
        user.setUserName("xuesong.net");
        user.setAge(1);
        List<User> userList = UserHandler.getUserList(16);

        PageContext pageContext = JspFactory.getPageContext(out);
        pageContext.setAttribute("user", user);
        pageContext.setAttribute("userList", userList);
        return pageContext;
    }

    public static void main(String[] args)
    {
        String source = IO.read(new File("webapp\\whenTest.html"), "UTF-8", 4096);
        TemplateCompiler compiler = new TemplateCompiler(source);
        TagLibrary tagLibrary = TagLibraryFactory.getStandardTagLibrary();
        compiler.setTagLibrary(tagLibrary);

        long t1 = System.currentTimeMillis();
        Template template = compiler.compile();
        long t2 = System.currentTimeMillis();

        System.out.println("compile time: " + (t2 - t1));

        StringWriter writer = new StringWriter();
        PageContext pageContext = getPageContext(writer);

        long t3 = System.currentTimeMillis();
        DefaultExecutor.execute(template, pageContext);
        long t4 = System.currentTimeMillis();
        System.out.println("run time: " + (t4 - t3));
        System.out.println(writer.toString());
    }
}
