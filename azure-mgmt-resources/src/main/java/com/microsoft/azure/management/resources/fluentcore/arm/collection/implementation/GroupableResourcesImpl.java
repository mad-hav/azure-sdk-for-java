/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */
package com.microsoft.azure.management.resources.fluentcore.arm.collection.implementation;

import java.io.IOException;

import com.microsoft.azure.CloudException;
import com.microsoft.azure.Resource;
import com.microsoft.azure.management.resources.fluentcore.arm.ResourceUtils;
import com.microsoft.azure.management.resources.fluentcore.arm.collection.SupportsGettingByGroup;
import com.microsoft.azure.management.resources.fluentcore.arm.collection.SupportsGettingById;
import com.microsoft.azure.management.resources.fluentcore.arm.models.GroupableResource;
import com.microsoft.azure.management.resources.implementation.ResourceManager;

/**
 * Base class for resource collection classes.
 * (Internal use only)
 * @param <T> the individual resource type returned
 * @param <ImplT> the individual resource implementation
 * @param <InnerT> the wrapper inner type
 */
public abstract class GroupableResourcesImpl<
        T extends GroupableResource,
        ImplT extends T,
        InnerT extends Resource>
    implements
        SupportsGettingById<T>,
        SupportsGettingByGroup<T> {

    private final ResourceManager resourceManager;
    
    protected GroupableResourcesImpl(ResourceManager resourceManager) {
        this.resourceManager = resourceManager;
    }
    
    protected ResourceManager resourceManager() {
        return this.resourceManager;
    }
    
    @Override
    public abstract T getByGroup(String groupName, String name) throws CloudException, IOException;

    @Override
    public final T getById(String id) throws CloudException, IOException {
        return this.getByGroup(
                ResourceUtils.groupFromResourceId(id),
                ResourceUtils.nameFromResourceId(id));
    }

    protected abstract ImplT createFluentModel(String name);

    protected abstract ImplT createFluentModel(InnerT inner);
}
