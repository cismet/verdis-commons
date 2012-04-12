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
public interface FrontinfoPropertyConstants extends PropertyConstants {

    //~ Static fields/initializers ---------------------------------------------

    String PROP__LAENGE_GRAFIK = "laenge_grafik";
    String PROP__LAENGE_KORREKTUR = "laenge_korrektur";
    String PROP__NUMMER = "nummer";
    String PROP__ERFASSUNGSDATUM = "erfassungsdatum";
    String PROP__SR_VERANLAGUNG = "sr_veranlagung";
    String PROP__WD_VERANLAGUNG = "wd_veranlagung";
    String PROP__GEOMETRIE = "geometrie";
    String PROP__STRASSE = "strasse";

    // +
    String PROP__SR_KLASSE_OR = "sr_klasse_or";
    // ++
    String PROP__SR_KLASSE_OR__KEY = PROP__SR_KLASSE_OR + DOT + "key";
    String PROP__SR_KLASSE_OR__SCHLUESSEL = PROP__SR_KLASSE_OR + DOT + "schluessel";
    // +
    String PROP__WD_PRIO_OR = "wd_prio_or";
    // ++
    String PROP__WD_PRIO_OR__KEY = PROP__WD_PRIO_OR + DOT + "key";
    String PROP__WD_PRIO_OR__SCHLUESSEL = PROP__WD_PRIO_OR + DOT + "schluessel";
}
