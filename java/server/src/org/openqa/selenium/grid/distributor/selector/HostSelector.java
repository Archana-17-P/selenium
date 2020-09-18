// Licensed to the Software Freedom Conservancy (SFC) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The SFC licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.

package org.openqa.selenium.grid.distributor.selector;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.grid.distributor.model.Host;

import java.util.Optional;
import java.util.Set;

/** Used to determine which {@link org.openqa.selenium.grid.node.Node} to
 * send a particular New Session request to.
 */
@FunctionalInterface
public interface HostSelector {
  Optional<Host> selectHost(Capabilities capabilities, Set<Host> hosts);
}