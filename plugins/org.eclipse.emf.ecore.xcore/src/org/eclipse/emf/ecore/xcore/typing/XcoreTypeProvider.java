/**
 * Copyright (c) 2011-2012 Eclipse contributors and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.emf.ecore.xcore.typing;


import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.xcore.XOperation;
import org.eclipse.emf.ecore.xcore.XcorePackage;
import org.eclipse.emf.ecore.xcore.mappings.XcoreMapper;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.typing.XbaseTypeProvider;

import com.google.inject.Inject;


public class XcoreTypeProvider extends XbaseTypeProvider
{

  @Inject
  private XcoreMapper mapper;

  @Override
  protected JvmTypeReference _expectedType(EObject container, EReference reference, int index, boolean rawType)
  {
    if (container instanceof XOperation)
    {
      return _expectedType((XOperation)container, reference, index, rawType);
    }
    return super._expectedType(container, reference, index, rawType);
  }

  protected JvmTypeReference _expectedType(XOperation expr, EReference reference, int index, boolean rawType)
  {
    if (reference == XcorePackage.Literals.XOPERATION__BODY)
    {
      JvmOperation operation = mapper.getMapping(expr).getJvmOperation();
      return operation.getReturnType();
    }
    return null;
  }

}
