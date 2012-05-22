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
public final class RegenFlaechenPropertyConstants extends PropertyConstants {

    //~ Static fields/initializers ---------------------------------------------

    public static final String PROP__FEB_ID = "feb_id";
    public static final String PROP__BEMERKUNG = "bemerkung";
    public static final String PROP__SPERRE = "sperre";
    public static final String PROP__BEMERKUNG_SPERRE = "bemerkung_sperre";
    public static final String PROP__FLAECHENBEZEICHNUNG = "flaechenbezeichnung";
    public static final String PROP__ANTEIL = "anteil";
    public static final String PROP__DATUM_ERFASSUNG = "datum_erfassung";
    public static final String PROP__DATUM_VERANLAGUNG = "datum_veranlagung";
    public static final String PROP__FLAECHENINFO = "flaecheninfo";
    // +
    public static final String PROP__FLAECHENINFO__ID = PROP__FLAECHENINFO + DOT + PROP__ID;
    public static final String PROP__FLAECHENINFO__GROESSE_GRAFIK = PROP__FLAECHENINFO + DOT + "groesse_aus_grafik";
    public static final String PROP__FLAECHENINFO__GROESSE_KORREKTUR = PROP__FLAECHENINFO + DOT + "groesse_korrektur";
    public static final String PROP__FLAECHENINFO__GEOMETRIE = PROP__FLAECHENINFO + DOT + "geometrie";
    // ++
    public static final String PROP__FLAECHENINFO__GEOMETRIE__GEO_FIELD = PROP__FLAECHENINFO__GEOMETRIE + DOT
                + GeomPropertyConstants.PROP__GEO_FIELD;
    // +
    public static final String PROP__FLAECHENINFO__ANSCHLUSSGRAD = PROP__FLAECHENINFO + DOT + "anschlussgrad";
    // ++
    public static final String PROP__FLAECHENINFO__ANSCHLUSSGRAD__ID = PROP__FLAECHENINFO__ANSCHLUSSGRAD + DOT
                + PROP__ID;
    public static final String PROP__FLAECHENINFO__ANSCHLUSSGRAD__GRAD = PROP__FLAECHENINFO__ANSCHLUSSGRAD + DOT
                + "grad";
    public static final String PROP__FLAECHENINFO__ANSCHLUSSGRAD__ABKUERZUNG = PROP__FLAECHENINFO__ANSCHLUSSGRAD + DOT
                + "grad_abkuerzung";
    // +
    public static final String PROP__FLAECHENINFO__FLAECHENART = PROP__FLAECHENINFO + DOT + "flaechenart";
    // ++
    public static final String PROP__FLAECHENINFO__FLAECHENART__ID = PROP__FLAECHENINFO__FLAECHENART + DOT + PROP__ID;
    public static final String PROP__FLAECHENINFO__FLAECHENART__ART = PROP__FLAECHENINFO__FLAECHENART + DOT + "art";
    public static final String PROP__FLAECHENINFO__FLAECHENART__ABKUERZUNG = PROP__FLAECHENINFO__FLAECHENART + DOT
                + "art_abkuerzung";

    //~ Constructors -----------------------------------------------------------

    /**
     * Creates a new RegenFlaechenPropertyConstants object.
     */
    private RegenFlaechenPropertyConstants() {
    }
}
