/***************************************************
*
* cismet GmbH, Saarbruecken, Germany
*
*              ... and it just works.
*
****************************************************/
/*
 *  Copyright (C) 2011 jruiz
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package de.cismet.verdis.commons.constants;

/**
 * DOCUMENT ME!
 *
 * @author   jruiz
 * @version  $Revision$, $Date$
 */
public final class FortfuehrungPropertyConstants extends PropertyConstants {

    //~ Static fields/initializers ---------------------------------------------

    public static final String PROP__BEGINN = "beginn";
    public static final String PROP__ANLASS = "anlass";
    public static final String PROP__FLURSTUECK_ALT = "flurstueck_alt";
    public static final String PROP__FLURSTUECK_NEU = "flurstueck_neu";
    public static final String PROP__GEOMETRIEN = "geometrien";
    public static final String PROP__DOKUMENTURL = "dokument";
    public static final String PROP__IST_ABGEARBEITET = "ist_abgearbeitet";

    public static final String PROP__ANLASS_NAME = PROP__ANLASS + DOT + "name";

    //~ Constructors -----------------------------------------------------------

    /**
     * Creates a new FortfuehrungPropertyConstants object.
     */
    private FortfuehrungPropertyConstants() {
    }
}
