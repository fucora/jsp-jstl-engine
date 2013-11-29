/*
 * $RCSfile: MapTag.java,v $$
 * $Revision: 1.1 $
 * $Date: 2013-11-26 $
 *
 * Copyright (C) 2008 Skin, Inc. All rights reserved.
 *
 * This software is the proprietary information of Skin, Inc.
 * Use is subject to license terms.
 */
package com.skin.ayada.jstl.core;

import java.util.LinkedHashMap;
import java.util.Map;

import com.skin.ayada.tagext.AttributeTagSupport;
import com.skin.ayada.tagext.Tag;
import com.skin.ayada.tagext.TagSupport;

/**
 * <p>Title: MapTag</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2006</p>
 * @version 1.0
 */
public class MapTag extends TagSupport implements AttributeTagSupport
{
    private String name;
    private Map<String, Object> map;

    @Override
    public int doStartTag() throws Exception
    {
        super.doStartTag();

        if(this.name == null)
        {
            return Tag.SKIP_BODY;
        }

        this.map = new LinkedHashMap<String, Object>();
        this.pageContext.setAttribute(this.name, this.map);
        return TagSupport.EVAL_BODY_INCLUDE;
    }

    /**
     * @param name
     * @param value
     */
    @Override
    public void setAttribute(String name, Object value)
    {
        this.map.put(name, value);
    }

    /**
     * @return the name
     */
    public String getName()
    {
        return this.name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name)
    {
        this.name = name;
    }
}