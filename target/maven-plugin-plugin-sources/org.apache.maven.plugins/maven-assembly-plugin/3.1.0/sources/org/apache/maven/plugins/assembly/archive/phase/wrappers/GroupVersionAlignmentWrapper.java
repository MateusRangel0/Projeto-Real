package org.apache.maven.plugins.assembly.archive.phase.wrappers;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import org.apache.maven.plugins.assembly.model.GroupVersionAlignment;

import java.util.List;

/**
 * @version $Id: GroupVersionAlignmentWrapper.java 1722459 2015-12-31 19:47:48Z rfscholte $
 */
class GroupVersionAlignmentWrapper
    implements org.apache.maven.plugins.assembly.repository.model.GroupVersionAlignment
{

    private final GroupVersionAlignment alignment;

    /**
     * @param alignment @{link {@link GroupVersionAlignment}
     */
    public GroupVersionAlignmentWrapper( final GroupVersionAlignment alignment )
    {
        this.alignment = alignment;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<String> getExcludes()
    {
        return alignment.getExcludes();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getId()
    {
        return alignment.getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getVersion()
    {
        return alignment.getVersion();
    }

}
