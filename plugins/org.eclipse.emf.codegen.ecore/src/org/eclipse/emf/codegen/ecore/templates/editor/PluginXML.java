package org.eclipse.emf.codegen.ecore.templates.editor;

import java.util.*;
import org.eclipse.emf.codegen.ecore.genmodel.*;

public class PluginXML
{
  protected final String NL = System.getProperties().getProperty("line.separator");
  protected final String TEXT_1 = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" + NL + "<?eclipse version=\"3.0\"?>" + NL + "" + NL + "<!--";
  protected final String TEXT_2 = NL;
  protected final String TEXT_3 = "/**" + NL + " * <copyright>" + NL + " * </copyright>" + NL + " *" + NL + " * ";
  protected final String TEXT_4 = "Id";
  protected final String TEXT_5 = NL + " */" + NL + "-->" + NL + "" + NL + "<plugin" + NL + "    name = \"%pluginName\"" + NL + "    id = \"";
  protected final String TEXT_6 = "\"" + NL + "    version = \"1.0.0\"" + NL + "    provider-name = \"%providerName\"" + NL + "    class = \"";
  protected final String TEXT_7 = "$Implementation\">" + NL + "" + NL + "  <requires>";
  protected final String TEXT_8 = NL + "    <import plugin=\"";
  protected final String TEXT_9 = "\" ";
  protected final String TEXT_10 = "export=\"true\"";
  protected final String TEXT_11 = "/>";
  protected final String TEXT_12 = NL + "  </requires>" + NL + "" + NL + "  <runtime>";
  protected final String TEXT_13 = NL + "    <library name=\"";
  protected final String TEXT_14 = ".jar\">";
  protected final String TEXT_15 = NL + "    <library name=\".\">";
  protected final String TEXT_16 = NL + "      <export name=\"*\"/>" + NL + "    </library>" + NL + "  </runtime>" + NL;
  protected final String TEXT_17 = NL + "  <extension point=\"org.eclipse.emf.edit.itemProviderAdapterFactories\">" + NL + "    <factory " + NL + "       uri = \"";
  protected final String TEXT_18 = "\" " + NL + "       class = \"";
  protected final String TEXT_19 = "\"" + NL + "       supportedTypes = ";
  protected final String TEXT_20 = NL + "         ";
  protected final String TEXT_21 = " />" + NL + "  </extension>" + NL + "  ";
  protected final String TEXT_22 = NL + "  <extension point=\"org.eclipse.emf.ecore.generated_package\">" + NL + "    <package" + NL + "       uri = \"";
  protected final String TEXT_23 = "\"" + NL + "       class = \"";
  protected final String TEXT_24 = "\"";
  protected final String TEXT_25 = " />";
  protected final String TEXT_26 = NL + "       genModel = \"";
  protected final String TEXT_27 = "\" /> ";
  protected final String TEXT_28 = NL + "  </extension>";
  protected final String TEXT_29 = NL + NL + "  <extension point=\"org.eclipse.emf.ecore.extension_parser\">" + NL + "    <parser" + NL + "       type=\"";
  protected final String TEXT_30 = "\"" + NL + "       class=\"";
  protected final String TEXT_31 = "\" />" + NL + "  </extension>";
  protected final String TEXT_32 = NL;
  protected final String TEXT_33 = NL + "  <extension" + NL + "    point=\"org.eclipse.core.runtime.applications\"" + NL + "    id=\"";
  protected final String TEXT_34 = "Application\">" + NL + "    <application>" + NL + "      <run" + NL + "        class=\"";
  protected final String TEXT_35 = "$Application\">" + NL + "      </run>" + NL + "    </application>" + NL + "  </extension>" + NL + "" + NL + "   <extension" + NL + "    point=\"org.eclipse.ui.perspectives\">" + NL + "    <perspective" + NL + "      name=\"%_UI_Perspective_label\"" + NL + "      class=\"";
  protected final String TEXT_36 = "$Perspective\"" + NL + "      id=\"";
  protected final String TEXT_37 = "Perspective\">" + NL + "    </perspective>" + NL + "  </extension>" + NL + "" + NL + "  <extension" + NL + "    point=\"org.eclipse.ui.actionSets\">" + NL + "    <actionSet" + NL + "      label=\"%_UI_";
  protected final String TEXT_38 = "_ActionSet_label\"" + NL + "      visible=\"true\"" + NL + "      id=\"";
  protected final String TEXT_39 = "ActionSet\">" + NL + "      <action" + NL + "        label=\"%_UI_Menu_About_label\"" + NL + "        class=\"";
  protected final String TEXT_40 = "$AboutAction\"" + NL + "        menubarPath=\"help/additions\"" + NL + "        id=\"";
  protected final String TEXT_41 = "AboutAction\">" + NL + "      </action>" + NL + "      <action" + NL + "        label=\"%_UI_Menu_OpenURI_label\"" + NL + "        accelerator=\"Ctrl+U\"" + NL + "        class=\"";
  protected final String TEXT_42 = "$OpenURIAction\"" + NL + "        menubarPath=\"file/additions\"" + NL + "        id=\"";
  protected final String TEXT_43 = "OpenURIAction\">" + NL + "      </action>" + NL + "      <action" + NL + "        label=\"%_UI_Menu_Open_label\"" + NL + "        accelerator=\"Ctrl+O\"" + NL + "        class=\"";
  protected final String TEXT_44 = "$OpenAction\"" + NL + "        menubarPath=\"file/additions\"" + NL + "        id=\"";
  protected final String TEXT_45 = "OpenAction\">" + NL + "      </action>" + NL + "    </actionSet>" + NL + "  </extension>" + NL + "   ";
  protected final String TEXT_46 = NL;
  protected final String TEXT_47 = NL + "  <extension" + NL + "    point=\"org.eclipse.ui.actionSets\">" + NL + "    <actionSet" + NL + "      label=\"%_UI_";
  protected final String TEXT_48 = "_ActionSet_label\"" + NL + "      visible=\"true\"" + NL + "      id=\"";
  protected final String TEXT_49 = "ActionSet\">" + NL + "      <action" + NL + "        label=\"%_UI_";
  protected final String TEXT_50 = "_label\"" + NL + "        class=\"";
  protected final String TEXT_51 = "$NewAction\"" + NL + "        menubarPath=\"file/new/additions\"" + NL + "        id=\"";
  protected final String TEXT_52 = "NewAction\">" + NL + "      </action>" + NL + "    </actionSet>" + NL + "  </extension>  ";
  protected final String TEXT_53 = NL + "  <extension" + NL + "    point = \"org.eclipse.ui.newWizards\">" + NL + "    <category" + NL + "      id = \"org.eclipse.emf.ecore.Wizard.category.ID\"" + NL + "      name=\"%_UI_Wizard_category\">" + NL + "    </category>" + NL + "    <wizard" + NL + "      id = \"";
  protected final String TEXT_54 = "ID\"" + NL + "      name = \"%_UI_";
  protected final String TEXT_55 = "_label\"" + NL + "      class = \"";
  protected final String TEXT_56 = "\"" + NL + "      category = \"org.eclipse.emf.ecore.Wizard.category.ID\"" + NL + "      icon = \"icons/full/obj16/";
  protected final String TEXT_57 = "ModelFile.gif\">" + NL + "      <description>%_UI_";
  protected final String TEXT_58 = "_description</description>" + NL + "      <selection class = \"org.eclipse.core.resources.IResource\" />" + NL + "    </wizard>" + NL + "  </extension>";
  protected final String TEXT_59 = NL + NL + "  <extension point = \"org.eclipse.ui.editors\">" + NL + "    <editor" + NL + "        id = \"";
  protected final String TEXT_60 = "ID\"" + NL + "        name = \"%_UI_";
  protected final String TEXT_61 = "_label\"" + NL + "        icon = \"icons/full/obj16/";
  protected final String TEXT_62 = "ModelFile.gif\"" + NL + "        extensions = \"";
  protected final String TEXT_63 = "\"" + NL + "        class = \"";
  protected final String TEXT_64 = "\" " + NL + "        contributorClass=\"";
  protected final String TEXT_65 = "\" >" + NL + "    </editor>" + NL + "  </extension>    ";
  protected final String TEXT_66 = NL + "</plugin>";
  protected final String TEXT_67 = NL;

  public String generate(Object argument)
  {
    StringBuffer stringBuffer = new StringBuffer();
    
/**
 * <copyright>
 *
 * Copyright (c) 2002-2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 * 
 * Contributors: 
 *   IBM - Initial API and implementation
 *
 * </copyright>
 */

    GenModel genModel = (GenModel)argument;
    stringBuffer.append(TEXT_1);
    stringBuffer.append(TEXT_2);
    stringBuffer.append(TEXT_3);
    stringBuffer.append("$");
    stringBuffer.append(TEXT_4);
    stringBuffer.append("$");
    stringBuffer.append(TEXT_5);
    stringBuffer.append(genModel.getEditorPluginID());
    stringBuffer.append(TEXT_6);
    stringBuffer.append(genModel.getQualifiedEditorPluginClassName());
    stringBuffer.append(TEXT_7);
    for (Iterator j=genModel.getEditorRequiredPlugins().iterator(); j.hasNext();) { String pluginID = (String)j.next();
    stringBuffer.append(TEXT_8);
    stringBuffer.append(pluginID);
    stringBuffer.append(TEXT_9);
    if (!pluginID.startsWith("org.eclipse.core.runtime")) {
    stringBuffer.append(TEXT_10);
    }
    stringBuffer.append(TEXT_11);
    }
    stringBuffer.append(TEXT_12);
    if (genModel.isRuntimeJar()) {
    stringBuffer.append(TEXT_13);
    stringBuffer.append(genModel.getEditorPluginID());
    stringBuffer.append(TEXT_14);
    } else {
    stringBuffer.append(TEXT_15);
    }
    stringBuffer.append(TEXT_16);
    if (genModel.sameEditEditorProject()) {
     for (Iterator i = genModel.getAllGenPackagesWithClassifiers().iterator(); i.hasNext(); ) { GenPackage genPackage = (GenPackage)i.next(); 
    stringBuffer.append(TEXT_17);
    stringBuffer.append(genPackage.getNSURI());
    stringBuffer.append(TEXT_18);
    stringBuffer.append(genPackage.getQualifiedItemProviderAdapterFactoryClassName());
    stringBuffer.append(TEXT_19);
    for (ListIterator j = genPackage.getProviderSupportedTypes().listIterator(); j.hasNext(); ) {
    stringBuffer.append(TEXT_20);
    stringBuffer.append((j.hasPrevious()? " " : "\"") + j.next() + (j.hasNext() ? "" : "\""));
    }
    stringBuffer.append(TEXT_21);
    }
    }
    if (genModel.sameModelEditorProject()) {
     for (Iterator i = genModel.getAllGenPackagesWithClassifiers().iterator(); i.hasNext(); ) { GenPackage genPackage = (GenPackage)i.next(); 
    stringBuffer.append(TEXT_22);
    stringBuffer.append(genPackage.getNSURI());
    stringBuffer.append(TEXT_23);
    stringBuffer.append(genPackage.getQualifiedPackageInterfaceName());
    stringBuffer.append(TEXT_24);
    if (!genModel.hasLocalGenModel()) {
    stringBuffer.append(TEXT_25);
    } else {
    stringBuffer.append(TEXT_26);
    stringBuffer.append(genModel.getRelativeGenModelLocation());
    stringBuffer.append(TEXT_27);
    }
    stringBuffer.append(TEXT_28);
    if (genPackage.getResource() != GenResourceKind.NONE_LITERAL) {
    stringBuffer.append(TEXT_29);
    stringBuffer.append(genPackage.getPrefix().toLowerCase());
    stringBuffer.append(TEXT_30);
    stringBuffer.append(genPackage.getQualifiedResourceFactoryClassName());
    stringBuffer.append(TEXT_31);
    }
    stringBuffer.append(TEXT_32);
    }
    }
    if (genModel.isRichClientPlatform()) {
    stringBuffer.append(TEXT_33);
    stringBuffer.append(genModel.getEditorAdvisorClassName());
    stringBuffer.append(TEXT_34);
    stringBuffer.append(genModel.getQualifiedEditorAdvisorClassName());
    stringBuffer.append(TEXT_35);
    stringBuffer.append(genModel.getQualifiedEditorAdvisorClassName());
    stringBuffer.append(TEXT_36);
    stringBuffer.append(genModel.getQualifiedEditorAdvisorClassName());
    stringBuffer.append(TEXT_37);
    stringBuffer.append(genModel.getEditorAdvisorClassName());
    stringBuffer.append(TEXT_38);
    stringBuffer.append(genModel.getEditorAdvisorClassName());
    stringBuffer.append(TEXT_39);
    stringBuffer.append(genModel.getQualifiedEditorAdvisorClassName());
    stringBuffer.append(TEXT_40);
    stringBuffer.append(genModel.getQualifiedEditorAdvisorClassName());
    stringBuffer.append(TEXT_41);
    stringBuffer.append(genModel.getQualifiedEditorAdvisorClassName());
    stringBuffer.append(TEXT_42);
    stringBuffer.append(genModel.getQualifiedEditorAdvisorClassName());
    stringBuffer.append(TEXT_43);
    stringBuffer.append(genModel.getQualifiedEditorAdvisorClassName());
    stringBuffer.append(TEXT_44);
    stringBuffer.append(genModel.getQualifiedEditorAdvisorClassName());
    stringBuffer.append(TEXT_45);
    }
    for (Iterator i = genModel.getAllGenPackagesWithClassifiers().iterator(); i.hasNext(); ) { GenPackage genPackage = (GenPackage)i.next(); 
    stringBuffer.append(TEXT_46);
    if (genModel.isRichClientPlatform()) {
    stringBuffer.append(TEXT_47);
    stringBuffer.append(genPackage.getModelWizardClassName());
    stringBuffer.append(TEXT_48);
    stringBuffer.append(genPackage.getQualifiedActionBarContributorClassName());
    stringBuffer.append(TEXT_49);
    stringBuffer.append(genPackage.getModelWizardClassName());
    stringBuffer.append(TEXT_50);
    stringBuffer.append(genPackage.getQualifiedActionBarContributorClassName());
    stringBuffer.append(TEXT_51);
    stringBuffer.append(genPackage.getQualifiedActionBarContributorClassName());
    stringBuffer.append(TEXT_52);
    } else {
    stringBuffer.append(TEXT_53);
    stringBuffer.append(genPackage.getQualifiedModelWizardClassName());
    stringBuffer.append(TEXT_54);
    stringBuffer.append(genPackage.getModelWizardClassName());
    stringBuffer.append(TEXT_55);
    stringBuffer.append(genPackage.getQualifiedModelWizardClassName());
    stringBuffer.append(TEXT_56);
    stringBuffer.append(genPackage.getPrefix());
    stringBuffer.append(TEXT_57);
    stringBuffer.append(genPackage.getModelWizardClassName());
    stringBuffer.append(TEXT_58);
    }
    stringBuffer.append(TEXT_59);
    stringBuffer.append(genPackage.getQualifiedEditorClassName());
    stringBuffer.append(TEXT_60);
    stringBuffer.append(genPackage.getEditorClassName());
    stringBuffer.append(TEXT_61);
    stringBuffer.append(genPackage.getPrefix());
    stringBuffer.append(TEXT_62);
    stringBuffer.append(genPackage.getPrefix().toLowerCase());
    stringBuffer.append(TEXT_63);
    stringBuffer.append(genPackage.getQualifiedEditorClassName());
    stringBuffer.append(TEXT_64);
    stringBuffer.append(genPackage.getQualifiedActionBarContributorClassName());
    stringBuffer.append(TEXT_65);
    }
    stringBuffer.append(TEXT_66);
    stringBuffer.append(TEXT_67);
    return stringBuffer.toString();
  }
}
