/* Copyright (c) 2011 Danish Maritime Authority
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this library.  If not, see <http://www.gnu.org/licenses/>.
 */
package dk.dma.enav.service.shore.areanotification;

import dk.dma.enav.model.geometry.Area;
import dk.dma.enav.service.general.notification.NotificationMessage;
import dk.dma.enav.service.spi.MaritimeInformationMessage;

/**
 * @deprecated use {@link NotificationMessage} instead.
 */
@Deprecated
public class AreaInformationMessage extends MaritimeInformationMessage {

    /** serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The area that is affected by this warning */
    Area area;

    String message = "Uh-Oh, We're In Trouble, Something's Come Along And It's Burst Our Bubble";
}