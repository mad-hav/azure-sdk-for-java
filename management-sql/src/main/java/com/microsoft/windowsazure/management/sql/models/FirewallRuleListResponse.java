/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.windowsazure.management.sql.models;

import com.microsoft.windowsazure.core.OperationResponse;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Iterator;

/**
* A standard service response including an HTTP status code and request ID.
*/
public class FirewallRuleListResponse extends OperationResponse implements Iterable<FirewallRuleListResponse.FirewallRule> {
    private ArrayList<FirewallRuleListResponse.FirewallRule> firewallRules;
    
    /**
    * Gets or sets the firewall rules for this SQL Database Server.
    * @return The FirewallRules value.
    */
    public ArrayList<FirewallRuleListResponse.FirewallRule> getFirewallRules() {
        return this.firewallRules;
    }
    
    /**
    * Gets or sets the firewall rules for this SQL Database Server.
    * @param firewallRulesValue The FirewallRules value.
    */
    public void setFirewallRules(final ArrayList<FirewallRuleListResponse.FirewallRule> firewallRulesValue) {
        this.firewallRules = firewallRulesValue;
    }
    
    /**
    * Initializes a new instance of the FirewallRuleListResponse class.
    *
    */
    public FirewallRuleListResponse() {
        super();
        this.firewallRules = new ArrayList<FirewallRuleListResponse.FirewallRule>();
    }
    
    /**
    * Gets the sequence of FirewallRules.
    *
    */
    public Iterator<FirewallRuleListResponse.FirewallRule> iterator() {
        return this.getFirewallRules().iterator();
    }
    
    /**
    * Firewall rule.
    */
    public static class FirewallRule {
        private InetAddress endIPAddress;
        
        /**
        * Gets or sets the ending IP address applied to this rule.
        * @return The EndIPAddress value.
        */
        public InetAddress getEndIPAddress() {
            return this.endIPAddress;
        }
        
        /**
        * Gets or sets the ending IP address applied to this rule.
        * @param endIPAddressValue The EndIPAddress value.
        */
        public void setEndIPAddress(final InetAddress endIPAddressValue) {
            this.endIPAddress = endIPAddressValue;
        }
        
        private String name;
        
        /**
        * Gets or sets the name of the Firewall Rule.
        * @return The Name value.
        */
        public String getName() {
            return this.name;
        }
        
        /**
        * Gets or sets the name of the Firewall Rule.
        * @param nameValue The Name value.
        */
        public void setName(final String nameValue) {
            this.name = nameValue;
        }
        
        private InetAddress startIPAddress;
        
        /**
        * Gets or sets the beginning IP address applied to this rule.
        * @return The StartIPAddress value.
        */
        public InetAddress getStartIPAddress() {
            return this.startIPAddress;
        }
        
        /**
        * Gets or sets the beginning IP address applied to this rule.
        * @param startIPAddressValue The StartIPAddress value.
        */
        public void setStartIPAddress(final InetAddress startIPAddressValue) {
            this.startIPAddress = startIPAddressValue;
        }
        
        private String type;
        
        /**
        * Gets or sets the type of resource.
        * @return The Type value.
        */
        public String getType() {
            return this.type;
        }
        
        /**
        * Gets or sets the type of resource.
        * @param typeValue The Type value.
        */
        public void setType(final String typeValue) {
            this.type = typeValue;
        }
    }
}