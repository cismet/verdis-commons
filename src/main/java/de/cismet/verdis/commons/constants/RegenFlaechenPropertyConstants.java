/***************************************************
*
* cismet GmbH, Saarbruecken, Germany
*
*              ... and it just works.
*
****************************************************/
package de.cismet.verdis.commons.constants;

/**
 * DOCUMENT ME!
 *
 * @author   jruiz
 * @version  $Revision$, $Date$
 */
public interface RegenFlaechenPropertyConstants extends PropertyConstants {

    //~ Static fields/initializers ---------------------------------------------

    String PROP__FEB_ID = "feb_id";
    String PROP__BEMERKUNG = "bemerkung";
    String PROP__SPERRE = "sperre";
    String PROP__BEMERKUNG_SPERRE = "bemerkung_sperre";
    String PROP__FLAECHENBEZEICHNUNG = "flaechenbezeichnung";
    String PROP__ANTEIL = "anteil";
    String PROP__DATUM_ERFASSUNG = "datum_erfassung";
    String PROP__DATUM_VERANLAGUNG = "datum_veranlagung";
    String PROP__FLAECHENINFO = "flaecheninfo";
    // +
    String PROP__FLAECHENINFO__ID = PROP__FLAECHENINFO + DOT + PROP__ID;
    String PROP__FLAECHENINFO__GROESSE_GRAFIK = PROP__FLAECHENINFO + DOT + "groesse_aus_grafik";
    String PROP__FLAECHENINFO__GROESSE_KORREKTUR = PROP__FLAECHENINFO + DOT + "groesse_korrektur";
    String PROP__FLAECHENINFO__GEOMETRIE = PROP__FLAECHENINFO + DOT + "geometrie";
    // ++
    String PROP__FLAECHENINFO__GEOMETRIE__GEO_FIELD = PROP__FLAECHENINFO__GEOMETRIE + DOT
                + GeomPropertyConstants.PROP__GEO_FIELD;
    // +
    String PROP__FLAECHENINFO__ANSCHLUSSGRAD = PROP__FLAECHENINFO + DOT + "anschlussgrad";
    // ++
    String PROP__FLAECHENINFO__ANSCHLUSSGRAD__ID = PROP__FLAECHENINFO__ANSCHLUSSGRAD + DOT + PROP__ID;
    String PROP__FLAECHENINFO__ANSCHLUSSGRAD__GRAD = PROP__FLAECHENINFO__ANSCHLUSSGRAD + DOT + "grad";
    String PROP__FLAECHENINFO__ANSCHLUSSGRAD__ABKUERZUNG = PROP__FLAECHENINFO__ANSCHLUSSGRAD + DOT + "grad_abkuerzung";
    // +
    String PROP__FLAECHENINFO__FLAECHENART = PROP__FLAECHENINFO + DOT + "flaechenart";
    // ++
    String PROP__FLAECHENINFO__FLAECHENART__ID = PROP__FLAECHENINFO__FLAECHENART + DOT + PROP__ID;
    String PROP__FLAECHENINFO__FLAECHENART__ART = PROP__FLAECHENINFO__FLAECHENART + DOT + "art";
    String PROP__FLAECHENINFO__FLAECHENART__ABKUERZUNG = PROP__FLAECHENINFO__FLAECHENART + DOT + "art_abkuerzung";
}
