/*
 * Copyright 2005-2014 Red Hat, Inc.
 * Red Hat licenses this file to you under the Apache License, version
 * 2.0 (the "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *    http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.  See the License for the specific language governing
 * permissions and limitations under the License.
 */
/**
 *
 */
package org.apache.activemq.tests.util;

import javax.management.MBeanServer;

import org.apache.activemq.core.config.Configuration;
import org.apache.activemq.core.server.NodeManager;
import org.apache.activemq.core.server.impl.ActiveMQServerImpl;
import org.apache.activemq.spi.core.security.ActiveMQSecurityManager;

public final class InVMNodeManagerServer extends ActiveMQServerImpl
{
   final NodeManager nodeManager;

   public InVMNodeManagerServer(final NodeManager nodeManager)
   {
      super();
      this.nodeManager = nodeManager;
   }

   public InVMNodeManagerServer(final Configuration configuration, final NodeManager nodeManager)
   {
      super(configuration);
      this.nodeManager = nodeManager;
   }

   public InVMNodeManagerServer(final Configuration configuration,
                                final MBeanServer mbeanServer,
                                final NodeManager nodeManager)
   {
      super(configuration, mbeanServer);
      this.nodeManager = nodeManager;
   }

   public InVMNodeManagerServer(final Configuration configuration,
                                final ActiveMQSecurityManager securityManager,
                                final NodeManager nodeManager)
   {
      super(configuration, securityManager);
      this.nodeManager = nodeManager;
   }

   public InVMNodeManagerServer(final Configuration configuration,
                                final MBeanServer mbeanServer,
                                final ActiveMQSecurityManager securityManager,
                                final NodeManager nodeManager)
   {
      super(configuration, mbeanServer, securityManager);
      this.nodeManager = nodeManager;
   }

   @Override
   protected NodeManager createNodeManager(final String directory, boolean replicatingBackup)
   {
      return nodeManager;
   }

}