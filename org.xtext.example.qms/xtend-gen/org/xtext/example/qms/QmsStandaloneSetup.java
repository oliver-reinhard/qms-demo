/**
 * generated by Xtext 2.17.1
 */
package org.xtext.example.qms;

import org.xtext.example.qms.QmsStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class QmsStandaloneSetup extends QmsStandaloneSetupGenerated {
  public static void doSetup() {
    new QmsStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}