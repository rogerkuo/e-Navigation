/* Copyright (c) 2011 Danish Maritime Authority.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package dk.dma.enav.model.voyage.cargo;

public enum CargoType {
    A, B, C, D, UNDEFINED;

    public String toString() {
        return this == UNDEFINED ? "Undefined" : "Category " + name();
    }

    /**
     * Returns a navigation status from an ais int on a best effort.
     * 
     * @return the navigation status.
     */
    public static CargoType fromAIS(int aisNavStatus) {
        switch (aisNavStatus) {
        case 1:
            return A;
        case 2:
            return B;
        case 3:
            return C;
        case 4:
            return D;
        default:
            return UNDEFINED;
        }
    }
}
