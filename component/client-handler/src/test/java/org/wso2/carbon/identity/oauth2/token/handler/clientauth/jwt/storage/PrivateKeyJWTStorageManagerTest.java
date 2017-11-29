/*
 * Copyright (c) 2017, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License
 */

package org.wso2.carbon.identity.oauth2.token.handler.clientauth.jwt.storage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.wso2.carbon.identity.common.testng.WithH2Database;
import org.wso2.carbon.identity.oauth2.IdentityOAuth2Exception;

@WithH2Database(jndiName = "jdbc/WSO2CarbonDB", files = {"dbscripts/identity.sql"})
public class PrivateKeyJWTStorageManagerTest{
    private PrivateKeyJWTStorageManager privateKeyJWTStorageManager;

    @BeforeClass
    public void setUp() throws Exception {
        privateKeyJWTStorageManager = new PrivateKeyJWTStorageManager();
    }

    @Test()
    public void testIsJTIExistsInDB() throws Exception {
      privateKeyJWTStorageManager.isJTIExistsInDB("");
    }

    @Test(expectedExceptions = IdentityOAuth2Exception.class)
    public void testPersistJWTIdInDB() throws Exception {
        privateKeyJWTStorageManager.persistJWTIdInDB("2000", 10000, 10000000);
        privateKeyJWTStorageManager.persistJWTIdInDB("2000", 10000, 10000000);
    }
}