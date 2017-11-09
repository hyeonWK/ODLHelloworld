package org.opendaylight.hello;

import org.opendaylight.controller.md.sal.binding.api.DataBroker;
import org.opendaylight.controller.sal.binding.api.AbstractBrokerAwareActivator;
import org.opendaylight.controller.sal.binding.api.BindingAwareBroker;
import org.opendaylight.controller.sal.binding.api.BindingAwareProvider;
import org.opendaylight.controller.sal.binding.api.BindingAwareBroker.ProviderContext;
import org.osgi.framework.Bundle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.osgi.framework.BundleContext;
import org.osgi.framework.BundleActivator;

public class helloActivator extends AbstractBrokerAwareActivator implements BindingAwareProvider {
    private static final Logger LOG = LoggerFactory.getLogger(helloActivator.class);

    @Override
    public void onSessionInitiated(final ProviderContext providerContext) {
        LOG.info("Hello Provider Session Init");
    }

    @Override
    protected final void onBrokerAvailable(BindingAwareBroker broker, BundleContext context) {
        LOG.info("Hello Provider onBrokerAvailable");
    }
}