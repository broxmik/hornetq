/*
 * Copyright 2010 Red Hat, Inc.
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

package org.hornetq.tests.integration.persistence;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hornetq.api.core.SimpleString;
import org.hornetq.core.persistence.config.PersistedRoles;

/**
 * A ConfigurationStorageTest
 *
 * @author <mailto:clebert.suconic@jboss.org">Clebert Suconic</a>
 *
 *
 */
public class RolesConfigurationStorageTest extends StorageManagerTestBase
{

   private Map<SimpleString, PersistedRoles> mapExpectedSets;

   @Override
   protected void setUp() throws Exception
   {
      super.setUp();

      mapExpectedSets = new HashMap<SimpleString, PersistedRoles>();
   }

   protected void addSetting(PersistedRoles setting) throws Exception
   {
      mapExpectedSets.put(setting.getAddressMatch(), setting);
      journal.storeSecurityRoles(setting);
   }

   public void testStoreSecuritySettings() throws Exception
   {
      createStorage();


      addSetting(new PersistedRoles("a#",
                            "a1",
                            "a1",
                            "a1",
                            "a1",
                            "a1",
                            "a1",
                            "a1"));


      addSetting(new PersistedRoles("a2",
                                    "a1",
                                    null,
                                    "a1",
                                    "a1",
                                    "a1",
                                    "a1",
                                    "a1"));

      journal.stop();

      checkSettings();

      createStorage();

      checkSettings();

      addSetting(new PersistedRoles("a2",
                                    "a1",
                                    null,
                                    "a1",
                                    "a1",
                                    "a1",
                                    "a1",
                                    "a1"));

      addSetting(new PersistedRoles("a3",
                                    "a1",
                                    null,
                                    "a1",
                                    "a1",
                                    "a1",
                                    "a1",
                                    "a1"));

      checkSettings();

      journal.stop();

      createStorage();

      checkSettings();

      journal.stop();

      journal = null;

   }

   /**
    * @param journal
    * @throws Exception
    */
   private void checkSettings() throws Exception
   {
      List<PersistedRoles> listSetting = journal.recoverPersistedRoles();

      assertEquals(mapExpectedSets.size(), listSetting.size());

      for (PersistedRoles el : listSetting)
      {
         PersistedRoles el2 = mapExpectedSets.get(el.getAddressMatch());

         assertEquals(el, el2);
      }
   }

   // Package protected ---------------------------------------------

   // Protected -----------------------------------------------------

   // Private -------------------------------------------------------

   // Inner classes -------------------------------------------------

}
