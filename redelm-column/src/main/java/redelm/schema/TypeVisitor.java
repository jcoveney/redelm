/**
 * Copyright 2012 Twitter, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package redelm.schema;

/**
 * Implement this interface to visit a schema
 *
 * type.accept(new TypeVisitor() { ... });
 *
 * @author Julien Le Dem
 *
 */
public interface TypeVisitor {

  /**
   * @param groupType the group type to visit
   */
  void visit(GroupType groupType);

  /**
   * @param messageType the message type to visit
   */
  void visit(MessageType messageType);

  /**
   * @param primitiveType the primitive type to visit
   */
  void visit(PrimitiveType primitiveType);

}
