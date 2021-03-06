/*
 * $RCSfile: Ayada3Test.java,v $
 * $Revision: 1.1 $
 * $Date: 2013-11-08 $
 *
 * Copyright (C) 2008 Skin, Inc. All rights reserved.
 *
 * This software is the proprietary information of Skin, Inc.
 * Use is subject to license terms.
 */
package com.skin.ayada.test.engine;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import com.skin.ayada.PageContext;
import com.skin.ayada.Template;
import com.skin.ayada.TemplateContext;
import com.skin.ayada.TemplateManager;
import com.skin.ayada.runtime.JspTemplateFactory;
import com.skin.ayada.test.TestWriter;
import com.skin.ayada.util.ClassPath;

/**
 * <p>Title: Ayada3Test</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2006</p>
 * @author xuesong.net
 * @version 1.0
 */
public class Ayada3Test extends Ayada1Test {
    /**
     * @return the name
     */
    @Override
    public String getName() {
        return "ayada3";
    }

    /**
     * @param name
     * @param context
     * @param stringWriter
     * @param count
     * @throws Exception
     */
    @Override
    public void execute(String name, Map<String, Object> context, TestWriter stringWriter, int count) throws Exception {
        PageContext pageContext = this.templateContext.getPageContext(context, stringWriter);
        pageContext.getExpressionContext().setEncoder(null);
        pageContext.setAttribute("engineName", this.getName());
        Template template = this.templateContext.getTemplate("bookList2.jsp", "utf-8");

        for(int i = 0; i < count; i++) {
            stringWriter.getBuffer().setLength(0);
            template.execute(pageContext);
        }

        if(count == 1) {
            System.out.println(stringWriter.toString());
        }
    }

    /**
     * @param file
     * @return TemplateContext
     * @throws IOException
     */
    @Override
    protected TemplateContext getTemplateContext(File work) throws IOException {
        TemplateContext templateContext = TemplateManager.create(work.getCanonicalPath());
        JspTemplateFactory jspTemplateFactory = new JspTemplateFactory();
        String classPath = ClassPath.getClassPath();
        jspTemplateFactory.setWork(new File("work").getAbsolutePath());
        jspTemplateFactory.setClassPath(classPath);
        jspTemplateFactory.setIgnoreJspTag(false);

        templateContext.setTemplateFactory(jspTemplateFactory);
        templateContext.getTemplateFactory().setIgnoreJspTag(false);
        templateContext.getSourceFactory().setSourcePattern("*");
        return templateContext;
    }
}
