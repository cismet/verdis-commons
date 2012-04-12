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
public interface KassenzeichenPropertyConstants extends PropertyConstants {

    //~ Static fields/initializers ---------------------------------------------

    String PROP__FLAECHEN = "flaechen";
    String PROP__FRONTEN = "fronten";
    String PROP__GEOMETRIE = "geometrie";
    String PROP__GEOMETRIE__GEO_FIELD = PROP__GEOMETRIE + DOT + GeomPropertyConstants.PROP__GEO_FIELD;
    String PROP__KASSENZEICHENNUMMER = "kassenzeichennummer8";
    String PROP__KASSENZEICHENNUMMER_OLD = "kassenzeichennummer";
    String PROP__KANALANSCHLUSS = "kanalanschluss";
    String PROP__DATUM_VERANLAGUNG = "datum_veranlagung";
    String PROP__DATUM_ERFASSUNG = "datum_erfassung";
    String PROP__BEMERKUNG = "bemerkung";
    String PROP__SPERRE = "sperre";
    String PROP__BEMERKUNG_SPERRE = "bemerkung_sperre";
    String PROP__LETZTE_AENDERUNG_TIMESTAMP = "letzte_aenderung_ts";
    String PROP__LETZTE_AENDERUNG_USER = "letzte_aenderung_von";
}
