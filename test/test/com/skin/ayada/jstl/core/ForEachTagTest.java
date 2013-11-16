/*
 * $RCSfile: ForEachTagTest.java,v $$
 * $Revision: 1.1 $
 * $Date: 2013-8-26 $
 *
 * Copyright (C) 2008 Skin, Inc. All rights reserved.
 *
 * This software is the proprietary information of Skin, Inc.
 * Use is subject to license terms.
 */
package test.com.skin.ayada.jstl.core;

import java.io.StringWriter;

import com.skin.ayada.jstl.core.ForEachTag;
import com.skin.ayada.runtime.JspFactory;
import com.skin.ayada.runtime.PageContext;
import com.skin.ayada.tagext.Tag;

/**
 * <p>Title: ForEachTagTest</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2006</p>
 * @version 1.0
 */
public class ForEachTagTest
{
    public static void main(String[] args)
    {
        test2();
    }
    
    public static void test1()
    {
        StringWriter out = new StringWriter();
        PageContext pageContext = JspFactory.getPageContext(out);

        ForEachTag forEachTag = new ForEachTag();
        forEachTag.setParent((Tag)null);
        forEachTag.setPageContext(pageContext);
        forEachTag.setItems(new String[]{"1", "2"});
        forEachTag.doStartTag();

        while(forEachTag.hasNext())
        {
            System.out.println(forEachTag.next());
        }
    }

    public static void test2()
    {
        StringWriter out = new StringWriter();
        PageContext pageContext = JspFactory.getPageContext(out);

        ForEachTag forEachTag = new ForEachTag();
        forEachTag.setPageContext(pageContext);
        forEachTag.setItems("1, 2, 3");
        int flag = forEachTag.doStartTag();
        System.out.println("index: " + forEachTag.getIndex());
        System.out.println("flag: " + flag);

        while(forEachTag.hasNext())
        {
            System.out.println(forEachTag.next());
        }
    }
}
